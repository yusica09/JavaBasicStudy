package util;

public class MyCalendar {

	//윤년 체크 함수 - true(윤년) / false(평년)
	public static boolean isLeapYear(int year) {		
		return (year%4 == 0 && year%100 != 0) || year%400 == 0;
	}

}
