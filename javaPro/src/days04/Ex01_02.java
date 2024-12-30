package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author yusica
 * @data 2024. 12. 27. - 오전 10:14:36
 * @subject	Scanner 클래스 사용해서 표준입력장치로부터 입력
 * @content	
 * 				BufferedReader 대신 Scanner 사용해보기
 */
public class Ex01_02 {

	public static void main(String[] args) throws IOException {

 		  Scanner scanner = new Scanner(System.in);
		 
		  System.out.print("> 이름 입력 : "); 
		  String name = scanner.nextLine();
		  System.out.print("> 국어점수 입력 : "); 
		  int kor = Integer.parseInt(scanner.nextLine());
		  System.out.print("> 영어점수 입력 : "); 
		  int eng = Integer.parseInt(scanner.nextLine());
		  System.out.print("> 수학점수 입력 : "); 
		  int mat = Integer.parseInt(scanner.nextLine());
		  
		  int total = kor + eng + mat ; double avg = (double)total / 3;
		  
		  System.out.printf("이름=\"%s\",국어=%d,영어=%d,수학=%d,총점=%d,평균=%.2f", name, kor,
		  eng, mat, total, avg);

	}

}
