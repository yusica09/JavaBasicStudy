package days18;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ex14 {

	public static void main(String[] args) {
		
		// 날짜 - 날짜 = 간격 Period 클래스
		// 시간 - 시간 = 간격 Duration 클래스
		
		//개강일
		LocalDate o = LocalDate.of(2024,12,23);
		//오늘
		LocalDate t = LocalDate.now();
		
		//			   간격		o포함O	t포함x
		Period p =Period.between(o, t);
		
		long year = p.get(ChronoUnit.YEARS);
		System.out.println(year);
		
		long month = p.get(ChronoUnit.MONTHS);
		System.out.println(month);
		
		long days = p.get(ChronoUnit.DAYS);
		System.out.println(days);
		
		System.out.println("-".repeat(60));
		
		//수업시작시간
		LocalTime ot = LocalTime.of(9,0,0);
		//System.out.println(ot); //09:00
		LocalTime tt = LocalTime.now();
		
		// 시간 - 시간 = 간격	Duration 클래스
		Duration d = Duration.between(ot, tt);
		// 시(hour)
		// java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Hours
		//long hour = d.get(ChronoUnit.HOURS);   X 
		//System.out.println(hour);
		// 분(min) 또한 마찬가지.
		
		System.out.println(d.getSeconds());
		System.out.println(d.get(ChronoUnit.SECONDS));
		
		System.out.println(d.getNano());
		
		// Period 날짜-날짜의 간격
		// between() / until() 차이점
		// static 메서드 / 인스턴스 메서드
		
		
	}

}
