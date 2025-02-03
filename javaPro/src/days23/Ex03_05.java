package days23;

import java.io.File;

/**
 * @author yusica
 * @data 2025. 1. 31. - 오후 2:22:06
 * @subject	폴더 유무 확인, 생성, 삭제
 * @content
 */
public class Ex03_05 {
	public static void main(String[] args) {
		
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
