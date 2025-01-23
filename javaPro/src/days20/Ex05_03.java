package days20;

import java.util.TreeSet;

public class Ex05_03 {

	public static void main(String[] args) {
		int [] score = { 80, 95, 50, 85, 45, 65, 10, 100 };
		
		//[범위 검색]
		// 75점보다 큰 점수를 얻어와서 출력
		// 50점보다 작은 점수를 얻어와서 출력
		// 50~75점 범위
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int i : score) ts.add(i);
		
		System.out.println(ts);
		
		// 75점보다 큰 점수를 얻어와서 출력
		System.out.println(ts.tailSet(75));
		// 50점보다 작은 점수를 얻어와서 출력
		System.out.println(ts.headSet(50));
		// 50~75점 범위
		System.out.println(ts.subSet(50,75)); //앞은 포함, 뒤는 미포함
		

	}

}
