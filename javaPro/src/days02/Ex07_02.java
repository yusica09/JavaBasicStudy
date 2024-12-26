package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yusica
 * @data 2024. 12. 24. - 오후 5:30:13
 * @subject [문제]
 * @content 국어 점수를  키보드로 입력받아서 변수에 저장하고 
 * 					국어=90점   출력하시오.
 */
public class Ex07_02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("> 국어 점수를 입력하시오 : ");
		// Type mismatch: cannot convert from String to byte
		// String "90" -> byte 90 형변환
		byte score =  Byte.parseByte(br.readLine());
		System.out.printf("국어=%d점", score);

	}

}
