package days15;

public class Ex04 {

	public static void main(String[] args) {
		System.out.println("1");
		try {		
			// DB 연결( open )
			System.out.println("2");
			System.out.println( 100 / 0 ); // 강제 예외 발생...
			// 연결된 DB CRUD   예외 발생...
			System.out.println("3");
		} catch (Exception e) {
			System.out.println("4");
		} finally {
			// try 블럭에 예외가 발생하지 않아도 finally 블럭은 실행한다. 
			// try 블럭에 예외가 발생해도       finally 블럭은 실행한다. 
			System.out.println("[5]");

			// 연결된 DB 닫기( close ) 
		}
		System.out.println("6");
		System.out.println(" end ");

		/* 구문 O
		try {

		} finally {

		}
		 */

		/*  구문 X
		try {

		} 
		 */

	} // main

} // class

