package days05;

import java.util.Scanner;

public class Ex01_03 {

	public static void main(String[] args) {
		// [문제]
		// 세 정수(a,b,c)를 입력받아서 가장 작은값(min)
		// 가장 큰값(max) 찾아서 출력
		
		/*
		int min, max;
	      
	      if ( a > b ) {  // max = a
	         // a c
	         if ( a > c) {
	            max = a;
	         } else {
	            max = c;
	         } // 
	         
	      } else {        // max = b
	         // b c
	         if ( b > c) {
	            max = b;
	         } else {
	            max = c;
	         } // 
	      } // if
	      
	      System.out.println("max = " + max);
	      */


		Scanner scanner = new Scanner(System.in);
		System.out.print("> 정수 a, b, c 입력 : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		int max = Math.max(a, b) > c ? Math.max(a, b) : c;
		//(1) 
		//max = Math.max(Math.max(a,b),c);
		
		//(2)
		// max = Math.max(a,b);
		// max = Math.max(max,c);
		int min = Math.min(a, b) > c ? c : Math.min(a, b);

		System.out.printf("max = %d, min = %d",max,min);

	}// main

}// class
