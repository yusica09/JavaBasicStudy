package days13;

public class Engine {
	
	//필드
	int speed;
	
	//메서드
	void moreFuel(int fuel) {
		this.speed += fuel * 0.05;
		
	}
	void lessFuel(int fuel) {
		this.speed -= fuel * 0.05;
		
	}
	void stop() {
		this.speed = 0;
	}

}
