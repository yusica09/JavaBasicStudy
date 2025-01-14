package days13;

public class Ex08 {

	public static void main(String[] args) {
		/*
		 * 1. 상속성
		 * 2. 다형성 / 인터페이스
		 * 3. 업캐스팅 / 다운캐스팅
		 * 4. 오버로딩 / 오버라이딩
		 * 5. 추상화 ( 추상메서드, 추상 클래스 )
		 * 6. this, super 키워드 사용
		 * 등등
		 * 
		 * 
		 * 1. 사원이라면 공통적으로 가지고 있어야할 멤버들을 선언한 
		 * 		Employee 라는 사원클래스 선언
		 * 2. 사원클래스의 자식클래스인 정규직 사원 클래스 Regular
		 * 3. 정규직 클래스를 물려받은 자식 클래스인 영업직 사원 클래스 SalesMan
		 * 4. 사원클래스의 자식 클래스인 임시직 사원 클래스 Temp
		 * 
		 * [ 상속 계층도 ]
		 * 
		 * 			object
		 * 				l
		 * 			employee
		 *			/			\		
		 *	regular			temp
		 *		l
		 *	salesMan
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		/*
		// 1. 사원(Employee) 객체 생성 후 메서드 호출
		Employee emp1 = new Employee("김이름", "서울 강남구", "010-1111-2222","2025.01.13");
		emp1.dispEmpInfo();
		*/
		
		/*
		// 2. 정규직(Regular) 객체 생성
	    // 상속관계에서 객체 생성시 생성자 호출 순서 ( 기억 )
		Regular emp2= new Regular("김이름", "서울 강남구", "010-1111-2222",
				"2025.01.13",3000000);
		// [문제점] 부모의 dispEmpInfo() 메서드를 사용하면 문제점이 있다.
			//		basePay 기본급과 관련된 사원정보는 출력되지 않음.. -> 오버라이딩 이용
	
		emp2.dispEmpInfo();
		*/
		
		
		// 클래스들 간에 형변환할 수 있다. 왜 ?
		// 클래스들 간에 자동으로 형변환이 되었다.
		// 1) UpCasting (자동 업캐스팅)
		// 부모타입 참조   <-  자식 객체 생성 후
		Employee emp1 = new Regular("김이름", "서울 강남구", "010-1111-2222","2025.01.13",3000000);
		// Type mismatch: cannot convert from Regular to Temp
		//   ㄴ 클래스들 간의 상속 관계가 있을 경우에만 형변환이 가능하다.
		// Temp emp4 = new Regular("박이름", "서울 강북구", "010-1122-3344", "2025.01.13", 2000000);
		Employee emp3 = new Regular("김이름", "서울 강남구", "010-1111-2222","2025.01.13",3000000);
		// [질문] dispEmpInfo() n, a, t, h + basePay
		// Employee의 메서드가 호출될까요? Regular의 메서드가 호출될까요?
		// [** 중요 **]실제 참조된 Regular 객체의 dispEmpInfo() 메서드가 호출된다.
		emp3.dispEmpInfo();
		
		// [문제점] 업캐스팅 후의 문제점 파악
		// emp3.getPay();  X
		
		// 자동 업캐스팅(upCasting) 		 : 부모 <- 자식으로 형변환
		// 강제 다운캐스팅(downCasting)   : 부모 -> 자식으로 형변환
		
		// 클래스들 간의 형변화할 때 사용하는 연산자 : (변환하고자하는 클래스명) cast 연산자
		Regular emp4 = (Regular) emp3;
		
		
		/*
		[형변환]
		1) 자동형변환 2가지 경우
		2) 강제형변환 - cast 연산자
		//long = int 자동 형변환
		long l = 100;
		// int = long 자동 형변환 X, 강제 형변환 O		cast 연산자
		int i =(int)1;		
		*/
		

	}//main

}//class
