package days09;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * @author yusica
 * @data 2025. 1. 7. - 오후 2:01:15
 * @subject
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {

		int [] kors = {79, 88, 100, 33, 100, 55, 95};
		
		OptionalInt op = IntStream.of(kors).max();
		int max = op.getAsInt();
		System.out.println(max);
		
		
		/*
		int max = kors[0];
		int min = kors[0];
		
		for (int i = 0; i < kors.length; i++) {
			if(max < kors[i]) max = kors[i];
			else if(min > kors[i]) min = kors[i];
		}
		
		System.out.println("최대 국어점수 : " + max);
		System.out.println("최소 국어점수 : " + min);
		
		for (int i = 0; i < kors.length; i++) {
			if(max == kors[i]) {
				System.out.printf("%d번 - 국어 : %d\n", i+1,kors[i]);
			}
		}
		*/

	}

}
