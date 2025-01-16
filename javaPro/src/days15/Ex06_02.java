package days15;

import java.io.IOException;
import java.util.Scanner;

public class Ex06_02 {

	public static void main(String[] args) {

		int kor = 0; 
		try {
			kor = getScore();
			System.out.println("국어=" + kor);

		} catch (IOException | ScoreOutOfBoundException e) {  
			System.out.println( e.getMessage() ); 
		} 

		System.out.println(" end ");

	} // main

	private static int getScore() throws IOException, ScoreOutOfBoundException {
		Scanner scanner = new Scanner(System.in);
		int score = 0;

		System.out.print("> 점수 입력 ? ");
		String input = scanner.next();

		String regex = "100|[1-9]?\\d";  // 0~100
		if (  input.matches(regex)  ) {
			score = Integer.parseInt(input);
		}else { 
			//        InputOutput
			//          입력/출력 예외 발생
			throw new ScoreOutOfBoundException("> 점수 범위(0~100)!!!");
		}

		return score;
	}

} // class


// [ 사용자 정의 예외클래스 선언 ] - 점수 0~100점 범위 ... 발생시킬 예외 클래스
// class ScoreOutOfBoundException extends RuntimeException{
class ScoreOutOfBoundException extends Exception{

	private static final long serialVersionUID = 6713716862026285718L;

	// 예외 코드 번호
	private final int ERROR_CODE;

	// 디폴트 생성자
	public ScoreOutOfBoundException(String message) {
		super(message);
		this.ERROR_CODE = 1004;
	} 

	// 생성자
	public ScoreOutOfBoundException(int eRROR_CODE, String message) {
		super(message);
		ERROR_CODE = eRROR_CODE;
	} 

	// setter X, getter O
	public int getERROR_CODE() {
		return ERROR_CODE;
	}


}
