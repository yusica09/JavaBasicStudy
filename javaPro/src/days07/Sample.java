package days07;

public class Sample {
	
	// [함수 선언부]
	// 1. 기능 : 선을 그리기  drawLine
	// 2. 매개변수 :  X
	// 3. 리턴값 : X , void
	public static void drawLine() {
		System.out.println("----------------------------");//50줄
	}

	//Duplicate method drawLine() in type : 메소드 중복선언 오류
	// * 오버로딩 (overloading)
	//  :  동일한 함수명으로 매개변수의 개수, 매개변수의 자료형이 다르면 함수 중복선언 가능.
	public static void drawLine(int n) {
		/*
		 * for (int i = 1; i <= n; i++) { System.out.print("-"); }
		 */
		System.out.print("-".repeat(n));
		System.out.println();//개행
	}

	public static void drawLine(String style, int n) {
		System.out.print(style.repeat(n));
		System.out.println();//개행
	}

}
