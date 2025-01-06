package days07;

import java.util.Scanner;

import util.MyCalendar;

/**
 * @author yusica
 * @data 2025. 1. 3. - 오후 12:02:32
 * @subject	윤년/평년 체크하기
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		
		// 년도를 입력받아서 윤년/평년을 체크해서 출력
		// 윤년 : 4의 배수이면서 100의 배수이지 않고 400의 배수는 가능
		/*
		 *    [치윤법]
         *      ① 서력 기원 연수가 4로 나누어 떨어지는 해는 우선 윤년으로 하고,
         *      		year%4 == 0 
         *      ② 그 중에서 100으로 나누어 떨어지는 해는 평년으로 하며,
         *      		year%100 != 0    
         *      ③ 다만 400으로 나누어 떨어지는 해는 다시 윤년으로 정하였다
         *      		year%400 == 0
		 */
		Scanner scanner = new Scanner(System.in);
		int year = getYear(scanner);
		
		if(MyCalendar.isLeapYear(year)) {
			System.out.println("윤년(leap year)");
		}else {
			System.out.println("평년(common year)");		
		}
		
		
		

	}//main

	private static int getYear(Scanner scanner) {
		String regex = "\\d+";
		String year;
		do {
			System.out.print("> 년도 입력 ? ");
			year = scanner.next();		
		} while (!year.matches(regex));
		return Integer.parseInt(year);
	}


}//class
