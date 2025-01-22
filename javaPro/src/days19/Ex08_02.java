package days19;

import java.util.LinkedList;

public class Ex08_02 {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add("권이름");
		list.add("권하나");
		list.add("김이름");
		list.add("김하나");
		list.add("라이름");
		
		list.addFirst("박이름");
		list.addLast("박하나");
		
		System.out.println(list);
		
		//boolean list.contains("박이름")
		/*
		if(list.contains("박이름")) {
			list.set(0, "오이름");
		}
		*/
		int index = -1;
		if((index = list.indexOf("박이름")) != -1) {
			list.set(index, "오이름");
		}
		
		// list.remove(); 중복선언
		// 첫번째 일치하는 객체를 삭제  - removeFirstOccurrence()
		list.removeFirstOccurrence("홍길동");
		
		System.out.println(list);
		
		//순차적으로 추가/삭제 : ArrayList
		//중간		   추가 / 삭제 : LinkedList
		
	}

}
