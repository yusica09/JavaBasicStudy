package days11;

public class Ex02 {

	public static void main(String[] args) {
		
		// 클래스, 객체, 인스턴스 구분
		// int age; // 지역변수 age
		
		// 참조변수 : 주소값을 갖는 변수
		// int [] m = new int[3];
		// m : 변수,지역변수,참조변수,배열명
		
		// 객체 : 클래스를 자료형으로 선언된 참조변수
		// 변수 선언 형식 : 자료형 변수명[=초기값]
		Car myCar = null;
		// myCar : 변수, 지역변수, 참조변수, [객체]
		
		// 인스턴스화 과정 == 객체 생성 과정 => 인스턴스
		// new 클래스명()
		myCar = new Car();
		
		// The local variable myCar may not have been initialized
		//        days11.Car@5594a1b5
		//System.out.println(myCar);
		
		// 객체명 메서드명;
		myCar.dispCarInfo();
		
		// 객체명.필드명;
		// 클래스의 멤버변수인 필드는 각 자료형의 기본값으로 초기화 되어있음.
		myCar.name = "K9";
		myCar.speed = 300;
		
		myCar.dispCarInfo();
		System.out.printf("> 차명:%s, 속도:%d \n", myCar.name, myCar.speed);
		
		// Random rnd = new Random();
		// Scanner sc = new Scanner(System.in);
		
		// "인스턴스화" 할 수 없다.
		// 객체를 생성하는 과정 == 인스턴스화
		// 아래의 코드가 오류가 뜨는 이유는 System 클래스는 객체 생성 X
		// System s = new System();
		
	}//main

}//class
