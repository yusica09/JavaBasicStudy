package days15;

import days13.Employee;
import days14.Car;
import days14.Engine;

/**
 * @author yusica
 * @data 2025. 1. 15. - 오전 10:27:26
 * @subject
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {

		// Car    클래스

		// Engine 클래스
		// - has-a 관계 ( 포함(==소속) 관계 )

		// Engine 인터페이스
		// K_Engine 클래스 implements Engine   X 0.07
		// H_Engine 클래스 implements Engine
		// X_Engine 클래스 implements Engine

		// Y_Engine 클래스명 ... 
		Car myCar = new Car();
		// myCar.setEngine(new Y_Engine());  // DI
		myCar.setEngine(new Engine() {
			@Override
			public void moreFuel(int fuel) {
				System.out.println("스피드 올리는 메서드 구현");
			}

			@Override
			public void lessFuel(int fuel) {
				System.out.println("스피드 줄이는 메서드 구현");
			}

			@Override
			public void stop() {
				System.out.println("멈추는 메서드 구현");
			}			
		} );

		myCar.speedUp(10);

		System.out.println(" end ");


		// 일회용 - 임시직형태의 사원
		Employee emp = new Employee() {


			@Override
			public void dispEmpInfo() {				
				super.dispEmpInfo();
			}

			@Override
			public int getPay() {
				return 100000;
			}

		};

	} // main

} // class


// 새로운 Y엔진
class Y_Engine implements Engine{

	@Override
	public void moreFuel(int fuel) {
		System.out.println("스피드 올리는 메서드 구현");
	}

	@Override
	public void lessFuel(int fuel) {
		System.out.println("스피드 줄이는 메서드 구현");
	}

	@Override
	public void stop() {
		System.out.println("멈추는 메서드 구현");
	}

}

