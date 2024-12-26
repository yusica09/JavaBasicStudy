package days02;

/**
 * @author yusica
 * @data 2024. 12. 24. - 오전 11:10:49
 * @subject 지역변수_3
 * @content
 */
public class Ex03_03 {

	public static void main(String[] args) {
		String name = "이름1";
		// Duplicate local variable name
		// 중복된 지역변수 이름 사용 x
		//String name = "이름2";
		{
			// Duplicate local variable name
			// 이 경우도 중복된 지역변수 사용이므로 X
			//String name = "이름3";
		}
	
		
	}

}
