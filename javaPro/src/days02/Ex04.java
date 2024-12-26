package days02;

/**
 * @author yusica
 * @data 2024. 12. 24. - 오전 11:40:27
 * @subject
 * @content  대입 연산자의 처리 방향
 */
public class Ex04 {
	public static void main(String[] args) {
		
		/*
		  int x = 1;
		  int y = 1;
		  int z = 1;
		 */
		
		// int x = 1, y = 1, z = 1;
		
		
		int x, y, z;
		z = y = x = 1;
		
		// 연산자 우선 순위 
		//  = 와 + 가 있다면 +부터
		// + 의 경우 -> 방향 (왼->오)
		// = 의 경우 <- 방향 (오->왼)
		int result = x + y + z ;
		System.out.println(result);
		
	}

}
