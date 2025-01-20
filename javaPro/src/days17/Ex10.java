package days17;

import java.io.FileReader;

/**
 * @author yusica
 * @data 2025. 1. 17. - 오후 3:18:41
 * @subject
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		
		String fileName = ".\\src\\days16\\Ex05.java";
		
		// 알파벳 대소문자를 구분하지 않고 A(20), B(11) ~ Z(3)
		// 갯수를 파악해서 #으로 막대그래프를 그리기.
		// A(20) : ####################
		// B(11) : ###########
		//    :
		// Z(3)   : ###
		
		// c[0] = 'A' 갯수 65 -> 0
		// c[25] = 'Z' 갯수 
		int [] counts = new int[26];
		char one ='\u0000';
		int code = -1;
		try(FileReader reader = new FileReader(fileName)) {
			while((code = reader.read()) != -1) {
				one = Character.toUpperCase((char) code);
				if(Character.isUpperCase(one)) {
					counts[one-'A']++;
				}
			}
		} catch (Exception e) {
				System.out.println(e.toString());
		}
		// 막대그래프 그리
		for (int i = 0; i < counts.length; i++) {
			System.out.printf("%c(%d)\t%s\n", i+'A', counts[i], "#".repeat(counts[i]));
			
		}
		
		System.out.println("  end  ");
	}

}
