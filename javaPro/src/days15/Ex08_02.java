package days15;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author yusica
 * @date 2025. 1. 15. - 오후 2:34:13
 * @subject   예외처리 활용 + 파일열어서 출력.
 * @content   [ try ~ resource(자원) 문 설명 ]
 */
public class Ex08_02 {

	public static void main(String[] args) {

		String fileName = "C:\\Users\\SIST\\git\\repository\\javaPro.git\\javaPro\\src\\days01\\Ex05.java";
		
		// [FileReader] / FileWriter 클래스
		 
		
		try( FileReader reader = new FileReader(fileName); ){
			 
			int one ;
			while ( (one = reader.read() ) != -1) {			 
				System.out.print((char)one);
			}
			
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			// System.out.println( e.getMessage() );
			System.out.println( e.toString() );
		} catch (Exception e) {
			System.out.println( e.toString() );
		} finally {
			
		}
		
		System.out.println(" end  ");

	} // main

} // class

