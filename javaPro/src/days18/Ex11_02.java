package days18;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author yusica
 * @data 2025. 1. 20. - 오후 4:27:46
 * @subject
 * @content
 */
public class Ex11_02 {

	public static void main(String[] args) {
		
		/*[1]
		LocalDate d = LocalDate.now();
		d = d.plusDays(2);
		d = d.minusDays(1);
		System.out.println(d);
		*/
		
		//[2]
		LocalTime t = LocalTime.now();
		t = t.plusHours(1);
		t = t.minusMinutes(30);
		System.out.println(t);

	}

}
