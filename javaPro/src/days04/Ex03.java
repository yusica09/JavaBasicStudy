package days04;

import java.util.Scanner;

/**
 * @author yusica
 * @data 2024. 12. 27. - 오전 11:46:20
 * @subject 	if문
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		/*
		 * 1. if문 == 조건문
		 * 2. if문의 선언 형식
		 * 
		 * 		조건식이 참일 경우에만 {   } 블럭 실행
		 * 		if(조건식){
		 * 			//명령코딩
		 * 		}
		 * 
		 * */
		
		// scanner로 정수(n)를 입력받아서  출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 정수 입력 : ");
		int n = scanner.nextInt();
		//System.out.printf("%d",n);
		
		//[1] if문 두개 사용
		/*
		 * if(n % 2 == 0) { System.out.println("짝수"); } 
		 * if (n % 2 != 0) {System.out.println("홀수"); } 
		 * System.out.println("END");
		 */
		
		//[2] if-else 사용
		if(n % 2 == 0) { 
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		

	}

}
