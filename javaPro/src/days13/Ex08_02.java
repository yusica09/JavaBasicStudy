package days13;

/**
 * @author yusica
 * @data 2025. 1. 13. - 오후 5:14:55
 * @subject
 * @content
 */
public class Ex08_02 {

	public static void main(String[] args) {
		
		// E e = new R() 	업캐스팅
		// R e2 = (R) e; 		다운캐스팅

		//Employee emp1 = new Employee("김이름", "서울 강남구", "010-1111-2222","2025.01.13");
		
		// 다운캐스팅 : 부모 -> 자식 형변환
		//Exception in thread "main" java.lang.ClassCastException: class days13.Employee cannot be cast to class days13.Regular (days13.Employee and days13.Regular are in module javaPro of loader 'app')
		//Regular emp2 = (Regular) emp1; // 이 경우 오류가 뜸
		// 		ㄴ 왜? : Ex08에서는 업캐스팅 후 다운캐스팅을 하였지만 이경우 처음부터 
		//                Employee로 객체 생성을 하였기때문에 안된다.
		System.out.println("end");
	}//main

}//class
