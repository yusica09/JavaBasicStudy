package days04;

import java.util.Scanner;

/**
 * @author yusica
 * @data 2024. 12. 27. - 오후 12:13:17
 * @subject		1) 조건문 : if문, if-else문
 * 						2) 분기문 : switch 문
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		
		// 정수를 입력받아서 짝수 / 홀수 출력
		
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 정수 입력 : ");
		n = scanner.nextInt();
		
		// [switch문 사용]
		// key	: 수식(변수, 연산자) O ,리터럴이나 상수는 사용할수는 있으나 굳이.?
		// value : 리터럴  20  'A'  "test" 다 사용가능하나, 변수는 사용 X
		switch(n % 2) {
			case 0:
				System.out.println("짝수");
				break;
			//case 1:
			default:
				System.out.println("홀수");
				break;
		}

	}

}
