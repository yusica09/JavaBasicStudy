package days08;

public class Ex05 {

	public static void main(String[] args) {
		int money = 125760;
		int share; //몫 변수
		int rest; //나머지 변수
		
		share = money/50000;
		System.out.printf("5만원 : %d 개\n", share);
		rest = money%50000;
		
		money = rest;
		share = money/10000;
		System.out.printf("1만원 : %d 개\n", share);
		rest = money%10000;
		
		money = rest;
		share = money/5000;
		System.out.printf("5천원 : %d 개\n", share);
		rest = money%5000;
		
		money = rest;
		share = money/1000;
		System.out.printf("1천원 : %d 개\n", share);
		rest = money%1000;
		
		money = rest;
		share = money/500;
		System.out.printf("5백원 : %d 개\n", share);
		rest = money%500;
		
		money = rest;
		share = money/100;
		System.out.printf("1백원 : %d 개\n", share);
		rest = money%100;
		
		money = rest;
		share = money/50;
		System.out.printf("5십원 : %d 개\n", share);
		rest = money%50;
		
		money = rest;
		share = money/10;
		System.out.printf("1십원 : %d 개\n", share);
		rest = money%10;
		
		money = rest;
		share = money/5;
		System.out.printf("5원 : %d 개\n", share);
		rest = money%5;
		
		money = rest;
		share = money/1;
		System.out.printf("1원 : %d 개\n", share);
		rest = money%1;
		
		

	}//main

}//class


/*
5만원 : 2 개
1만원 : 2 개
5천원 : 1 개
1천원 : 0 개
5백원 : 1 개
1백원 : 2 개
5십원 : 1 개
1십원 : 1 개
5원 : 0 개
1원 : 0 개
*/
