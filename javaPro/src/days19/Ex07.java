package days19;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author yusica
 * @data 2025. 1. 21. - 오후 2:00:27
 * @subject	vector 컬렉션 클래스
 * @content		ㄴ List
 * 						ㄴ 순서유지O , 중복허용 O
 * 						ㄴ 멀티스레드에 안전(== 동기화 처리 O) - Vector, StringBuffer
 * 						ArrayList  / Vector 차이점
 * 								동기화처리여부
 * 
 * 						StringBuffer/StringBuilder 차이점
 * 								동기화처리여부
 * 
 */
public class Ex07 {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		System.out.println(v.capacity()); //10 -> 초기용량
		System.out.println(v.size()); //0  -> 들어가있는양

		
		v.add("박이름");
		v.addElement("양이름");
		v.addElement("홍길동");
		
		System.out.println(v.size()); // 3
		System.out.println(v.capacity()); // 10
		
		v.trimToSize();
		System.out.println(v.capacity()); // 3
		
		System.out.println(v.get(0)); //박이름
		System.out.println(v.elementAt(0)); //박이름
		
		v.add(1,"박길동");
		
		System.out.println(v);
		
		// v.iterator
		// 반복자 : fail-fast
		// 열거자
		Enumeration en = v.elements();
		while (en.hasMoreElements()) {
			String name = (String) en.nextElement();
			System.out.println(name);
		}
		
		// v.remove(2);
		
		// v.clear();

		//v.firstElement() == v.get(0)
		//v.lastElement() == v.get(v.size()-1)
		
		// v.insertElementAt("홍순돌", 2); == v.add(2, "홍순돌");
		
		v.setSize(10);
			
		
	}

}
