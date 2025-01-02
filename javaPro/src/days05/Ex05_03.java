package days05;

public class Ex05_03 {

	public static void main(String[] args) {    
        // 3번 문제
        // ___*
        // __**
        // _***
        // ****
		
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4; j++) {
				if(j + i <= 4) 	System.out.print("_");
				else 	System.out.print("*");
			}
			System.out.println();
		}

	}

}
