package days10;

import java.util.Random;
import java.util.Scanner;

/**
 * @author yusica
 * @data 2025. 1. 8. - 오후 5:18:15
 * @subject
 * @content
 * 				> 게임 횟수 입력 ? 3
 * 					[1 게임]	[32][06][11][19][33][25]
 * 						:
 * 					[3 게임]  [34][10][45][35][02][43]
 */
public class Ex06 {

	public static void main(String[] args) {
		// 로또게임
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 게임 횟수 입력 ? ");
		int gameNumber = scanner.nextInt();
		
		int [][] lottos = new int[gameNumber][6];
		
		fillLottos(lottos);
		dispLottos(lottos);

	}
	
	private static void dispLottos(int[][] lottos) {
		for (int i = 0; i < lottos.length; i++) {
			System.out.printf("[%d 게임] ",i+1);
			dispLotto(lottos[i]);
		}
		
	}

	private static void fillLottos(int[][] lottos) {
		for(int i=0;i<lottos.length;i++) {
			fillLotto(lottos[i]);
		}
	}

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

}
