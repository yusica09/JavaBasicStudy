package days17;

import java.util.StringTokenizer;

/**
 * @author yusica
 * @data 2025. 1. 17. - 오후 12:13:28
 * @subject	StringTokenizer 클래스	X -> split() 권장
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		String team1 = "박이름, 김이름, 양이름, 이이름, 강이름";
		
		//[권장]
		//String regex = "\\s*,\\s*";
		//String [] names = team1.split(regex);
		
		StringTokenizer st = new StringTokenizer(team1, ",");
		System.out.println(st.countTokens());
		
		//	true / false		st.hasMoreTokens()
		/*
		String name = st.nextToken().trim();
		System.out.println(name);
		
		name = st.nextToken().trim();
		System.out.println(name);
		*/
		
		String name;
		while (st.hasMoreTokens()) {
			name = st.nextToken().trim();
			System.out.println(name);
		}
		
		System.out.println("  end  ");
	}//main

}//class
