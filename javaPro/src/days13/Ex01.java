package days13;

import java.util.Arrays;

/**
 * @author yusica
 * @data 2025. 1. 13. - 오전 10:08:26
 * @subject	두 문자열의 대소문자 구분 없이, 
 * 					순서 상관 없이 같은 문자여부를 체크하는 코딩을 하세요. 
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		String n = "keNik"; 
		String m= "kKnie";

		//n = toUpperCase(n);
		n = n.toUpperCase();
		m = m.toUpperCase();
		
		n = stringSort(n);
		m = stringSort(m);
		
		if(n.equals(m)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		/*
		String n = "keNik"; String m= "kKnie"; 
		
		char[] nArr = n.toLowerCase().toCharArray();
        char[] mArr = m.toLowerCase().toCharArray();
		
		Arrays.sort(mArr);
		Arrays.sort(nArr);
		
		m = String.valueOf(mArr);
		n = String.valueOf(nArr);
		
		System.out.println(n.equals(m));
		*/

	}//main

	private static String stringSort(String str) {
		char [] nArr = str.toCharArray();
		Arrays.sort(nArr);
		return String.valueOf(nArr);
	}

	private static String toUpperCase(String str) {
		String result = "";
		char ch = '\u0000';
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			//if('a' <= ch && ch<='z') {
			if(Character.isLowerCase(ch)) {
				result += (char)(str.charAt(i)-32);
			}else {
				result += ch;
			}
		}
		return result;
	}

}
