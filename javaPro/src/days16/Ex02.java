package days16;

/**
 * @author yusica
 * @data 2025. 1. 16. - 오전 10:03:59
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		
		// Object 메서드
		// 1. hashCode()
		// 2. getClass()
		// 3. toString()
		// 4. equals()
		
		// 두 객체가 같은가? -> '=='사용 불가
		//Value v1 = new Value(10);
		//Value v2 = new Value(10);
		//Value v2 = v1;
		
		
		//System.out.println(v1 == v2); // false
		
		//Object.equals() 메서드	->  ==와 동일한 결과값이 나온다
		//System.out.println(v1.equals(v2)); // false
		
		//Object.equals() 메서드 를 Value 클래스에서 오버라이딩
		// v1, v2   value 필드의 값이 같으면 다른 인스턴스여도 같다라고 출력..
		//System.out.println(v1.equals(v2)); // true
		
		// [ 문제 ] Point 클래스
		//			x , y 필드값이 같으면 equals() -> true  되도록 오버라이딩
		
		//Point p1 = new Point(1,2);
		//Point p2 = new Point(1,2);
		
		//System.out.println(p1.equals(p2));
		
		// 5. clone()
		//			ㄴ 복제 의미 ? 같은 값을 가지는 새로운 인스턴스 생성 . 
		Point p1 = new Point(10,20);
		
		// 복제 
		/* [1]
		Point p2 = new Point();
		p2.x = p1.x;
		p2.y = p1.y;
		*/
		/* [2]
		Point p2 = new Point(p1.x,p1.y);
		*/
		
		//The method clone() from the type Object is not visible
		//		-> 오버라이딩 이용
		Point p2 = (Point) p1.clone();
		System.out.println(p2.equals(p1));
		
		Point p3 = p1.clone();
		
		System.out.println(p1); // .toString이 생략된 형태이므로 그냥 적어도 된다
		System.out.println(p2);
		

	}//main

}// class

class Value extends Object {
	int value;
	
	public Value(int value) {
		this.value = value;
	}

	// 오버라이딩 조건
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Value) {
			Value v = (Value)obj; // 다운캐스팅
			return this.value == v.value;
		}
		return false;
	}
	
}

class Point extends Object implements Cloneable{
	int x;
	int y;
	
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//p1.equals(p2)
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Point) {
			Point p = (Point)obj; // 다운캐스팅
			return (this.x == p.x) && (this.y == p.y);
		}
		return false;
	}
	
	
	/*
	// Point p2 = p1.clone()
	//Object.clone() 메서드를 이용하여 객체를 복제할 때 
	//Clonable 인터페이스를 상속하지 않은 클래스를 복사하려고 한다면 
	//CloneNotSupportedException이 발생
	@Override
	protected Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
	*/
	
	// jdk1.5 부터 "공변 반환 타입" 추가
	// 오버라이딩 할 때 조상 메서드의 반환타입을 자식 클래스의 타입으로 변경이 가능해짐
	@Override
	protected Point clone() {
		Point obj = null;
		try {
			obj = (Point) super.clone(); //제대로 적은건지 확인
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}
