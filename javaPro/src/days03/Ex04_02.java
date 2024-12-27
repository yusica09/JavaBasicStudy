package days03;

/**
 * @author yusica
 * @data 2024. 12. 26. - 오후 12:32:12
 * @subject 산술 연산자(이항 연산자) 설명
 * @content   +  -  *   /
 * 
 * 				쉬프트연산자 ( <<  ,   >> )
 * 
 */
public class Ex04_02 {

	public static void main(String[] args) {
		
		// 1) 산술 연산자 예제
		
		int i = 10, j = 3;
		
		// alt + shift + a
		System.out.println(i + j); //13
		System.out.println(i - j); //7
		System.out.println(i * j); //30
		System.out.println(i / j); //3  -> int 나누기 int 하기 때문에 int로 나옴
		System.out.println(i % j); //1
		
		// <주의할 점>
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		//System.out.println(10 / 0);
		System.out.println(10F / 0); //Infinity -> 오류가 아닌 리터럴값
		
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		//System.out.println(10 % 0);
		System.out.println(10D % 0); //NaN -> 오류가 아닌 리터럴값
		
		// 정수를 0으로 나누면 오류, 실수를 0으로 나누면 Inf
		// 정수를 0으로 나누고 나머지구할때 오류, 실수의 경우 NaN(Not a Number)
		
		
		
		// 2) 쉬프트(shift) 연산자
		
		// shift 사전적 의미 : 방향을 바꾸다. 물건을 이동시키다(옮기다).
		System.out.println(15 >> 2); //3
		// 0000 1111 >> 2
		// __00 0011 -> 0으로 시작하므로 빈칸은 다 0으로 채움 / 1로 시작하면 빈칸은 다 1로 채움
		// 0000 0011 => 3
		System.out.println(15 << 2); //60
		// 0000 1111 << 2
		// 0011 11__ -> 0으로 빈칸 채우기
		// 0011 1100  => 60
		
		
	}

}
