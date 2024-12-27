package days03;

/**
 * @author yusica
 * @data 2024. 12. 26. - 오후 12:18:07
 * @subject 산술 오버플로우
 * @content
 */
public class Ex03_03 {

	public static void main(String[] args) {
		int i = 100, j = 200;
		int k = i + j;
		
		System.out.printf("%d + %d = %d\n", i, j, k);
		//100 + 200 = 300
		

		int i2 = Integer.MAX_VALUE;
		int k2 = i2 + j;

		System.out.printf("%d + %d = %d\n", i2, j, k2);
		//2147483647 + 200 = -2147483449  -> 산술 overflow
		
		long t = i2 + j;
		System.out.printf("%d + %d = %d\n", i2, j, t);
		//2147483647 + 200 = -2147483449 
		// 오버플로우 난 상태를 그냥 큰 자료형인 long에 넣었을 뿐이므로 결과는 같음
		
		long t2 = (long)i2 + j;
		System.out.printf("%d + %d = %d\n", i2, j, t2);
		// 2147483647 + 200 = 2147483847
		// 이렇게 고쳐야 제대로 된 결과가 나온다
		
	}

}
