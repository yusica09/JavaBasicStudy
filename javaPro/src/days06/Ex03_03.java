package days06;

/**
 * @author yusica
 * @data 2025. 1. 2. - 오후 2:07:06
 * @subject 구구단출력3
 * @content
 */
public class Ex03_03 {

	public static void main(String[] args) {
		
		// [구구단 세로 출력]
		// 2단 3단 4단 5단
		// 6단 7단 8단 9단
		
		/*
		for(int i = 1; i <= 9; i ++) {
			//System.out.printf("[ %d 단 ]\t",i);
			for(int j = 2; j <= 5; j++) {
				System.out.printf("%d*%d=%02d ", j, i, i*j);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 6; j <= 9; j++) {
				System.out.printf("%d*%d=%02d ", j, i, i*j);
			}
			System.out.println();
		}
		*/
		/*
		for(int k =1; k <= 2; k++) {
			for(int i = 1; i <= 9; i ++) {
				for(int j = 4*k-2; j <= 4*k-2+3; j++) {
					System.out.printf("%d*%d=%02d ", j, i, i*j);
				}
				System.out.println();
			}
			System.out.println();
		}
		*/
		
		// [구구단 세로 출력]
		// 2단 3단 4단 
		// 5단 6단 7단
		// 8단 9단
		
		/*
		for(int k =1; k <= 3; k++) {
			for(int i = 1; i <= 9; i ++) {
				//for(int j = 3*k-1; j <= 3*k+1 && j <= 9; j++)
				//위처럼 조건 추가해서 10단 없애기 가능
				for(int j = 3*k-1; j <= 3*k+1; j++) {
					if(j == 10) continue; // continue 말고 break도 가능
					System.out.printf("%d*%d=%02d ", j, i, i*j);
				}
				System.out.println();
			}
			System.out.println();
		}
		*/
		
		
		// 9단만 출력 하지 않기
		for(int k =1; k <= 3; k++) {
			for(int i = 1; i <= 9; i ++) {
				//여기서는 조건에 && j != 9를 넣으면 8단에서 끊긴다
				for(int j = 3*k-1; j <= 3*k+1; j++) {
					if(j == 9) continue; 
					System.out.printf("%d*%d=%02d ", j, i, i*j);
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
	}//main

}//class
