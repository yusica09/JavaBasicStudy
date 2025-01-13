package days12;

public class MyPoint {
	
	//field
	public int x=0;
	public int y;
	
	//default constructor
	public MyPoint() {
		System.out.println("> MyPoint default constructor .. ");
	}
	
	public MyPoint(int i, int j) {
		this.x = i;
		this.y = j;
		System.out.println("> MyPoint 2 constructor .. ");
	}

	public MyPoint(int i) {
		this(i,i);
		System.out.println("> MyPoint 1 constructor .. ");
	}

	//method
	public void dispMyPoint() {
		System.out.printf("> x=%d, y=%d\n",x,y);
	}
	
	
	/*
	// 현재 좌표를 이동
	public void offsetPoint(int d) {
		x += d;
		y += d;
	}
	*/
	public MyPoint offsetPoint(int d) {
		this.x += d;
		this.y += d;
		return this;
	}
	
	
	// 현재 좌표를 이동 + 매개변수로 받는 p 객체의 x,y
	public void offsetPoint(MyPoint p) {
		x += p.x;
		y += p.y;
	}
	
	// 기본형 반환타입
	public int plusPointX() {
		return x + 1000;
	}
	
	// 참조형 반환타입
	public MyPoint createMyPoint(MyPoint p) {
		
		MyPoint newP = new MyPoint();
		newP.x = p.x;
		newP.y = p.y;
		
		return newP;
	}
	
	// p1.test()		this == p1
	public void test() {
		this.offsetPoint(this);// this의 3번째 용도 - 매개변수값
	 //= p1.offsetPoint(p1)
	}

}
