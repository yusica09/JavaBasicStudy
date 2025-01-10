package days11;

// 멤버들 앞에 접근지정자를 테스트하기 위한 클래스
public class Time {

	public int hour;
	protected int minute;
	int second;
	private int milisecond; // 밀리초	1000ms = 1s
	// nanosecond	 		10의 9제곱 ns = 1s
	
	private void test() {
		milisecond = 10;
	}
}
