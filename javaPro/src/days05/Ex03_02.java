package days05;

/**
 * @author yusica
 * @data 2024. 12. 30. - 오후 3:16:07
 * @subject
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		//256가지
		// [문제]
		// 한 라인에 10개의 ASCII문자를 출력
		/*
		for(int i = 0; i < 256; i++) {
			if(i % 10 == 0) System.out.printf("%d: ",(i/10)+1);
			System.out.printf("[%c]", (char)i);
			if(i % 10 == 9) {
				System.out.println();
			}
		}
		*/
		
		int lineNumber = 1;
		
		for(int i = 0; i < 256; i++) {
			if(i % 10 == 0) 
				System.out.printf("%d: ",lineNumber++);
			System.out.printf("[%c]", (char)i);
			if(i % 10 == 9) {
				System.out.println();
			}
		}

	}//main

}//class
