package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yusica
 * @data 2024. 12. 26. - 오후 5:35:12
 * @subject 내일 나갈 내용 preview
 * @content
 */
public class Ex08 {

	public static void main(String[] args) throws IOException {
		// 1. Scanner 클래스 설명
		// 2. 제어문
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("> 이름 입력 : ");
		String name = br.readLine();
		System.out.print("> 국어점수 입력 : ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("> 영어점수 입력 : ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("> 수학점수 입력 : ");
		int mat = Integer.parseInt(br.readLine());
		
		int total = kor + eng + mat ;
		double avg = (double)total / 3;
		
		
		System.out.printf("이름=\"%s\",국어=%d,영어=%d,수학=%d,총점=%d,평균=%.2f",
				name, kor, eng, mat, total, avg);

	}

}
