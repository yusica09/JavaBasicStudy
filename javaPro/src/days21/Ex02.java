package days21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author yusica
 * @data 2025. 1. 23. - 오전 9:11:23
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// Arrays 클래스 - 배열 사용하기 쉽도록 기능(메서드) 구현된 클래스
		// Collections 클래스 - 컬렉션을 사용하기 쉽도록 기능(메서드) 구현된 클래스
		
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		// Collections<? super T>, T...element
		Collections.addAll(list, 1,2,3,4,5);
		/*
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		*/
		System.out.println(list);
		
		// 오른쪽 2칸씩 list의 요소를 이동(회전)
		//Collections.rotate(list, 2);
		//System.out.println(list);
		
		List<Integer> l1 = list.subList(list.size()-2, list.size());
		System.out.println(l1);
		List<Integer> l2 = list.subList(0, list.size()-2);
		
		ArrayList<Integer> al = new ArrayList<>();
		al.addAll(l1);
		al.addAll(l2);
		
		list = al;
		System.out.println(list);
		
		
		/*
		ArrayList<Integer> tempList = new ArrayList<>(list.size());
		Collections.addAll(tempList, 1,2,3,4,5);
		for (int i = 0; i < list.size(); i++) {
			int num = list.get(i);
			tempList.set((i+2)%5, num);
		} //for i
		list = tempList;
		System.out.println(list);
		*/
		
		/*
		Collections.swap(list, 0, 2); // temp 이용한 교환작업 필요X
		System.out.println(list);
		*/
		
		Collections.shuffle(list);
		System.out.println(list);
		
		//오름차순
		Collections.sort(list);
		System.out.println(list);
		//내림차순
		//Collections.sort(list,Collections.reverseOrder());
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.fill(list, 100);
		System.out.println(list);
		
//		Collections.copy(복사한list, 원본list);
//		Collections.replaceAll(list, 1, 100);
		
	}

}
