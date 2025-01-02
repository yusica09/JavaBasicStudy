package days05;

public class Ex05_07 {

	public static void main(String[] args) {
		
        // 7번 문제  Ex05_07.java
        // *
        // _*
        // __*
        // ___*
        // ____*
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				if(i == j) System.out.print("*\n");
				else  System.out.print("_");
			}
		}

	}//main

}//class
