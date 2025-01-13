package days12;

/**
 * @author yusica
 * @data 2025. 1. 10. - 오후 4:33:08
 * @subject	[ 가변인자 (variable arguments) ]
 * @content	JDK1.5 메서드의 매개변수의 갯수가 고정 -> 동적 지정할 수 있다.
 */
public class Ex11 {

	public static void main(String[] args) {
		
		System.out.println(Ex11.sum(1, 2));
		System.out.println(Ex11.sum(1, 2, 3));
		System.out.println(Ex11.sum(1, 2, 3, 4));
		
		int [] m = {1, 2, 3, 4, 5, 6, 7};
		System.out.println(Ex11.sum(m));

	}//main
	
	private static int sum(int[] m) {
		int res = 0;
		for(int num:m){
			res += num;
		}
		return res;
	}

	//sum()
	public static int sum(int a, int b) {
		return a+b;
	}
	//sum()
	public static int sum(int a, int b,int c) {
		return a+b+c;
	}
	//sum()
	public static int sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	

}//class
