package days13;

//[ 영업직 사원 클래스 ]  
public final class SalesMan extends Regular{

	// 필드 : name, addr, tel, hiredate, basePay
	private int sales; // 판매량
	private int comm; // 커미션
	
	//생성자
	public SalesMan() {
		super();
		System.out.println("> SalesMan 디폴트 생성자 호출됨.");
	}
	public SalesMan(String name, String addr, String tel, String hiredate
			, int basePay, int sales, int comm) {
		super(name, addr, tel, hiredate, basePay);
		this.sales = sales;
		this.comm = comm;
		System.out.println("> SalesMan 7 생성자 호출됨.");
	}
	
	// 메서드 : dispEmpInfo() , getPay() , getter / setter
	@Override
	public void dispEmpInfo() {
		//super.dispEmpInfo();
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s, 기본급:%d, "
				+ "판매량:%d , 커미션:%d\n",
				this.getName(),this.getAddr(), this.getTel(), this.getHiredate(), this.getBasePay(),this.sales, this.comm);
	}
	
	@Override
	public int getPay() {
		// 영업직은 기본급 + 판매량 * 커미션
		// 아래 둘다 가능
		//return this.getBasePay() + this.sales * this.comm; 
		return super.getPay() + this.sales * this.comm; 
	}
	
	
	
}

//The type LastChild cannot subclass the final class SalesMan
//class LastChild extends SalesMan{ }