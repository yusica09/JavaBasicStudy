package days21;

import java.util.Arrays;

public class Ex04_02 {
	
	// 열거형 선언 // 열거형 == 일종의 클래스

	public static void main(String[] args) {
		
		// 1. 열거형 선언 형식
		// [접근지정자] enum 열거형이름{상수명 ..}
		// 클래스의 일종 - java.lang.Enum 부모클래스
		
		// 2. 열거형 사용 방법
		//    열거형이름.상수명
		System.out.println(Card.CLOVER);
		
		System.out.println(Card.HEART); //HEART
		System.out.println(Card.HEART.name()); //"HEART"
		System.out.println(Card.HEART.ordinal()); //1
		
		Card cardType = Card.valueOf("HEART");
		System.out.println(cardType);
		
		Card [] cardArr = Card.values();
		System.out.println(Arrays.toString(cardArr)); //[CLOVER, HEART, DIAMOND, SPADE]	
		
	}

}
