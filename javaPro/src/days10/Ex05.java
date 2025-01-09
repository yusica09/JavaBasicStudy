package days10;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author yusica
 * @data 2025. 1. 8. - 오후 4:35:13
 * @subject		이진 검색
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		// 이진 검색 ( binary Search)
		//		 -> 필수조건 : 정렬

		/*
		int [] m = { 0, 4, 5, 15, 20, 21, 22, 24, 25, 28, 29, 30, 32, 33, 40, 43, 46, 47, 48, 58, 62, 63, 71, 76, 
				86, 91, 94, 99, 111, 116, 128, 135, 137, 139, 142, 145, 146, 150, 151, 160, 161, 166, 168, 
				169, 172, 181, 184, 185, 191, 198 };
		System.out.println(Arrays.toString(m));
		*/
		
		int [] m = new int[1000000];
		for (int i = 0; i < m.length; i++) {
			m[i] = i + 1;
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 배열에서 찾을 정수 입력 ? ");
		int n = scanner.nextInt();  
		
		int index = -1;
		index = binarySearch(m,n);
		
		System.out.println("> 이진 탐색");
		if(index != -1) {
			System.out.printf("찾는 정수 %d는 %d 위치에 있다.\n", n, index);
		}else {
			System.out.println("찾는 정수는 없다.\n");
		}
		
		System.out.println("=====================");
		System.out.println("> 재귀 이용한 이진 탐색");
		int top = m.length;
		int bot = 0;
		int idx = recursiveBinarySearch(m,n,bot,top);
		
		if(idx != -1) {
			System.out.printf("찾는 정수 %d는 %d 위치에 있다.\n", n, index);
		}else {
			System.out.println("찾는 정수는 없다.\n");
		}
		
	}

	private static int recursiveBinarySearch(int[] m, int n, int bot, int top) {
		
		int mid = (bot+top)/2;
		
		if(bot > top) return -1;
		if(n == m[mid]) return mid;
		else if(n > m[mid])
			return recursiveBinarySearch(m,n,mid+1,top);
		else
			return recursiveBinarySearch(m,n,bot,mid - 1);
	}

	private static int binarySearch(int[] m, int n) {
		int top = m.length;
		int bot = 0;
		int mid;
		int count = 0;
		
		while(bot <= top) {
			count++;
			mid = (bot+top)/2;
			if(n == m[mid]) {
				System.out.println("> 찾은 횟수 : " + count);
				return mid;
			}
			else if(n > m[mid])
				bot = mid + 1;
			else if(n < m[mid])
				top = mid - 1;
		}	
		System.out.println("> 못 찾은 횟수 : " + count);
		return -1;
	}

}
