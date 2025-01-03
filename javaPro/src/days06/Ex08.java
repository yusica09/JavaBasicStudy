package days06;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author yusica
 * @data 2025. 1. 2. - 오후 5:17:20
 * @subject	가위바위보게임 유효성검사 추가 + 횟수 제한 + 게임 계속 추가
 * @content
 */
public class Ex08 {

	public static void main(String[] args) throws IOException {
		// 가위(1)/바위(2)/보(3)
		int com, user;
		Scanner scanner = new Scanner(System.in);
		char con = 'y';
		
		do {
			com = (int)(Math.random()*3) + 1;
			
			boolean flag = false;
			int count = 0;
			do {
				if(flag) {
					System.out.printf("\t\t [%d번 실패] 가위바위보 선택 잘못!!\n> 다시 \n",count);
					if(count == 3) {
						System.out.println("못함 !! 게임 종료 !!");
						return;
					}
				}
				
				System.out.print("> user 가위(1)/바위(2)/보(3) 중 선택 : ");
				user = scanner.nextInt();
				flag = true; count ++;
				
			} while (!(user==1 || user==2 || user==3));
			//!String.valueOf(user).matches("[123]")

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
			
			System.out.print("\n> 게임 계속합니까? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while (con == 'y' || con == 'Y');

	}

}
