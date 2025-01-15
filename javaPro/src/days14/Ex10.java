package days14;

public class Ex10 {

	public static void main(String[] args) {
		
		// 추상 클래스 업캐스팅
		// 인터페이스 업캐스팅 가능
		IA obj = new Ex00();
		obj.aaa();
		
		IB obj2 = new Ex00();
		obj2.bbb();
		
		IC obj3 = new Ex00();
		obj3.aaa();
		obj3.bbb();
		obj3.ccc();

	}//main

}//class

interface IA{
	void aaa();
}

interface IB{
	void bbb();
}

// 인터페이스 다중 상속 구현할 수 있다.
interface IC  extends IA,IB{
	//void aaa();
	//void bbb();
	void ccc();
}

class Ex00 implements IC{

	@Override
	public void aaa() {

	}

	@Override
	public void bbb() {
	
	}

	@Override
	public void ccc() {
	
	}
	
}
