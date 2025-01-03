package days06;

/**
 * @author yusica
 * @data 2025. 1. 2. - 오후 3:29:01
 * @subject	스위칭변수 사용하기
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// [문제] 1-2+3-4+5-6+7-8+9-10 = -5
		
		// 이런 경우 스위칭 변수 사용하기 좋음
		
		/*[1]
		int sum = 0;
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				sum += i;
				System.out.printf(i==1?"%d":"+%d",i);
			}
			else if(i%2==0) {
				sum -= i;
				System.out.printf("-%d",i);
			}
		}
		System.out.printf(" = %d",sum);
		*/
		
		
		
		//[2]
		/*
		int sum = 0;
		boolean sw = false;
		for(int i=1; i<=10; i++) {
			if(!sw) {
				sum += i;
				System.out.printf(i==1?"%d":"+%d",i);
			}
			else{
				sum -= i;
				System.out.printf("-%d",i);
			}
			sw = !sw;
		}
		System.out.printf(" = %d",sum);
		*/
		
		
		// [2]에서 더 줄이기
		int sum = 0;
		boolean sw = false;
		for(int i=1; i<=10; i++) {
			System.out.printf(sw? "%d+":"%d-",i);
			sum = sum + (sw? -i : +i);
			sw = !sw;
		}
		System.out.printf("\b = %d",sum);
		
		
		
		
		

	}//main

}
