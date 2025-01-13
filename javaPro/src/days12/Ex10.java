package days12;

/**
 * @author yusica
 * @data 2025. 1. 10. - 오후 4:24:23
 * @subject
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		// 클래스명.메서드명()
		// Ex10.disp();
		
		//함수에 static이 있는 경우 그냥 함수명으로 잘 불러와짐
		dispA();
		
		//함수에 static이 없는 경우 객체 생성 후 불러올수있음
		Ex10 obj = new Ex10();
		obj.dispB();

	}//main

	public void dispB() {
		System.out.println("> dispB()..");
		
	}

	public static void dispA() {
		System.out.println("> dispA()...");
		
	}

}//class
