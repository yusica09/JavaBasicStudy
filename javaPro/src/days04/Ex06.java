package days04;

import java.util.Scanner;

/**
 * @author yusica
 * @data 2024. 12. 27. - 오후 2:37:36
 * @subject 오전시간 복습 및 여러가지 for문 사용
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print(">정수 입력: ");
//		int n = scanner.nextInt();
		
		// [문제1] if 정수 -> 짝/홀
//		if(n%2 == 0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//		}
		// [문제2] switch 정수 -> 짝/홀
//		switch (n%2) {
//			case 0:
//				System.out.println("짝수");
//				break;
//			default:
//				System.out.println("홀수");
//				break;
//		}
		
		// [문제3] for    1~10 출력
		
//		for(int i=1;i<=10;i++) {
//			System.out.println(i);
//		}
//		
//		for(int i=10;i>=1;i--) {
//			System.out.println(i);
//		}
		
//		for(int i=0;i<10;i++) {
//			System.out.println(10-i);
//		}
		
		int sum = 0;
		for(int i=1;i<=10;i++) {
			if(i != 10) System.out.printf(" %d +", i);
			else System.out.printf(" %d ", i);
			sum += i;
		}
		System.out.printf("= %d\n", sum);

	}

}
