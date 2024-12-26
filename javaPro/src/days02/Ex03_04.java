package days02;

/**
 * @author yusica
 * @data 2024. 12. 24. - 오전 11:13:08
 * @subject 지역변수_4
 * @content x라는 정수를 저장할 변수 선언, 10 초기화, 출력
 * 					x, y 선언 한줄에 쓰기
 * 					x, y 값 교환
 */
public class Ex03_04 {

	public static void main(String[] args) {
		/*
		    int x; x = 10; 
		    int y = 20;
		 */
		int x = 10, y = 20;
		//System.out.println(x);
		// 출력 줄바꿈 시 , 일반적으로는 \n을 사용하지만 \r도 원래는 사용가능하다.
		System.out.printf("x = %d, y = %d\n",x,y);
		
		{
			// x ,y  값 교환하는 방법
			int temp = x;
			x = y;
			y = temp;
		}
		
		System.out.printf("x = %d, y = %d\n",x,y);
		
		/*
		  - 이 두 경우는 같음
		  	int a = 1; 
		  	int b= 2; 
		  	int c = 3; 
		  	int d = 4;
		  
		  	int a=1, b=2, c=3, d=4;
		 */
		
	}

}
