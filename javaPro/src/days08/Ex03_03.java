package days08;

import java.util.Date;

/**
 * @author yusica
 * @data 2025. 1. 6. - 오전 11:39:37
 * @subject
 * @content
 */
public class Ex03_03 {

	public static void main(String[] args) {
	
		String rrn = "830412-1700001";
		System.out.println(rrn);
		
		// 나이 계산 - 정년퇴임
		// 	1) 세는 나이(한국 나이)
		// 2) 만 나이
		
		/*
		 * 				2024.12.30		25.1.1	25.12.29	25.12.30
		 * 세는 나이			1				2			2				2
		 * 만  나이			0				0			0				1
		 * 
		 * */
		
		int age = getCountingAge(rrn);
		//System.out.println("세는 나이 : "+age);
		
		int age2 = getAmericanAge(rrn);
		System.out.println("만 나이 : "+age); 
		
	}// main

	private static int getAmericanAge(String rrn) {
		// 만 나이 = 올해년도 - 생일년도		생일 지나지않은 경우 -1
		int americanAge = getCountingAge(rrn)-1;
		
		/*
		int currentMonth = d.getMonth()+1;
		int currentDay = d.getDay();
		int birthMonth = Integer.parseInt(rrn.substring(2,4));
		int birthDay = Integer.parseInt(rrn.substring(4,6));
		if (birthMonth > currentMonth) americanAge--;
		else if(birthMonth == currentMonth && birthDay > currentDay) americanAge--;
		return americanAge;
		*/
		Date d = new Date();
		int currentMonth = d.getMonth()+1;
		int currentDay = d.getDay();
		
		int currentMonthDay = currentMonth*100 + currentDay;
		int birthMonthDay = Integer.parseInt(rrn.substring(2,6));
		
		if(currentMonthDay < birthMonthDay) americanAge--;
		return americanAge;
	}
	
	

	
	public static int getCountingAge(String rrn) {
		
		int birthYear = Integer.parseInt(Ex03_02.getBirthday(rrn).substring(0,4));
		Date d = new Date();
		int currentYear = d.getYear() + 1900;
		
		return currentYear - birthYear + 1;
	}
	
	

	/*
	public static int getCountingAge(String rrn) {
		// 올해년도 : 2025
		// 생일년도 : 2024
		// 세는 나이 = 올해년도 - 생일년도 + 1
		
		int year = Integer.parseInt(rrn.substring(0,2));
		char gender = rrn.charAt(7);
		
		switch (gender) {
		case '9': case '0':
			year += 1800;
			break;
		case '1': case '2': case '5': case '6':
			year += 1900;
			break;

		default:
			year += 2000;
			break;
		}
		
		return 2025 - year + 1;
	}
	*/
	
}//class
