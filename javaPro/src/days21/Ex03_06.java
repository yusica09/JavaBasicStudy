package days21;

import java.util.ArrayList;

/**
 * @author yusica
 * @data 2025. 1. 23. - 오전 11:23:13
 * @subject		와일드 카드( ? )  +  제너릭 메서드 설명
 * @content		<? extends T>	T의 자손만 가능
 * 						<? super T>		T의 조상만 가능
 * 						<?>	== 	<? extends Object> 제한 없음
 */
public class Ex03_06 {
	
	public static void main(String[] args) {
		/*
		FruitBox<Fruit>  fruitBox = new FruitBox<Fruit>();
		Juice juice = Juicer.makeJuice(fruitBox);
		System.out.println(juice);
		
		// The method makeJuice(FruitBox<Fruit>) in the type Juicer 
		// is not applicable for the arguments (FruitBox<Apple>)
		FruitBox<Apple>  appleBox = new FruitBox<Apple>();
		juice = Juicer.makeJuice(appleBox);
		System.out.println(juice);
		
		
		FruitBox<Grape>  grapeBox = new FruitBox<Grape>();
		juice = Juicer.makeJuice(grapeBox);
		System.out.println(juice);
		*/
		
		// [2] 제네릭 메서드를 호출하는 방법.
		FruitBox<Fruit>  fruitBox = new FruitBox<Fruit>();
		Juice juice = Juicer.<Fruit>makeJuice(fruitBox);
		// Juice juice = Juicer.makeJuice(fruitBox); 생략가능
		System.out.println(juice);

		
	}//main
}

class Fruit { public String toString() { return  "Fruit";  } }
class Apple extends Fruit{ public String toString() { return  "Apple";  } }
class Grape extends Fruit{ public String toString() { return  "Grape";  }}

class Box05<T>{
	
	ArrayList<T>  list = new ArrayList<T>();
	void add(T item) {    this.list.add(item);  }
	T get(int i) {  return  this.list.get(i); }
	int size() {  return this.list.size();  }
	public String toString(){  return this.list.toString(); }
	
}

class FruitBox<T extends Fruit> extends Box05<T>{
	
}

// 쥬스
class Juice{
	// 구현
}

// 쥬스를 만드는 기기
class Juicer{
	
	/*
	public static void printAll (
			ArrayList<? extends Fruit> list,
			ArrayList<? extends Fruit> list2) {
		
			 for (Fruit fruit : list2) {
				System.out.println(fruit);
			} // foreach
			 
	}
	*/
	public static <T extends Fruit> void printAll (
			ArrayList<T> list,
			ArrayList<T> list2) {
		
			 for (Fruit fruit : list2) {
				System.out.println(fruit);
			} // foreach
			 
	}

	
	/* [2] 와일드카드를 사용해서 처리 FruitBox<? extends Fruit>
	static Juice makeJuice( FruitBox<? extends Fruit>  box ) {
		//
		//
		return new Juice();
	}
	*/	
	
	// [3] 위의 [2] 메서드를 "제네릭 메서드"로 선언
	//  ㄴ 리턴자료형 앞에 <T> 타입변수를 선언
	//     제네릭클래스의 <T>와는 별개 X
	static <T extends Fruit> Juice makeJuice( FruitBox<T>  box ) {
		//
		//
		return new Juice();
	}
	
	/* [1] 오버로딩 필요한 아래 코딩. 
	static Juice makeJuice( FruitBox<Fruit>  box ) {
		//
		//
		return new Juice();
	}
	
	// 오버로딩(중복함수)
	// Erasure of method makeJuice(FruitBox<Apple>) is the same as another method in type Juicer
	static Juice makeJuice( FruitBox<Apple>  box ) {
		//
		//
		return new Juice();
	}
	*/
	
}

