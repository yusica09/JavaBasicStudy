package days18;

import java.util.Date;

/**
 * @author yusica
 * @data 2025. 1. 20. - 오전 9:03:44
 * @subject	날짜(data), 시간(time) + 형식화(formatting)
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		
		/*
		 * 1. JDK 1.0 - java.util.Date 클래스
		 * 2. JDK 1.1 - java.util.Calendar 클래스
		 * 									ㄴ Gregorian Calendar 클래스
		 * 3. JDK 1.8 - java.time 패키지 안에 여러 하위 패키지
		 * 							ㄴ 다양한 클래스  추가
		 * 
		 * */
		
		Date d = new Date();	// 현재 시스템의 날짜 + 시간
		System.out.println(d.toString());	//fullname@hashcode 16진수여야하는데 오버라이딩
		System.out.println(d.toGMTString());
		System.out.println(d.toLocaleString());
		
		//연
		System.out.println(d.getYear() + 1900);
		//월
		System.out.println(d.getMonth() + 1);
		//일
		System.out.println(d.getDate());
		//시간
		System.out.println(d.getHours());
		//분
		System.out.println(d.getMinutes());
		//초
		System.out.println(d.getSeconds());
		//밀리초 X
		//요일 - 0: 일 /1: 월 / ... /6: 토
		System.out.println("일월화수목금토".charAt(d.getDay())); 
		
		// boolean d.after(Date when);
		// boolean d.before(Date when);
		// d.equals(d)
		// int d.compareTo(Date anotherDate);
		
		
		
	}//main

}//class
