package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yusica
 * @date 2024. 12. 26. - 오후 4:21:36
 * @subject  [시험] ***
 * @content  비교연산자 : ==        !=
 *           두 문자열을 비교할 때는  ==, != 비교연산자를 사용하지 않는다.
 *           왜 ? 
 *           방법 설명 
 */
public class Ex05_02 {

	public static void main(String[] args) throws IOException {
		
		String n1 = "최지우";
		String n2 = "최지우"; 
		
		System.out.println(  n1==n2 ? "같다" : "다르다"  ); 
		System.out.println(  n1.equals(n2) ? "같다" : "다르다"  );
		
		
	} 

} 









