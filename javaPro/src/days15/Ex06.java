package days15;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author yusica
 * @data 2025. 1. 15. - 오후 12:35:18
 * @subject	[예외처리 2번째 방법 : 	throws문 설명]
 * @content  [사용자 정의 예외 선언 + 	throw문   강제로 예외 발생..]
 */
public class Ex06 {

	public static void main(String[] args) {

		// System.in.read(); 

		// 국어 점수를 입력받아서 수~가 출력.
		int kor = 0;
		// 반드시 예외 처리를 해야된다. 
		// 1) try~catch 문
		// 2) throws 문
		try {
			kor = getScore();
			System.out.println("국어=" + kor);
		} catch (IOException e) { 
			// e.printStackTrace();
			System.out.println( e.getMessage() );
		}

		System.out.println(" end ");

	} // main

	private static int getScore() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int score = 0;

		System.out.print("> 점수 입력 ? ");
		String input = scanner.next();

		String regex = "100|[1-9]?\\d";  // 0~100
		if (  input.matches(regex)  ) {
			score = Integer.parseInt(input);
		}else {
			// 강제 예외 발생시키도록 하겠다. 
			throw new IOException("> 점수 범위(0~100)!!!");
			//throw new ArithmeticException("> 점수 범위(0~100)!!!");
		}

		return score;
	}

} // class
