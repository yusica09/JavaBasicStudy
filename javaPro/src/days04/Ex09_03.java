package days04;

/**
 * @author yusica
 * @data 2024. 12. 27. - 오후 5:32:38
 * @subject   for문과 while문의 증감은 +1 만 가능한게 아님.
 * @content
 */
public class Ex09_03 {

	public static void main(String[] args) {
		
//		for문 2씩 증가시켜서 홀수 합 구하기
		
//		int sum = 0;
//		
//		for(int i=1;i<=10;i+=2) {
//			System.out.printf(" %d +",i);
//			sum += i;
//		}
//		System.out.printf(" = %d",sum);
		
		
		int sum = 0, i = 1;
		while(i <= 10) {
			System.out.printf(" %d +",i);
			sum += i; i += 2;
		}
		System.out.printf("= %d",sum);
	}

}
