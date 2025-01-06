package days07;

import java.util.Random;

/**
 * @author yusica
 * @data 2025. 1. 3. - 오후 4:29:01
 * @subject  로또 메서드 처리
 * @content	구조적 프로그래밍 (함수로 이루어진 프로그래밍), 객체지향적 프로그래밍
 */
public class Ex05_03 {

	public static void main(String[] args) {
		
		int [] lotto = new int[6];
		
		fillLotto(lotto);
		// 1. 기능 - 로또 번호 출력 함수
		// 2. 매개변수 - 출력할 배열 lotto
		// 3. 리턴값 - X, void
		dispLotto(lotto);

	} //main

	private static void fillLotto(int[] lotto) {
		int index = 0, n;
		Random rnd = new Random();
		
		while(index < 6) {
			n = rnd.nextInt(45)+1;
			// 중복이 되면 true;
			if(!isDuplicateLotto(lotto, n, index)) {// 중복체크 함수
				lotto[index++] = n;
			}
		}//while
	}

	

	private static boolean isDuplicateLotto(int[] lotto, int n, int index) {
		for (int i = 0; i < index; i++) {
			if(lotto[i] == n) return true;
		}
		return false;
	}


	private static void dispLotto(int[] lotto) {
		for(int i = 0; i < lotto.length; i++) {
			System.out.printf("[%02d]",lotto[i]);
		}
		System.out.println();
		
	} 

} //class
