package days04;

/**
 * @author yusica
 * @data 2024. 12. 27. - 오후 12:26:57
 * @subject	1) 조건문
 * 					2) 분기문
 * 					3) 반복문 - for문, foreach문
 * @content   for문
 */
public class Ex05 {

	public static void main(String[] args) {
		// 1. 초기식 : 어떤 변수가 값으로 초기화 식
		// 2. 조건식 : 참 -> 명령코딩 블럭 { } 실행 -> 증감식
		//			     거짓 -> for문 END
		/*
		 * for(초기식; 조건식; 증감식){
		 * 			//명령코딩
		 * }
		 * */
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

	}

}
