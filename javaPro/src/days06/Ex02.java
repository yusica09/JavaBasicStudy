package days06;

public class Ex02 {

	public static void main(String[] args) {

		// ****
		// ****
		// ****
		// ****

		/*
		 * for(int i = 1; i <= 4;i++) { for(int j = 1; j <= 4; j++) {
		 * System.out.print("*"); } System.out.println(); }
		 */

		// *
		// **
		// ***
		// ****

		/*
		 * for(int i = 1; i <= 4;i++) { for(int j = 1; j <= i; j++) {
		 * System.out.print("*"); } System.out.println(); }
		 */

		// ****
		// ***
		// **
		// *

		/*
		 * for(int i = 4; i >= 1;i--) { for(int j = 1; j <= i; j++) {
		 * System.out.print("*"); } System.out.println(); }
		 */

		// ___*
		// __**
		// _***
		// ****

		/*
		 * for(int i = 1; i <= 4;i++) { for(int j = 1; j <= 4; j++) { System.out.print(j
		 * <= 4-i ? "_":"*"); } System.out.println(); }
		 */

		// ****
		// _***
		// __**
		// ___*

		/*
		 * for(int i = 4; i >= 1;i--) { for(int j = 1; j <= 4; j++) { System.out.print(j
		 * <= 4-i ? "_":"*"); } System.out.println(); }
		 */

		// __*
		// _***
		// *****

		/*
		 * for(int i = 3; i <= 5;i++) { for(int j = 1; j <= i; j++) { System.out.print(j
		 * <= 5 - i ? "_":"*"); } System.out.println(); }
		 */

		// __*__
		// _***_
		// *****
		// _***_
		// __*__

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 3 || i == 3 || (i%2==0 && j%2==0))
					System.out.print("*");
				else
					System.out.print("_");
			}
			System.out.println();
		}

	}

}
