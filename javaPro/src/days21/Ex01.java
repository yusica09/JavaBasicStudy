package days21;

import java.io.FileReader;
import java.util.Properties;

/**
 * @author yusica
 * @data 2025. 1. 23. - 오전 9:02:42
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		
		// jdbc.properties -> Properties -> 환경설정값 알아와서 출력
		String fileName = "jdbc.properties";
		
		Properties p = new Properties();
		
		//FileWriter / FileOutputStream 파일 쓰기
		//FileReader/FileInputStream 파일 읽기
		
		//p.store();
		//p.storeToXML();
		
		//p.load(reader);
		//p.loadFromXML(in);
		
		try (FileReader reader = new FileReader(fileName)){
			p.load(reader);
			p.list(System.out);
			
			//p.list(System.out);
			String className = p.getProperty("className");
			String user = p.getProperty("user");
			String url = p.getProperty("url");
			String password = p.getProperty("password");
			
			System.out.println(className);
			System.out.println(user);
			System.out.println(url);
			System.out.println(password);
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
