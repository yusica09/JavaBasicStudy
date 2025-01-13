package days12;

/**
 * @author yusica
 * @data 2025. 1. 10. - 오후 2:02:30
 * @subject	[ this 키워드 ]
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		/*
		 * [ this ]키워드 설명
		 * 1. 정의 : 인스턴스가 생성되면 자기자신의 주소값을 갖는 참조변수
 		 * 2. 3가지 용도
		 * 		1) 멤버를 가리킬 때의 this 용도
		 * 			멤버 == 클래스(객체)의 구성요소
		 * 			멤버변수(필드)
		 * 			멤버함수(메서드)
		 * 		2) 생성자에서 또 다른 생성자를 호출 할 때의 this
		 * 			생성자 호출 시기 : 객체 생성될 때 .. + 자동
		 * 	          역할 : 필드 초기화  
		 *      왜 ? A생성자 -> B생성자 호출      
		 *   3) 단독(홀로)으로 사용될 때의 this
		 *      ㄴ 매개변수
		 *      ㄴ 리턴값 
		 *     */  

		
		/*
		Person p1 = new Person();
		p1.setName("홍길동");
		System.out.println(p1.getName());
		*/
		
		MyPoint p1 = new MyPoint(10, 20);
		p1.test();
		
		MyPoint p2 = new MyPoint(100);
		p2.test();
		
		//메서드 체인
		//p2.offsetPoint(5).dispMyPoint();
		p2
			.offsetPoint(5)
			.dispMyPoint();
		
		/*
		p2.offsetPoint(new MyPoint(1,1));
		p2.dispMyPoint();
		*/
		// 위코드는 가능하지만 아래코드는 불가능(리턴값과 인풋값이 안맞아서 따로처리해야함)
		/*
		p2
			.offsetPoint(new MyPoint(1,1))
			.dispMyPoint();
		*/
		

	}//main

}//class
