package days21;

import java.io.File;
import java.io.FileReader;

/**
 * @author yusica
 * @data 2025. 1. 23. - 오후 3:14:39
 * @subject	FileReader / FileWriter
 * @content  File 클래스
 * 						ㄴ 파일, 디렉토리(폴더)를 다루는(생성,삭제,수정,정보 얻어오기 등) 클래스
 */
public class Ex06_02 {
	
	public static void main(String[] args) {
		// 절대경로
		// 상대경로	. 현재 디렉토리		.. 상위 디렉토리
		//String fileName = ".\\src\\days20\\Ex01.java";
		String dir = ".\\src\\days20";
		//File file = new File(fileName);
		String fileName = "Ex01.java";
		File file = new File(dir, fileName);
		System.out.println(file.isFile()); //true
		
		//true/false file.exists()
		
		System.out.println("> 파일 크기 : " + file.length()+"(bytes)");
		int code;
		try (FileReader reader = new FileReader(file)){
			
			while ((code = reader.read()) != -1) {
				System.out.print((char)code);
			} // while
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}//main

}
