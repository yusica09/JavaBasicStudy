package days18;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author yusica
 * @data 2025. 1. 20. - 오전 10:07:12
 * @subject
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		
		// [Calendar]
		// 25.7.21 요일 출력
		
		/*
		// Calendar가 객체 생성이 안되는 이유 -> 추상클래스
		Calendar c = Calendar.getInstance();

		//[1]
		c.set(Calendar.YEAR,2025);
		c.set(Calendar.MONTH,7-1);
		c.set(Calendar.DATE,21);


		//[2]
		c.set(2025, 7-1, 21);
		
		*/
		
		//[3] 추상클래스
		Calendar c = new GregorianCalendar(2025, 7-1, 21);
		
		
		System.out.println("일월화수목금토".charAt(c.get(Calendar.DAY_OF_WEEK) -1));
		
		
	}

}
