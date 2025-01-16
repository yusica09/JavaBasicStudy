package days15;

import java.io.IOException;

/**
 * @author yusica
 * @data 2025. 1. 15. - 오후 12:28:22
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) throws IOException  {
		// 1. "checked예외"
		//      ㄴ 컴파일러가 예외처리를 확인하는 예외
		//      ㄴ Exception( RE 제외 )	 
		System.in.read(); // IOException 예외클래스

		// 2. "unchecked예외"
		//      ㄴ 컴파일러가 예외처리를 확인하지 않는 예외
		//      ㄴ RuntimeException 및 자식 예외들...

	} // main


}
