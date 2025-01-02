package days05;

import java.util.Scanner;

/**
 * @author yusica
 * @data 2024. 12. 30. - 오후 12:46:37
 * @subject  if - else if문 사용 풀이 
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		// [문제]
		// 국어점수를 입력받아서
		// 수 우 미 양 가 등급 출력
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 국어 점수 입력 : ");
		int score = scanner.nextInt();
		
		if (0 <= score && score <= 100) {
			if(score >= 90) System.out.println("수");
			else if(score >= 80) System.out.println("우");
			else if(score >= 70) System.out.println("미");
			else if(score >= 60) System.out.println("양");
			else System.out.println("가");
		}else {
			System.out.println("점수 오입력");
		}
			
		
	
		
	}

}
