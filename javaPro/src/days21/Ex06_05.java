package days21;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author yusica
 * @data 2025. 1. 23. - 오후 4:16:55
 * @subject		exe 실행파일 복사
 * @content		문자 스트림 X
 * 						바이트 스트림 ( 파일 읽/쓰기 )
 * 
 * 						FIS/FOS (1)
 * 						BI / BO  (2)
 */
public class Ex06_05 {
	
	public static void main(String[] args) {
		//  텍스트 파일 복사
		String fileName = "C:\\Windows\\notepad.exe";
		String copyFileName = ".\\notepad_copy.exe";
		String copyFileName2 = ".\\notepad_copy02.exe";
		
		fileCopy_byteStream(fileName,copyFileName);
		fileCopy_byteStream02(fileName,copyFileName2);
		
	}//main

	private static void fileCopy_byteStream(String source, String target) {

		long start = System.nanoTime();
		
		try (FileInputStream fis = new FileInputStream(source);
				FileOutputStream fos = new FileOutputStream(target);){
			int code;
			while ((code = fis.read()) != -1) {
				//System.out.println(code);// 화면출력
				fos.write(code);
			} // while
			
			fos.flush(); // ***
			System.out.println("파일 복사 완료!");

			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		long end = System.nanoTime();
		System.out.println("> 처리 시간(ns) : "+ (end - start));
		
	}
	
	private static void fileCopy_byteStream02(String source, String target) {

		long start = System.nanoTime();
		
		final int BUFFER_SIZE = 1024;

		try (FileInputStream fis = new FileInputStream(source);
				FileOutputStream fos = new FileOutputStream(target);
			// 보조스트림 + 버퍼기능
			BufferedInputStream bis = new BufferedInputStream(fis, BUFFER_SIZE);
			BufferedOutputStream bos = new BufferedOutputStream(fos, BUFFER_SIZE);){
			
			byte [] b = new byte[BUFFER_SIZE];
			
			int n = -1;
			while ((n = bis.read(b)) != -1) {
				bos.write(b,0,n);
			} // while
			
			bos.flush();
			System.out.println("파일 복사 완료!");

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		long end = System.nanoTime();
		System.out.println("> 처리 시간(ns) : "+ (end - start));

	}

}
