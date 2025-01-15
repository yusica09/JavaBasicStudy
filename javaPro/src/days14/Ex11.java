package days14;

/**
 * @author yusica
 * @data 2025. 1. 14. - 오후 5:06:53
 * @subject	[ 내부(inner) 클래스 ] == 중첩 클래스
 * @content	- AWT, Swing과 같은 GUI 어플리케이션에서 이벤트 처리할때
 * 						자주 사용
 */
public class Ex11 {

	public static void main(String[] args) {
		/*
		 * [내부 클래스의 종류와 특징] - 선언위치
		 * 1. 인스턴스(instance) 클래스
		 * 2. 정적(static) 클래스
		 * 3. 지역(local) 클래스	  : 외부 메서드 안, 초기화 블럭 안 선언
		 * 4. 익명(anonymous) 	클래스		: 클래스명X (일회용)
		 * 											  클래스 선언 + 생성 (동시)
		 * 
		 * */
		
		

	}//main

}//class

class Outer{
	//필드
	int iv = 0; //인스턴스 변수
	static int cv = 0; //클래스변수
	// 인스턴스 클래스는 외부 클래스의 필드 선언 위치에 위치함
	class InstanceClass{
		// 주로 외부클래스의 인스턴스 멤버들과 관련된 
		// 작업을 할 목적으로 선언된 내부 클래스
	}
	static class StaticClass{
		// static 멤버처럼 다루어진다.
		// 주로 외부 클래스의 static 멤버들과 관련된 작업을 할 목적.
	}
	
	
	{
		//초기화블럭 -> 로컬클래스는 여기에도 존재할수있음
	}
	
	//메서드
	void method1() { // 메서드 안에서만 사용할 수 있는 클래스
		class LocalClass{//로컬클래스
			
		}
	}
	
}



/*
class Car{
   
   public Engine engine;
   
}

class Engine{
   
}
*/
/*
class Car{   // 외부 클래스 
   
   // 멤버 선언
   public class Engine{  // 내부 클래스
      // 장점 : 내부 클래스에서 외부 클래스의 멤버들을 쉽게 접근할 수 있다. 
      //       코드의 복잡성을 줄일 수 있다 ( 캡슐화 )
   }
   
}
*/


//중첩(내부) 클래스
		// 예외처리
		// Object 메서드 설명
		// 문자열 다루는 클래스 
		// 날짜,시간 클래스
		// 컬렉션 프레임워크
		// 자바 IO