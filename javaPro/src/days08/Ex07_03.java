package days08;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

/**
 * @author yusica
 * @data 2025. 1. 6. - 오후 4:50:54
 * @subject		배열
 * @content		배열은 크기가 자동으로 증가되지 않는다. (단점)
 */
public class Ex07_03 {

	public static void main(String[] args) throws IOException {
		 
		int [] m = new int[3];  
		Arrays.fill(m, -1); 
		int index = 0;
		char con = 'y';
		Random rnd = new Random();
		do { 
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


}
