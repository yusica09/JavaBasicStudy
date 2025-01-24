package days21;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author yusica
 * @data 2025. 1. 23. - 오후 3:30:46
 * @subject		file flush 알아보기
 * @content
 */
public class Ex06_03 {

	public static void main(String[] args) {
		//  텍스트 파일 복사
		String fileName = ".\\src\\days20\\Ex01.java";
		String copyFileName = ".\\src\\days20\\Ex01Copy.java";
		
		fileCopy_textStream(fileName,copyFileName);
	}//main

	private static void fileCopy_textStream(String source, String target) {

		long start = System.nanoTime();
		
		try (FileReader reader = new FileReader(source);
				FileWriter writer = new FileWriter(target);){
			int code;
			while ((code = reader.read()) != -1) {
				System.out.println(code);// 화면출력
				writer.write(code); // writer.append()
			} // while
			writer.flush(); // ***
			
			System.out.println("파일 복사 완료!");
			
			//[문제] 파일명 == 클랴스명 수정.(변경)
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		long end = System.nanoTime();
		System.out.println("> 처리 시간(ns) : "+ (end - start));
		
	}
	
}
