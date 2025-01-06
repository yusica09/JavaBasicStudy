package days07;

import java.util.Arrays;
import java.util.Random;

/**
 * @author yusica
 * @data 2025. 1. 3. - 오후 3:39:03
 * @subject
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) {

		int [] lotto = new int[6];
		boolean isDuplicated = false;
		Random rnd = new Random();
		
		// 1 .배열크기
		// System.out.println(lotto.length);
		// 2. 윗첨자값( upperbound ) = lotto.length - 1
		// 3. 배열은 초기화 하지 않아도 자료형의 기본값으로 초기화 되어져 있다.
		
		System.out.println(Arrays.toString(lotto));
		
		
		int index = 0;
		int n = rnd.nextInt(45)+1;
		lotto[index] = n;
		System.out.println(Arrays.toString(lotto));
		index++;
		
		while(index < 6) {
			do {
				isDuplicated = false;
				n = rnd.nextInt(45)+1;
				for (int i = 0; i < index; i++) {
					if(lotto[i] == n) {
						//System.out.print("중복됨");
						isDuplicated = true;
						break;
					}
				}
			} while (isDuplicated);
			lotto[index] = n;
			index++;	
		} //while
		
		
		/*
		for (int i = 0; i < lotto.length; i++) {
			int n = rnd.nextInt(45);
			if(i == 0) lotto[i] = n+1;
			else {
				do {
					isDuplicated = false;
					n = rnd.nextInt(45)+1;
					for(int j=0; j < i; j++) {
						if(lotto[j] == n){
							isDuplicated = true;
							break;
						}
					}
					
				} while (isDuplicated);
				lotto[i] = n;
			}
		}
		*/
		
		
		System.out.println(Arrays.toString(lotto));
		
	}//main

}//class
