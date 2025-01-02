package days05;

import java.io.IOException;

/**
 * @author yusica
 * @data 2024. 12. 30. - 오후 4:38:27
 * @subject
 * @content
 */
public class Ex04_04 {

	public static void main(String[] args) throws IOException {
		
		char one;
		System.out.print("> 한 문자 입력 : ");
		one = (char) System.in.read();
		System.out.printf("%c\n", one);
		
		//System.in.read(); 은 버퍼가 그대로 유지가 되기 때문에
		// 한문자만 입력하더라도 \r\n 가 처음 문자를 쓰면서 남아있어서 없애야함
		
		//System.in.read(); // '\r'
		//System.in.read(); // '\n
		// => System.in.skip(2);
		
		// 여러개 입력하는 경우를 막아주는 방법
		System.in.skip(System.in.available());
		
		System.out.print("> 한 문자 입력 : ");
		one = (char) System.in.read();
		System.out.printf("%c\n", one);

	}

}
