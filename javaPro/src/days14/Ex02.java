package days14;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @author yusica
 * @data 2025. 1. 14. - 오전 11:27:01
 * @subject	매개변수 다형성
 * @content
 */

public class Ex02 {
	public static void main(String[] args) {
		
		test(new ArrayList());
		test(new Vector());
		
		//ArrayList list = new ArrayList();
		List list = new ArrayList();
		ArrayList list2 = new ArrayList(list);
		//Collection c = List list;
		
	}//main
	
	public static void test(List list) { //매개변수 다형성
		
	}

}//class
