package days05;

import java.util.Scanner;

/**
 * @author yusica
 * @data 2024. 12. 30. - 오전 9:43:45
 * @subject 복습문제 풀이& 문제 한개
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		//[문제] n 정수를 입력받아서
		//1 ~ n 까지의 합 출력
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 정수  n 입력 : ");
		int n = scanner.nextInt();
		
		int sum =0;
		for(int i = 1 ; i <= n;i++) {
			sum += i;
			System.out.printf((i==n)? " %d ":" %d +",i);
		}
		System.out.printf("= %d\n",sum);
		
		//위의 코드는 음수일때는 적용이 안된다. -> 유효성검사
		
		// 삼항 연산자로 마지막 +를 출력안할수도 있지만,
		// 아래처럼 그냥 마지막 + 출력시켜놓고 sum 출력전에 백스페이스를 이용할수도있음
		// 글씨체에 따라 안지워지는 것처럼 보일 수 있음
		// System.out.printf("\b= %d\n",sum);
		
		
	}//main

}//class
