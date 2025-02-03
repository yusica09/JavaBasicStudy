package days23;

import java.io.File;

public class Ex03_07 {
	public static void main(String[] args) {
		// [ 문제 ]
		
		String pathname = "C:\\Temp\\upload";
		File f = new File(pathname);

		System.out.println(f.exists()); //false
		if(!f.exists()) {
			// 폴더 생성
			System.out.println(f.mkdir());
		}else {
			// 폴더삭제
			System.out.println(f.delete());
			// f.deleteOnExit() 프로그램 종료시 삭제
		}
	}//main

}
