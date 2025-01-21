package days18;

import java.util.Date;

/**
 * @author yusica
 * @data 2025. 1. 20. - 오전 9:28:55
 * @subject
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) {
		
		// Data 클래스 사용해서
		// 24/12/23 이 무슨 요일인지 출력
		
		//[1]
		Date d = new Date();
		
		d.setYear(124); // 2024 - 1900
		d.setMonth(11); // 12 - 1
		d.setDate(23);
		//2024. 12. 23. 오전 9:39:15
		System.out.println(d.toLocaleString()); // 객체 생성시간이 출력
		
		
		/*[2]
		Date d = new Date(2024-1900, 12-1, 23);
		//2024. 12. 23. 오전 12:00:00
		System.out.println(d.toLocaleString());
		*/
		
		System.out.println("일월화수목금토".charAt(d.getDay()));
		
	}

}
