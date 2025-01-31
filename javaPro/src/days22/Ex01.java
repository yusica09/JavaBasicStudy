package days22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author yusica
 * @data 2025. 1. 24. - 오전 9:02:58
 * @subject
 * @content
 */
public class Ex01 {
	
	public static void main(String[] args) throws IOException {
		/*
		 * 1. 자바 모든 입/출력 : 스트림(Stream)
		 * 2. 단방향 : 입력스트림, 출력스트림
		 * 3. 스트림 2가지 종류
		 * 		1) 문자 스트림 : Reader, Writer
		 * 		2) 바이트 스트림 : InputStream, OutputStream
		 * 4. 보조 스트림
		 * 5. 메모리 스트림
		 * */
		
		// 키보드 -> 바이트스트림
		InputStream is = System.in;
		// 한글1문자		[][][]	  바이트
		
		
		// 보조스트림 InputStream[Reader] : 문자스트림
		// 바이트 스트림 -> 문자스트림
		InputStreamReader isr = new InputStreamReader(is);
		//int one = isr.read();
		//System.out.println((char)one); //한
		
		
		// 보조스트림 BufferedReader		(reader)  -> 여러 문자를 읽고 싶은 경우
		BufferedReader br = new BufferedReader(isr);
		String name = br.readLine();
		System.out.println(name);
		
		/* [1]
		int code = is.read();
		// 전부를 못읽고 한바이트만 읽는 문제 - 한 : 237-í
		System.out.printf("%d-%c\n", code, (char)code);
		*/
		
		/* [2]
		byte[] b = new byte[3];
		int n = is.read(b); // 배열에 저장된 갯수
		System.out.println("배열에 저장된 바이트의 수 : "+n);
		for (byte c : b) {
			System.out.println(c);
		} // for c
		
		//배열에 저장된 바이트의 수 : 3
		//-19
		//-107
		//-100
		//한
		System.out.println(new String(b).charAt(0)); 
		*/
		
		
		//54620
		//System.out.printf("%d\n", (int)'한');
		
	}//main

}
