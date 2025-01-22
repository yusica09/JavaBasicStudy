package days19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author yusica
 * @data 2025. 1. 21. - 오후 12:25:39
 * @subject	String[] <-> ArrayList  변환
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {

		// 1. String[] -> ArrayList 변환
		
		String [] names = {"박이름", "양이름","박길동","김이름","주이름","이이름"};
		
		//[1]
		/*
		ArrayList list = new ArrayList();
		for (int i = 0; i < names.length; i++)
			list.add(names[i]);
		System.out.println(list);
		*/
		
		//[2]
		List list = Arrays.asList(names);
		System.out.println(list);
		
		ArrayList list2 = new ArrayList(list);	// 매개변수 다형성, 생성자
		
		
		// 2. ArrayList -> String[] 변환
		
		//[1]
		/*
		String [] names2 = new String[list2.size()];
		
		int index = 0;
		Iterator ir = list2.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			names2[index++] = name;
		}
		System.out.println(Arrays.toString(names2));
		*/
		
		//[2]
		
		//class [Ljava.lang.Object; cannot be cast to class [Ljava.lang.String; 
		//([Ljava.lang.Object; and [Ljava.lang.String;
		//are in module java.base of loader 'bootstrap')
		/*
		String [] arr = (String[])list2.toArray();
		System.out.println(arr);
		*/
		
		String [] arr = (String[]) list2.toArray(new String[list.size()]);
		System.out.println(arr);
		
		/*
		String [] strArr = (String[]) list2.toArray(String[]::new);
		System.out.println(Arrays.toString(strArr));
		 */
	}

}
