package days11;

/**
 * @author yusica
 * @data 2025. 1. 9. - 오후 3:27:39
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// [클래스 배열 == 객체 배열]
		/*
		Person p1 = new Person();
		p1.name = "홍길동";
		
		Person p2 = new Person();
		p2.name = "가나다";
		
		Person p3 = new Person();
		p3.name = "라마바";

		Person p4 = new Person();
		p4.name = "사아자";
		
		Person p5 = new Person();
		p5.name = "차카타";
		*/
		
		
		//*********************
		// 배열 선언 형식
		// 자료형 [] 배열명 = new 자료형[배열크기];
		// 배열명일뿐 객체가 아니므로 객체를 만들어줘야함
		Person [] persons = new Person[5];
							// 배열크기 새로 생성 new
		for (int i = 0; i < persons.length; i++) {
			persons[i] = new Person();
						// 객체 새로 생성 new
		}
		
		
		// *******************
		// 클래스(객체) 배열 초기화
		// int [] num = {1,2,3}; 같이 나타내는 방법
		Person [] persons2 = {
				new Person(),
				new Person(),
				new Person(),
				new Person(),
				new Person()
		};
		
		
		persons[0].name =  "홍길동";
		persons[1].name =  "가나다";
		persons[2].name =  "라마바";
		persons[3].name =  "사아자";
		persons[4].name =  "차카타";
		
		for (int i = 0; i < persons.length; i++) {
			persons[i].run();
		}
	}

}
