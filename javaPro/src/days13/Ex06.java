package days13;

public class Ex06 {

	public static void main(String[] args) {
		// 자식 객체를 생성
		// (기억)  부모 객체 먼저 생성된 후  자식 객체가 생성된다. 
		//          (부모 생성자 호출)    (자식 생성자 호출)
		Child c = new Child();

		c.dispChild();

		/*
		[ super 키워드  ]
		- 자식 클래스에서 부모 클래스의 멤버를 참조하는 데 사용되는  참조변수
		- 1) 부모의 멤버를 가릴킬 때의 super
		- 2) 생성자에서 또 다른 부모의 생성자를 호출할 때의 super()
		- 3) 단독으로 사용 X

		 */


	}//main

}//class

//메서드 앞에  final 이 있는 경우 설명... 
//
class Parent{
	int x = 10;

	Parent(){
		System.out.println("> Parent 디폴트 생성자 호출됨.");
	}

	void dispParent() {

	}

	public final void test() {
		System.out.println("> test...");
	}
}

class Child extends Parent{
	// int x = 10 부모 물려받은 필드
	// dispParent()  부모 물려받은 메서드	
	int y;
	int x = 20;  // 가능 O

	public Child() {
		// super : 부모의 주소값을 갖는 참조변수
		super();  //  부모 생성자를 호출하는 용도, 부모의 필드를 초기화
		// this()  생성자에서 또 다른 생성자를 호출할 때의 2번째 용도
		System.out.println(">  Child 디폴트 생성자 호출됨.");
	}

	void dispChild() {
		System.out.println(this.x);
		System.out.println(super.x);
	}

	// Cannot override the final method from Parent
	/*
	@Override
	public void test() {
	System.out.println("> test...");
	}
	 */
}




