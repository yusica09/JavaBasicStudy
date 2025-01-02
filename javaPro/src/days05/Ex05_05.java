package days05;

public class Ex05_05 {

	public static void main(String[] args) {

        // 5번 문제 ( 이등변 삼각형 )
        // __*
        // _***
        // *****
		
		for(int i=1;i<4;i++) {
			for(int j = 1;j<=i+2;j++) {
				if(2<= (i + j) && (i + j) <= 3)  System.out.print("_");
				else	System.out.print("*");
			}
			System.out.println();
		}
	}//main

}//class
