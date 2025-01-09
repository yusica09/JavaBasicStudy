package days10;

import java.util.Date;
import java.util.Scanner;

import days07.Sample;
import util.MyCalendar;

/**
 * @author yusica
 * @data 2025. 1. 8. - 오전 9:01:41
 * @subject		달력 출력하기
 * @content		시간나면 추가문제 
 * 						1	2	3	4
 * 						5	6	7	8
 * 						9  10	11 12 		형태로 출력
 */
public class Ex01_03 {

	public static void main(String[] args) {
		// [일정 관리/근태 관리]
		// 자바 달력, js 달력, jsp 달력
		// [년도와 월]을 입력받아서 달력을 출력
		Scanner scanner = new Scanner(System.in);
		int year, month;
		
		System.out.print("> year, month input ? ");
		year = scanner.nextInt();
		month = scanner.nextInt();
		
		for (int i = 1; i <= 12; i++) {
			printCalendar(year, i);
		}

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
		//		총 날짜수 % 7 	0(일)	1(월)	2(화)	...	6(토)
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
		for(int i=0; i < dayOfWeek; i++)
			System.out.print("\t");
		for (int i = 1; i <= lastDay; i++) {
			if(isToday(year, month, i))
				System.out.printf("\t[%d]",i);
			else System.out.printf("\t%2d",i);
			
			if((dayOfWeek+i) % 7 == 0) System.out.println();
		}
		System.out.println();
		Sample.drawLine("-", 60);
		
		
		
	}//printCalendar

	private static int getLastDay(int year, int month) {
		
		int [] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int lastDay = months[month-1];
		if(MyCalendar.isLeapYear(year) && month == 2) lastDay = 29;
		return lastDay;
		
	}

	private static int getDayOfWeek(int year, int month, int day) {
		// 	1.1.1	~	year.month.1 총 날짜수
		int totalDays = getTotalDays(year, month, day);
		//System.out.printf("1.1.1 ~ %d.%d.%d 총날짜수=%d일\n",
				//year, month, day, totalDays);
		// 요일 = 총 날짜수 % 7
		int dayOfWeek = totalDays % 7;
		return dayOfWeek;
	}

	// 1.1.1 ~ year.month.day 까지의 총 날짜수를 반환하는 메서드
	private static int getTotalDays(int year, int month, int day) {
		// year = 2025
		// month = 4
		// days = 1
		
		// totalDays = (365 * 2024) + ( 31 + 29 + 31) + 1
		
		int totalDays = 0;
		/*
		for (int i = 1; i < year; i++) {
			if(util.MyCalendar.isLeapYear(i))
				totalDays += 366;
			else totalDays += 365;
		}
		*/
		// 위랑 코드의 의미는 같으나 반복문을 줄여서 더 좋음
		totalDays = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		
		int [] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int i = 0; i < month-1; i++) {
			totalDays += monthDays[i];
		}
		if(MyCalendar.isLeapYear(year) && month >= 3) totalDays++;
		
		return totalDays + day;
		
		
		
		/*
		int totalDays = 0;
		// 1) 년도일수
		for(int i = 1; i < year; i++) {
			if(MyCalendar.isLeapYear(i)) totalDays += 366;
			else totalDays += 365;
		}
		// 2) 월일수
		// 이번 년도가 윤년일 가능성 생각
		int [] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(MyCalendar.isLeapYear(year)) monthDays[1]++;
		
		for(int i = 0; i < month-1; i++) {
			totalDays += monthDays[i];
		}
		// 3) 일수
		return totalDays + day;
		*/
	}

}
