package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//alt + shift + j
/**
 * @author yusica
 * @data 2024. 12. 26. - 오전 11:24:14
 * @subject 형 변환 설명
 * @content   char -> int 
 * 					 int -> char
 * 					 float -> double
 * 					 double -> float
 * 					 int -> long
 * 
 *  				1) 자동 형변환 2가지 경우
 *  					(1) 작은 자료형  --> 큰 자료형 
 *  										할당
 *  					(2) 작은 자료형 + 큰 자료형 = 큰자료형
 *  				2) 강제 형변환 - cast 연산자 이용
 */
public class Ex03_02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//형변환
		int i = 10;
		long l = i; // int -> long 자동형변환 1번째 경우
		System.out.println(l);
		
		//Type mismatch: cannot convert from double to float
		//float 이 더 커서 자동 형변환 x
		//float avg = 98.99;
		float avg = 98.99f;
		
		//강제로 double -> float 형변환
		// 3 + 4 + "5"
		//  덧셈  문자열연결
		// 2+3*5
		// (2+5)*5   () 최우선연산자
		float avg2 = (float)98.99; //cast 연산자
		
		
		long b = 100L;
		int a = 100;

		long c = a + b; // int + long = long
		
		long d = a - 'x';
		long d1 = a - 90;
		//Type mismatch: cannot convert from int to short
		//short d2 = a - 90;
		
		//char a = 'x';
		//char b1 = 'x' - 32;
		//Type mismatch: cannot convert from int to char
		//char b2 = a - 32;
		
		// 리터럴인 경우에만 암시적 형변환 하기 때문에 오류가 뜬다고 알았는데,
		// 왜 char의 경우엔 오류가 뜨고 위의 경우는 오류가 안뜨지?
		// -> 같은 정수형 이라서.? char도 정수형 아닌가?
		// 내부적 cpu 계산이 int 형으로 되는데 char가 더 작은 자료형이기 때문?
		//   => short랑 char는 오류가 나는데 long은 안남
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("> 숫자 입력 : ");
		int p = Integer.parseInt(br.readLine());
		
		long q = p + 50;
		
		// 위 코드가 문제가 없는 것을 보면 리터럴의 문제가 아닌듯?
		
		
		
	}
		
}
