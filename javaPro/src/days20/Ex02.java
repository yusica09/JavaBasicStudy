package days20;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @author yusica
 * @data 2025. 1. 22. - 오전 10:23:35
 * @subject	빙고게임
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		
		int [][] bingo = new int[5][5];
		// 1 ~ 25 정수를 중복되지 않게 2차원 배열에 채워넣기.
		LinkedHashSet<Integer> hs = new LinkedHashSet(25);
		int rnd = -1;
		while(hs.size() < 25) {
			rnd = (int)(Math.random()*25) + 1;
			hs.add(rnd);
		}
		//System.out.println(hs);
		
		//LinkedHashSet -> int [][]
		//int [] -> int[][]
		Iterator<Integer> ir = hs.iterator();
		int i = 0;
		while (ir.hasNext()) {
			int n = ir.next();
			bingo[i/5][i%5] = n;
			i++;
		}
		
		//출력
		for (i = 0; i < bingo.length; i++) {
			for (int j = 0; j < bingo[i].length; j++) {
				System.out.printf("[%02d]", bingo[i][j]);
			}
			System.out.println();
		}
		
// ===================================================
		// 숫자 뽑고 넣기
		/*[2]
		for (int i = 0; i < bingo.length; i++) {
	         for (int j = 0; j < bingo[i].length; j++) {
	            int n = (int)( Math.random()*25 ) + 1; // 중복 되지 않으면 
	            if( ! isDuplicateCheck( bingo, i, j, n)) {
	                 bingo[i][j]  = n;
	            }else {
	               j--;
	            }
	         }
	      }
	      */
	
		
		/*[1] - 오류 수정 필요
		HashSet<Integer> set = new HashSet<Integer>();
		int rnd; int size = set.size();
		for (int i = 0; i < bingo.length; i++) {
			while((size=set.size())%5 < 5) {
				rnd = (int)(Math.random()*25)+1;
				set.add(rnd);
				if(size < set.size())
					bingo[i][size%5] = rnd;
			}
			set = new HashSet<Integer>();
		}
		*/
		
	}

}
