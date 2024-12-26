package days02;

/**
 * @author yusica
 * @data 2024. 12. 24. - 오후 3:05:33
 * @subject float(4), double(8)
 * @content
 */
public class Ex06_05 {

	public static void main(String[] args) {
		
		// 평균 저장 ( 실수 )
		// float(4), double(8)
		
		// double avg = 78.99;
		
		// 형변환 1) 자동형변환 2) 강제형변환 - cast 연산자 
		// Type mismatch: cannot convert from double to float
		//float avg = 78.99;
		float avg = 78.99f;// f 대신 F도 가능
		System.out.printf("%.2f\n", avg);
		
		// 0 int(4)  0L long(8)  -> 같은 0 이지만 int에서 0과 long에서 0은 다르다
		// 0F float(4) == 0.0F
		// 0D double(8)
		
		// 1 정수
		// '1' 문자
		// "1" 문자열 = '1' + '\0'

	}

}
