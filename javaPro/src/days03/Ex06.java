package days03;

/**
 * @author yusica
 * @data 2024. 12. 26. - 오후 4:38:27
 * @subject 배열, [] 인덱스 연산자
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// [] 인덱스 연산자
		// 한 학생의 국어점수를 저장할 변수를 선언하세요.
		//int kor;
		
		//1000명 학생의 국어점수를 저장할 변수를 선언하세요
		//1명일 경우처럼 선언할 경우 너무 많이 필요하므로 문제.
		
		// [배열]
		// 1. 참조타입의 한 종류
		// 2. 정의 : 동일한 자료형을 메모리상에 연속적으로 놓이게 한 것
		// 3. 배열 선언 형식
		//			[자료형] [] [배열명(=변수명)];
		//          자료형 + [] 까지 자료형
		// 3-2. 배열 생성 형식
		//    = new 자료형[배열크기];
		//  (new = 동적메모리(heap) 영역에 할당)
		//       Heap(동적)							Stack
		//     0        1        n - 1   -> 인덱스(=점자값)
		// [4byte][4byte]..[4byte]		[0X100번지]배열명..
		// ↑ 시작주소(0X100번지)	
		// 4. 각각 배열의 저장공간 == 배열의 요소
		
		int [] kors = new int[3];
		
		System.out.println("배열의 크기 == 배열명.length : " + kors.length);
		// 배열명[인덱스(=점자값)] 각각의 배열의 요소를 나타낸다.
		kors[0] = 90;
		kors[1] = 88;
		kors[2] = 99;
		
		System.out.println(kors[0]);
		System.out.println(kors[1]);
		System.out.println(kors[2]);
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
		//: Index 3 out of bounds
		//System.out.println(kors[3]);

	}

}
