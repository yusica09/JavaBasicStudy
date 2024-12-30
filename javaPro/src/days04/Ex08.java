package days04;

/**
 * @author yusica
 * @data 2024. 12. 27. - 오후 3:09:01
 * @subject 		Math.random()을 이용하여 임의의 수 발생시키기
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		// 자바에서 임의의 수 발생시키는 방법
		// 1) Math.random() ***
		// 2) Random 클래스
		
		// 0.0 <= 		double	Math.random()	 < 1.0
//		for(int i=0; i<10; i++) {
//			System.out.println(Math.random());			
//		}

		// 1 <= 	(int)(Math.random()*45)+1	< 46
//		for(int i=0; i<10; i++) {
//			System.out.println((int)(Math.random()*45)+1);
		
		
//		for(int i=0; i<1000; i++) {
//			int n = (int)(Math.random()*45)+1;
//			if(n < 1 || n > 45) {
//				System.out.println("범위에서 벗어남");
//			}
//		}
//		System.out.println("END");
		
		for(int i=0; i <=6; i++) {
			int n = (int)(Math.random()*45)+1;
			System.out.printf("%d\t",n);
		}
		System.out.println("END");
		

	}

}
