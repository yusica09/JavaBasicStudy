package days08;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

/**
 * @author yusica
 * @data 2025. 1. 6. - 오후 4:50:54
 * @subject		배열
 * @content
 */
public class Ex07 {

	public static void main(String[] args) throws IOException {
			//[배열]
			// 1. 정의 : 동일한 자료형 + 메모리상에 연속적으로 놓이게 한 것.
			// 2. 선언형식 : 자료형[] 배열명 = new 자료형[배열크기];
			// 3. 배열의 크기 : 배열명.length
			// 4. 배열의 윗첨자값(UpperBound) : 배열의 크기 - 1
			// 5. 배열의 초기화		int [] kors = {90, 80, 70};
			// 6. [배열의 단점] -> 컬렉션 클래스 사용
		
		int [] m = new int[3];
		/* 배열의 각 요소를 -1값으로 초기화
		for (int i = 0; i < m.length; i++) {
			m[i] = -1;
		}*/
		
		//Arrays 클래스 : 배열을 더 쉽게 다루는 기능이 있는 클래스
		// Arrays.toString(m)
		Arrays.fill(m,-1);
		
		int index = 0;
		char con = 'y';
		
		// Character.toUpperCase('y');
		
		Random rnd = new Random();
		
		do {
			m[index++] = rnd.nextInt(100); // 0<= 정수 < 100
			// 계속 여부 ? y
			System.out.printf("> 배열(%d) 계속 초기화할거냐?", index);
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con) == 'Y');
		
		dispArr(m);
	}

	private static void dispArr(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]=%d\n",i,m[i]);
		}
		
	}

}
