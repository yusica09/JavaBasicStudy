package days04;

import java.util.Scanner;

/**
 * @author yusica
 * @data 2024. 12. 27. - 오전 11:11:59
 * @subject	 [PCCE 기출문제] 2번 / 각도 합치기
 * @content
 */
public class Ex01_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sum_angle = angle1 + angle2;
        System.out.println(sum_angle % 360);

	}

}
