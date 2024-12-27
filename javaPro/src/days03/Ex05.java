package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yusica
 * @data 2024. 12. 26. - 오후 4:21:36
 * @subject  [시험] **
 * @content 비교연산자 : == , != 
 * 					두 문자열을 비교할 때는 비교연산자 사용 X
 */
public class Ex05 {

	public static void main(String[] args) throws IOException {
		
		String n1 = "홍길동";
		String n2; // "홍길동"
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(" > n2 입력 ? ");
		n2 = br.readLine();
		System.out.printf("n2 : [%s]\n", n2);
		//같은 문자열처럼 보이지만 다르다는 결과가 나옴
		System.out.println( n1 == n2? "같다":"다르다"); //다르다

		//String.equals() 메서드 : 두 문자열 비교
		System.out.println(n1.equals(n2)? "같다":"다르다"); //같다
		
	}

}
