package days19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @author yusica
 * @data 2025. 1. 21. - 오후 4:50:33
 * @subject		게임 횟수를 입력받아서 로또 번호 출력
 * @content		days11.Ex06_03.java 이용해서
 * 						List
 * 						Set
 * 
 */
public class Ex12_03 {

	public static void main(String[] args) {
		// 게임횟수 입력받기
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 게임 횟수 입력 ? ");
		int gameNumber = scanner.nextInt();
		// 로또 숫자 입력받을 hashSet과 이걸 게임횟수만큼 받을 List 생성
		HashSet<Integer> lotto = new HashSet<Integer>();
		List lottoGames = new ArrayList();
		//ArrayList<HashSet<Integer>> lottos = new ArrayList<HashSet<Integer>>(gameNumber);
		// List의 사이즈가 게임횟수보다 적을동안..
		while(lottoGames.size() < gameNumber) {
			 lotto = new HashSet<Integer>();
			 fillLotto(lotto);
			 dispLotto(lotto);
			 
			 lottoGames.add(Arrays.asList(lotto));
		}
		
		
	}//main

	private static void dispLotto(HashSet<Integer> lotto) {
		Iterator<Integer> ir = lotto.iterator();
		while (ir.hasNext()) {
			Integer num = (Integer) ir.next();
			System.out.printf("[%02d] ",num);
		}
		System.out.println();
		
	}

	private static void fillLotto(HashSet<Integer> lotto) {
		Random rnd = new Random();
		int n;
		while(lotto.size() < 6) {
			n  = rnd.nextInt(45)+1;
			lotto.add(n);
		}
	}//fillLotto

}
