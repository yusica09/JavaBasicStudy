package days21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author yusica
 * @data 2025. 1. 23. - 오후 3:49:49
 * @subject		FileReader / FileWriter
 * @content		BufferedReader/BufferdWriter  파일 복사
 */
public class Ex06_04 {

	public static void main(String[] args) {
		//  텍스트 파일 복사
		String fileName = ".\\src\\days20\\Ex01.java";
		String copyFileName = ".\\src\\days20\\Ex01Copy.java";

		fileCopy_textStream02(fileName,copyFileName);
	}//main

	private static void fileCopy_textStream02(String source, String target) {

		long start = System.nanoTime();
		
		final int BUFFER_SIZE = 1024;

		try (FileReader reader = new FileReader(source);
				FileWriter writer = new FileWriter(target);
			// 보조스트림 + 버퍼기능
			BufferedReader br = new BufferedReader(reader, BUFFER_SIZE);
			BufferedWriter bw = new BufferedWriter(writer, BUFFER_SIZE);){
			/*
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);// 화면출력
				bw.write(line);
			} // while
			*/
			
			char [] cbuf = new char[BUFFER_SIZE];
			// br.readLine() 한 라인을 읽어오는 메서드
			// br.read() 	  한 문자를 읽어와서 int 반환 메서드
			// int		br.read(char [] cbuf)
			// 1) 기능 :	한문자X , char [] 배열로 문자를 읽어와서 
			// 2) 매개변수 : cbuf에 저장
			// 3) 리턴값 : 읽어온 문자를 채운 크기
			//(기억)
			int n = -1;
			while ((n = br.read(cbuf)) != -1) {
				bw.write(cbuf,0,n);
			} // while
			
			bw.flush(); // ***
			System.out.println("파일 복사 완료!");

			//[문제] 파일명 == 클랴스명 수정.(변경)

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		long end = System.nanoTime();
		System.out.println("> 처리 시간(ns) : "+ (end - start));

	}

}
