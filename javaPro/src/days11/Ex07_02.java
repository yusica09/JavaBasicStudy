package days11;

public class Ex07_02 {

	public static void main(String[] args) {
		Person p1 = null ; 
		// java.lang.NullPointerException
		// 객체를 만들지 않았기 때문에 생기는 오류
		p1.name = "홍길동";
	}

}
