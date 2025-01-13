package days12;

import java.util.Arrays;

/**
 * @author yusica
 * @data 2025. 1. 10. - 오후 4:33:08
 * @subject	[ 가변인자 (variable arguments) ]
 * @content	JDK1.5 메서드의 매개변수의 갯수가 고정 -> 동적 지정할 수 있다.
 */
public class Ex11_02 {

	public static void main(String[] args) {
		
		System.out.println(Ex11_02.sum(1, 2));
		System.out.println(Ex11_02.sum(1, 2, 3));
		System.out.println(Ex11_02.sum(1, 2, 3, 4));
		System.out.println(Ex11_02.sum(1, 2, 3, 4, 5, 6, 7, 8, 9));
		
		int [] m = {1, 2, 3, 4, 5, 6, 7};
		System.out.println(Ex11_02.sum(m));
		

	}//main
	
	//sum()
	public static int sum(int...args) {
		/*
		int res = 0;
		for(int num:m){
			res += num;
		}
		return res;
		*/
		
		// JDK 1.5 제네릭
		// JDK 1.8 람다와 스트림
		return Arrays.stream(args).sum();
	}
	

}//class
