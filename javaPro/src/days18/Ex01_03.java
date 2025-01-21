package days18;

import java.util.Date;

public class Ex01_03 {

	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now.toLocaleString());
		// getTime()	1970.1.1 00:00:00	밀리세컨드
		System.out.println(now.getTime());
		
		Date open = new Date(2024-1900, 12-1, 23, 9, 0, 0);
		System.out.println(open.toLocaleString());
		System.out.println(open.getTime());
		
		// 2421796937 -> 몇일/시간/븐/초/밀리초
		System.out.println(now.getTime() - open.getTime());
		
		
	}

}
