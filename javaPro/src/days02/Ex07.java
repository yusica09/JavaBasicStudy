package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yusica
 * @data 2024. 12. 24. - 오후 4:46:35
 * @subject 표준입력장치(키보드)로부터 입력받기
 * @content
 */
public class Ex07 {

	public static void main(String[] args) throws IOException {
		// 표준입력장치(키보드)로부터 이름을 입력받아서
		// name 변수에 저장하고 출력
		/*
		 *  	[키보드]    -> System.in			-> 	InputStreamReader
		 *  이름입력 엔터	   Stream						  문자 변환
		 *  					   텍스트(문자)스트림
		 *  					   *바이트 스트림				0101 -> 한 문자
		 *
		 * -> BufferedReader
		 * 		버퍼기능
		 * 	
		 * 
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ctrl + shift + o  : 필요한거 전체 import
		//Unhandled exception type IOException - 예외처리
		System.out.print("> 이름을 입력하세요? ");
		String name = br.readLine();
		System.out.println(name);

	}

}
