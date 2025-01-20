package days17;

public class Ex01_03 {

	public static void main(String[] args) {
		
		// 1차원 배열의 값을 -> 2차원 배열 변환
		int [] m = {1,2,3,4,5,6,7,8,9,10,11,12};
		int [][] n = new int[6][2];
		
		int cols = n[0].length;
		for (int i = 0; i < m.length; i++) {
			n[i/cols][i%cols] = m[i];
		}
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.printf("n[%d][%d]=%d ",i,j,n[i][j]);
			}
			System.out.println();
		}

	}

}
