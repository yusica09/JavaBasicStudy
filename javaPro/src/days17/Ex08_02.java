package days17;

import java.util.Arrays;

/**
 * @author yusica
 * @date 2025. 1. 17. - 오후 2:47:46
 * @subject
 * @content 
 */
public class Ex08_02 {

	public static void main(String[] args) {
		int [] m = { 3,5,2,4,1 };
		int [] n = { 3,6,2,4,1 };

		// [1]  int [] ->  List 변환하는 메서드 ( 컬렉션 프레임 워크 )
		// List<int[]> asList(T...a) 메서드 
		// Arrays.asList(m);
		
		// [2] 순차검색, 이진검색==binarySearch
		// int index = Arrays.binarySearch(m, 3);
		
		// [3]int  두 배열이 같은지 여부  -  양수, 음수, 0
		// System.out.println( Arrays.compare(m, n) );
		
		// [4] int [] x = Arrays.copyOf(m, 3);
		// System.out.println( Arrays.toString(x ));
		
		// [5] Arrays.copyOfRange(배열, from , to)
		
		// [6] boolean Arrays.equals(null, null)

	
	} // main

} // class
