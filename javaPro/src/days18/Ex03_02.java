package days18;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import days07.Sample;
import util.MyCalendar;

/**
 * @author yusica
 * @data 2025. 1. 20. - 오전 10:39:59
 * @subject
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		// [년도와 월]을 입력받아서 달력을 출력
		// [문제] 오늘날짜인 경우 [  ] 출력
		Scanner scanner = new Scanner(System.in);
		int year, month;

		System.out.print("> year, month input ? ");
		year = scanner.nextInt();
		month = scanner.nextInt();

		printCalendar(year, month);

	}//main
	
	
	public static boolean isToday(int year, int month, int day) {
		Date today = new Date();
		int todayYear = today.getYear() + 1900;
		int todayMonth = today.getMonth() + 1;
		int todayDay = today.getDate();
		if(day == todayDay&& todayMonth == month && todayYear == year)
			return true;
		else return false;
	}

	private static void printCalendar(int year, int month) {
		// 1. year.month.1  - 무슨 요일 ?
		int dayOfWeek = getDayOfWeek(year, month, 1);
		//System.out.println("일월화수목금토".charAt(dayOfWeek)+"요일");
		
		// 2. 마지막 날짜 몇일? 28/29/30/31
		int lastDay = getLastDay(year, month);
		//System.out.printf("마지막 날짜 : %d일 ", lastDay);
		
		System.out.printf("\t\t\t[%d년 %d월]\n", year, month);
		Sample.drawLine("-", 60);
		String week = "일월화수목금토";
		for(int i=0; i < week.length(); i++) {
			System.out.printf("\t%c", week.charAt(i));
		}
		System.out.println();
		Sample.drawLine("-", 60);
		
		Calendar c = new GregorianCalendar(year,month-1,1);
		c.add(Calendar.DATE, -dayOfWeek);
		int c_month = 1;
		for (int i = 1; i <= 42; i++) {
			c_month = c.get(Calendar.MONTH)+1;
			System.out.printf(isToday(c.get(Calendar.YEAR),c_month,c.get(Calendar.DATE))? 
					"\t[%2d]":month == c_month? "\t%2d":"\t(%2d)",c.get(Calendar.DATE));
			c.add(Calendar.DATE, 1);
			if(i%7 == 0) System.out.println();
		}

		System.out.println();
		Sample.drawLine("-", 60);	
		
	}//printCalendar

	private static int getLastDay(int year, int month) {
		Calendar c = new GregorianCalendar(year,month-1,1);
		int lastDay = c.getActualMaximum(Calendar.DATE);
		return lastDay;
	}

	// 0(일) 1(월) ~ 6(토)
	private static int getDayOfWeek(int year, int month, int day) {
		Calendar c = new GregorianCalendar(year, month-1, day);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK); // 1(일) ~ 7(토)
		return dayOfWeek - 1;
	}

	// 1.1.1 ~ year.month.day 까지의 총 날짜수를 반환하는 메서드
	private static int getTotalDays(int year, int month, int day) {
		
		int totalDays = 0;
		totalDays = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		
		int [] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int i = 0; i < month-1; i++) {
			totalDays += monthDays[i];
		}
		if(MyCalendar.isLeapYear(year) && month >= 3) totalDays++;
		
		return totalDays + day;
		
	}

}
