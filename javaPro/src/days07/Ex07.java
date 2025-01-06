package days07;

public class Ex07 {

	public static void main(String[] args) {
	     int x = 10, y = 20;
	      System.out.printf("x=%d, y=%d\n", x, y);
	      
	      // x,y  두 기억공간의 값을 바꾸기
	      /*  swap() 메서드 호출
	      {
	         int temp = x;
	         x = y;
	         y = temp;
	      }
	      */
	      int [] numArr = new int[2];
	      numArr[0] = x;
	      numArr[1] = y;
	      
	      // 자바에는 포인터의 개념이 없어서 참조타입인 배열이나 클래스를 이용해야함
	      swap(numArr);
	      
	      x = numArr[0];
	      y = numArr[1];
	      
	      System.out.printf("x=%d, y=%d\n", x, y);

	} //main

	private static void swap(int[] numArr) {
		int temp = numArr[0];
		numArr[0] = numArr[1];
		numArr[1] = temp;		
	}


} //class
