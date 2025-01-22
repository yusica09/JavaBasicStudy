package days19;

/**
 * @author yusica 
 * @data 2025. 1. 21. - 오후 2:27:04
 * @subject		LinkedList(링크드 리스트) 컬렉션 클래스
 * @content
 * 				1. 배열
 * 					- [][][100][][]		자동크기 조절X
 * 					- 비순차적인 데이터를 삽입/삭제 성능 떨어짐
 * 					- (장점) 읽기 성능이 가장 빠르다
 * 				2. 연결리스트 (양방향, 단방향)
 * 					- (특징) 비연속적이다.
 * 
 * 
 * 
 */
public class Ex08 {

	public static void main(String[] args) {
		
		// 단방향 연결리스트
		// node1 - node2 - node3- node4
		Node node1 = new Node();
		Node node2 = new Node();
		Node node3 = new Node();
		Node node4 = new Node();
		
		node1.value = 10;
		node2.value = 20;
		node3.value = 30;
		node4.value = 40;
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = null;
		
		Node node = node1;
		while (node != null) {
			System.out.println( node.value);
			node = node.next;
		} 
		
		//[문제] 노드2와 노드3 사이에 노드5 추가(삽입) 하시오
		Node node5 = new Node();
		node5.value = 50;
		node2.next = node5;
		node5.next = node3;
		// node1 - node2 - node5 - node4
		
 		// node3 삭제
		node5.next = node4;
		
		// 가장 마지막 노드4 삭제
		node5.next = null;
		
		/*
		System.out.println("1");
		System.err.println("2");	// 에러객체
		System.out.println("3");
		System.err.println("4"); // 출력이 빨간색으로 나오고, 정상출력후 나옴
		System.out.println("6");
		System.err.println("7"); // 멀티스레드같은 거라서 순서는 이에 맞지않음
		System.out.println("8");
		System.out.println("10");
		*/
		
	}

}


class Node{
	
	int value = 0;
	Node next = null;
}
