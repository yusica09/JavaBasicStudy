package days14;

import days13.Employee;
import days13.Regular;
import days13.SalesMan;
import days13.Temp;

/**
 * @author yusica
 * @data 2025. 1. 14. - 오전 9:33:10
 * @subject	업캐스팅, 다운캐스팅, 다형성
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		// 1. Employee
		// Cannot instantiate the type Employee - 객체생성할수없다 : 추상클래스로 바뀌었기때문
		//Employee emp1 = new Employee("김이름", "서울 강남구", "010-1111-2222","2025.01.13");
		
		// 2. Regular
		Regular emp2= new Regular("김이름", "서울 강남구", "010-1111-2222",
				"2025.01.13",3000000);
		
		// 3. 영업직 객체 생성
		SalesMan emp3 = new SalesMan("이름","경기도 남양주","010-1234-1233"
				,"2000.03.29",1000000,20,150000);
		//emp5.dispEmpInfo();
		//System.out.println(emp5.getPay());
		 
		// 4. 임시직 객체 생성
		Temp emp4 = new Temp("오이름","서울 강북", "010-2345-2344","2021.11.12",30,100000);
		//emp6.dispEmpInfo();
		
		// (가정: 사원들의 종류가 100가지 ..)
		//사원정보출력(emp1);
		사원정보출력(emp2); // E emp = new R() 상속관계, 업캐스팅
		사원정보출력(emp3); // E emp = new S() 상속관계, 업캐스팅
		사원정보출력(emp4); // E emp = new T() 상속관계, 업캐스팅
		
		// [ 다형성(polymorphism) ]
		// 1. 상속 관계
		// 2. 다양한 성질
		// 3. 여러가지 형태를 가질 수 있는 능력 -> 업캐스팅
		// 4. 조상클래스 타입의 참조변수로 자손클래스의 인스턴스를 참조할 수 있도록 한 것.
		
	}//main
	
	// [ *** ]  -> 다형성
	// 다 업캐스팅 되어 들어가기때문에 출력메서드를 하나만 사용해도 다 출력가능
	private static void 사원정보출력(Employee emp) {	// 매개변수의 다형성
		// 매개변수로 전달된 실제 객체가 E/R/S/T 파악	- instanceof 연산자 사용
		// instanceof 연산자 ->[문제점] 자동업캐스팅으로 인해 부모클래스도 다 true로 뜸
		//							***	ㄴ 자식클래스부터 확인 + if-else if 문 사용 
		if (emp instanceof SalesMan) {
			System.out.println("영업직");
		}else if(emp instanceof Regular){
			System.out.println("정규직");
		}else if(emp instanceof Temp) {
			System.out.println("임시직");
		}
		// 위 방법 말고 다 다운캐스팅해서 확인하는것도 방법
		
		/*
		System.out.println(emp instanceof Employee);
		System.out.println(emp instanceof Regular);
		System.out.println(emp instanceof SalesMan);
		System.out.println(emp instanceof Temp);
		*/
		emp.dispEmpInfo();
	}

	/*
	private static void 사원정보출력(Employee emp) {
		emp.dispEmpInfo();
	}
	
	private static void 사원정보출력(Regular emp) {
		emp.dispEmpInfo();
	}
	
	private static void 사원정보출력(SalesMan emp) {
		emp.dispEmpInfo();
	}
	
	private static void 사원정보출력(Temp emp) {
		emp.dispEmpInfo();
	}
	*/

}//class
