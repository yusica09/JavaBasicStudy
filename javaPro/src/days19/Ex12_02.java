package days19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 * @author yusica
 * @data 2025. 1. 21. - 오후 4:27:56
 * @subject		로또게임
 * @content	days04.Ex08.java
 * 					days07.Ex05_03.java
 * 						fillLotto()
 * 						dispLotto()
 * 						isDuplicateLotto()
 * 
 */
public class Ex12_02 {

	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		fillLotto(lotto);
		dispLotto(lotto);
		
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

}//class
