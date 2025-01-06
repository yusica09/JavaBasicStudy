package days07;

import java.util.Scanner;

/**
 * @author yusica
 * @data 2025. 1. 3. - 오전 11:08:47
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// 이름, 국어, 영어, 수학을 입력받아서
		// 총점, 평균 계산 후 출력.. 
		String name;
		int kor, eng, mat, tot;
		double avg;
		
		Scanner scanner = new Scanner(System.in);
		
		name = getName(scanner);
		//System.out.println(name);
		
		kor = getScore("국어",scanner);
		eng = getScore("영어",scanner);
		mat = getScore("수학",scanner);
		
		//System.out.printf("kor:%d, eng:%d, mat:%d\n", kor, eng, mat);
		
		printScore(name, kor, eng, mat);

	}//main

	//name cannot be resolved to a variable
	private static void printScore(String name, int kor, int eng, int mat) {
		System.out.printf("name:%s, kor:%d, eng:%d, mat:%d\n", name, kor, eng, mat);
		
	}

	private static int getScore(String subject,Scanner scanner) {
		/*
		 - >  이 경우 문자열을 입력하면 오류 나므로 문자열을 입력 받는게 좋음
		int score;
		String regex = "^(100|[1-9]?\\d)$";
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.printf("> %s 점수 입력 ? ",subject);
			score = scanner.nextInt();
		} while (!String.valueOf(score).matches(regex));
		return score;
		*/
		
		String score;
		String regex = "^(100|[1-9]?\\d)$";
		//Scanner scanner = new Scanner(System.in);
		boolean flag = false;
		do {
			if(flag) {
				System.out.println(" > 다시 ");
			}
			System.out.printf("> %s 점수 입력 ? ",subject);
			score = scanner.next();
			flag = true;
		} while (!score.matches(regex));
		return Integer.parseInt(score);
	
	}

	// This method must return a result of type String
	// String 의 기본값은 null
	public static String getName(Scanner scanner) {
		//Scanner scanner = new Scanner(System.in);
		System.out.print("> 이름 입력 ? ");
		String name = scanner.next();
		return name;
	}
	
	

}//class
