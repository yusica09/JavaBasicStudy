package days03;

/**
 * @author yusica
 * @data 2024. 12. 26. - 오후 3:32:26
 * @subject 삼항연산자 ( 조건 연산자 )
 * @content 항1 ? 항2 : 항3
 * 				항1이 참 -> 항2
 * 				항1이 참 -> 항2
 * 
 */
public class Ex04_06 {

	public static void main(String[] args) {

		int x = 30,y;
		// y = x > 5 ? 100 : 200;
		// 삼항연산자 안에 삼항연산자 가능
		y = (x < 5 ? (x < 10? 1: 2) : 200);
		
		System.out.println(y); //200

	}

}
