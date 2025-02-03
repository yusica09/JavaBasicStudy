package days23;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yusica
 * @data 2025. 1. 31. - 오후 12:19:36
 * @subject		javaPro 폴더 안에
 * @content			ㄴ 하위폴더
 * 							ㄴ 파일
 * 							정보 조회..
 */
public class Ex03_02 {
	
	public static void main(String[] args) {
	
		String currentDirectory = System.getProperty("user.dir");
		System.out.println(currentDirectory);
		
		File parent = new File(currentDirectory);
		
		/*
		String[] listArr = parent.list();
		for (int i = 0; i < listArr.length; i++) {
			System.out.println(listArr[i]);
		} //for i
		*/
		
		// 1737534488642	 long -> 날짜 객체로 변환 -> 형식화 클래스사용
		String pattern = "yyyy-MM-dd a hh:mm";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		File[] listArr = parent.listFiles();
		for (int i = 0; i < listArr.length; i++) {
			File f = listArr[i];
			Date d = new Date(f.lastModified());
			
			System.out.printf("%s\t%s\t\t%s\t\t%s\t \n"
					, f.isDirectory()? "[폴더]":"파일"
						, f.getName()
						, sdf.format(d)
						, f.isFile()? f.length()+"(bytes)":"");
		} //for i
		
	}//main

}
