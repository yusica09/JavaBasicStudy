package days05;

public class Ex05_04 {

	public static void main(String[] args) {

        // 4번 문제
        // ****
        // _***
        // __**
        // ___*
		
		
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4; j++) {
				if(j <= i - 1 )	System.out.print("_");
				else System.out.print("*");
			}
			System.out.println();
		}

	}

}
