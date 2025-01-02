package days05;

/**
 * @author yusica
 * @data 2024. 12. 30. - 오후 5:17:56
 * @subject 별 찍기
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		/*
		System.out.println("****");
		System.out.println("****");
		System.out.println("****");
		System.out.println("****");
		*/
		
		/*
		for(int i =1; i <= 4; i++) {
			System.out.println("****");
		}
		*/
		
		
		for(int i = 1; i <= 4; i++) { 	// 행 갯수
			//System.out.println("****");
			for(int j =1; j <= 4; j++) {	// 열 갯수
				System.out.print("*");
			}// for j
			System.out.println();
		} //for i

	}//main

}//class
