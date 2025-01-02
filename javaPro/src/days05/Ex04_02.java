package days05;

/**
 * @author yusica
 * @data 2024. 12. 30. - 오후 4:14:05
 * @subject
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// Scanner 한문자 읽어오는 메서드(함수) X
		
		// "가나다" -> '가' 첫번째 한 문자를 얻어오는 방법
		// "가" = '가' + '\0'
		
		String name = "홍길동";
		
		// String.charAt(Index)
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(2));
		
		String name2 = "hong gil dong";
		
		//문자열.length() : 문자열 길이
		//Systme.out.println(name.length());
		
		for (int i = 0;i < name2.length(); i ++) {
			System.out.println(name2.charAt(i));
		}

	}//main

}//class
