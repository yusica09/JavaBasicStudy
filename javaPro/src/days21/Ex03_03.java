package days21;

/**
 * @author yusica
 * @data 2025. 1. 23. - 오전 10:37:15
 * @subject		[ 제네릭의 제한 ]
 * @content		1. 객체별로 다른 타입으로 지정해서 동작하도록 만든 기능이기 때문에
 * 							static 필드는 선언할 수 없다. (프로그램시작과 동시에 메모리에 올라갈 수 없으므로)
 * 						2. static 메서드의 매개변수 타입으로 T를 사용할 수 X
 * 						3. T타입의 배열 선언 할 수 있다.
 */
public class Ex03_03 {

	public static void main(String[] args) {
		
		
		
	}//main

}


class Box2<T>{
	
	//static T item2;	- 1번 설명
	/*
	static int compare(T t1, T t2) {   - 2번 설명
		return 0;
	}
	*/  
	
	T [] itemArr;  // - 3번 설명
	
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
}