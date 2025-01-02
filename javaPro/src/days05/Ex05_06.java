package days05;

public class Ex05_06 {

	public static void main(String[] args) {

        // 6번 문제( 마름모 )
        // __*
        // _***
        // *****
        // _***
        // __*
		
		for(int i=1;i<4;i++) {
			for(int j = 1;j<=i+2;j++) {
				if(2<= (i + j) && (i + j) <= 3)  System.out.print("_");
				else	System.out.print("*");
			}
			System.out.println();
		}
		for(int i=4;i>=3;i--) {
			for(int j = 1;j<=i;j++) {
				if(4 <= (i + j) && (i + j) <= 5)  System.out.print("_");
				else	System.out.print("*");
			}
			System.out.println();
		}

	}//main

}//class
