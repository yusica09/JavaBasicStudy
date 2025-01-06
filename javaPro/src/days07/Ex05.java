package days07;

import java.util.Random;

/**
 * @author yusica
 * @data 2025. 1. 3. - 오후 3:38:48
 * @subject 로또 게임 , Random 클래스
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		// [로또 게임]
		// Math.random() 1~45 정수(로또번호)
		
		//java.util.Random 클래스
		Random rnd = new Random();
		// 0 <=  rnd.nextInt(45)	< 45
		// 1 <=  rnd.nextInt(45)+1;  < 46
		// -21억 ~ rnd.nextInt() ~ 21억
		
		for (int i = 1; i <= 6; i++) {
			int lotto = rnd.nextInt(45)+1;
			System.out.println(lotto);
		}

	}

}
