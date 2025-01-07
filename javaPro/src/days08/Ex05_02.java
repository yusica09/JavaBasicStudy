package days08;

public class Ex05_02 {

	public static void main(String[] args) {
		int money = 125760;
		int share; //몫 변수
		int rest; //나머지 변수
		
		int [] unit = {50000, 10000, 5000, 1000, 500, 100, 50,10,5,1};
		 // 화폐 단위 배열 선언
	    String [] s_unit = { "5만원","1만원","5천원", "1천원", "5백원", "1백원","5십원","1십원","5원","1원" };
		for(int i=0; i<unit.length; i++) {
			share = money/unit[i];
			System.out.printf("%s : %d 개\n", s_unit, share);
			rest = money%unit[i];
			money = rest;
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
