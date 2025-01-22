package days19;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author yusica
 * @data 2025. 1. 21. - 오후 3:34:55
 * @subject		큐		-  offer(), poll(), isEmpty(), peek()
 * @content
 */
public class Ex09_02 {

	public static void main(String[] args) {
		// Queue 큐 FIFO
		//Queue q = new Queue(); -> 인터페이스이기때문에 객체생성 불가
		
		
		// List 인터페이스
		// Deque -> Queue 인터페이스
		Queue q = new LinkedList();
		q.offer("주이름");
		q.offer("최이름");
		q.offer("이이름");
		
		/*
		System.out.println(q.peek());
		System.out.println(q.size());
		System.out.println(q.poll());
		System.out.println(q.poll());
		*/
		
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
