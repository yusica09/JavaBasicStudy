package days11;

/**
 * @author yusica
 * @data 2025. 1. 9. - 오후 2:49:55
 * @subject
 * @content
 */
public class Ex05_05 {

	public static void main(String[] args) {
		// 클래스 복사 == 객체 복사 (copy)
		// 클래스 복제 == 객체 복제 (clone)
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		//t1.channelUp();
		//동일한 인스턴스를 참조 == 클래스 복사(copy)
		Tv t3 = t1;
		
		//t3.channel = 100;
		//System.out.println(t1.channel);
		
		test(t1); // Call By Reference
		System.out.println(t1.channel);
		
	}//main
	
									//Tv t = t1;
	private static void test(Tv t) { // 클래스 복사
		t.channel = 500;
		
	}

}//class
