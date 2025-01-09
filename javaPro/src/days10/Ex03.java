package days10;

public class Ex03 {

	public static void main(String[] args) {
		/*
		int [] m = new int[3];
		m[0]=1;
		m[1]=2;
		m[3]=4;
		*/
		
		// 배열 초기화
		// int [] m = new int[]{1,2,3};
		int [] m = {1,2,3};
		
		dispArr(m);

	}//main

	private static void dispArr(int[] m) {
		System.out.println(m.length);
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]=%d",i,m[i]);
		}
		
	}

}
