package days04;

/**
 * @author yusica
 * @data 2024. 12. 27. - 오후 5:33:07
 * @subject	foreach문 + 배열 또는 컬렉션 X
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		int [] kors = new int[3];
		kors[0] = 100;
		kors[1] = 87;
		kors[2] = 95;
//		kors[3] = 95;  X (주의) 
	/*	
		System.out.println(kors[0]);
		System.out.println(kors[1]);
		System.out.println(kors[2]);
	*/
		
		// *****
		// 배열은 값을 할당하지 않으면 배열의 자료형의 기본값으로 설정되어있음
		// (쓰레기값 아님 !! 주의 )
		// int -> 0 , boolean -> false, double -> 0.0
		//
		// *****
		
		/*
		 * for(int i=0;i < kors.length;i++) { 
		 * 		System.out.println(kors[i]); 
		 * }
		 */
		
		// foreach 문 사용 --> 읽기 용도 !! 
		for(int kor : kors) {
			System.out.println(kor);
		}
		
		
	} //main

} // class
