package days16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author yusica
 * @data 2025. 1. 16. - 오전 9:31:30
 * @subject		
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) throws FileNotFoundException {
		
		String fileName = ".\\src\\days15\\Ex01.java";
		FileReader fileReader = new FileReader(fileName);
		int one;
		int lineNumber = 1;
		// [][][][][][][][][13][10]
		// 2 : [13][10]
		// 3 : [][][][][13][10]

		
		try {
			System.out.printf("%d : ", lineNumber++);
			while((one = fileReader.read()) != -1) {
				System.out.print((char)one);
				// 마지막 end 앞에 라인넘버 뺴기
				if(one == 10 && fileReader.ready())
					System.out.printf("%d : ", lineNumber++);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("  end  ");
	}

}
