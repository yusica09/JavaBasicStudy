package days17;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author yusica
 * @data 2025. 1. 17. - 오후 4:13:35
 * @subject	스트림을 이용해서 합 쉽게 구하기
 * @content
 */
public class Ex10_03 {

	public static void main(String[] args) {
		
		int [] m = {3,5,2,4,1};
		
		//[1]
		// int [] -> Stream 변환 + 메서드()
		//int sum = Arrays.stream(m).sum();
		
		//System.out.printf("> 합: %d", sum);
		
		
		//[2]
		int sum = IntStream.of(m).sum();
		System.out.printf("> 합: %d", sum);
		
	}

}
