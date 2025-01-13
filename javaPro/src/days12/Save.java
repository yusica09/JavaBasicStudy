package days12;

// 저축클래스
public class Save {
	
	// 필드
	// 인스턴스 변수
	private String name; //예금주
	private int money; //예금액
	//private double rate = 0.02 ; //이자율
	// 클래스 변수 == static 변수
	private static double rate = 0.02 ; //이자율
	
	// 생성자
	public Save(String name, int money, double rate) {
		//super();
		this.name = name;
		this.money = money;
		this.rate = rate;
	}
	// 디폴트 생성자
	public Save() {
		//super();
	}
	
	// 메서드
	// 예금 정보를 출력하는 메서드 선언
	
	public void printSave() {
		System.out.printf("> 예금주:%s, 예금액:%d, 이자율:%.2f\n"
				, this.name, this.money,this.rate);
	}

	// getter / setter
	/*
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	*/
	
	// 정적 메서드 == static 메서드 == 클래스 메서드 
		public static double getRate() {
			return rate;
		}
		
		public static void setRate(double rate) {
			int age = 10; // 지역변수 
			// this X
			Save.rate = rate;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	

}
