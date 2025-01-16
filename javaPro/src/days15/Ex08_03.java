package days15;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author yusica
 * @data 2025. 1. 15. - 오후 3:20:15
 * @subject	예외처리 활용 + 파일 열기
 * @content
 */

public class Ex08_03 {
	
	public static void main(String[] args) {
		
		String fileName = "C:\\Users\\SIST\\git\\repository\\javaPro.git\\javaPro\\src\\days01\\Ex05.java";
		try {	FileReader reader = new FileReader(fileName);
			int one;int lineNum = 1;
			System.out.printf("%d: ",lineNum++);
			
			while((one = reader.read()) != -1) {
				System.out.print((char)one);
				/*
				if((char)one == '\r' || (char)one == '\n') {
					System.out.printf("%d: ",lineNum++);
				}
				*/
				if (one == 10) {
					System.out.printf("%d: ",lineNum++);
				}		
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("  end  ");
	}

}
