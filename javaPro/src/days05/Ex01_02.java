package days05;

import java.util.Scanner;

public class Ex01_02 {

	public static void main(String[] args) {
		// [문제]
		// 두 정수 n,m 입력받고
		// 두 정수 사이의 사이의 합을 출력

		Scanner scanner = new Scanner(System.in);
		System.out.print("> 정수 n, m 입력(공백기준) : ");
		int n = scanner.nextInt();
		int m = scanner.nextInt();

		int sum = 0;
		
		
		// [1]
		/*
		if (n < m) {
			for (int i = n; i <= m; i++) {
				sum += i;
				System.out.printf(i == m ? " %d " : " %d +", i);
			}
			System.out.printf(" = %d\n", sum);
		} else {
			for (int i = m; i <= n; i++) {
				sum += i;
				System.out.printf(i == n ? " %d " : " %d +", i);
			}
			System.out.printf(" = %d\n", sum);
		}
		*/
		
		
		// [2] - [1]보단 더 좋은 코딩
		/*
		if (n > m) {
			int temp = n;
			n = m;
			m = temp;
		}
		
		for (int i = n; i <= m; i++) {
			sum += i;
			System.out.printf(i == m ? " %d " : " %d +", i);
		}
		System.out.printf(" = %d\n", sum);
		*/
		
		// [3] *****
		//int min, max;
		/*
		if (n > m) {
			min = m; max = n;
		}else {
			max = m; min = n;
		}
		*/
		
		/*
		min = n > m? m:n;
		max = n > m? n:m;
		*/
		
		//성능은 함수 호출시 더 떨어지지만 가독성은 더 좋음
		int min = Math.min(n,m);
		int max = Math.max(n,m);
		
		for (int i = min; i <= max; i++) {
			sum += i;
			System.out.printf(i == m ? " %d " : " %d +", i);
		}
		System.out.printf(" = %d\n", sum);
		
		
		

		/*
		 * int sum = 0, n , m; Scanner scanner = new Scanner(System.in);
		 * System.out.print("> n, m 입력 ? "); n = scanner.nextInt(); m =
		 * scanner.nextInt(); for(int i=n;i<=m;i++) { sum += i;
		 * System.out.printf(" %d +",i); } System.out.printf("\b = %d\n",sum);
		 */

	}// main

}// class
