package days19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author yusica
 * @data 2025. 1. 21. - 오전 9:42:42
 * @subject	ArrayList 컬렉션클래스
 * @content	1. 가장 많이 사용되는 컬렉션 클래스
 * 					2. List 인터페이스(순서유지O, 중복허용O)
 */
public class Ex03 {

	public static void main(String[] args) {
		/*		배열의 단점들 - 크기 고정, 원소 삽입 또는 삭제 시 다 옮겨야함
		String [] names = new String[15];
		names[0] = "박이름";
		names[1] = "양이름";
		*/
		
		// 제네릭(Generics)
		// <E>  E == Element==요소 
		// <? extends E>
		ArrayList list = new ArrayList(3);
		//System.out.println(list.isEmpty());		-> 요소가 있는지 없는지 확인가능
		
		list.add("김이름");
		list.add("이이름");	
		list.add("양이름");
		
		//System.out.println(list.isEmpty());
		
		list.add(1, "주이름");
		System.out.println(list);
		System.out.println(list.size());
		list.trimToSize(); // 사용하지 않는 공간 제거해줌
		
		//boolean
		System.out.println(list.contains("김이름"));
		System.out.println(list.contains("최이름"));
		
		int index = list.indexOf("이이름");
		System.out.println(index);
		
		// list.add(index, "이이름"); -> insert역할
		list.set(index, "박이름"); // -> replace 마냥 넣는 index값과 바꾸기
		System.out.println(list);
		
		//list.remove(index);
		list.add("박이름");
		System.out.println(list); // 중복허용
		
		
		// [문제] 박씨 성 학생들 제거
		
		/*	-> remove 사용시 삭제후 리스트 재정렬 되므로 잘못된 코드
		for (int i = 0; i < list.size(); i++) {
			String name = (String) list.get(i); //다운캐스팅
//			if(name.charAt(0) == '박')
//				list.remove(i);
			if(name.startsWith("박")) {
				list.remove(i);
			}
		}
		*/
		
		
		/*
		//[1] -> 인덱스 조정때문에 i--로 for문이 도는 인덱스 조정
		for (int i = 0; i < list.size(); i++) {
			String name = (String) list.get(i); //다운캐스팅
//			if(name.charAt(0) == '박')
//				list.remove(i);
			if(name.startsWith("박")) {
				list.remove(i);
				i--;
			}
		}
		
		//[2] -> 인덱스 재정렬과 관계없게 지울수있게 뒤부터 지우기
		for (int i = list.size()-1; i >= 0; i--) {
			String name = (String) list.get(i); //다운캐스팅
//			if(name.charAt(0) == '박')
//				list.remove(i);
			if(name.startsWith("박")) {
				list.remove(i);
			}
		}
		*/
		
		/*
		//[3]
		// <T> Type
		list.removeIf(new Predicate<String>() {

			@Override
			public boolean test(String name) {
				
				return name.startsWith("박");
			}
		});
		*/
		
		//[4] - 람다식
		// list.removeIf((name) -> ((String)name).startsWith("박"));
		
		// 정렬 - 오름차순
		//list.sort(null); //[김이름, 박이름, 박이름, 양이름, 주이름]

		//내림차순 정렬
		/*
		//[1]
		//list.sort(Collections.reverseOrder());
		//[2]
		list.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		*/
		//[3] - 람다식
		list.sort((o1, o2) -> ((String) o2).compareTo((String) o1));
	
		System.out.println(list);
		
		// 모든요소제거
		//list.clear();
		
		//1 ~ 3 요소를 얻어오기
		int fromIndex = 1;
		int toIndex = 3;
		List list13 = list.subList(fromIndex, toIndex + 1);
		System.out.println(list13);
		
		System.out.println(list);
		
	}

}
