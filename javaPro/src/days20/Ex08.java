package days20;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author yusica
 * @data 2025. 1. 22. - 오후 3:16:27
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		// HashMap / HashTable
		// MVC
		// days20.1차조편성.txt
		// ArrayList x 3 - 각팀
		// HashMap		key	value ( 팀명 , 그 팀의 명단이 들어간 ArrayList)

		String [] 팀1 = {"박이름", "김이름", "김이름", "박이름", "[양이름]"};
		String [] 팀2 = {"[주이름]", "최이름", "김이름", "이이름", "라이름"};
		String [] 팀3 = {"윤이름", "오이름", "[박이름]", "유이름", "권이름"};

		// String [] 팀1 -> ArrayList
		ArrayList<String> team1 = new ArrayList<String>();
		for (int i = 0; i < 팀1.length; i++) {
			team1.add(팀1[i]);
		}
		// String [] 팀2 -> ArrayList
		List<String> list2 = Arrays.asList(팀2);
		ArrayList<String> team2 = new ArrayList<String>(list2);
		// String [] 팀3 -> ArrayList
		List<String> list3 = Arrays.asList(팀3);
		ArrayList<String> team3 = new ArrayList<String>(list3);

		//
		LinkedHashMap<String, ArrayList<String>> hm = new LinkedHashMap<>();
		hm.put("1조", team1);
		hm.put("2조", team2);
		hm.put("3조", team3);
		//

		printHashMap(hm);


	}//main

	private static void printHashMap(HashMap<String, ArrayList<String>> hm) {
		// 1조 ( 5명 )
		//		1. 홍길동
		//		2. 홍길동
		//		3. 홍길동
		//		4. 홍길동
		//		5. 홍길동
		// 2조 ( 3명 )
		//		1. 홍길동
		//		2. 홍길동
		//		3. 홍길동
		// 3조 ( 7명 )
		//       :

		Set<Entry<String, ArrayList<String>>> entrySet = hm.entrySet();	
		Iterator <Entry <String, ArrayList <String>>> itr = entrySet.iterator();

		while (itr.hasNext()) {
			Entry<String, ArrayList<String>> entry = itr.next();

			String teamName = entry.getKey();
			ArrayList<String> team = entry.getValue();
			System.out.printf("%s ( %d명 )\n", teamName, team.size());

			Iterator <String> itr2 = team.iterator();
			//int index = 1;
			while (itr2.hasNext()) {
				String name = itr2.next();
				int index = team.indexOf(name)+1;
				System.out.printf("\t%d.%s\n",index,name);
			}
		}

	}

}
