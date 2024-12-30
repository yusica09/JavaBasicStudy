package days04;

import java.util.Scanner;

/**
 * @author yusica
 * @data 2024. 12. 27. - 오전 11:36:11
 * @subject scanner 이전 예제 응용
 * @content 
 * 				여러 자료형 입력받고		
 * 				삼항연산자 이용해보기
 */
public class Ex01_05 {

	public static void main(String[] args) {
		
		// 이름(String), 나이(byte), 키(double), 성별(boolean) 입력받아서 출력.
		// > 이름:홍길동, 나이:20살, 키:178.89, 성별:남자/여자
		
//		String name; byte age; double height; boolean gender;
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("> 이름 나이 키 성별 입력 : ");
//		
//		name = scanner.next();
//		age = scanner.nextByte();
//		height = scanner.nextDouble();
//		gender = scanner.nextBoolean();
//		
//		if(gender) {
//			System.out.printf("> 이름:%s, 나이:%d살, 키:%.2f, 성별:남자",name, age, height);
//		}
//		else {
//			System.out.printf("> 이름:%s, 나이:%d살, 키:%.2f, 성별:여자",name, age, height);
//		}
		
		String name; byte age; double height; boolean gender;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 이름 나이 키 성별 입력 : ");
		
		name = scanner.next();
		age = scanner.nextByte();
		height = scanner.nextDouble();
		gender = scanner.nextBoolean();
		
		//삼항 연산자 사용
		System.out.printf("> 이름:%s, 나이:%d살, 키:%.2f, 성별:%s\n",
				name, age, height, gender? "남자":"여자");
		


	}

}
