package days04;

/**
 * @author yusica
 * @data 2024. 12. 27. - 오후 3:50:05
 * @subject		foreach문 , break, continue 
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		// 1) for문 사용해서 1+ .. ~+10=55
//		int sum = 0;
//		for(int i=1;i<=10;i++) {
//			if(i!=10) System.out.printf(" %d +",i);
//			else System.out.printf(" %d ",i);
//			sum += i;
//		}
//		System.out.printf("= %d\n",sum);

//		int sum = 0, i = 0;
//		for(	;	;	) {
//			if(i >10) break;
//			if(i!=10) System.out.printf(" %d +",i);
//			else System.out.printf(" %d ",i);
//			sum += i;
//			i++;
//		}
//		System.out.printf("= %d\n",sum);
		
		// [2] 홀수의 합
		// 1+3+5+7+9 = 25
		int sum = 0;
		for(int i=1; i<= 10; i++) {
			if(i%2 == 1) {
				if(i != 9)
					System.out.printf(" %d +",i);
				else
					System.out.printf(" %d ",i);
				sum += i;
			}
		}
		System.out.printf("= %d\n",sum);
		
		//[2]-2 홀수합 다른 방법 - continue 이용해보기
		int sum2 = 0;
		for(int i=1; i<= 10; i++) {
			if(i%2 == 0) continue;
			else{
				if(i != 9)
					System.out.printf(" %d +",i);
				else
					System.out.printf(" %d ",i);
				sum2 += i;
			}
		}
		System.out.printf("= %d\n",sum2);
		
		// break가 들어가게 되면 2에서 끊김
		int sum3 = 0;
		for(int i=1; i<= 10; i++) {
			if(i%2 == 0) break;
			else{
				if(i != 9)
					System.out.printf(" %d +",i);
				else
					System.out.printf(" %d ",i);
				sum3 += i;
			}
		}
		System.out.printf("= %d\n",sum3);
		
		
		
		
	}

}
