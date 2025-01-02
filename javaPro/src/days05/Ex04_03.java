package days05;

import java.io.IOException;

/**
 * @author yusica
 * @data 2024. 12. 30. - 오후 4:38:27
 * @subject
 * @content
 */
public class Ex04_03 {

	public static void main(String[] args) throws IOException {
		
		char one;
		System.out.print("> 한 문자 입력 : ");
		// Returns:the next byte of data, or -1 if the end of thestream is reached.
		//int i = System.in.read();
		// 한글은 1byte로 읽을 수 없어서 깨지는 상황 발생
		one = (char) System.in.read();
		System.out.printf("%c\n", one);

	}

}
