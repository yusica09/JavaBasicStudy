package days06;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		//  [문제] 두 정수 n , m을 입력받아서
		// 두 정수 사이의 짝수의 합을 출력
		// > n m 입력? 3 50
		// > n m 입력? 10 3
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> n m 입력? ");
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		int min = Math.min(n, m);
		int max = Math.max(n, m);
		
		if(min % 2 == 1) min++;
		
		int sum = 0;
		for(int i = min; i <= max; i += 2) {
			sum += i;
		}
		System.out.println(sum);
	}//main

}//class
