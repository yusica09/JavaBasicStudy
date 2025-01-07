package days08;

public class Ex06_03 {

	public static void main(String[] args) {
		// [문제] 문자열을 뒤집어서 문자열을 반환하는 메서드를 선언
		String s = "abcde";
		s = reverse(s);
		System.out.println(s);

	}
	/*
	private static String reverse(String s) {
		char [] arr = new char[s.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.charAt(s.length()-1-i);
		}
		return String.valueOf(arr);
	}
	*/
	
	private static String reverse(String s) {
		// 1.String -> char [] 변환
		char [] sArr = s.toCharArray();
		char [] arr = new char[s.length()];
		for (int i = 0 ,index= sArr.length-1; i < arr.length; i++, index--) {
			arr[index] = sArr[i];
		}
		//2. char[] -> String
		return new String(arr);
	}

}
