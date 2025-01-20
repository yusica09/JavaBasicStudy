package days17;

/**
 * @author yusica
 * @data 2025. 1. 17. - 오후 12:40:44
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		
		// 래퍼(Wrapper)클래스
		// 기본형 8가지를 사용하기 쉽도록 기능이 구현된 클래스
		
		// boolean -> Boolean
		// char                    -> Character
		// byte -> Byte
		// short -> Short
		// int                        -> Integer
		// long -> Long
		// float -> Float
		// double -> Double
		
		/*
		 * [ 상속 계층도 ]
		 * 
		 * Object
		 * 		ㄴ	Boolean
		 * 		ㄴ	Character
		 * 		ㄴ	Number	추상클래스
		 * 					ㄴ Byte
		 * 					ㄴ Short
		 * 					ㄴ Integer
		 * 					ㄴ Long
		 * 					ㄴ Float
		 * 					ㄴ Double
		 * 
		 * 					ㄴ BigInteger 클래스
		 * 					ㄴ BigDecimal 클래스
		 * 		
		 * */
		
		int i = 10;
		// "100" -> int
		int j = Integer.parseInt("100");
		
		Integer i2 = new Integer("20");
		
		int j2 = i2.intValue();
		
		
		// Integer.MAX_VALUE;
		// Integer.MIN_VALUE;
		
		// 오토박싱 & 오토언박싱
		// Auto Boxing & Auto UnBoxing
		int x = 100;
		
		// 오토박싱
		//   기본형(int) -> 자동으로 래퍼클래스 객체로 변환
		// int -> Integer 형변환 : 오토 박싱
		Integer y = x;
		
		// 오토 언박싱
		// Integer 객체 -> int 형변환
		int z = y;
		
		// int -> Integer -> Object
		test(100);
	
	} // main
	
	private static void test(Object i) { 
		// 모든 기본형 -> 래퍼클래스 오토박싱  -> Object 
		// System.out.printf();
		
	}

}//class
