package days07;

import java.util.Scanner;

public class Ex01_03 {

	public static void main(String[] args) {
		// 두 정수를 입력받아서 합을 출력 .. 
		// 조건) 두 정수의 합을 반환하는 sum 함수를 만들어서 처리
		
		int x,y,z = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 두 정수 x, y 입력 ? ");
		
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		//int z = x + y;
		z = sum(x,y);
		
		System.out.printf("%d + %d = %d\n", x, y, z);
		
		
	}//main
	
	public static int sum(int x, int y) {
		return x + y;
	}

}//class
