package days11;

public class Ex05_02 {
	public static void main(String[] args) {
		
		int [] m = new int[1];
		int x = 100;
		m[0] = x;
		
		plus(m); // Call By Reference - 배열, 클래스

		
		System.out.println(m[0]); //300
	}

	public static void plus(int [] m) {
		//return x+=200;
		m[0]+=200;
		
	}

}
