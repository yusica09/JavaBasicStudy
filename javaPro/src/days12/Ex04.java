package days12;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * @author yusica
 * @data 2025. 1. 10. - 오전 10:49:18
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		/*
		 * [생성자(Constructor)]
		 * 
		 * 1. 일종의 메서드이다.
		 * 2. 리턴자료형 X(없는게 아니라 안붙임) , void X
		 * 3. 반드시 클래스명 == 생성자명 
		 * 4. 디폴트 생성자( default constructor ) : 매개변수 없는 생성자
		 * 5. 메서드 호출 시기 : 인스턴스(객체) 생성하면 자동으로 호출, 인위적 생성자 호출 X
		 * 6. 역할 : 필드(멤버) 초기화 목적
		 * 7. 접근지정자(modifier) 사용 가능
		 * 8. 오버로딩(overloading) 가능 (매개변수 달라야함, 리턴값 다른건 X)
		 * 9. 생성자는 상속되지 않는다.
		 * 10. 클래스에 선언된 생성자가 하나도 없는 경우에는 
		 * 		 컴파일러가 자동으로 디폴트 생성자를 추가한다.
		 * */
		
		// 5. 메서드 호출 시기 - 디폴트 생성자 호출 확인
		// new MyPoint();
		MyPoint p1 = new MyPoint();
		
		// 객체 생성 + 동시에 x=10, y=20 필드 초기화
		// The constructor MyPoint(int,int) is undefined
		MyPoint p2 = new MyPoint(10,20);
		p2.dispMyPoint();
		
		MyPoint p3 = new MyPoint(100);
		p3.dispMyPoint();
		
		System.out.println("END");
		
		Scanner scanner = new Scanner(System.in);
		Random rnd = new Random();
		
		Date d = new Date(2000-1900,9-1,22);
		System.out.println(d.toLocaleString());

	}//main

}//class
