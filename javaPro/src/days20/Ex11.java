package days20;

import java.io.FileOutputStream;
import java.util.Properties;

/**
 * @author yusica
 * @data 2025. 1. 22. - 오후 5:06:11
 * @subject	Map	-	TreeMap, HashTable, HashMap, LinkedHashMap
 * @content			Properties	컬렉션클래스
 * 								ㄴ key String, value String
 * 								ㄴ HashTable의 자식 클래스
 * 								ㄴ 환경설정
 * 										속성(property) = 속성값
 */
public class Ex11 {

	public static void main(String[] args) {
		// 오라클 DBMS
		// DataBase 연결하기 위한 설정값..
		String className = "oracle.jdbc.driver.OracleDriver";            
		String url = "jdbc:oracle:thin:@localhost:1521:xe";                  
		String user = "scott";                                                                   
		String password = "tiger";
		//1) 위의 4개 설정값 -> Properties 저장 -> 파일 저장
		Properties p = new Properties();
		//p.put(k,v); - 여기선 잘 안씀
		p.setProperty("className", className);
		p.setProperty("url", url);
		p.setProperty("user", user);
		p.setProperty("password", password);
		
		System.out.println(p);
		
		//파일로 저장		FileWriter / FileReader
		//파일 경로를 굳이 설정하지 않으면 그냥 프로젝트명 폴더에 생성된다
		/*
		String fileName = "jdbc.properties";
		try (FileWriter writer = new FileWriter(fileName)){
			p.store(writer, "[DB ConnectionString]");
			System.out.println("save end");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		*/
		
		// XML 파일 저장
		String fileName = "jdbc.xml";
		try(FileOutputStream fos = new FileOutputStream(fileName)) {
			//p.store(writer, "[DB ConnectionString]"
			p.storeToXML(fos,  "[DB ConnectionString]","UTF-8");
			System.out.println("save end");
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		//2) 위의 4개 설정값 <- Properties 저장 <- 파일 저장
		//days21에 이어서..
		
	}

}
