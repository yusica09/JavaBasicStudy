package days17;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author yusica
 * @data 2025. 1. 17. - 오후 2:11:38
 * @subject		java.util 패키지
 * @content			ㄴ 자주 사용되는 유용한 유틸리티(클래스)
 * 
 * 						Arrays 클래스 - 배열을 사용하기 쉽도록 기능이 구현된 클래스
 * 
 * 
 */
public class Ex08 {

	public static void main(String[] args) {
		int [] m = { 3,5,2,4,1 };
		
		// [2]  int[] -> Integer [] 변환
		Integer[] n = ((IntStream) Arrays.stream(m))
				     .boxed()
				     .toArray(Integer[]::new);
		
		/* [1]
		Integer [] n = new Integer[m.length];
		for (int i = 0; i < n.length; i++) {
			n[i] = m[i]; // auto boxing
		} // for i
		*/
		// Integer [] m = { 3,5,2,4,1 }; 
		
		//                  "[3, 5, 2, 4, 1]"
		System.out.println( Arrays.toString(m) );
		
        // Arrays.fill(m, -1);
        // System.out.println( Arrays.toString(m) );
		
		// 오름차순(asc) 정렬
		// Arrays.sort(m);
		
		// 내림차순(desc) 정렬
		//       T[] t                <? super T>
		// Type [] , Comparator <Integer> 
		// [1]
		// Arrays.sort(n, Collections.reverseOrder());
		
		// [2]    T[] t
		//       Integer[] n
		/*
		Arrays.sort(n, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {				
				// return o2 - o1;
				return o2.compareTo(o1);
			}
			
		});
		*/
		
		// [3]
		/*
		Arrays.sort(n, (o1,  o2) -> { 
				return o2.compareTo(o1);
			}			
		);
		*/
		
		// [4]                  -> 람다연산자을 사용한 식: 람다식
		Arrays.sort(n, (o1,  o2) -> o2.compareTo(o1) );
		System.out.println( Arrays.toString(n) );
		
	} // main

}
