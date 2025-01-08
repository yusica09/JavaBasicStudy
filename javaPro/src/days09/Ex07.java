package days09;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author yusica
 * @data 2025. 1. 7. - 오후 4:10:47
 * @subject	(시험)
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		int [] m = new int[100];
		// 0<= 정수 <= 9
		Random rnd = new Random();
		
		//[1]
		for(int i=0; i<m.length;i++) {
			//m[i] = (int)(Math.random()*10);
			m[i] = rnd.nextInt(10);
		}
		
		//[2]
		//m = IntStream.generate(()-> rnd.nextInt(10)).limit(100).toArray();
		
		System.out.println(Arrays.toString(m));
		
		//[문제]
		// 0 갯수 : 5개
		// 1 갯수 : 15개
		// :
		// 9 갯수 : 20개
		
		
		
		/*
		for (int j = 0; j <= 9; j++) {
			int cnt = 0;
			for (int i = 0; i < m.length; i++) {
				if(m[i] == j) cnt++;
			}
			System.out.printf("%d : %d개 \n", j, cnt);
		}
		*/
		
		int [] countArr = new int[10];
		for (int i = 0; i < m.length; i++) {
			countArr[m[i]]++;
		}
		int num = 0;
		for(int count:countArr) {
			System.out.printf("%d 갯수 : %d\n", num++,count);
		}
		

	}//main

}//class
