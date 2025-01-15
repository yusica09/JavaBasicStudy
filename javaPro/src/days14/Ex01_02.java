package days14;

import days13.Employee;
import days13.Regular;
import days13.SalesMan;
import days13.Temp;

/**
 * @author yusica
 * @data 2025. 1. 14. - 오전 10:38:32
 * @subject
 * @content
 */

public class Ex01_02 {

	public static void main(String[] args) {
		// R/S/T 생성 -> E [] 클래스 배열 초기화
		
		/*
		Regular emp2 = new Regular("김이름", "서울 강남구", "010-1111-2222",
				"2025.01.13",3000000);
		SalesMan emp3 = new SalesMan("박이름","경기도 남양주","010-1234-1233"
				,"2000.03.29",1000000,20,150000);
		Temp emp4 = new Temp("오이름","서울 강북", "010-2345-2344","2021.11.12",
				30,100000);
		
		Employee [] emps = {emp2,emp3,emp4};
		*/
		
		// 클래스 배열 + 초기화
		Employee [] emps = {
				new Regular("김이름", "서울 강남구", "010-1111-2222",
						"2025.01.13",3000000),
				new SalesMan("박이름","경기도 남양주","010-1234-1233"
						,"2000.03.29",1000000,20,150000),
				new Temp("오이름","서울 강북", "010-2345-2344","2021.11.12",
						30,100000),
				new TempTwo()
		};
		
		for (int i = 0; i < emps.length; i++) {
			사원급여출력(emps[i]);
		}
		
	}//main
	
	// private static void 사원급여출력(Object emp)
	private static void 사원급여출력(Employee emp) { //매개변수 다형성
		System.out.println(emp.getPay());
		
		// E emp = R/S/T + getPay()
		// E.getPay() X
		// ==> emp.getPay(); X
		
		/* [1]
		if (emp instanceof SalesMan) {
			System.out.println(((SalesMan) emp).getPay());
		}else if(emp instanceof Regular){
			System.out.println(((Regular) emp).getPay());
		}else if(emp instanceof Temp) {
			System.out.println(((Temp) emp).getPay());
		}
		*/
		
		// [2] Employee.getPay() 추가 선언 - 추상메서드
	}

}//class


// 나중에 새로운 임시직이 생성 되더라도 위의 사원급여출력은 문제가 없다
class TempTwo extends Temp{
	
}