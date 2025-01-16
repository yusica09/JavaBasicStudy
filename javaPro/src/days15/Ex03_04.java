package days15;

import java.util.Arrays;
import java.util.Random;

/**
 * @author yusica
 * @date 2025. 1. 15. - 오전 11:32:08
 * @subject   try~catch 문
 * @content 
 */
public class Ex03_04 {

	public static void main(String[] args) {

		int number = 100;
		int result = 0;
		Random rnd = new Random();
		int [] m = new int[5];
		// ArithmeticException : / by zero	

		// 다중 catch 블럭
		for (int i = 0; i < 10 ; i++) { 
			try {
				// 코딩
				result = number / rnd.nextInt(5); // 0<= 정수 <5
				System.out.println(result );

				// ArrayIndexOutOfBoundsException
				/* [1] 중첩 try~catch 문 사용 가능.
				try {
					// index 5 ~ 9
					m[i] = result;					
				}catch(ArrayIndexOutOfBoundsException e) {
					// 예외처리... m 배열크기 +5 증가..
					m = Arrays.copyOf(m, m.length+5);
					m[5] = result;
				}
				 */
				m[i] = result;
				// 
				// 
				//  jdk1.7 추가    멀티 catch 블럭.
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { 
				// System.out.println( 0 );
				/* 예외 정보를 출력+확인
				e.printStackTrace();
				System.out.println( e.toString() );
				System.out.println( e.getMessage() ); // 에러 메시지
				 */
			} catch (Exception e) {
				// 다중 catch 문을 사용할 때의 주의할점 
				//  ㄴ 부모Exception catch문을 밑에 코딩한다. 
			}
		} // for

		System.out.println(" end ");
		/*
		try {
		   // 1
		   // 2
		   // 3         예상치 못한 예외 발생..
		   // 4
		   // 5         예상치 못한 예외 발생..
		   :
		   // 100
		} catch (Exception e) {  // 모든 예외가 발생하면 처리..
			// 예외 처리.. 코딩~~
		}
		 */

		//
		//
		//
	} // main

} // class


