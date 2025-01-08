package days09;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

/**
 * @author yusica
 * @data 2025. 1. 7. - 오전 10:37:35
 * @subject		배열의 크기 늘리기 - 알고리즘 코드
 * @content
 */
public class Ex02 {

	public static void main(String[] args) throws IOException {
		 
		int [] m = new int[3];  
		Arrays.fill(m, -1); 
		int index = 0;
		char con = 'y';
		Random rnd = new Random();
		do { 
			
			if(index == m.length) {
				int [] temp = new int[m.length+3];
				//m -> temp 배열 복사
				for (int i = 0; i < m.length; i++) {
					temp[i] = m[i];
				}
				// 참조 위치 바꾸기
				m = temp;
			}
			
			m[index++] = rnd.nextInt(100);   
			System.out.printf("> 배열(%d) 계속 초기화할거냐? ", index);
			con = (char)System.in.read();
			System.in.skip(System.in.available());  
		} while ( Character.toUpperCase(con) == 'Y');
			
	    dispArr(m);

	} // main

	private static void dispArr(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]=%d\n", i, m[i]);
		}
	}

}//class
