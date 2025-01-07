package days08;

public class Ex05_03 {

	public static void main(String[] args) {
		//(시험)
		int money = 125760;
		int unit = 50000;
		boolean sw = false; // 스위치변수
		int count = 0;
		
		while (unit >= 1) {
			count = money / unit;
			System.out.printf("%d원 : %d 개\n", unit, count);
			money %= unit;
			unit /= (!sw? 5:2);
			sw = !sw;
		}
		
		/*
		int k = 50000;
		for(int i=1; i<=10; i++) {
			share = money/k;
			System.out.printf("%d원 : %d 개\n", k, share);
			rest = money%k;
			money = rest;
			k = i%2==1? k/5 : k/2;
		}
		*/

	}//main

}//class
