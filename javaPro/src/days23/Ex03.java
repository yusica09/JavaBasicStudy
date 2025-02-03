package days23;

import java.io.File;
import java.io.IOException;

/**
 * @author yusica
 * @data 2025. 1. 31. - 오후 12:07:44
 * @subject		[ File 클래스 ]
 * @content
 */
public class Ex03 {
	
	public static void main(String[] args) throws IOException {
		
		String pathname = ".\\src\\days23";
		//String pathname = ".\\src\\days23\\Ex01.java";
		File parent = new File(pathname);
		
		//System.out.println(parent.isDirectory()); //true
		//System.out.println(parent.isFile()); //false
		
		String child = "Ex01.java";
		
		File f = new File(parent, child);
		
		System.out.println(f.getName()); // Ex01.java
		int pos = f.getName().indexOf(".");
		// 순수한 파일명  Ex01
		System.out.println(f.getName().substring(0,pos));
		// 확장자 .java
		System.out.println(f.getName().substring(pos));
		
		System.out.println(f.getPath());
		// 절대경로
		System.out.println(f.getAbsolutePath());
		// Canonical : 인정받은
		System.out.println(f.getCanonicalPath());
		
		System.out.println(f.getParent()); //.\src\days23
		// 경로;경로
		System.out.println(File.pathSeparator); // ;
		// 폴더와 폴더 사이 ex) 폴더\폴더
		System.out.println(File.separator); // \
	
	}//main

}
