package days20;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author yusica
 * @data 2025. 1. 22. - 오전 11:26:27
 * @subject		문제 1만
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		//int [] a = {1,2,3,4,5};
		//int [] b = {4,5,6,7,8};
		
		// (문제1) a U b  합집합 : 1 2 3 4 5 6 7 8
		// (문제2) a - b 차집합
		// (문제3) a   b  교집합
		
		int [] a = {1,2,3,4,5};
		int [] b = {4,5,6,7,8};
		
		
		//[2]
		ArrayList<Integer> aL = new ArrayList<Integer>();
		ArrayList<Integer> bL = new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) 	aL.add(a[i]);
		for (int i = 0; i < b.length; i++)  bL.add(b[i]);
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.addAll(aL);
		set.addAll(bL);
		
		System.out.println(set);
		
		
		
		/*[1]
		HashSet<Integer> set = new HashSet<Integer>();
		for(int num : a) {
			set.add(num);
		}
		for(int num : b) {
			set.add(num);
		}
		
		System.out.println(set);
		*/
		
		
		
	}

}
