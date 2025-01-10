package days11;

public class Car {
	// 지역변수 라고 하지 않음 (지역변수 X)
	// 필드(field) == 속성 == 특성 == property == 멤버변수
	String name = null; // 자동차 이름
	int speed = 0;	// 속도
	int wheelCount = 0;	//바퀴 수
	
	// 메서드(method) == 기능 == 일 == 멤버함수
	public void dispCarInfo() {
		System.out.printf("> 차명:%s, 속도:%d \n", name, speed);
	}

}
