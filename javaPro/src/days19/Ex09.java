package days19;

import java.util.Stack;

/**
 * @author yusica
 * @data 2025. 1. 21. - 오후 3:19:07
 * @subject		스택 - push(), pop(), peek(), empty(), search()
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {

		// stack extends Vector
		Stack s = new Stack();
		
		//LIFO
		s.push("양이름");
		s.push("오이름");
		s.push("유이름");
		
		// s.get(1) X
		//s.search("홍길동");
		
		System.out.println(s);
		
		/*
		//String name = (String) s.pop();
		//System.out.println(name);
		//System.out.println(s.size()); //2
		
		String name = (String) s.peek(); // 들여다보기
		System.out.println(name);

		System.out.println(s.size()); //3
		*/
		
		//System.out.println(s.pop());
		//System.out.println(s.pop());
		//System.out.println(s.pop());
		
		/*
		int len = s.size();
		for (int i = 0; i < len; i++) {
			System.out.println(s.pop());
		}
		*/
		
		//System.out.println(s.isEmpty());
		//System.out.println(s.empty());
		while (!s.empty()) {
			System.out.println(s.pop());
			
		}
		
		
		
	}

}
