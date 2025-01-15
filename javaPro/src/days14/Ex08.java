package days14;

/**
 * @author yusica
 * @data 2025. 1. 14. - 오후 3:49:28
 * @subject		인터페이스와 다형성을 이용하면 확장성이 매우 좋고 유지보수도 좋다
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		// 인터페이스 활용 예제 설명
		// days13.Car.java
		// days13.Engine.java 
		
		Car myCar = new Car(new H_Engine());
		myCar.setEngine(new K_Engine());
		myCar.speedUp(10); 	// *0.07
		
		// 5년 뒤에 X_Engine  		*0.15
		myCar.setEngine(new X_Engine());
	}

}
