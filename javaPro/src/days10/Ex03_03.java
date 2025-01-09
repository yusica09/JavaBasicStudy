package days10;

public class Ex03_03 {

	public static void main(String[] args) {
		// 가변 배열
		// String [][] names = new String[3][30];
		String [][] names = new String[3][];
		
		names[0] = new String[30];
		names[1] = new String[10];
		names[2] = new String[15];
		
		System.out.println(names[0].length);
		System.out.println(names[1].length);
		System.out.println(names[2].length);

	}//main

}//class
