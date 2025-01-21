package days18;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 * @author yusica
 * @data 2025. 1. 20. - 오후 3:30:22
 * @subject
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		
		//1. 날짜클래스 : localDate
		LocalDate d = LocalDate.now();
		System.out.println(d);
		//년
		System.out.println(d.getYear());
		System.out.println(d.get(ChronoField.YEAR));
		//월
		//[e]num 열거형
		System.out.println(d.getMonth());
		//int형
		System.out.println(d.getMonthValue());
		System.out.println(d.get(ChronoField.MONTH_OF_YEAR));
		//일
		System.out.println(d.getDayOfMonth());
		System.out.println(d.get(ChronoField.DAY_OF_MONTH));
		//요일
		DayOfWeek dow = d.getDayOfWeek();
		System.out.println(dow);
		// LocalDate 요일
		// 1(월) 2(화)  7(일)
		System.out.println(dow.getValue()); //int
		// Date     0(일) 1(월) ~6(토)
		// Calendar 1(일) 2(월) ~ 7(토)
		
		
		
		System.out.println("  end  ");
	}

}
