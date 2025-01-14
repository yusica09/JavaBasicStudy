package days13;

/**
 * @author yusica
 * @data 2025. 1. 13. - 오전 10:49:37
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		/*
		 * [ 클래스들간의 2가지 관계 ]
		 * 1) has-a 관계(소속 관계)
		 * 		자동차 클래스				- Car
		 * 		ㄴ 엔진(1) 클래스		- Engine
		 * 2) is-a 관계(상속 관계)
		 * 
		 * */
		
		// 외부에서 자동차 객체 생성할 때 엔진객체 주입(inject)
		// 의존 관계(의존성 dependency)
		// 의존성 주입(DI)
		//		1) 생성자 통해서 주입
		//		2) setter 통해서 주입
		
		// 엔진
		Engine a_engine = new Engine();
		Engine b_engine = new Engine();
		Engine c_engine = new Engine();
		
		//The constructor Car(Engine) is undefined
		// 생성자 통해서 주입
		//Car myCar = new Car(c_engine);
		
		//setter 통해서 주입
		Car myCar = new Car();
		myCar.setEngine(a_engine);
		
		myCar.getEngine().speed = 100;
		myCar.speedUp(10);
		
		int speed = myCar.getEngine().speed;
		System.out.println("현재 속도 : " + speed);
		
		System.out.println("end");

	}

}
