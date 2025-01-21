package days18;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author yusica
 * @data 2025. 1. 20. - 오전 10:22:02
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		
		// 달력
		// 1) 20XX.X.XX 무슨요일
		// 2) 20XX.X 은 몇일까지?	-	Date/Calendar
		
		//[1]
		Date d = new Date(2025-1900, 5-1, 1);
		System.out.println(d.toLocaleString());
		d.setMonth(d.getMonth() + 1);
		System.out.println(d.toLocaleString());
		d.setDate(d.getDate()-1);
		System.out.println(d.toLocaleString());
		System.out.println(d.getDate());
		
		
		//[2]
		Calendar c = new GregorianCalendar(2025,5-1,1);
		
		//c.set(Calendar.MONTH,c.get(Calendar.MONTH)+1);
		//c.set(Calendar.DATE,c.get(Calendar.DATE)-1);
		
		c.add(Calendar.MONTH, 1);
		c.add(Calendar.DATE, -1);
		
		System.out.println(c.get(Calendar.DATE));
		
		//[3]
		Calendar c2 = new GregorianCalendar(2025,5-1,1);
		int lastDay = c2.getActualMaximum(Calendar.DATE);
		System.out.println(lastDay);

		
	}

}
