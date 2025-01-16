package days15;

import java.util.Random;

public class Ex03_02 {

	public static void main(String[] args) {
		
		int number = 100;
		int result = 0;
		Random rnd = new Random();
		// ArithmeticException : / by zero
		int n = -1;
		for (int i = 0; i < 10; i++) {
			n = rnd.nextInt(5); 
			if( n == 0 ) {
				i--;
				continue;
			}
			result = number / n ; // 0<= 정수 <5
			System.out.println(result);
		}

	}

}
