package days06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yusica
 * @data 2025. 1. 2. - 오전 11:18:41
 * @subject 	trim() 사용 말고 다른 공백제거 방법 - 정규표현식
 * @content
 */
public class Ex01_03 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// "홍길동, 90, 38, 84"
		System.out.print("> 이름, 국, 영, 수 입력 : ");
		String data = br.readLine();
		
		String regex = "\\s*,\\s*";
		String [] dataArr = data.split(regex);
		String name = dataArr[0];

		int kor = Integer.parseInt(dataArr[1]);
		int eng = Integer.parseInt(dataArr[2]);
		int mat = Integer.parseInt(dataArr[3]);
		
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		
		
		
		

	}//main

}//class
