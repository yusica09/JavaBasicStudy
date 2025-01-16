package days15;

public class Ex01_02 {

	class InstanceInner{}	
	static class StaticInner{}

	// 외부의 인스턴스 멤버 간에 서로 직접 접근 가능.
	// Ex01_02 클래스의 인스턴스 변수 + 자료형 ( 내부 인스턴스 클래스명 )
	InstanceInner iv = new InstanceInner();

	// Ex01_02 클래스의 static 변수 + 자료형 ( 내부 static 클래스명 )
	static StaticInner cv  = new StaticInner();

	// 인스턴스 메서드
	void method1() {

		class LocalInner{} // 초기화 블럭, 메서드 안 선언 가능

		LocalInner lv = new LocalInner();		
		// 인스턴스 메서드 안에서 내부클래스(인,s) 모두 접근 가능
		InstanceInner obj1 = new InstanceInner(); // O
		StaticInner obj2 = new StaticInner(); // O
	}

	// 클래스 메서드 
	static void method2() {
		// LocalInner lv = new LocalInner(); XX

		// InstanceInner obj1 = new InstanceInner(); // X
		// [해결]인스턴스 클래스 굳이 객체생성해서 사용하려면
		//      외부 객체를 먼저 생성 후 인스턴스 클래스 객체를 사용할 수 있다.
		Ex01_02 outer = new Ex01_02();
		InstanceInner obj3 = outer.new InstanceInner();



		StaticInner obj2 = new StaticInner(); // O
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	} // main

} // class

