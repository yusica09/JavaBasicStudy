package days05;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		//한 문자를 입력받아서
		// 대문자, 소문자, 숫자, 한글, 특수문자(# ! @ %) , 기타 인지 출력
		
		char one;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 한 문자 입력 : ");
		
		one = scanner.next().charAt(0);
		//System.out.printf("%c\n", one);
		
		if('A'<= one && one <='Z') {
			System.out.println("대문자");
		}else if('a' <= one && one <= 'z') {
			System.out.println("소문자");
		}else if('0' <= one && one <= '9') {
			System.out.println("숫자");
		// 한글 시작 '가' 부터 맨 마지막 '힣' 까지
		//}else if('가' <= one && one <= '힣' ) {
		}else if(String.valueOf(one).matches("[가-힣]") ) {
			System.out.println("한글");
		//}else if(one == '#' || one == '!' || one == '@' || one == '%') {
		}else if(String.valueOf(one).matches("[#!@%]") ) {
			System.out.println("특수문자");
		}
		
	}

}
