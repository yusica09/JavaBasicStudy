package days10;

import java.util.Date;

public class Ex01_02 {

	public static void main(String[] args) {
		
		Date d = new Date();
		int year = d.getYear() + 1900;
		int month = d.getMonth() + 1;
		int day = d.getDate();
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);

	}

}
