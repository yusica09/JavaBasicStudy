package days09;

import java.util.Arrays;

/**
 * @author yusica
 * @data 2025. 1. 7. - 오후 2:19:12
 * @subject	정렬(Sort)
 * @content		- 특정 기준에 맞게 데이터를 열거하는 알고리즘
 * 						예) 성적순, 나이순 등등
 * 						- 오름차순 정렬([Asc]ending Sort)
 * 						- 내림차순 정렬([Desc]ending Sort)
 * 						* 버블정렬, 선택정렬, 삽입정렬, 병합정렬, 쉘 정렬 등등
 */
public class Ex06 {

	public static void main(String[] args) {
		// 버블정렬(bubble sort)
		//		: 인접한 두 원소를 검사하며 정렬하는 알고리즘
		//		: 두 개의 인접한 자료 값을 비교하면서 위치를 교환하는
		// 			방식으로 정렬하는 방법
		
		//ASC
		int [] m = {3,5,2,4,1};
		System.out.println(Arrays.toString(m));
		
		bubbleSort(m);
		
		//선택정렬
		//selectionSort(m);
		//selectionSort2(m);
		
		
		

	}

	private static void selectionSort2(int[] m) {
		// 3, 5, 2, 4, 1
		// [0]
		// 1, 5, 2, 4, 3
		
		//    [1]
		// 1  2  5  4  3
		
		//       [2]
		// 1  2  3  4  5
		
		//			  [3]
		// 1  2  3  4  5
		
	
		for (int i = 0, minIdx; i < m.length-1 ; i++) {
			minIdx = i;
			for (int j = i+1; j < m.length; j++) {
				if( m[minIdx] > m[j] ) minIdx = j;
			}
			System.out.printf("[%d] minIndex = %d ",i,minIdx);
			System.out.print(" *** ");
			if(i != minIdx) {
				int temp = m[i];
				m[i] = m[minIdx];
				m[minIdx] = temp;
			}
			System.out.println(Arrays.toString(m));
			System.out.println();
		}//for i
		
	}

	
	
	
	private static void selectionSort(int[] m) {
		// 3, 5, 2, 4, 1
		
		// 0-1 0-2 0-3 0-4		1회전 1 [] [] [] []
		// 		  1-2 1-3 1-4		2회전 1 2  [] [] []
		// 		  		2-3 2-4		3회전 1 2  3  [] []
		// 		  		 	  3-4		4회전 1 2  3  4  5
		for (int i = 0; i < 4 ; i++) {
	         for (int j = i; j <= 4; j++) {
	            System.out.printf("%d-%d ",i, j);
	            if( m[i] > m[j] ) {
	               System.out.print(" *** ");
	               int temp = m[i];
	               m[i] = m[j];
	               m[j] = temp;
	            }
	            System.out.println(Arrays.toString(m));
	         }
	         System.out.println();
	      }
		
	}//select

	private static void bubbleSort(int[] m) {
	      // i-i+1 
	      // 0-1 1-2 2-3 3-4          1회전
	      // 0-1 1-2 2-3              2회전
	      // 0-1 1-2
	      // 0-1
	      
	      // 0-  1-  2- 3-          1회
	      // 0-  1-  2-              2회전
	      // 0-  1- 
	      // 0- 
	      
	      // i=0 j=0,1,2,3
	      // i=1 j=0,1,2
	      // i=2 j=0,1
	      // i=3 j=0
	      
	      // i+j==3
	      // j= 3-i 
	      for (int i = 0; i <= 3 ; i++) {
	         for (int j = 0; j <= 3-i; j++) {
	            System.out.printf("%d-%d ",j, j+1);
	            if( m[j] > m[j+1] ) { // 조건식 부등호 반대로 바꾸면 오름차순/내림차순
	               System.out.print(" *** ");
	               int temp = m[j];
	               m[j] = m[j+1];
	               m[j+1] = temp;
	            }
	            System.out.println(Arrays.toString(m));
	         }
	         System.out.println();
	      }
	      
	      
	   }//bubble
		

}//class
