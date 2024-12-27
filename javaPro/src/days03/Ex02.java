package days03;

/**
 * @author yusica
 * @data 2024. 12. 26. - 오전 10:28:17
 * @subject 기본형, 래퍼 클래스설명
 * @content Byte.parseByte() 설명, MAX_VALUE, (래퍼클래스).parse(형)()
 */
public class Ex02 {

	public static void main(String[] args) {

		/*
		 * [ Byte.parseByte() 설명 ] 기본형 클래스 == 객체 == object "래퍼 클래스( wrapper class )" :
		 * 기본형을 사용하기 쉽도록 기능(메서드)를 구현한 클래스 byte Byte long Long boolean Boolean
		 * 
		 */

		// 예시
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);

		// "90" - > byte 변환
		byte kor = Byte.parseByte("90");
		// int의 경우
		int kor2 = Integer.parseInt("90");
		// long, double
		long kor3 = Long.parseLong("90");
		double kor4 = Double.parseDouble("90");

	}

}
