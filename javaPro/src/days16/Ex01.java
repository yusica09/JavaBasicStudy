package days16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author yusica
 * @data 2025. 1. 16. - 오전 9:07:30
 * @subject		days15.Ex01.java 파일 읽고 라인번호 붙여서 출력하기
 * @content
 */
public class Ex01 {

	public static void main(String[] args) throws FileNotFoundException {
		
		String dir = System.getProperty("user.dir");
		
		// 		절대경로
		//		상대경로				. 기분 현재 디렉토리		.. 부모 디렉토리
		
		//String fileName = dir + "\\src\\days15\\Ex01.java";
		String fileName = ".\\src\\days15\\Ex01.java";
		//String fileName = "C:\\Class\\JavaClass\\javaPro\\src\\days15\\Ex01.java";
		FileReader fileReader = new FileReader(fileName);
		BufferedReader reader = new BufferedReader(fileReader);
		
		try {
			String line = null;
			int lineNumber = 1;
			while((line = reader.readLine()) != null) {
				//System.out.printf("%d : %s\n",lineNumber++,line);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("  end  ");
	}

}
