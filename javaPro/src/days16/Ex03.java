package days16;

/**
 * @author yusica
 * @data 2025. 1. 16. - 오전 11:07:59
 * @subject	어떤 객체로부터 클래스 정보를 얻어오는 방법
 * @content	Class<?> getClass()
 * 					getName()	days15.Ex05	 == fullName
 */
public class Ex03 {

	public static void main(String[] args) {
		
		/*
		Card c1 = new Card();
		System.out.println(c1);
		System.out.println(c1.toString());
		*/
		
		Card c = new Card("HEART",3);
		
		//[첫번째 방법]
		/*
		Class cls = c.getClass();
		String fullName = cls.getName();
		System.out.println(fullName);
		*/
		
		//[두번째 방법] 모든 클래스 static 필드 : class
		// 얻어온 Class cls 객체를 사용해서 인스턴스를 생성할 수 있다.
		// new 클래스명(); X
		
		//Unhandled exception type IllegalAccessException
		/*
		Class cls = Card.class;
		try {
			Card c1 = (Card)cls.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		*/
		
		//[세번째 방법]
		String className ="days16.Card";
		try {
			Class cls = Class.forName(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}//main

}//class

final class Card{
	
	String kind; //카드종류
	int num;	//카드번호
	
	//디폴트생성자
	public Card() {
		this("SPADE",1);
	}
	//생성자
	public Card(String kind, int num) {
		super();
		this.kind = kind;
		this.num = num;
	}

	@Override
	public String toString() {
		return "Card [kind=" + kind + ", num=" + num + "]";
	}
	
	
	
	
	
}
