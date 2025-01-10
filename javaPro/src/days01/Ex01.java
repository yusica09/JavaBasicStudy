package days01;

import days11.Person;
import days11.Time;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("hello world");
		
		// 2. 멤버 앞의 접근 지정자 테스트
		// 패키지 외부 접근(참조) 사용
		Time t = new Time();
		t.hour = 1;
		
		
		// 다른패키지에서 Person 클래스 사용
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 20;
		p1.run();
		
		p1.name = "이름바꿈";
		p1.run();
		
	}

}
