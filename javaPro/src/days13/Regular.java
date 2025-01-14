package days13;

// [ 정규직 사원 클래스 ]

public class Regular extends Employee{
	
	// 필드 - name, addr, tel, hiredate 상속
	// 메서드 - public getter, setter, dispEmpInfo() 상속
	// 생성자 상속 X
	
	// 필드
	private int basePay; // 기본급

	
	public Regular() {
		super();
		System.out.println("> Regular 디폴트 생성자 호출됨.");
	}

	public Regular(String name, String addr, String tel, String hiredate, int basePay) {
		super(name, addr, tel, hiredate);
		this.basePay = basePay;
		System.out.println("> Regular 5 생성자 호출됨.");
	}

	// getter, setter
	public int getBasePay() {
		return basePay;
	}

	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}
	
	//메서드
	// 급여 계산해서 반환하는 메서드
	public int getPay() {
		return this.basePay;	// 정규직은 기본급 ..
	}

	@Override
	public void dispEmpInfo() {
		/*
		super.dispEmpInfo(); // name, addr, tel, hiredate
		System.out.printf("기본급=%d\n", this.basePay);
		*/
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s, 기본급:%d\n",
				this.getName(),this.getAddr(), this.getTel(), this.getHiredate(), this.basePay);
	}
	
	
	
	
} // class
