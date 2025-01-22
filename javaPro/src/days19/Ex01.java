package days19;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author yusica
 * @data 2025. 1. 21. - 오전 9:02:52
 * @subject	DateTimeFormatter
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		
		//now(), of()
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		// [ dt -> 출력형식 ]
		//2025/01/21 화요일	  09:05:54.591
		String pattern = "yyyy/MM/dd E요일	hh:mm:ss.SSS";
		DateTimeFormatter df = DateTimeFormatter.ofPattern(pattern);
		String s = df.format(dt); // 매개변수 다형성
		System.out.println(s);
		
	}

}
