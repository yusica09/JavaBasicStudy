package days08;

/**
 * @author yusica
 * @data 2025. 1. 6. - 오전 11:16:02
 * @subject
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
	
		String rrn = "990412-9700001";
		System.out.println(rrn);
		// 주민등록번호로 부터 생년월일 얻어와서 출력
		// "????년 ??월 ??일"
		String birthday = getBirthday(rrn);
		System.out.println(birthday);
	}// main

	// "990412-9700001"
	public static String getBirthday(String rrn) {
		int year = Integer.parseInt(rrn.substring(0,2));
		int month = Integer.parseInt(rrn.substring(2,4));
		int day = Integer.parseInt(rrn.substring(4,6));
		
		char gender = rrn.charAt(7);
		switch (gender) {
		case '9': case '0':
			year += 1800;
			break;
		case '1': case '2': case '5': case '6':
			year += 1900;
			break;

		default:
			year += 2000;
			break;
		}
		
		return String.format("%d년 %02d월 %02d일", year, month, day);
	}

	/*
	private static String getBirthday(String rrn) {
		String month = rrn.substring(2,4);
		String day = rrn.substring(4,6);
		String year = rrn.substring(0,2);
		
		switch (rrn.substring(7,8)) {
		case "9":
		case "0":
			year = "18" + year;
			break;
		case "1":
		case "2":
		case "5":
		case "6":
			year = "19" + year;
			break;
		case "3":
		case "4":
		case "7":
		case "8":
			year = "20" + year;
			break;
		}
		
		return String.format("%s년 %s월 %s일", year, month, day);
	}
	*/
	
	
	
	
}//class
