package days08;

import days07.Sample;

/**
 * @author yusica
 * @data 2025. 1. 6. - 오전 9:34:01
 * @subject	개념파악(이해) *****
 * @content
 * 				매개변수 + 메서드 를 호출하는 방법
 * 				1) Call By Name : 매개변수 x, 메서드를 호출하는 경우 ex) draw
 * 				2) Call By Value  : 값을 넘겨서 호출(주소x) -> ex) swap
 * 				3) Call By Reference (참조타입 - 배열, 클래스, 인터페이스)
 * 				
 * 			[ +4)] Call By Point  -> 자바에는 x
 */
public class Ex01_02 {

	public static void main(String[] args) {

		// 다른 패키지 안의 Sample 클래스의 drawLine() 호출 사용
		//Sample.drawLine(30);
		
		int x = 10, y = 20; // main 지역변수
		System.out.printf("1. main x=%d, y=%d\n", x, y);
		swap(x,y);
		System.out.printf("2. main x=%d, y=%d\n", x, y);
		


	}//main

	public static void swap(int x, int y){ // swap 지역변수
		System.out.printf("1. swap x=%d, y=%d\n", x, y);
		int temp = x;
		x = y;
		y = temp;
		System.out.printf("2. swap x=%d, y=%d\n", x, y);
	}
	
}//class
