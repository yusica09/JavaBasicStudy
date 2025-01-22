package days19;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author yusica
 * @data 2025. 1. 21. - 오전 9:06:32
 * @subject	DateTimeFormatter -parse
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) {
		//[문제]
		// 문자열 s -> LocalData 객체로 변환
		
		String s = "2022년 12월 25일 (일)";
		String pattern = "yyyy년 MM월 dd일 (E)";
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern(pattern);
		
		LocalDate d = LocalDate.parse(s,df);
		
		System.out.println(d);
		
	}

}
