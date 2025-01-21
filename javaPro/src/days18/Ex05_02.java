package days18;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * @author yusica
 * @data 2025. 1. 20. - 오후 12:07:00
 * @subject
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) {
		String strMoney = "1,234,567";
		int money;
		
		//[1]
		money = Integer.parseInt(strMoney.replaceAll(",", ""));
		System.out.println(money);
		
		//[2] DecimalFormat
		// 숫자 -> 형식화된문자열		변환:format() 메서드
		// 형식화된문자열 -> 숫자		변환: parse() 메서드
		
		String pattern = "#,###";
		DecimalFormat df = new DecimalFormat(pattern);
		try {
			Number n = df.parse(strMoney);
			//Number -> int 변환
			money = n.intValue();
			System.out.println(money);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("  end  ");
		
	}

}
