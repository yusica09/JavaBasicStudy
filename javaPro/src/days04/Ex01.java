package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01 {

	public static void main(String[] args) throws IOException {

 		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		  System.out.print("> 이름 입력 : "); 
		  String name = br.readLine();
		  System.out.print("> 국어점수 입력 : "); 
		  int kor = Integer.parseInt(br.readLine());
		  System.out.print("> 영어점수 입력 : "); 
		  int eng = Integer.parseInt(br.readLine());
		  System.out.print("> 수학점수 입력 : "); 
		  int mat = Integer.parseInt(br.readLine());
		  
		  int total = kor + eng + mat ; double avg = (double)total / 3;
		  
		  System.out.printf("이름=\"%s\",국어=%d,영어=%d,수학=%d,총점=%d,평균=%.2f", name, kor,
		  eng, mat, total, avg);
	
		/*
		 * int [] kor = new int[3]; kor[0] = 89; kor[1] = 34; kor[2] = 66;
		 * 
		 * System.out.printf("kor[0]=%d, kor[1]=%d, kor[2]=%d", kor[0],kor[1],kor[2]);
		 */
		
		/*
		 * String n1 = "홍길동", n2 = "서영학"; System.out.println(n1.equals(n2));
		 */
	

	}

}
