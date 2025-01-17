package days16;

import java.util.Arrays;

/**
 * @author yusica
 * @data 2025. 1. 16. - 오전 11:49:42
 * @subject		String의 메서드
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		
		String str = "public static void main(String[] args) {";
		// 1. 문자열 길이
		int len = str.length();
		System.out.println(len); //40
		
		// 2. 문자열 속에서 특정 위치의 한 문자를 반환하는 메서드 charAt(index)
		System.out.println(str.charAt(0));
		// 가장 마지막 한 문자
		System.out.println(str.charAt(len-1));
		/*
		str = reverse(str);
		System.out.println(str.charAt(0));
		*/
		
		/*
		// 3. 대문자로 변환하는 메서드
		str = str.toUpperCase();
		System.out.println(str);
		// 4. 소문자로 변환하는 메서드
		str = str.toLowerCase();
		System.out.println(str);
		*/
		
		// 5. true / false 			str.matches(String regex)
		// 6. String -> char[]	변환해서 사용할 일이 많이 있다.
		char [] strArr = str.toCharArray();
		System.out.println(Arrays.toString(strArr));
		
		// 7. str.trim()		앞뒤 공백을 제거하는메서드		ltrim() 	rtrim()
		
		// 8. [문제] str 문자열 속에 main 문자를 찾아서 MAIN으로 변경.
		/*
		System.out.println(str.contains("main")); //true
		System.out.println(str.contains("abc")); //false
		// 있는 위치 : indexOf() , lastIndexOf()  -> return 값 int
		// indexOf 는 앞에서부터 찾음(여러개 있는 경우 앞의 것이 찾아짐)
		System.out.println(str.indexOf("main")); //19
		System.out.println(str.indexOf("abc")); //-1
		// lastIndexOf 는 뒤에서부터 찾음(여러개 있는 경우 뒤의 것이 찾아짐)
		System.out.println(str.lastIndexOf("main")); //19
		System.out.println(str.lastIndexOf("abc")); //-1
		*/
		
		//[1]
		String searchWord = "MaiN";
		int index = (str.toLowerCase()).indexOf(searchWord.toLowerCase());
		
		System.out.println(str.substring(0, index) + searchWord.toUpperCase()
		+ str.substring(index + searchWord.length()) );
		/*
		//[2]
		str = str.replace("main", "MAIN");
		System.out.println(str);
		*/
		
		// 9. concat()		두 문자열을 연결해서 연결된 문자열을 반환하는 메서드
		// String result = "aaa".concat("bbb").concat("ccc");
		String result = "aaa" + "bbb" + "ccc";
		System.out.println(result);
		
		//10. 두 문자열 비교 equals()
		String a = "abc";
		String b = "aBc";
		System.out.println(a.equals(b)); //false
		//대소문자 구분하지 않고 같다, 다르다.
		//System.out.println(a.toUpperCase().equals(b.toUpperCase())); // true
		System.out.println(a.equalsIgnoreCase(b)); //true
		
		
	}//main

	private static String reverse(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			result = str.charAt(i) + result;
		}
		return result;
	}

}//class
