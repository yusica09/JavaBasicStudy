package days08;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

/**
 * @author yusica
 * @data 2025. 1. 6. - 오후 5:24:55
 * @subject		배열의 크기가 부족할 경우 배열의 크기를 3 증가시켜서 처리 구현 
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) throws IOException {	
		int [] m = new int[3];	//m[0]    ~   m[2]
										// 아랫첨자값    LowerBound
										// 윗첨자값 		UpperBound
	
		int index = 0;
		char con = 'y';

		Arrays.fill(m,-1);
		
		Random rnd = new Random();
		
		do {
			m[index++] = rnd.nextInt(100); // 0<= 정수 < 100
			// 계속 여부 ? y
			System.out.printf("> 배열(%d) 계속 초기화할거냐? ", index);
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con) == 'Y' && index < m.length);
		
		if( con == 'y') System.out.println("빈 방이 없어서 나감 .. ");
		
		dispArr(m);
	}//main

	private static void dispArr(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]=%d\n",i,m[i]);
		}
		
	}

}
