package days15;

/**
 * @author yusica
 * @data 2025. 1. 15. - 오전 11:04:25
 * @subject		예외처리
 * @content
 */
public class Ex03 {

	public static void main(String[] args)  {
		// [ 예외 처리( Exception Handling ) ]
		/*
		 *  예외  !=  오류     차이점.
		 * 1. 프로그램 오류 ? 프로그램 실행 중에 오작동 또는 비정상 종료되는 원인 
		 *    == 프로그램 에러
		 * 2. 오류 발생 시점에 따라.. 
		 *   1) 컴파일 오류(에러)
		 *   int a
		 *   
		 *   2) 실행 오류(에러) == 런타임(RunTime) 오류
		 *   int [] m = null;
             m[0] = 100;             
             컴파일 + 실행 => 빌드 오류
                 (1) 에러(Error) : 메모리 부족, 스택 오버프로워, 복구할 수 없는 심각한 오류
                     Error 클래스
                       ㄴ 자식 Error클래스

                 (2) 예외(Exception) : 에러보다 덜 심각한 비교적 수습될 수 있는 실행 오류.
                     Exception 클래스
                       ㄴ 자식 예외 클래스
                         ????Exception


		 *   3) 논리적 오류 ( 가장 어려운 오류 )  
		 *   // -2147483549
		     int i = Integer.MAX_VALUE + 100;
		     System.out.println( i ); 

		 * */

		// JVM의 "예외처리기"가 발생한 예외를 예외객체(
		// ( ArrayIndexOutOfBoundsException )로 만들어서
		// 예외를 처리할 수 있도록 개발자 에게 전달.. 수습
		// [ 예외 처리 ]
		// - 프로그램 실행 시 발생할 수 있는 예기치 못한 예외의 
		//   발생에 대비한 코드를 작성하는 것. 

		// 예외 발생 : ArrayIndexOutOfBoundsException
		int [] m = new int[3];
		m[4] = 100;

		//                   Object
		//                      ↑
		//                  Throwable
		//       ↑                                  ↑
		//  Exception                             Error
		//      ↑
		// RuntimeException IOException ..
		//   ㄴ NullpointExceptioon
		//   ㄴ ArithmeticExceptioon
		//    등등
		// RuntimeException - 개발자의 실수로 발생하는 예외
		// 그외 Exception    - 사용자의 실수같은 외적인 요인으로 발생하는 예외.

		// [예외 처리 방법]
		// 1. throws 문 사용 
		// 2. try~ catch문 사용.

		// read() 메서드는 IOException 반드시 예외처리가 필요하다. 
		// Unhandled exception type IOException
		/*
		 try {
			System.in.read();
		 } catch (IOException e) { 
			e.printStackTrace();
		 }
		 */


		// 



	} // main

} // class

