package days15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) {

		//String fileName = "C:\\Class\\JavaClass\\javaPro\\src\\days01\\Ex05.java";
		String fileName = "C:\\Users\\SIST\\git\\repository\\javaPro.git\\javaPro\\src\\days01\\Ex05.java";
		
		// [FileReader] / FileWriter 클래스
		FileReader reader = null;
		
		try {
			//         지역변수
			reader = new FileReader(fileName);
			
			/* [1]
			int one = reader.read();
			System.out.println((char)one);
			one = reader.read();
			System.out.println((char)one);
			one = reader.read();
			System.out.println((char)one);
			one = reader.read();
			System.out.println((char)one);
			one = reader.read();
			System.out.println((char)one);
			*/

			/* [2]
			while (true) {
				int one = reader.read();
				if( one == -1) break;
				System.out.print((char)one);
			}
			*/
			
			// [3]
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
			// 파일 닫기 
			try {
				reader.close();
			} catch (IOException e) { 
				e.printStackTrace();
			}
		}
		
		System.out.println(" end  ");

	} // main

} // class

