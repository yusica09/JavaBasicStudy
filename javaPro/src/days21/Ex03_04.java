package days21;

import java.util.ArrayList;

/**
 * @author yusica
 * @data 2025. 1. 23. - 오전 10:43:51
 * @subject	[ 제네릭 클래스의 객체 생성과 사용 ]
 * @content
 */
public class Ex03_04 {

	public static void main(String[] args) {
		
		/*
		Box03<Fruit> fruitBox = new Box03<>();
		Box03<Apple> appleBox = new Box03<>();
		Box03<Grape> grapeBox = new Box03<>();
		Box03<Toy> toyBox = new Box03<>();
		
		// 예외 발생.
		// Type mismatch: cannot convert from Box03<Grape> to Box03<Apple>
		// Box03<Apple> box1 = new Box03<Grape>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		
		// The method add(Fruit) in the type Box03<Fruit> 
		// is not applicable for the arguments (Toy)
		//fruitBox.add(new Toy()); 오류남
		
		toyBox.add(new Toy());
		//toyBox.add(new Apple()); 오류남
		*/
		
	}

}

/*
class Fruit{
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

// 제네릭 클래스 선언
class Box03<T>{
	
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {	this.list.add(item); }
	T get(int i) { return this.list.get(i); }
	int size()	{ return this.list.size(); }
	public String toString() { return  this.list.toString();  }
}
*/