package days17;

import java.util.Iterator;

/**
 * @author yusica
 * @data 2025. 1. 17. - 오전 11:21:49
 * @subject		String 불변
 * @content		StringBuffer(동X) / StringBuilder(동O)
 */
public class Ex03 {

	public static void main(String[] args) {
		
		// "a"+"a"+"a"+"a"		20만번	처리시간 체크
		
		//testString();
		testStringBuffer();
		
		
		System.out.println("  end  ");
	}//main

	
	// > 처리 시간 : 2956100ns	- 20만번
	// > 처리 시간 : 11163300ns   -  200만번
	// 뒤에 a가 추가가 되는게 다라서 빠름
	private static void testStringBuffer() {
		long start = System.nanoTime();
		
		StringBuffer sb = new StringBuffer("a");
		for (int i = 0; i < 2000000; i++) {
			sb.append("a");
		}//for i
		
		long end = System.nanoTime();
		System.out.printf("> 처리 시간 : %dns\n", (end - start));
		
	}


	// > 처리 시간 : 3800567200ns  - 20만번
	// 계속 새로운 객체가 만들어지면서 sb에 참조가 되다보니 시간이 굉장히 오래걸림
	private static void testString() {
		long start = System.nanoTime();
		
		String sb = "a";
		for (int i = 0; i < 200000; i++) {
			sb += "a";
		}//for i
		
		long end = System.nanoTime();
		System.out.printf("> 처리 시간 : %dns\n", (end - start));
		
	}

}//class
