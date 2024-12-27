package days03;

/**
 * @author yusica
 * @data 2024. 12. 26. - 오후 2:08:34
 * @subject 논리연산자
 * @content true / false
 * 			1) 일반 논리 연산자
 * 			   - 우선 순위
 * 				!   >   &&   >  ||
 * 
 * 				(1) !  부정(not) 연산자
 * 					!true => false
 * 					!false => true
 * 
 * 				(2) && 일반 논리 AND 연산자 ( 논리곱 )
 * 					T && T => T		둘 다 참일때만 참
 * 					T && F => F
 * 					F && T => F
 * 					F && F => F
 * 					
 * 				(3) || 일반 논리 OR 연산자( 논리합 )
 * 					T || T => T		둘 중 하나이상 참이면 참
 * 					T || F => T
 * 					F || T => T
 * 					F || F => F
 * 
 * 			2) 비트 논리 연산자
 * 				(1) ~ (Tilde) 비트 논리 NOT 연산자
 * 				(2) & 비트 논리 AND 연산자
 * 				(3) | 비트 논리 OR 연산자
 * 				(4) ^ e[x]clusive OR 연산자 == XOR 연산자 == 배타적인 연산자
 */
public class Ex04_04 {

	public static void main(String[] args) {
		//1)일반 논리 연산자 예제
		
		System.out.println(!true);
		System.out.println( 5 > 3);
		//The operator ! is undefined for the argument type(s) int
		// c언어에서는 그냥 숫자는 true로 인식이 가능하므로 !100 은 false를 의미
		// 자바에서는 불가능.
		// 아래의 경우 !가 >보다 우선순위가 높으므로 무조건 괄호 필요
		//System.out.println( !5 > 3);
		System.out.println( !(5 > 3));
		System.out.println( !(5 > 3) && !true);
		//							   false
		//							효율적 연산(short circuit evaluation)
		System.out.println( !(5 < 3) || !true);
		//							   true
		//							효율적 연산(short circuit evaluation)
		
		
		// 2) 비트논리연산자 예제
		
		byte i = 10;
		
		System.out.println(~i); //-11
		//  0000 1010
		//  1111 0101  => -11
		//  1111 0100
		//  0000 1011   => 11
		
		System.out.println(i & 3); //2
		//    0000 1010
		// & 0000 0011
		// --------------
		//    0000 0010   => 2
		
		System.out.println(i | 3); //11
		//    0000 1010
		// |  0000 0011
		// --------------
		//    0000 1011   => 11
		
		System.out.println(i ^ 3); //9
		//    0000 1010
		// ^ 0000 0011
		// --------------
		//    0000 1001   => 9

	}

}
