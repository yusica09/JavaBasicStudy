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
 * @subject		게임 횟수를 입력받아서 로또 번호 출력 - Hash에서 입력받는 순서대로 출력
 * @content		List와 HashSet만으로 했으나 사실 LinkedHashSet으로 쉽게 해결가능
 * 
 */
public class Ex12_04 {

	public static void main(String[] args) {
		// 게임횟수 입력받기
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 게임 횟수 입력 ? ");
		int gameNumber = scanner.nextInt();
		// 로또 숫자 입력받을 hashSet과 이걸 게임횟수만큼 받을 List 생성
		HashSet<Integer> lotto = new HashSet<Integer>();
		List listLotto =  new ArrayList();
		List lottoGames = new ArrayList();
		// List의 사이즈가 게임횟수보다 적을동안..
		while(lottoGames.size() < gameNumber) {
			 lotto = new HashSet<Integer>();
			 listLotto =  new ArrayList();
			 fillLotto(lotto,listLotto);
			 dispLotto(listLotto);
			 
			 lottoGames.add(Arrays.asList(lotto));
		}
		
		
	}//main

	private static void dispLotto(List listLotto) {
		Iterator<Integer> ir = listLotto.iterator();
		while (ir.hasNext()) {
			Integer num = (Integer) ir.next();
			System.out.printf("[%02d] ",num);
		}
		System.out.println();
		
	}

	private static void fillLotto(HashSet<Integer> lotto, List listLotto) {
		Random rnd = new Random();
		int n, beforeSize;
		while(lotto.size() < 6) {
			beforeSize = lotto.size();
			n  = rnd.nextInt(45)+1;
			lotto.add(n);
			if(beforeSize < lotto.size())
				listLotto.add(n);
		}
	}//fillLotto

}
