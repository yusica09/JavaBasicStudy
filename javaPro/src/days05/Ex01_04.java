package days05;

import java.util.Arrays;

/**
 * @author yusica
 * @data 2024. 12. 30. - 오후 12:14:46
 * @subject
 * @content
 */

public class Ex01_04 {

	public static void main(String[] args) {
		
		int [] m = new int[10];
		
		for(int i = 0;i<m.length;i++) {
			m[i] = (int)(Math.random()*101);
		}
		
		// 배열값을 확인
		//Arrays 클래스 : 배열을 사용하기 쉽도록 기능이 구현된 클래스
		System.out.println(Arrays.toString(m));
		
		int max = m[0]; int min = m[0];
		
		for(int i = 1;i < m.length; i++) {
			max = Math.max(max, m[i]);
			min = Math.min(min, m[i]);
		}
		
		System.out.printf("max = %d\n",max);
		System.out.printf("min = %d\n",min);

	}//main

}//class
