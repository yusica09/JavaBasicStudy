package days08;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		/*
		 * [주민등록번호]
		 * 1. 영어: Resident Registration Number, (RRN)
		 * 2. 1975년 3개편 ㄱㄴㄷㄹㅁㅂ - ㅅㅇㅈㅊㅋㅌㅍ  13자리.
		 * 3. ㅅ -> 성별
		 *         외국인/내국인
		 *         세기 1800, 1900, 2000
		 *    getGedner()     
		 * */

		Scanner scanner = new Scanner(System.in);
		//String rrn = getRrn(scanner);
		String rrn = "830412-1700001";
		// 남자 true , 여자 false
		boolean gender = getGender(rrn);
		System.out.println(gender? "남자": "여자");

	}
	/*
	private static String getRrn(Scanner scanner) {
		String regex = "\\d{6}-\\d{7}";
		String rrn;
		
		do {
			System.out.print("> 주민등록번호 14자리 입력(예 : 000000-000000) ? ");
			rrn = scanner.next();
		} while (!rrn.matches(regex));
		return rrn;
		
	}
	*/

	private static boolean getGender(String rrn) {
		char gender = rrn.charAt(7);
		return (gender - '0')%2 == 1? true : false;
		// 남자 9 1 3 5 7 홀수
		// 			'1' -> 49 % 2
	}
	
	/* [substring]
	private static boolean getGender(String rrn) {
		int gender = Integer.parseInt(rrn.substring(7,8));
		return gender % 2 == 1? true : false;
	}
	*/
}
