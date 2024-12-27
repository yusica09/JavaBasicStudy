package days03;

/**
 * @author yusica
 * @data 2024. 12. 26. - 오후 5:21:28
 * @subject 숫자 자료형 -> String 으로 변환하는 방법들
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		/*
		 * 1. String -> byte, short, int, ... 
		 *   : wrapper class 이용, ex) Byte.parseByte( ); 
		 *   
 		 * 2. byte, short, int ...  -> String
		 *  	: 숫자에 문자열 더하기. 
		 */
		// int -> String  
		int i = 10; // -> "100"
		// 1) 첫번째 방법
		String str1 = i + "";
		// 2) 두번째 방법
		String.valueOf(i);
		// 3) 세번째 방법
		//Integer.toString(i);
		System.out.println(Integer.toString(i)); // "10"
		
		System.out.println(Integer.toOctalString(i)); // "12" 8진수 문자열
		System.out.println(Integer.toHexString(i)); // "a" 16진수 문자열
		System.out.println(Integer.toBinaryString(i)); // "1010" 2진수 문자열
		
	}

}
