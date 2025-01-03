package days06;

/**
 * @author yusica
 * @data 2025. 1. 2. - 오후 3:35:37
 * @subject   스위칭 변수 사용해서 문제 풀어보기
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		// [문제] 1/2-2/3+3/4-4/5 ... - 8/9 = ??
		
		double sum = 0;
		boolean sw = true;
		
		for(int i=1; i<9; i++) {
			System.out.printf(sw? " %d/%d -":" %d/%d +",i,i+1);
			sum = sum + (sw? (double)i/(i+1):-(double)i/(i+1));
			sw = !sw;
		}
		System.out.printf("\b = %f\n",sum);

	}//main

}
