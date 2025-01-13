package days12;

/**
 * @author yusica
 * @data 2025. 1. 10. - 오전 10:15:06
 * @subject
 * @content
 * 				// 1. 기본형 매개변수와 참조형 매개변수
				// 2. 기본형 반환타입과 참조형 반환타입
				
				MyPoint 클래스 : 좌표를 관리하기 위한 기능, 특성을 가진 클래스
				
 */
public class Ex03 {

	public static void main(String[] args) {
		
		MyPoint p1 = new MyPoint();
		// p1.x , p1.y
		p1.dispMyPoint();

		MyPoint p2 = new MyPoint();
		p2.x = 10;
		p2.y = 20;
		// p2.x , p2.y
		p2.dispMyPoint(); //> x=10, y=20
		
		//p2.offsetPoint(100); // 기본형 매개변수 
		//p2.dispMyPoint(); //> x=110, y=120
		
		p1.offsetPoint(100);
		p1.dispMyPoint(); //> x=100, y=100
		
		p1.offsetPoint(p2);	// 참조형 매개변수
		p2.dispMyPoint(); // > x=10, y=20
		p1.dispMyPoint(); // > x=110, y=120
		
		int x = p2.plusPointX();
		System.out.println(x); // 1010
		
		// 아래 두 코드는 p3의 결과가 같음
		//MyPoint p3 = p1.createMyPoint(p2);
		MyPoint p3 = p2.createMyPoint(p2);
		p3.dispMyPoint();
		
	}//main

}//class
