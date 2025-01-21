package days18;

import java.text.MessageFormat;

/**
 * @author yusica
 * @data 2025. 1. 20. - 오후 2:11:03
 * @subject		4. MessageFormat 클래스
 * @content			ㄴ 어떤 값을 정해진 형식에 맞게 출력...
 * 
 * 						System.out.println("출력형식", 값)
 * 						String 출력형식문자열 = String.format("출력형식", 값)
 */
public class Ex08 {

	public static void main(String[] args) {
		
		String name = "홍길동";
		int age = 20;
		boolean gender = false;
		
		// 출력형식  :      이름:홍길동, 나이:20살, 성별:여자
		/* [1]
		String str = String.format("이름:%s, 나이:%d살, 성별:%s",name, age,
				gender?"남자":"여자");
		System.out.println(str);
		*/
		
		/*[2]
		String pattern = "이름:{0}, 나이:{1}살, 성별:{2}";
		MessageFormat mf = new MessageFormat(pattern);
		String str = mf.format(new Object[] {name, age, gender?"남자":"여자"});
		*/
		
		String pattern = "이름:{0}, 나이:{1}살, 성별:{2}";
		String  str = MessageFormat .format(pattern, name, age, gender?"남자":"여자");
		
		System.out.println(str);
		
	}

}
