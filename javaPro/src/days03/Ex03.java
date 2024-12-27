package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yusica
 * @data 2024. 12. 26. - 오전 10:42:17
 * @subject 입력받고 출력하는 것 연습문제
 * @content 
 */
public class Ex03 {

	public static void main(String[] args) throws IOException {
		// [문제]
		// 이름, 국어 점수, 영어 점수, 수학 점수를 입력받고
		// 출력형식
		// 이름="홍길동", 국어=90, 영어=89, 수학=77, 총점 = 256, 평균=85.33
		
		
		// 내가 작성한 코드
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.print("> 이름 입력 : ");
//		String name = br.readLine();
//		
//		System.out.print("> 국어 점수 입력 : ");
//		byte kor = Byte.parseByte( br.readLine());
//		
//		System.out.print("> 영어 점수 입력 : ");
//		byte eng = Byte.parseByte( br.readLine());
//		
//		System.out.print("> 수학 점수 입력 : ");
//		byte math = Byte.parseByte( br.readLine());
//		
//		int score = kor + eng + math;
//		float avg = (float)score / 3 ; 
//		
//		System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점 = %d, 평균=%.2f"
//				, name, kor, eng, math, score, avg);
		
		
		// 최대한 변수의 크기를 생각해서 형 정하기.
		String name;
		byte kor, eng, mat; //~127
		short total; //~32767
		double avg;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("> 이름 입력 ? ");
		name = br.readLine();
		
		System.out.print("> 국어 입력 ? ");
		kor = Byte.parseByte(br.readLine());
		
		System.out.print("> 영어 입력 ? ");
		eng = Byte.parseByte(br.readLine());

		System.out.print("> 수학 입력 ? ");
		mat = Byte.parseByte(br.readLine());
		
		total = (short) (kor + eng + mat);
		avg = (double)total / 3 ;
		
		System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점 = %d, 평균=%.2f"
				, name, kor, eng, mat, total, avg);

	}

}
