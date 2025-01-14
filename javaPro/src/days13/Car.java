package days13;

public class Car {
	
	//필드
	String name;
	String gearType;
	int door;
	
	// 필드(자료형이 클래스인 필드)
	// has-a 관계
	// 결합력이 높은 코딩 -> 좋지 않음
	//private Engine engine = new Engine(); // 명시적 초기화
	
	private Engine engine = null;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	//디폴트 생성자
	Car(){
		this.engine = new Engine();
	}

	public Car(Engine engine) {
		this.engine = engine;
	}

	//메서드
	void speedUp(int fuel) {
		this.engine.moreFuel(fuel);
	}
	void speedDown(int fuel) {
		this.engine.lessFuel(fuel);
	}
	void stop() {
		this.engine.stop();
	}

}
