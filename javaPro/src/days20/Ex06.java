package days20;

import java.util.HashMap;

/**
 * @author yusica
 * @data 2025. 1. 22. - 오후 12:27:31
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		
		/*
		 * [ Map 인터페이스를 구현한 컬렉션 클래스 ]
		 * 1. HashTable, HashMap 컬렉션 클래스
		 * 		Vector		ArrayList
		 * 		동기화O		 동기화X
		 * 
		 * 2. Key + Value  한 쌍으로 관리
		 * 		=> Entry(엔트리)
		 * 
		 * 3. Hash :  해싱이라는 기법을 사용하여 데이터를 저장 -> 검색 성능 뛰어남.
		 * 
		 * 4. 해싱기법
		 * 		1) 해시함수( hash function )을 이용해서
		 * 			데이터를 해시테이블(hash table)에 저장하고 검색하는 기법.
		 * 		2) 해시함수는 데이터가 저장되어 있는 곳을 알려주기 때문에
		 * 			다량의 데이터 중에서 원하는 데이터를 빠르게 검색할 수 있다.
		 * 		
		 * 	5. 배열과 연결리스트 구조의 조합된 형태
		 * 
		 * */
		
		// <K, V> key, value - key 중복 O / value 중복 X
		HashMap<String, String> hm = new HashMap<>();
		hm.put("yusica", "최지우");
		hm.put("admin", "관리자");
		hm.put("hong", "홍길동");
		
		System.out.println(hm);
		
		// [문제 1] key값이 "admin"인 사람을 찾아 이름 출력해보고 "김이름"으로 변경
		/*
		String s = hm.get("admin");
		System.out.println(s);
		
		hm.replace("admin", "김이름");
		
		System.out.println(hm);
		*/
		
		String key = "admin";
		if(hm.containsKey(key)) {
			String value = hm.get(key);
			hm.put(key, "김이름");
		}
		System.out.println(hm);
		
		//hm.clear();  // 엔트리 전부 삭제
		
		//hm.entrySet();  //******
		//hm.keySet();
		//hm.values(); // 중복이 가능하므로 이름에 Set 없음
		
		
		}

}
