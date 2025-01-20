package days17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yusica
 * @data 2025. 1. 17. - 오후 4:25:05
 * @subject
 * @content
 */
public class Ex11 {

	public static void main(String[] args) {

		String[] data = { "bat", "baby", "bonus",  "cA", "ca", "co", "c.", "c0", "car", "combat", "count", "date",
				"disc", "fx" };

		// [ 정규표현식을 설명하세요 ]
		// String regex = "c[a-z]*"; // c문자 + 소문자 여러개
		// String regex = "c[a-z]"; // c문자 + 소문자 1개
		// String regex = "c[a-zA-Z]"; // c문자 + 알파벳 1개
		// String regex = "c[a-zA-Z0-9]"; // c문자 + 알파벳(또는 숫자) 1개
		// String regex = "c\\w";
		// String regex = ".*"; //모든 문자열
		// String regex = "c.";
		// String regex = "c\\.";
		// String regex = "c[0-9]"; // c문자 + 숫자 1개
		// String regex = "c.*t";
		// String regex = "[b|c]";
		// String regex = "[bc]";
		// String regex = "[b-c].*";
		String regex = "[^bc].*";

		// String regex = ".*a.*";

		// String regex = "[^bcd].*";

		// String regex = "[a-zA-Z].*";
		// String regex = "[ae-zA-Z].*";
		// String regex = "[a-zA-Z&&[^b-d]].*";

		// 1. Pattern 객체 생성
		Pattern pattern = Pattern.compile(regex);

		// 2. Matcher 객체 생성
		// 3. matches() 매칭 검사
		for (int i = 0; i < data.length; i++) {
			Matcher matcher = pattern.matcher(data[i]);
			if (matcher.matches()) {
				System.out.println(data[i]);
			}
		}

	}// main

}
