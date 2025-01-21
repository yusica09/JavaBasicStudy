package days18;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

/**
 * @author yusica
 * @data 2025. 1. 20. - 오후 5:17:50
 * @subject
 * @content
 */
public class Ex14_02 {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(2014,1,1);
		LocalDate d2 = LocalDate.of(2015,12,31);
		// d1포함  o / d2 포함 x
		Period p = Period.between(d1, d2);
		
		System.out.println(p); // P 1Y 11M 30D = 1년 11개월 30일 날짜 간격
		
		// 총 개월수 : 23개월	(일 무시)
		System.out.println(p.toTotalMonths());
		
		System.out.println("-".repeat(60));
		
		// 오늘 아침에 수업 시작한지 지금 몇초가 지났나?
		LocalTime s = LocalTime.of(9, 0);
		LocalTime t = LocalTime.now();
		Duration d = Duration.between(s, t);
		System.out.println(d); // PT 8H 24M 36.4112693S
		System.out.println(d.toHours()); //8
		System.out.println(d.toMinutes()); //8*60+24 = 504
		System.out.println(d.toSeconds()); //30369
		
		
	}

}
