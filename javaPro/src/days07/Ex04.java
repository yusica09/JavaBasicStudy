package days07;

/**
 * @author yusica
 * @data 2025. 1. 3. - 오후 2:06:06
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// 재귀 [호출] 함수?  함수 안에서 자기자신을 다시 호출하는 함수
		disp(); // 함수 호출 부분

	}//main

	//재귀 함수
	private static void disp() {
		System.out.println("disp() 메서드 호출됨..");
		disp(); //이렇게두면 무한 출력
	}

}//class
