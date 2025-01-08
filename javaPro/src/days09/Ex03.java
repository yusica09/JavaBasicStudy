package days09;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author yusica
 * @data 2025. 1. 7. - 오전 10:46:52
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		int [] m = {3,5,2,4,1};	
		System.out.println(Arrays.toString(m));
		
		// 1. 8 정수 배열에 마지막 요소로 추가 append
		// 배열 크기 증가 -> 이후 추가
		
		// 2. index 2 삭제 
		for (int i = 2; i < m.length-1; i++) {
			m[i] = m[i+1];
		}
		m[m.length-1] = 0;
		int [] temp = Arrays.copyOf(m, m.length-1);	 
		m = temp;
		System.out.println(Arrays.toString(m));
		
		// 3. index=2			100 정수 삽입
		temp = new int[m.length+1]; 
		System.arraycopy(m, 0, temp, 0, 2);
		System.arraycopy(m, 2, temp, 2+1, m.length-2);
		temp[2] = 100;
		m = temp;
		System.out.println(Arrays.toString(m));

	}//main

}//class
