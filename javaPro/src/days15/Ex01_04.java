package days15;

/**
 * @author yusica
 * @data 2025. 1. 15. - 오전 10:10:53
 * @subject	외부클래스가 아닌 완전 다른 클래스에서 내부클래스의 멤버를 접근하는 방법
 * @content
 */
public class Ex01_04 {

	public static void main(String[] args) {
		Outer outer = new Outer(); // 외부클래스 객체 생성
		Outer.InstanceInner icObj = outer.new InstanceInner();
		System.out.println( icObj.iv ); // A

		// Outer.x
		System.out.println( Outer.StaticInner.cv );
		// ㄴstatic내부클래스(StaticInner)의 인스턴스변수  접근.
		Outer.StaticInner siObj = new Outer.StaticInner();
		System.out.println( siObj.iv );
	} // main

} // class

class Outer{ // 외부클래스

	static int x = 100;

	class InstanceInner{ 
		int iv = 100; // A
	}	  

	static class StaticInner{
		int iv = 200;
		static int cv = 300;
	} 

	void method1() {  
		class LocalInner{ 
			int iv = 400;
		}  
		//
	}

}

