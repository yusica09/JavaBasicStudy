package days02;

/**
 * @author yusica
 * @data 2024. 12. 24. - 오전 10:41:51
 * @subject 지역변수 ( Local variable )
 * @content
 * 지역변수 : 메서드, 생성자 또는 블록 내에서 선언되며, 
 * 		해당 블록(괄호)이 실행되는 동안에만 사용 가능한 변수
 */
public class Ex03 {
	{
		int age = 20; // 이 경우에도 블록안에 있으므로 지역변수
	}

	public static void main(String[] args) {
		
		String name; // 지역변수
		name = "이름1";
		// 정의: 메서드, 생성자 또는 블록 내에서 선언된 변수
		{
			char grade = 'A';
			// name 선언한 블록 내에 있으므로 선언 안해도 된다.
			name = "이름2"; 
		}
		name = "이름3";
		
	}

}
