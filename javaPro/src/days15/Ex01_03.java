package days15;

/**
 * @author yusica
 * @data 2025. 1. 15. - 오전 9:47:25
 * @subject	내부클래스에서 외부클래스의 필드에 접근하는 방법
 * @content
 */
public class Ex01_03 { // 외부클래스

	// 외부클래스의 필드
	private int outerIv = 0;
	static  int outerCv = 0;

	class InstanceInner{
		int a = outerIv; // private 외부 필드
		int b = outerCv; // 외부 static 변수
	}	   // 1.

	static class StaticInner{
		// static 클래스에서 외부클래스의 인스턴스멤버 접근할 수 없다. 
		static int scv = outerCv;  // 외부클래스의 static 멤버는 접근 가능.
	} // 2

	void method1() {

		int lv = 0;
		final int LV = 0;

		class LocalInner{
			int c = outerIv; // 외부클래스 모든 필드 접근 가능
			int d = outerCv; //

			int x = lv; // X  (jdk1.8부터 가능하다)
			int y = LV;
		}    // 3.   

	}

	public static void main(String[] args) {

	} // main

} // class

