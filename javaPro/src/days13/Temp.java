package days13;

//[ 임시직 사원 클래스 ]
// 급여 = 근무일수 * 하루일당
public class Temp extends Employee {
	
	// 필드 : name, addr, tel, hiredate
	private int days;				// 근무일수
	private int payOfDay;		//하루일당
	
	//생성자
	public Temp() {
		super();
		System.out.println("> Temp 디폴트 생성자 호출됨.");
	}
	
	public Temp(String name, String addr, String tel, String hiredate, int days, int payOfDay) {
		super(name, addr, tel, hiredate);
		this.days = days;
		this.payOfDay = payOfDay;
		System.out.println("> Temp 6 생성자 호출됨.");
	}
	
	// 사원정보를 출력하는 메서드
	@Override
	public void dispEmpInfo() {
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s, 근무일수:%d, 하루일당:%d\n",
				this.getName(),this.getAddr(), this.getTel(), this.getHiredate(), this.days,this.payOfDay);
	}
	
	//급여계산해서 반환하는 메서드
	public int getPay() {
		return this.days * this.payOfDay; 
	}
	
	

}
