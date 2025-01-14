package days13;

/**
 * @author yusica
 * @data 2025. 1. 13. - 오후 3:28:40
 * @subject		final 키워드 설명
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		/*
		 * [ final 키워드 설명 ]
		 * 
		 * 1. 변수 앞에	- 상수
		 * 		지역변수
		 * 		인스턴스 변수
		 * 		클래스 변수
		 * 
		 * 2. 메서드 앞에
		 * 		Ex06.java
		 * 		ㄴ parent class
		 * 		ㄴ Child 클래스
		 * 
		 *   오버라이딩을 할 수 없는 마지막(최종) 메서드를 선언할 때 
		 *    final 키워드를 메서드 앞에 붙인다.   
		 * 
		 * 
		 * 3. 클래스 앞에
		 * 		final Class SalesMan extends Regular{}
		 * 		ㄴ 	더 이상 자식 클래스를 가질 수 없는 최종(마지막) 클래스이다.
		 * 
		 * */
		
		//지역변수는 접근지정자 사용 불가
		// public final double PI= 3.141592; -> X
		final int MAX_VALUE = 10;
		
		Sample s = new Sample(100);
		s.plus(111);

	}

}

class Sample{
	
	// 지역변수 x
	// 멤버변수
	// 필드
	// ㄴ 인스턴스 변수
	
	//double pi = 3.141592;
	//final double PI = 3.141592; //상수
	public final double PI = 3.141592; //상수		명시적 초기화
	
	// 클래스 변수 -> 상수
	public final static double MIN_VALUE = 1;

    // The blank final field MAX_VALUE may not have been initialized
	public final int MAX_VALUE; // 상수
	
	{
		//MAX_VALUE = 100; 초기화 블럭
	}
	
	// 생성자 초기화
	public Sample(int maxValue) {
		this.MAX_VALUE = maxValue;
	}
	
	public void plus(final int value) { //111
					//		매개변수
					//     지역변수		상수
		
// 		value++;  1증가
//		value = 102;

	}
}
