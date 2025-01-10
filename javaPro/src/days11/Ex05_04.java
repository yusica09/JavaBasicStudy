package days11;

public class Ex05_04 {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x = 100;
		plus(p1);// Call By Reference  + 클래스 매개변수
		System.out.println( p1.x ); // 100
		
		plus(p1); // Call By Reference
		
		System.out.println(p1.x);

	}
	private static void plus(Point p) {
		p.x +=200;
	}

}

class Point{
		// field
		int x;
		
		// method
}