package days10;

import java.util.Arrays;

/**
 * @author yusica
 * @data 2025. 1. 8. - 오후 5:13:56
 * @subject			이진탐색 내장함수 이용
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) {
		
		int [] m = { 0, 4, 5, 15, 20, 21, 22, 24, 25, 28, 29, 30, 32, 33, 40, 43, 46, 47, 48, 58, 62, 63, 71, 76, 
				86, 91, 94, 99, 111, 116, 128, 135, 137, 139, 142, 145, 146, 150, 151, 160, 161, 166, 168, 
				169, 172, 181, 184, 185, 191, 198 };
		int index = Arrays.binarySearch(m,86);
		System.out.println(index);

	}

}
