package days06;

/**
 * @author yusica
 * @data 2025. 1. 2. - 오후 2:32:13
 * @subject  라벨 break 사용
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		
		// out은 라벨 이름으로써 임의 설정 가능
		// 그냥 break하면 j for문만 break되므로 i for문에 라벨 달고 그 라벨 break
		out:
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(i == 4 && j == 6) break out;
				System.out.printf("(%d-%d)",i,j);
			}
			System.out.println();
		}

	}//main

}//class
