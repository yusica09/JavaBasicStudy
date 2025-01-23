package days20;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author yusica
 * @data 2025. 1. 22. - 오전 11:38:38
 * @subject		TreeSet, 이진검색트리구조
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		
		/*
		 * List - 컬렉션 클래스
		 * Set - HashSet, LinkedHashSet
		 *			[TreeSet]
		 *
		 * 1. 중복 허용 X, 순서 유지 X
		 * 2. 이진 검색 트리를 사용해서 데이터를 순서대로 저장한다.
		 * 3. 검색, 정렬, 범위 검색을 하는 데 뛰어난 성능을 보이는 컬렉션 클래스이다.
		 * 4. 연결리스트처럼 노드(Node)가 서로 연결된 구조이다.
		 * 5. 최상위노드를 "루트(root)노드" 라고 한다.
		 * 		부모-자식 노드 관계, 형제 노드 관계
		 * 6. class TreeNode{
		 * 			Object value;
		 * 			TreeNode left; // 왼쪽 자식 노드
		 * 			TreeNode right; // 오른쪽 자식 노드
		 * 		}
		 * 7. [이진 검색 트리 구조]
		 * 		부모노드의 왼쪽에는 부모노드 값보다 작은 값의 자식노드 배치.
		 * 		부모노드의 오른쪽에는 부모노드의 값보다 큰 값의 자식노드 배치
		 *
		 **/
		
		TreeSet<Integer> tset = new TreeSet<>();
		tset.add(7);
		tset.add(4);
		tset.add(9);
		tset.add(1);
		tset.add(5);
		tset.add(6);
		
		System.out.println(tset);
		System.out.println(tset.first()); // 1
		System.out.println(tset.last()); // 9
		
		SortedSet<Integer> ss = tset.subSet(4, 7); // [4,5,6]
		System.out.println(ss);
		
		System.out.println(tset.higher(1)); //4
		System.out.println(tset.lower(1)); //null
		
		System.out.println(tset.floor(3)); // 1
		System.out.println(tset.ceiling(3)); // 4
		
	}

}
