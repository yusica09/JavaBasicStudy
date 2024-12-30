package days04;

import java.util.Scanner;

/**
 * @author yusica
 * @data 2024. 12. 27. - 오후 3:29:55
 * @subject		컴퓨터와 사용자가 가위(1)/바위(2)/보(3) 게임
 * 						1/2/3		키보드입력
 * 
 * 						사용자 이겼다.
 * 						컴퓨터 이겼다.
 * 						무승부.
 * @content
 */
public class Ex08_02 {

	public static void main(String[] args) {
		// 가위(1)/바위(2)/보(3)
		int com, user;
		
		Scanner scanner = new Scanner(System.in);
		
		com = (int)(Math.random()*3) + 1;
		
		System.out.print("> user 가위(1)/바위(2)/보(3) 중 선택 : ");
		user = scanner.nextInt();
		
		System.out.printf("> com=%d, user=%d\n", com, user);
		
		// 승자 판단해서 출력
		switch ( user - com ) {
		case 0:
			System.out.println("무승부");
			break;
		case 1:
			System.out.println("user 승");
			break;
		case -2:
			System.out.println("user 승");
			break;
		case -1:
			System.out.println("com 승");
			break;
		case 2:
			System.out.println("com 승");
			break;
		}

	}

}
