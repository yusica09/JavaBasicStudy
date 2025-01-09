package days10;

import java.util.Random;
import java.util.Scanner;

public class Ex06_02 {
	public static void main(String[] args) {
		// 로또 게임
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 게임 횟수 입력 ? ");
		int gameNumber = scanner.nextInt();
		//int [] lotto = new int[gameNumber*6];
		int [][] lotto = new int[gameNumber][6];

		fillLotto(lotto, gameNumber);
		dispLotto(lotto, gameNumber);
	} // main

	private static void fillLotto(int[][] lotto, int gameNumber) {
		int index = 0, n;
		Random rnd = new Random();
		for (int i = 0; i < gameNumber; i++) {
			index = 0; // 중요! 0으로 만들지 않으면 1게임 번호만 뽑고 끝나버림.
			while (index < 6) { 
				n = rnd.nextInt(45)+1;
				// 중복되면 true 반환
				if( !isDuplicatedLotto(lotto, n, index, i)) {
					lotto[i][index++] = n; 
				} // if         
			} // while 
		} // for
	} // fillLotto

	private static boolean isDuplicatedLotto(int[][] lotto, int n, int index, int row) {
		for (int i = 0; i < index; i++) { 
			if( lotto[row][i] == n ) return true;   
		} // for i
		return false;
	} // isDuplicatedLotto

	private static void dispLotto(int[][] lotto, int gameNumber) {
		for (int i = 0; i < gameNumber; i++) { // 행(게임) 개수
			System.out.printf("[%d게임] ", i+1);
			for (int j = 0; j < lotto[i].length ; j++) { // 열(로또번호) 개수
				System.out.printf("[%02d]", lotto[i][j]);      
			} // for j
			System.out.println();      
		} // for i      
	} // dispLotto
}//class
