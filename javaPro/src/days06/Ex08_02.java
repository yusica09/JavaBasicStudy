package days06;

import java.util.Scanner;

/**
 * @author yusica
 * @data 2025. 1. 2. - 오후 5:25:56
 * @subject	유효성 검사, String.matches -> boolean형, regex(정규표현식) 
 * @content
 */
public class Ex08_02 {

	public static void main(String[] args) {
		
		// 정규 표현식 ([reg]ular [exp]ression)
		//						regex
		
		// 입력값에 대한 유효성 검사 - ***
		Scanner scanner = new Scanner(System.in);
		System.out.print("> user 가위(1), 바위(2), 보(3) 선택 ?  ");
		
		// boolean String.matches(String regex)
		String regex = "[1-3]";
		
		// 정규 표현식의 경우 String 함수에서 사용가능하므로, 
		// next로 받고 유효성 검사를 통과하면 nextInt
		String strUser = scanner.next();
		int user;
		if(strUser.matches(regex)) {
			user = Integer.parseInt(strUser);
			System.out.println(user);
		}else {
			System.out.println("입력 잘못 !!");
		}
		
	}//main

}//class
