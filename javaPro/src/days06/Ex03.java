package days06;

/**
 * @author yusica
 * @data 2025. 1. 2. - 오후 12:25:57
 * @subject	구구단 출력
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// 구구단 출력
		
		/*
		int dan = 2;
		System.out.printf("[ %d 단 ]\n",dan);
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %02d\n",dan,i,dan*i);
		}
		*/

		for(int i = 2; i <= 9; i++) {
			System.out.printf("[ %d 단 ]\n",i);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %02d\n",i,j,i*j);				
			}
		}
	}

}
