package days02;

/**
 * @author yusica
 * @data 2024. 12. 24. - 오후 12:30:17
 * @subject 논리형 ( Boolean )
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		// 성별: 남(true), 여(false) 설정해서 처리
		boolean gender;
		// Type mismatch: cannot convert from int to boolean
		// 변수에 할당한 값과 자료형이 다를 때 나타나는 오류.
		//gender = 0;
		gender = false;
		
		
		/*
		 	 					conversion
		 *String 				s
		 *int						d o x
		 *double				f e g a
		 *char					c C
		 *boolean				b B
		 */
		
		// 찾을 때는 Search - quick search에서 검색
		//%[argument_index$][flags][width][.precision]conversion
		
		//Exception in thread "main" 
		// java.util.MissingFormatArgumentException: 
		//  Format specifier '%B'
		// %B에 해당하는 매개변수가 없음
		//System.out.printf("성별:%b - %B\n", gender);
		System.out.printf("성별:%b - %B\n", gender, gender);
		// 이 두개는 같다. 1$는 넣은 매개변수중 첫번째것을 사용한단 의미
		System.out.printf("성별:%1$b - %1$B\n", gender);
		
		// 실행 시 %b는 소문자 출력 , %B는 대문자 출력
		

	}

}
