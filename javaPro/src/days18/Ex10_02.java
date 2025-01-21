package days18;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

/**
 * @author yusica
 * @data 2025. 1. 20. - 오후 3:47:02
 * @subject
 * @content
 */
public class Ex10_02 {

	public static void main(String[] args) {
		
		// 시간 .. LocalTime
		LocalTime t = LocalTime.now();
		System.out.println(t);
		
		//시
		System.out.println(t.getHour());
		System.out.println(t.get(ChronoField.HOUR_OF_DAY));
		//분
		System.out.println(t.getMinute());
		System.out.println(t.get(ChronoField.MINUTE_OF_HOUR));
		//초
		System.out.println(t.getSecond());
		System.out.println(t.get(ChronoField.SECOND_OF_MINUTE));
		//밀리초
		System.out.println(t.get(ChronoField.MILLI_OF_SECOND));
		//나노초
		System.out.println(t.getNano());
		System.out.println(t.get(ChronoField.NANO_OF_SECOND));
		
		
	}

}
