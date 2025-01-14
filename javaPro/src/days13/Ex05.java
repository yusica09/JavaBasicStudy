package days13;

import java.io.IOException;

/**
 * @author yusica
 * @data 2025. 1. 13. - 오후 2:01:55
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		// 도형 클래스(원, 삼각형, 사각형)
		Shape s = new Shape();
		// s.  9개의 메서드가 보임. 모든 클래스의 최상위 부모클래스는 Object 클래스
		// Object 클래스의 메서드 이해..
		
		
		// 원점
		Point center = new Point(50, 50);
		int radius = 10;
		Circle c = new Circle(center, radius);
		c.color ="red";
		c.draw(); // 오버라이딩(== 재정의함수 ) 
		
		// 구분선
		System.out.println("=".repeat(30));
		
		Point [] p = {
				new Point(1, 1),
				new Point(20, 40),
				new Point(10, 5)
		};
		Triangle t = new Triangle(p);
		
		//	Unhandled exception type IOException
		t.draw();
		
		/*
		 * 1. Shape.draw() 메서드의 접근지정자  default -> public 수정 
		 *   2군데 에러가 발생하더라.. 
		 *   그 이유 ? 
		 *   1) 오버라이딩을 할 때 메서드명은 동일해야 한다. 
		 *   2) 매개변수 타입+갯수 동일해야 한다. 
		 *   3) 리턴자료형도 동일해야 한다. 
		 *   4) 접근지정자는 부모 보다 같거나 큰 접근지정자를 사용할 수 있다. 
		 *      default -> default < proteced < public 
		 *      public  -> public 
		 *   5) 예외는 부모의 예외보다 많을 수 없다. ( 의미 )
		 *   6) 인스턴스 메서드  <-> static 메서드로 변경 X  
		 * */


	}//main

}//class

// 도형 클래스
// 일반적으로 extends Object가 생략되어있는 상태.
class Shape extends Object{
	// 필드
	String color = "black";
	//생성자
	//메서드
	public void draw() throws IOException {
		System.out.printf("[color=%s]\n", color);
	} 

	
	
}
/*
// 도형 - 원 상속 X
class Circle{
	
	//필드
	int x;
	int y;
	int r; //반지름 radius
	
	//생성자
	Circle(int x, int y, int r){
		this.x = x;
		this.y = y;
		this.r = r;
		
	}
	
	public Circle() {
		this(0,0,0);
	}
	
} 
*/

// 상속관계 == is - a 관계
//				~은   ~이다
// 				원은 도형이다 (o)
class Circle extends Shape{
	
	//필드
	Point center; // 원점 has -  a 관계
	int r; //반지름 radius
	
	//생성자
	Circle(Point center, int r){
		this.center = center;
		this.r = r;
		
	}
	
	public Circle() {
		this(new Point(0,0),0);
	}
	
	//메서드
	// Shape -> draw() 메서드를 재정의 함수.. Override
	@Override
	public void draw() { // throws IOException{
//		super.draw();
//		System.out.printf("[color=%s, center=(%d, %d)]\n"
//				, color, this.center.x, this.center.y);
		
		System.out.printf("[color=%s, center=%s]\n"
 				, color, this.center.getXY());
	}

	
}//circle class

// 삼각형 클래스
//한 평면상에 있고, 일직선상에 없는 3개의 점 a,b,c를 2개씩 쌍으로
//하여 선분을 연결하여 이루어지는 도형.
class Triangle extends Shape{
	// 필드
	// 꼭지점 3개
	Point [] p = new Point[3]; // 배열
	
	// 생성자
	Triangle(  Point [] p  ) {
		this.p = p;
	}

	// 
	@Override
	public void draw() { //  throws IOException{
		System.out.printf("[p1=%s, p2=%s, p3=%s]\n"
				,  p[0].getXY(),  p[1].getXY(),  p[2].getXY());
	}

}


class Point{
	//필드
	int x;
	int y;
	
	//생성자
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	Point(){
		this(0,0); // 또 다른 생성자를 호출하는 this
	}
	//메서드
	String getXY() {
		return String.format("(%d, %d)", this.x, this.y);
	}
	
}