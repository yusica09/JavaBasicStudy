package days07;

import util.MyCalendar;

/**
 * @author yusica
 * @data 2025. 1. 3. - 오후 12:30:36
 * @subject
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		// [문제] 2000 ~ 2100 윤년 몇번 ? 몇 년 출력(확인)
		int count = 0;
		for (int i = 2000; i <= 2100; i++) {
			if(MyCalendar.isLeapYear(i)) {
				count++;
				System.out.printf("> year : %d\n", i);
			}
		}
		System.out.printf("> 윤년 횟수 : %d번\n", count);
	}//main

}//class
