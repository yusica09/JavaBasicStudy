package days11;

/**
 * @author yusica
 * @data 2025. 1. 9. - 오후 2:04:03
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// 필드X
		// 지역변수, 초기화 X -> 지역변수 앞에는 접근지정자x
		//	->	Illegal modifier for parameter age; only final is permitted
		//public int age;
		
		Tv t1 = new Tv();
		t1.power();
		
		t1.channel = 11;
		t1.channelUp();
		System.out.println(t1.channel);
		
		t1.power();

	}//main

}//Ex04 class

//The public type Tv must be defined in its own file
//하나의 자바 파일 안에 여러 개의 클래스를 선언할 수 있다.
//							public class는 1개여야한다.
//						* 파일명 == public 클래스명
//Ex04.java -> Ex04{}, Tv{}
class Tv{
	
	//중첩 클래스
	protected class Volumn{
	}
	
	// 필드 == 멤버변수 선언 형식
	// [접] [기] 자료형 필드명[=초기값];
	public String color;
	public boolean power;
	public int channel;
	
	// 메서드
	public void power() {
		power = !power;
	}
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
	
}// Tv class