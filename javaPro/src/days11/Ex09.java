package days11;

/**
 * @author yusica
 * @data 2025. 1. 9. - 오후 4:40:19
 * @subject
 * @content
 */
public class Ex09 {
	
	// 멤버변수 == 필드(field)
	// [접] [기] 자료형 필드명[=초기값];
	
	//1) 인스턴스 변수
	public String name = null;
	public int age = 0;
	//2) static 붙어 있는 필드를 클래스 변수
	public static double PI = 3.14;
	
	 									//지역변수
	public static void main(String[] args) {
		
		for (int i = 0; i < args.length; i++) {
	         System.out.printf("args[%d] : %s\n", i, args[i]);
	      }
	      System.out.println("----");
		
		/*
		 * [ 자바 변수의 종류 ]
		 * 1) 지역변수 
		 * 			- 해당 영역(지역)에서만 사용되는 변수
		 * 			- 매개변수 지역변수 String [] args
		 * 2) 인스턴스 변수
		 * 			- 초기화 하지 않아도 그 자료형의 기본값으로 초기화 되어져 있다.
		 * 3) 클래스 변수
		 * */
		
		int age = 20;	// 지역변수
		for (int i = 0; i < args.length; i++) {
			// int i = 0 지역변수
		}

	}//main

}//class
