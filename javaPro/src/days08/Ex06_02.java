package days08;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06_02 {

	public static void main(String[] args) {
		// (시험)
		// 10진수 정수를 입력받아서
		// 2바이트 2진수 형태로 출력
		
		int n = 10;
		int 몫, 나머지;
		String s ="";
		while(n!=0) {
			몫 =  n/2;
			나머지 = n%2;
			System.out.println(나머지);
			//s +=  나머지;
			s = 나머지 + s;
			n = 몫;
		}
		System.out.println(s);
		
		//(1)
		//System.out.printf("%016d",Integer.parseInt(s));
		
		//(2)
		//s = String.format("%16s",s);
		//System.out.println(s.replace(' ', '0'));
		
		//(3)
		//System.out.println("0".repeat(16-s.length()) + s);
		
		
		/* [2]
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse());
		*/
		
		
		/* [1] 로직  "1010"
		char [] sReverse = new char[s.length()];
		
		for (int i = 0; i < s.length(); i++) {
			sReverse[s.length()-1-i] = s.charAt(i);
		}
		
		String sr = String.valueOf(sReverse);
		System.out.println(sr);
		*/
		
	}//main

}//class
