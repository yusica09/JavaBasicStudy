package days14;

public class Car {

	//필드
	String name;
	String gearType;
	int door;

	private Engine engine = null;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	//디폴트 생성자
	public Car(){
		this.engine = new K_Engine();
	}

	public Car(Engine engine) {
		this.engine = engine;
	}

	//메서드
	public void speedUp(int fuel) {
		this.engine.moreFuel(fuel);
	}
	void speedDown(int fuel) {
		this.engine.lessFuel(fuel);
	}
	void stop() {
		this.engine.stop();
	}

}