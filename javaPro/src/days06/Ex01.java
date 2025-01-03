package days06;


import java.io.IOException;
import java.util.Scanner;

/**
 * @author yusica
 * @data 2025. 1. 2. - 오전 10:25:11
 * @subject 복습문제 풀기 & 심화문제
 * @content	
 * 				심화문제 
 * 					: 아스키 코드 15개마다 개행하고 라인 넘버 주는 코드에서
 * 						라인넘버 5개씩만 출력하고 키 입력받고 이어서 출력하기
 */
public class Ex01 {

	public static void main(String[] args) throws IOException {

		/*
		 * int [] kors = new int[10];
		 * 
		 * for(int i=0; i < kors.length; i++) { kors[i] = (int)(Math.random()*101); }
		 * 
		 * int max = kors[0]; for(int kor:kors) { max = Math.max(max, kor); }
		 * 
		 * System.out.println(max);
		 */

		Scanner scanner = new Scanner(System.in);

		int lineNumber = 1;
		for (int i = 0; i < 256; i++) {
			if (i % 15 == 0)
				System.out.printf("%d : ", lineNumber++);
			System.out.printf("[%c]", i);
			// 개행하는 if문쪽에 추가하기
			if (i % 15 == 14) {
				System.out.println();
				if((lineNumber - 1) % 5 == 0) {
					System.out.print("> 아무키나 누르세요..");
					System.in.read();
					System.in.skip(System.in.available());					
					
				}
			}
		}
				

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.print("> message input ? "); String message = scanner.nextLine();
		 * 
		 * //(1)
		 * for(int i = 0; i < message.length();i++) {
		 * System.out.printf("'%c'\n",message.charAt(i)); }
		 * 
		 *  //(2)
		 * char [] messageCharArr = message.toCharArray();
		 * for(char c: messageCharArr){
		 * 			System.out.printf("'%c'\n",c)
		 * } 
		 * 
		 * 
		 * 
		 * 
		 */

		
		/*
		 * for(int i = 1; i <= 4;i++) { for(int j = 1; j <= 4; j++) {
		 * System.out.print("*"); } System.out.println(); }
		 */

		/*
		 * for(int i = 1; i <= 4;i++) { for(int j = 1; j <= i; j++) {
		 * System.out.print("*"); } System.out.println(); }
		 */

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.print("> 두 정수 x,y 입력(공백 기준) : "); int x = scanner.nextInt(); int y
		 * = scanner.nextInt();
		 * 
		 * int max = Math.max(x, y); int min = Math.min(x, y);
		 * 
		 * int sum = 0; for (int i = min; i <= max; i++) { sum += i; }
		 * System.out.printf("합 : %d", sum);
		 */

	}// main

}// class
