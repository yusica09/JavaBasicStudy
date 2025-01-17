package days16;

/**
 * @author yusica
 * @date 2025. 1. 16. - 오후 4:21:57
 * @subject
 * @content 
 */
public class Ex04_07 {

	public static void main(String[] args) {
		
		String a = "aXXd1234";
		String b = "abcd";
		
		// boolean a.equals(b)
		
		// 0         양수 / 음수 
		 System.out.println( a.compareTo(b) );
		// System.out.println( myCompareTo(a, b) );
		

	} // main

	private static int myCompareTo(String a, String b) {
		
		for (int i = 0; i < a.length(); i++) {
			if(  (a.charAt(i) - b.charAt(i) )   != 0  )
				return (a.charAt(i) - b.charAt(i) );
		} // for i
		
		return 0;
	}

} // class



