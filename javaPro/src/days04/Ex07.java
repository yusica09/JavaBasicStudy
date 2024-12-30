package days04;

/**
 * @author yusica
 * @data 2024. 12. 27. - 오후 2:37:53
 * @subject		while , do-while문  -> 조건반복문
 * @content
 */
public class Ex07 {
	public static void main(String[] args) {
//		int i = 1;
//		while(i <= 10) {
//			System.out.println(i++);
//			//i++;
//			//++i;
//		}
		
		int i = 1, sum = 0;
		while(i <= 10) {
			if(i != 10) System.out.printf(" %d +",i);
			else System.out.printf(" %d ",i);
			sum += i;
			i++;
			//i++;
			//++i;
		}
		System.out.printf("= %d\n",sum);
	}

}
