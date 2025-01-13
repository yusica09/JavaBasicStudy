package days12;

import static java.lang.Math.*;

/**
 * @author yusica
 * @data 2025. 1. 10. - 오후 4:16:47
 * @subject
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		// 클래스 메서드( == static 메서드)
		// 1. static 변수를 사용할 메서드
		// 2. 프로그램 코딩 시 반드시 필요한 메서드
		/*
		Math.abs(10);
		Math.random();
		Math.max(1, 0);
		Math.min(1, 0);
		Math.pow(2, 3);
		*/
		abs(10);
		random();		// import static 이용해서 이렇게 나타낼수 있다
		max(1, 0);
		min(1, 0);
		pow(2, 3);
		
		
	}//main

}//class
