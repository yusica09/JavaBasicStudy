package days17;

import static java.lang.Math.*;
import static java.lang.System.*;

/**
 * @author yusica
 * @data 2025. 1. 17. - 오후 12:31:20
 * @subject	Math : 수학과 관련된 메서드
 * @content		ㄴ public static 멤버
 */
public class Ex06 {

	public static void main(String[] args) {
		
		System.out.println(PI);
		System.out.println(E);
		
		System.out.println(random());
		System.out.println(max(1,2));
		System.out.println(min(1,2));
		
		System.out.println(pow(2,3));
		System.out.println(abs(-2));
		System.out.println(sqrt(2));	// double
		
		//반올림, 올림(절상), 버림(절삭)
		System.out.println(ceil(45.179)); //double // 절상
		System.out.println(round(45.179));	// long
		System.out.println(floor(45.179)); // double
		
	}//main

}//class
