package days05;

import java.util.Scanner;

/**
 * @author yusica
 * @data 2024. 12. 30. - 오후 12:46:37
 * @subject  switch문 사용 풀이 
 * @content
 */
public class Ex02_03 {

	public static void main(String[] args) {
		// [문제]
		// 국어점수를 입력받아서
		// 수 우 미 양 가 등급 출력
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 국어 점수 입력 : ");
		int score = scanner.nextInt();
		
		if (0 <= score && score <= 100) {
			char grade = '가';
			
			switch (score / 10) {
			case 10:
			case 9:
				grade = '수';
				break;
			case 8:
				grade = '우';
				break;
			case 7:
				grade = '미';
				break;
			case 6:
				grade = '양';
				break;
			default:
				grade = '가';
				break;
			}//switch
			
			System.out.printf("%c",grade);
			
		}else {
			System.out.println("점수 오입력");
		}
			
		
	
		
	}

}
