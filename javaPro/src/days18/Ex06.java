package days18;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author yusica
 * @data 2025. 1. 20. - 오후 12:13:33
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		
		//[2. SimpleDataFormat 클래스]
		//		Date, Calendar -> 내가 원하는 날짜/시간 형식으로 변환
		Calendar c = Calendar.getInstance();
		//String pattern = "yyyy년 MM월 dd일 E요일";
		String pattern =  "''yy년 M월 d일  hh:mm:ss,SSS E요일";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		//Calendar -> Date 형변환
		// sdf.format(Date)
		String s = sdf.format(c.getTime());
		System.out.println(s);
		
		System.out.println("  end  ");
	}

}
