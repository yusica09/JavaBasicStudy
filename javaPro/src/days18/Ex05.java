package days18;

import java.text.DecimalFormat;

/**
 * @author yusica
 * @data 2025. 1. 20. - 오전 11:34:07
 * @subject		형식화 클래스 4가지
 * @content		1. DecimalFormat 클래스
 * 						2. SimpleDateFormat 클래스
 * 						3. ChoiceFormat 클래스
 * 						4. MessageFormat 클래스
 */
public class Ex05 {

	public static void main(String[] args) {
		
		// 1. DecimalFormat 클래스
		//			: 숫자를 형식화(내가 원하는 형식)하는 데 사용되는 클래스
		
		/*
		int money = 3257600;
		//				   3,257,600
		
		
		// 1) 로직 구현
		String strMoney = String.valueOf(money);
		String res = "";
		int cnt = 0;
		for (int i = strMoney.length()-1; i >= 0; i--) {
			res = strMoney.charAt(i) + res;
			cnt ++;
			if(cnt%3 == 0)
				res = "," + res;
		}
		System.out.println(res);
		
		// 2) String.format( "%,d" )
		System.out.println(String.format("%,d", money));
		
		String pattern = "#,###";
		DecimalFormat df = new DecimalFormat(pattern);
		System.out.println(df.format(money));
		*/
		
		double money = 3257600.8;
		// 화폐단위 붙이고,
		// 천 자리마다 콤마 붙이고,
		// 소수점은 무조건 2자리까지 출력
		
		//					\3,257,600.80
		
		String pattern = "\u00A4 #,###,###.00";
		DecimalFormat df = new DecimalFormat(pattern);
		
		System.out.println(df.format(money));
		
	}

}
