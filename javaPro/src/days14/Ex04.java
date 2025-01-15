package days14;

/**
 * @author yusica
 * @data 2025. 1. 14. - 오후 12:32:38
 * @subject		추상화
 * @content		abstract 키워드
 * 							ㄴ 메서드
 * 							ㄴ 클래스
 * 
 * 						추상 클래스는 미완성 클래스
 * 									 는 공통적인 부분(멤버)만을 미리 선언한 클래스 
 * 						Employee 추상 클래스 선언 
 */
public class Ex04 {

	public static void main(String[] args) {
		// 추상메서드가 없어도 추상 클래스로 선언이 가능하다.
		// 의미) 객체를 생성 X
		// Player p1 = new Player();
		
		// 추상클래스도 일종의 클래스이기 때문에 업캐스팅 가능하다.
		//AudioPlayer p = new CDPlayer();
		Player p = new CDPlayer();
		p.play(0);
		p.stop();

	}//main

}//class


// 추상메서드가 없더라도 추상클래스 가능
abstract class Player{
	
	// 필드
	boolean pause; // 작동 중지
	int currentPos;	// 현재 위치
	
	//생성자
	public Player() { }
	
	//메서드
	abstract void play(int pos);
	abstract void stop();
		
}

 // 추상클래스를 상속
abstract class AudioPlayer extends Player{
	// 추상클래스로부터 물려받은 추상메서드들 모두 오버라이딩 하지 않으면 
	// 그 클래스도 추상클래스가 된다
	@Override
	void play(int pos) {
		System.out.println("추상 메서드 오버라이딩 완료!!");
		
	}
}

class CDPlayer extends AudioPlayer{

	@Override
	void stop() {
		System.out.println("추상 메서드 오버라이딩 완료!!");
		
	}
	
}