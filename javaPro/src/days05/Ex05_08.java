package days05;

public class Ex05_08 {

	public static void main(String[] args) {

        // 8번 문제  Ex05_08.java
        // ____*
        // ___*
        // __*
        // _*
        // *
		
		for(int i = 5; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				if(i == j) System.out.print("*\n");
				else  System.out.print("_");
			}
		}

	}

}
