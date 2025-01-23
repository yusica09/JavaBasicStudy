package days20;

import java.time.*;
import java.util.*;



public class Ex01 {

	public static void main(String[] args) {
		
		//중복허용X, 순서유지O
		//HashSet<Integer> set = new HashSet<>();
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		set.add(3); // auto boxing
		set.add(5);
		set.add(2);
		set.add(4);
		set.add(1);
		set.add(1);

		System.out.println(set);
	}

}
