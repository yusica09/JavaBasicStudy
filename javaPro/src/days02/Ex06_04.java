package days02;

/**
 * @author yusica
 * @data 2024. 12. 24. - 오후 2:32:35
 * @subject 자바의 자료형(Data Type)
 * @content 기본형(8가지) - 정수계열( byte, short, int, long)
 */
public class Ex06_04 {

	public static void main(String[] args) {
		// 기본형(8가지) - 정수계열(byte, short, int, long)
		// 자료형 = 크기 + 유형(정수)
		
		// [문제] 나이를 저장할 변수를 선언하고 출력
		
		int age = 10;
		System.out.println(age);
		
		// byte - 1byte = 8bit = 2^8 = 256가지 , 
		//       그러나 맨 왼쪽 비트는 양수 음수 부호이므로 -128~127 정수												
		// short - 2byte = 2^16 = 65536가지, -32768 ~ 32767
		// int - 4byte = 2^32 = 대략 42억 넘음, -21억 ~ 21억 정수
		// long - 8byte
		
		
		// age는 최고 연령이 120이므로 byte로도 충분
		byte age2 = 20; // 0~120
		System.out.printf("%d\n",age2);
		
		// [문제] 국어점수 저장할 변수 선언
		// 0 ~ 100 정수 byte
		byte kor;

	}

}
