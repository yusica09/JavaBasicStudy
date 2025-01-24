package days21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author yusica
 * @data 2025. 1. 23. - 오전 10:15:07
 * @subject	제네릭 예시
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		
		/*
		Box box = new Box();
		box.setItem(100);
		int item = (int)box.getItem(); //다운캐스팅
		System.out.println(item);
		
		//Box2 box2 = new Box2();
		Box box2 = new Box();
		box2.setItem("문자열");
		String sItem = (String) box2.getItem(); //다운캐스팅
		System.out.println(sItem);
		*/
		
		// 컴파일 시에 타입을 결정하는 Box 클래스 선언
		Box<Integer> box1 = new Box<>();
		box1.setItem(100);
		int item = box1.getItem(); // 다운캐스팅이 필요X
		System.out.println(item);
		
		Box<String> box2 = new Box<>();
		box2.setItem("100");
		String item2 = box2.getItem(); // 다운캐스팅이 필요X
		System.out.println(item);
		/*
		ArrayList list = new ArrayList();
		Collections.addAll(list, 3,5,2,4,1);
		System.out.println(list);
		int first = (int)list.get(0); //형변환
		
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			int n = (int) ir.next();
			System.out.println(n);
		} // while
		*/
		
		ArrayList<Integer> list = new ArrayList<>();
		Collections.addAll(list, 3,5,2,4,1);
		System.out.println(list);
		int first = list.get(0); //형변환
		
		Iterator<Integer> ir = list.iterator();
		while (ir.hasNext()) {
			int n = ir.next();
			System.out.println(n);
		} // while
		
	}//main
}

// [제네릭 클래스] 클래스명 뒤에 <T>을 붙이면 된다.
// T 타입변수 또는 타입 매개변수
// Box 	 원시타입(Raw Type) 
//Box<T>  제네릭클래스
class Box<T> {
	
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
}

/*
class Box{
	
	private Object item; // int , double, String, char, 등등 
	
	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
	
}
*/

/*
class Box {	//int
	private int item;

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}
	
}

class Box2 {	//double
	private double item;

	public double getItem() {
		return item;
	}

	public void setItem(double item) {
		this.item = item;
	}
	
}

class Box3 {	//String
	private String item;
	
	public String getItem() {
		return item;
	}
	
	public void setItem(String item) {
		this.item = item;
	}
	
}

class Box4 {	//char
	private char item;
	
	public char getItem() {
		return item;
	}
	
	public void setItem(char item) {
		this.item = item;
	}
	
}
*/