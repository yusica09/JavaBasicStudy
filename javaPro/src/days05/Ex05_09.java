package days05;

public class Ex05_09 {

	public static void main(String[] args) {

        // 9번 문제  Ex05_09.java
        // *___*
        // _*_*
        // __*
        // _*_*
        // *___*
		
		for(int i = 5; i >= 1; i--) {
			int k = i;
			if(i == 2) k = 4;
			else if(i == 1) k = 5;
			for(int j = 1; j <= k; j++) {
				if(i == j || i + j == 6)	System.out.print("*");
				else	System.out.print("_");
			}
			System.out.println();
		}
		
		

	}

}
