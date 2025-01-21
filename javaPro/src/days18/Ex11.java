package days18;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 * @author yusica
 * @data 2025. 1. 20. - 오후 4:05:07
 * @subject
 * @content
 */
public class Ex11 {

	public static void main(String[] args) {
		// 1) 객체 생성 : now(), of()
		// 2) 특정 필드 값을 얻어올때 : get(), getXXX()
		// 3) 필드값을 변경 : plusXXX(), minusXXX()
		//							plus()		minus()
		//						 	with()		withXXX()
		
		// 24.12.23
		
		
		/*[1]
		// 불변하기 때문에 다른 객체에 바꾸려는걸 받아야함
		LocalDate d = LocalDate.now();
		System.out.println(d);
		// d.withYear(2024)  X
		d = d.withYear(2024);
		d = d.withMonth(12);
		d = d.with(ChronoField.DAY_OF_MONTH,23);
		
		System.out.println(d);
		*/
	
		/*[2]
		LocalDate d = LocalDate.of(2024, 12, 23);
		System.out.println(d);
		
		System.out.println(d.isLeapYear());
		
		d.isAfter(d);
		d.isBefore(d);
		d.isEqual(d);
		*/
		
		
		// A 생일 2000.1.15
		// B 생일 2000.1.20
		// C 생일 2000.12.15
		
		LocalDate d = LocalDate.now();
		
		LocalDate a = d.withMonth(1);
		a = d.withDayOfMonth(15);
		
		LocalDate b = d.withMonth(1);
		b = d.withDayOfMonth(20);
		
		LocalDate c = LocalDate.of(2025, 12, 15);
		
		System.out.println(d.isEqual(a)? "오늘": d.isAfter(a)? "지났다":"안지났다" );
		System.out.println(d.isEqual(b)? "오늘": d.isAfter(b)? "지났다":"안지났다" );
		System.out.println(d.isEqual(c)? "오늘": d.isAfter(c)? "지났다":"안지났다");
		
		//System.out.println( d.isAfter(a));  // true
		//System.out.println( d.isBefore(a));
		//System.out.println( d.isEqual(a));
		
		//System.out.println( d.compareTo(a) ); //5
		//System.out.println( d.compareTo(b) ); //0
		//System.out.println( d.compareTo(c) ); //-11


		
	}

}
