package days20;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
/**
 * @author yusica
 * @data 2025. 1. 22. - 오후 2:14:43
 * @subject
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		
		HashMap< String, String> hm = new HashMap<>();
		hm.put("yusica", "최지우");
		hm.put("admin", "관리자");
		hm.put("hong", "홍길동");
		
		//1. 모든 key 총 출력		hm.keySet()
		Set<String> ks = hm.keySet();
		Iterator<String> ir = ks.iterator();
		while (ir.hasNext()) {
			String key = ir.next();
			String value = hm.get(key);
			System.out.println(key + "/" + value);
		}
		System.out.println("-".repeat(50));
		
		//2.  모든 value를 출력 hm.values();
		Collection<String> vc = hm.values();
		ir = vc.iterator();
		while (ir.hasNext()) {
			String value = ir.next();
			System.out.println(value);
		}
		
		//3. 모든 entry(key + value) 를 출력 hm.entrySet()
		Set<Entry<String, String>> es = hm.entrySet();
		Iterator<Entry<String, String>> ir2 = es.iterator();
		while (ir2.hasNext()) {
			Entry<String,String> entry = ir2.next();
			String key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + "/" + value);	
		}
		
	}

}
