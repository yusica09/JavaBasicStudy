package days02;

/**
 * @author yusica
 * @data 2024. 12. 24. - 오후 4:08:08
 * @subject 실수의 2진수 표현(진법 변환)
 * @content
 */
public class Ex06_07 {

	public static void main(String[] args) {
		//  float, double 실수형 -> 2진수, 저장(표현)
		// 1) 실수 -> 2진수 표현(진법 변환)
		//     정수 10 -> 0000 1010
		/* [예]
		 * 0.625 실수 -> 2진수 변환(0,1)
		 * 0.625 x 2 = [1].25
		 * 0.25   x 2 = [0].5
		 * 0.5     x 2 = [1].0
		 * 					  0. 101(2진수)
		 *  				  1 x 2^-1 + 0 x 2^-2 + 1 x 2^-3 == 0.625
		 *  
		 *  0.7232 -> 0. 10101011010111111000011100111...
		 *  실수를 2진수로 변환할 때 오차가 생기게 되는 경우가 생긴다.
		 * 					  
		 * 2)
		 * int(4)
		 * [s][][][][][][][]  [][][][][][][][]  [][][][][][][][]  [][][][][][][][]
		 * long(8)
		 * [s][][][][][][][]  [][][][][][][][]  [][][][][][][][]  [][][][][][][][]
		 * [][][][][][][][]  [][][][][][][][]  [][][][][][][][]  [][][][][][][][]
		 * 
		 * 실수 자료형
		 * float(4)
		 * 부호비트(s) : 1bit
		 * 
		 * 				8비트 E(지수) :				23비트 M(가수):
		 * [s(1)][E][][][][][][]  [E]  [][][][][][][]  [][][][][][][][]  [][][][][][][][]
		 * double(8)
		 * 				13비트 E(지수):				52비트 M(가수):
		 * [s(1)][E][][][][][][]  [][][][][][]  [][E]  [][][][][][][][]  [][][][][][][][]
		 * [][][][][][][][]  [][][][][][][][]  [][][][][][][][]  [][][][][][][][]
		 *  
		 *  
		 *  ex)
		 *  9.123456 실수(유한소수)
		 *  
		 *  		무한소수
		 *  1001.00011111~~~
		 *  
		 *  부동소수점 표기 ( 형식을 원래 소수?에서 1. ~~~ 이런 형식이 되도록 만들어줘야함 )
		 *  1.00100011111~~~ x 2^3
		 *  
		 *  	3 + 127 = 130   E지수영역
		 *  
		 *  
		 *   - BigDecimal 클래스
		 */

		
	}

}