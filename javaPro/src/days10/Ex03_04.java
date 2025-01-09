package days10;

/**
 * @author yusica
 * @data 2025. 1. 8. - 오후 3:13:30
 * @subject
 * @content
 */
public class Ex03_04 {

	public static void main(String[] args) {
		/*
		int [][][] m = new int[2][3][4];
		
		m[0][0][0]=1; m[0][0][1]=2; m[0][0][2]=3; m[0][0][3]=4; 
		m[0][1][0]=5; m[0][1][1]=6; m[0][1][2]=7; m[0][1][3]=8; 
		m[0][2][0]=9; m[0][2][1]=10; m[0][2][2]=11; m[0][2][3]=12; 

		m[1][0][0]=13; m[1][0][1]=14; m[1][0][2]=15; m[1][0][3]=16; 
		m[1][1][0]=17; m[1][1][1]=18; m[1][1][2]=19; m[1][1][3]=20; 
		m[1][2][0]=21; m[1][2][1]=22; m[1][2][2]=23; m[1][2][3]=24; 
		*/
		
		int [][][] m = {
								{
									{1,2,3,4},
									{5,6,7,8},
									{9,10,11,12}
								},
								{
									{2,4,5,6},
									{5,6,7,8},
									{9,10,11,12}
								}	
									} ;

		
		dispArr(m);

	}//main

	private static void dispArr(int[][][] m) {
		//System.out.println(m.length); //면 갯수
		//System.out.println(m[0].length); //행 갯수
		//System.out.println(m[0][0].length); // 열 갯수
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				for (int k = 0; k < m[i][j].length; k++) {
					System.out.printf("m[%d][%d][%d]=%d ",i,j,k,m[i][j][k]);
				}
				System.out.println();
			}//for j
			System.out.println();
		}//for i
	}

}//class
