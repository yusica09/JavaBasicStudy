package days11;

/**
 * @author yusica
 * @data 2025. 1. 9. - 오후 12:09:48
 * @subject
 * @content
 */

//Illegal modifier(접+기) for the class Ex03; only public, abstract & final are permitted
public class Ex03 {
	
	//중첩 클래스
	//private class Sample{}
	
	public static void main(String[] args) {
		
		/* [ 클래스 선언 시 앞에 붙는 기타제어자 설명 ]
		 * 		1) abstract	 활성화 - 추상클래스로 선언
		 * 		2) final	활성화
		 * 			필드 앞 - 상수
		 * 			메서드 앞 - 오버라이딩 할 수 없는 메소드
		 * 			클래스 앞 - 자식을 가질 수 없는 최종(마지막) 클래스로 선언. 상속X
		 * 		3) static		비활성화	: 중첩 클래스를 선언할 때 사용 가능
		 * 					정적(static) 클래스
		 * 			(static 키워드에 대한 설명)
		 * 
		 * [ 1. 클래스 선언 시 앞에 붙는 접근 지정자 설명 ]
		 * 			독립적인 클래스를 선언할 때는 public, default 만 사용가능
		 * 		Person 클래스
		 * 		1) public	활성화 : 패키지 내/외부 에서 사용( 상속과 참조 ) 가능
		 * 		2) default 	활성화 : 패키지 내에서만 사용( 상속과 참조 ) 가능
		 * 		(==package)
		 * 
		 * 					중첩 클래스를 선언할 때 사용할 수 있다.
		 * 					(내부 클래스 	4가지 종류)
		 * 					왜? 클래스 안에 클래스 선언하는가?
		 * 		3) protected	비활성화 : 디폴트(패키지 내에서만 상속, 참조 가능) 
		 * 												+ 패키지 외부에서는 상속만 가능
		 * 		4) private	비활성화	: 같은 파일 내에서만 상속, 참조 가능
		 * 
		 * 		public > protected > default > private
		 * 
		 * [ 2. 필드, 메서드 선언 시 앞에 붙는 접근 지정자 설명 ]
		 * 		1)private
		 * 		2)public
		 * 		3)protected
		 * 		4)default
		 * 
		 * */
		
		// 같은 패키지 안에서 public 선언된 클래스 사용o
		// 다른 패키지 안에서 public 선언된 클래스 사용o
		
		// 같은 패키지 안에서 default 선언된 클래스 사용o
		// 다른 패키지 안에서 default 선언된 클래스 사용x
		//    ->person cannot be resolved to a type
		
		// public days11.Person;
		// days11.Ex03
		
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 20;
		p1.run();
		
		p1.name = "이름바꿈";
		p1.run();

	}//main

}//class
