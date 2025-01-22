package days19;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author yusica
 * @data 2025. 1. 21. - 오전 11:17:49
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {

//		1조 : 박정현, 김하은, 김민곤, 박예진, 양희동
//		2조 : 주정호, 최지우, 김대원, 이찬희, 라일락
//		3조 : 윤형식, 오재문, 박세훈, 유예나, 권용범
		
		//클래스배열
		// ArrayList[] teamArr = new ArrayList[3]; X
		
		ArrayList team1 = new ArrayList();
		ArrayList team2 = new ArrayList();
		ArrayList team3 = new ArrayList();
		
		team1.add("박정현");
		team1.add("김하은");
		team1.add("김민곤");
		team1.add("박예진");
		team1.add("양희동");
		
		team2.add("주정호");
		team2.add("최지우");
		team2.add("김대원");
		team2.add("이찬희");
		team2.add("라일락");
		
		team3.add("윤형식");
		team3.add("오재문");
		team3.add("박세훈");
		team3.add("유예나");
		team3.add("권용범");
		
		System.out.println(team1);
		System.out.println(team2);
		System.out.println(team3);
		
		ArrayList classE = new ArrayList(team1);
		classE.addAll(team2);
		classE.addAll(team3);
		
		System.out.println(classE);
		
		/*
		//기능 - team1에 있는 요소와 team2에 있는 
		//			요소 중에 공통요소만 남기는 메서드
		//매개변수 - Collection c
		//리턴값(리턴자료형) - boolean
		team1.retainAll(team2);
		*/
		
		// [모든 classE 요소를 출력]
		
		//[1] - for문
		/*
		for (int i = 0; i < classE.size(); i++) {
			String name = (String) classE.get(i);
			System.out.println(name);
		}
		*/
		
		//[2] - iterator() 
		Iterator ir = classE.iterator();
		// boolean hasNext() 다음 요소가 있으면 true / 없으면 false
		while (ir.hasNext()) {
			String name = (String)ir.next();
			System.out.println(name);
			
		}
		
		// toArray()
		Object [] arr = classE.toArray();
			
		
	}

}
