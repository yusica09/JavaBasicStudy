package days09;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

/**
 * @author yusica
 * @data 2025. 1. 7. - 오전 10:37:20
 * @subject 		배열의 크기 늘리기 - 내장 함수 사용
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		
		 int [] m = {1,2,3};
		 
		 /* [1] Arrays.copyOf()
		 int [] temp = Arrays.copyOf(m, m.length+3);	 
		 m = temp;
		 System.out.println(Arrays.toString(m));
		 */
		 
		 //[2] System.arraycopy
		 int [] temp = new int[m.length+3];
		 // void java.lang.System.arraycopy (src(소스), srcPos, dest(목적지), destPos, length)
		 System.arraycopy(m, 0, temp, 0, m.length);	 
		 m = temp;
		 System.out.println(Arrays.toString(m));
		
	
	} // main

}//class
