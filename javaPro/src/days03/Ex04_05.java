package days03; 
/**
 * @author yusica
 * @data 2024. 12. 26. - 오후 3:03:49
 * @subject 증감연산자(전위형/ 후위형)
 * @content
 */
public class Ex04_05 {

	public static void main(String[] args) {
		// 단항 연산자
		System.out.println(!true);
		System.out.println(+3);
		System.out.println(-3);
		
	
		// 증감 연산자(기능) ++  --
		int x = 10;
		
		// [문제] x 기억공간의 값을 5 증가
		// x = x + 5;
		// x += 5;
		
		
		// x 기억공간의 값을 [1증가] / 1감소
		
		/* 
		 1증가 시키는 코딩 3가지
		   1) x = x + 1;
		   2) x += 1;   복합대입연산자
		   3) x++;
 
		 1감소 시키는 코딩 3가지
		   1) x = x - 1;
		   2) x -= 1;   복합대입연산자
		   3) x --;
		 */
		
		// 전위형 / 후위형 증감 연산자
		x = 10;
		
		// 1) 단독으로 사용될 때는 전/후위형은 동일한 기능이다.
		//++x;  전위형 증감 연산자
		//x++;  후위형 증감 연산자
		
		// 2) 단독 사용이 아닐 때
		//int y = ++x; // 11/11
		int y = x++; // 11/10
		System.out.println(x + "/" + y);
		
		//while (x++ <= 10){} 10<=10 true
		//while (++x <= 10){} 11<=10 false
		
		System.out.println(x);

	}

}
