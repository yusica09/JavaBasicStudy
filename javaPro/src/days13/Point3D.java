package days13;

// 상속 
public class Point3D extends Point2D{

	// 필드	
	private int z;

	// 생성자는 상속되지 않는다. (암기)
	public Point3D() {
		System.out.println("> Point3D 디폴트 생성자 호출됨...");
	}

	public Point3D(int a) { 
		// 부모클래스로 물려받은 필드를 초기화
		// The field Point2D.x [is not visible] 접근지정자
		//this.x = a;
		//this.y = a;
		this.setX(a);
		this.setY(a);

		this.z = a;
		System.out.println("> Point3D 1 생성자 호출됨...");
	}

	public Point3D(int x, int y, int z) { 
		//this.x = x;
		//this.y = y;
		this.z = z;
		System.out.println("> Point3D 3 생성자 호출됨...");
	}

	// 메서드 + getter,setter

	public Point3D(Point2D p, int z) {
		this.setX( p.getX() );
		this.setY( p.getY() );
		this.z = z;
	}

	// z  getter, setter
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	} 

	public void dispPoint3D() {
		//System.out.printf("x=%d, y=%d\n", this.x, this.y);
		System.out.printf("x=%d, y=%d\n", this.getX(), this.getY());
		System.out.printf("z=%d\n", this.z);
	}

	@Override
	public Point3D offsetPoint(int i) {  // 10
		//x += i;    x =  x + i;
		//y += i;
		this.setX(this.getX()+i);
		this.setY(this.getY()+i);

		z += i;
		return this;
	}

	public void offsetPoint( Point3D p ) {
		//x += p.x;
		//y += p.y;
		z += p.z;
	}

	public Point3D plus(Point3D p) {
		//int xValue =  x + p.x;
		//int yValue =  y + p.y;
		int zValue =  z + p.z;

		Point3D newp = new Point3D();
		//newp.x = xValue;
		//newp.y = yValue;
		newp.z = zValue;

		return newp;
	}

} // class








