package days09;

import java.util.Arrays;
import java.util.Random;

/**
 * @author yusica
 * @data 2025. 1. 7. - 오후 2:07:53
 * @subject	카드 섞기, 화투 섞기 등
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		int [] m = new int[10];
		for (int i = 0; i < m.length; i++) {
			m[i] = i;
		}
		shuffle(m);
		System.out.println(Arrays.toString(m));

	}//main

	// Call By Reference
	private static void shuffle(int[] m) {
		Random rnd = new Random();
		int idx1, idx2;
		for (int i = 0, temp; i < 100; i++) {
			idx1 = rnd.nextInt(m.length);
			idx2 = rnd.nextInt(m.length);
			
			temp = m[idx1];
			m[idx1] = m[idx2];
			m[idx2] = temp;
		}
		
		/*
		for(int i=0; i < 100; i++) {
			int index1 = (int)(Math.random()*10);
			int index2 = (int)(Math.random()*10);
			
			int temp = m[index1];
			m[index1] = m[index2];
			m[index2] = temp;
		}*/
		
	}

}//class
