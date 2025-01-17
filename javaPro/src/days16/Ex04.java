package days16;

/**
 * @author yusica
 * @data 2025. 1. 16. - 오전 11:29:09
 * @subject	문자열을 다루는 클래스
 * @content	1) String 클래스
 * 					2) StringBuffer 클래스
 * 					3) StringBuilder 클래스
 * 					4) StringTokenizer 클래스
 * 
 * 					이후)
 * 					java.util 패키지 안의 클래스 정리.
 * 					날씨/시간 다루는 클래스
 * 					컬렉션 프레임워크(JCF)
 */
public class Ex04 {

	public static void main(String[] args) {
		
		// [String 클래스]
		// 다른 언어에서는 문자열 : 	문자의 나열 		char[]
		// 자바 : String 클래스 사용
		// (암기) "변경 불가능한(immutable) 클래스"이다.
		// String name = new String(); X
		String str = "문자열"; // 힙 영역에 메모리가 붙잡히고 난후에 문자열이 들어간 주소값 할당
		String str1 = "문자열";
		String name = new String("문자열"); 
		
		System.out.println(str == str1); // true
		
		System.out.println(str == name); //false
		System.out.println(str.equals(name)); //true
		
		System.out.println(name.toString());
		System.out.println(name);
		
		
		
		
	}//main

}//class
