package days19;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author yusica
 * @data 2025. 1. 21. - 오후 3:41:51
 * @subject		더블큐
 * @content
 */
public class Ex09_03 {

	public static void main(String[] args) {
		//Deque == Double Enabled Queue
		//					양쪽		가능		큐		(추가/추출)
		
		Deque q = new LinkedList();
		q.offerFirst("A");
		q.offerLast("B");
		
		q.pollLast();
		q.pollFirst();
		
	}

}
