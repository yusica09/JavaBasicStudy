package days15;

/**
 * @author yusica
 * @data 2025. 1. 15. - 오전 9:23:16
 * @subject		내부 클래스
 * @content
 */
public class Ex01 {

	// 1. 인스턴스 클래스
	class InstanceInner{
		int iv = 100; // 인스턴스 변수
		// static int cv = 100; // 클래스(static) 변수 [에러 X]
		final static int CONST = 100; // 상수 [가능]
	}

	// 2. static 클래스 
	static class StaticInner{
		int iv = 200; // 인스턴스 변수
		static int cv = 200; // 클래스(static) 변수
		final static int CONST = 100; // 상수 [가능]
	}


	void method1() {

		// 3. 로컬(Local) 클래스
		class LocalInner{
			int iv = 300; // 인스턴스 변수
			// static int cv = 100; // 클래스(static) 변수 [에러]
			final static int CONST = 100; // 상수 [가능]
		}

	}

	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);		
		System.out.println( StaticInner.CONST );
		System.out.println( StaticInner.cv );

	} // main

} // class
