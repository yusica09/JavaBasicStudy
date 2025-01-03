package days06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yusica
 * @data 2025. 1. 2. - 오전 11:16:37
 * @subject  .split() 과 .trim()
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) throws IOException {
		// 이름, 국 , 영, 수 입력 받을때
		
		// 처음엔 br.readLine() 여러번 써서 하나씩 입력받고,
		// 다음엔 scanner 이용해서 next() , nextInt() 로 입력받음.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// "홍길동, 90, 38, 84"
		System.out.print("> 이름, 국, 영, 수 입력 : ");
		String data = br.readLine();
		
		//String.split() 사용
		// regex : 정규 표현식
		String regex = ",";
		// split은 string 배열을 반환하므로
		String [] dataArr = data.split(regex);
		String name = dataArr[0];
		//String -> int
		//공백 제거 함수 .trim()
		int kor = Integer.parseInt(dataArr[1].trim());
		int eng = Integer.parseInt(dataArr[2].trim());
		int mat = Integer.parseInt(dataArr[3].trim());
		
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		
		
		
		

	}//main

}//class
