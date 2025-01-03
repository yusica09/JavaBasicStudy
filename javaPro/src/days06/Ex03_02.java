package days06;

/**
 * @author yusica
 * @data 2025. 1. 2. - 오후 2:02:54
 * @subject 구구단 출력2
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i ++) {
			//System.out.printf("[ %d 단 ]\t",i);
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%d*%d=%02d ", j, i, i*j);
			}
			System.out.println();
		}
		
	}

}
