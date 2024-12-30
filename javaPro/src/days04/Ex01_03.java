package days04;

import java.util.Scanner;

/**
 * @author yusica
 * @data 2024. 12. 27. - 오전 10:40:31
 * @subject 	Scanner 다른 예제
 * @content	
 * 			Scanner 스캐너이름 = new Scanner(스캐너가 읽을 대상)
 */
public class Ex01_03 {

	public static void main(String[] args) {

		String input = "1 fish 2 fish red fish blue fish";
		//Scanner 스캐너이름 = new Scanner(스캐너가 읽을 대상)
		// scanner.useDelimiter(String pattern) : 정규표현식을 알아야 패턴 설정 가능
		// '\s' == space 공백
		//  *  == 반복횟수 -> 0~여러번
		Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
		System.out.println(s.nextInt());
		System.out.println(s.nextInt());
		System.out.println(s.next());
		System.out.println(s.next());
		
		s.close();

	}

}
