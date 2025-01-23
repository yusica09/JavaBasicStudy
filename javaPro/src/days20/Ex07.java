package days20;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

/**
 * @author yusica
 * @data 2025. 1. 22. - 오후 2:30:06
 * @subject		파일 읽어와서 'A'(20) : ##### ..
 * @content		days17.Ex10.java
 */
public class Ex07 {

	public static void main(String[] args) {
		String fileName = ".\\src\\days16\\Ex05.java";
		
		// 한문자
		HashMap<Character, Integer> hm = new HashMap<>();

		char one ='\u0000';
		int code = -1;
		
		try(FileReader reader = new FileReader(fileName)) {
			while((code = reader.read()) != -1) {
				one = (char) code;
				if(hm.containsKey(one)){
					int oldValue = hm.get(one);
					hm.put(one, oldValue+1);
				}else {
					hm.put(one, 1);
				}
			}
		} catch (Exception e) {
				System.out.println(e.toString());
		}
		
		//			k   v
		// 출력	'A'(20)	
		
		//[1] 정렬 X
		//Set<Entry<Character, Integer>> es = hm.entrySet();
		//Iterator <Entry <Character, Integer>> ir = es.iterator();
		
		//[2] 정렬O
		List<Entry<Character, Integer>> entryList = new ArrayList<>(hm.entrySet());
		entryList.sort((e1, e2) -> Character.compare(e1.getKey(), e2.getKey()));
		
		Iterator <Entry <Character, Integer>> ir = entryList.iterator();
		while (ir.hasNext()) {
			Entry<java.lang.Character, java.lang.Integer> entry = ir.next();
			char key = entry.getKey();
			int value = entry.getValue();
			
			System.out.printf("%c(%d)\t%s\n", key, value, "#".repeat(value));
			
		}

		System.out.println("  end  ");
	}//main

}
