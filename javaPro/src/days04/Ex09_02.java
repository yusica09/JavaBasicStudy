package days04;

/**
 * @author yusica
 * @data 2024. 12. 27. - 오후 5:32:04
 * @subject  while문에 continue 사용시 무한루프 생기는 문제 고쳐보기
 * @content
 */
public class Ex09_02 {

	public static void main(String[] args) {
		// while 1+2+..+10=55
		//int i = 1, sum =0;
//		while(i <= 10) {
//			if (i != 10)
//					System.out.printf(" %d +",i);
//			else
//					System.out.printf(" %d ",i);
//			sum += i; i++;
//		}
//		System.out.printf("= %d\n",sum);

	
//	while(i <= 10) {
//		if (i %2 ==1) {
//			System.out.printf(" %d +",i);
//			sum += i; 
//		}
//		i++;
//	}
//	
//	System.out.printf("= %d\n",sum);
		
		
	// continue 쓰고 싶을 때 (원래는 안쓰는게 좋지만)
	int i = 1, sum =0;	
	while(i <= 10) {
		if (i %2 ==0) {
			i++; 
			continue;
		}
		System.out.printf(" %d +",i);
		sum += i;
		i++;
	}
	System.out.printf("= %d\n",sum);
	
	
	/* continue 넣고 싶을 때 다른 수정방법 ! 
	 * 
	 * while문의 조건문에 ++ 기호를 넣을 수 있다는걸 응용하자!
	 *   ---> 대신 이 경우 조건문의 범위를 잘 생각해서 정하기
	 * 
	  	int i = 0, sum =0;	
		while(i++ < 10) {
			if (i %2 ==0) continue;
			System.out.printf(" %d +",i);
			sum += i;
		}
		System.out.printf("= %d\n",sum);
		
		
		
		int i = 0, sum =0;	
		while(++i <= 10) {
			if (i %2 ==0) continue;
			System.out.printf(" %d +",i);
			sum += i;
		}
		System.out.printf("= %d\n",sum);
	 * 
	 * */
	
}

}
