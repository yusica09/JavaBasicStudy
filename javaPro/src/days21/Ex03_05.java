package days21;

import java.util.ArrayList;

/**
 * @author yusica
 * @data 2025. 1. 23. - 오전 11:08:28
 * @subject		[ 제한된 제네릭 클래스 ]
 * @content
 */
public class Ex03_05 {
	public static void main(String[] args) {
		
	}//main
}//class

/*
interface Eatable{
	class Fruit implements Eatable{
		public String toString() { return  "Fruit";  }
	}
	class Apple extends Fruit{
		public String toString() { return  "Apple";  }
	}
	class Grape extends Fruit{
		public String toString() { return  "Grape";  }
	}

	class Toy{
		public String toString() { return  "Toy";  }
	}
}

// Box04 제네릭 클래스는 모든 타입(T)을 담을 수 있는 상자를 만드는 클래스

class Box04<T>{
	
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {	this.list.add(item); }
	T get(int i) { return this.list.get(i); }
	int size()	{ return this.list.size(); }
	public String toString() { return  this.list.toString();  }
}
*/


//제네릭 클래스 선언 + 과일만 담을 수 있는 제네릭 클래스( 제한 )
//FruitBox<T extends Fruit>
/*
class FruitBox<T extends Fruit>  extends Box04<T>{
		
}
*/

/*
//implements 인터페이스 
class FruitBox<T extends Eatable>  extends Box04<T>{
	
}
*/

//Eatable 인터페이스로 구현된 Fruit 클래스의 자식만  T  제한...
/*
class FruitBox<T extends Fruit & Eatable>  extends Box04<T>{
	
}
*/


