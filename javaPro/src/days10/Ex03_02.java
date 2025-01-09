package days10;

public class Ex03_02 {

	public static void main(String[] args) {
		// 2차원 배열			   행  열
		/*
		int [][] m = new int[2][4];
		m[0][0]=1; m[0][1]=2; m[0][2]=3; m[0][3]=4; 
		m[1][0]=5; m[1][1]=6; m[1][2]=7; m[1][3]=8; 
		*/
		
		int [][] m = {{1,2,3,4},{5,6,7,8}};
		
		dispArr(m);

	}//main

	private static void dispArr(int[][] m) {
		System.out.println(m.length); //행 갯수
		System.out.println(m[0].length);//열 갯수
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("m[%d][%d]=%d ", i, j, m[i][j]);
			}
			System.out.println();
		}
		
		//return ; // 메서드 종료..
		
	}

}//class
