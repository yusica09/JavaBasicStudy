package days05;

import java.util.Scanner;

/**
 * @author yusica
 * @data 2024. 12. 30. - 오후 12:46:37
 * @subject if문 사용 풀이
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// [문제]
		// 국어점수를 입력받아서
		// 수 우 미 양 가 등급 출력

		Scanner scanner = new Scanner(System.in);
		// 0 ~ 100 점수 : 유효성 검사
		System.out.print("> 국어 점수 입력 : ");
		int score = scanner.nextInt();

		char grade;

		if (0 <= score && score <= 100) {
			
			/*
			if (score >= 90)
				grade = '수';
			else if (score >= 80)
				grade = '우';
			else if (score >= 70)
				grade = '미';
			else if (score >= 60)
				grade = '양';
			else
				grade = '가';
					
			System.out.printf("등급은 '%c'입니다", grade);
			*/
			if(90 <= score && score <= 100) System.out.println("수");
			if(80 <= score && score <= 89) System.out.println("우");
			if(70 <= score && score <= 79) System.out.println("미");
			if(60 <= score && score <= 69) System.out.println("양");
			if(0 <= score && score <= 59) System.out.println("가");

		} else {
			System.out.println("점수 오입력");
		}

	}

}
