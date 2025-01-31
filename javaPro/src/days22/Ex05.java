package days22;

import java.io.PrintStream;

/**
 * @author yusica
 * @data 2025. 1. 24. - 오전 10:26:05
 * @subject
 * @content	[ 표준 입력출력 관련 스트림 ]
 * 					1) InputStream System.in
 * 					2) PrintStream System.out
 * 					2) PrintStream System.err
 */
public class Ex05 {
	
	public static void main(String[] args) {
		// 바이트스트림(출력용)
		// FilterOutputStream
		PrintStream ps =  System.out;
		ps.append('a');
		ps.append("문자열");
		//ps.write(byte [])
		//ps.write(int );
		
		//ps.print(각종 자료형);
		//ps.println();
		//ps.printf(null, args);
		
		
	}//main

}
