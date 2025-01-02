package days05;

public class Ex05_01 {

	public static void main(String[] args) {
		// 1번 문제
        // *
        // **
        // ***
        // ****
		
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
