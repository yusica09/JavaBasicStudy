package days07;

/**
 * @author yusica
 * @data 2025. 1. 3. - 오후 2:15:26
 * @subject	재귀함수
 * @content	트리구조검색 같은게 아니라면 재귀함수는 사용하지 않는게 좋다.
 */
public class Ex04_02 {

	public static void main(String[] args) {

		//int result = sum(10);
		// recursive = 재귀
		int result = recursiveSum(10);
		System.out.println(result);

	}
	
	
	// 재귀함수(암기)
	private static int recursiveSum(int n) {
		if(n==1) return n;
		else return n + recursiveSum(n);
	}

	
	private static int sum(int n) {
		// 1~n 까지의 합을 구해서 반환하는 메서드
		int result = 0;
		for (int i = 1; i <= n; i++) {
			result += i;
		}
		return result;
	}

}
