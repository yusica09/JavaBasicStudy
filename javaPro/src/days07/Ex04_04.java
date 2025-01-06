package days07;

/**
 * @author yusica
 * @data 2025. 1. 3. - 오후 2:33:42
 * @subject	합, 팩토리얼
 * @content	거듭제곱 == 누승 == 멱 == pow
 * 					2^3 = 2*2*2
 * 				밑수   지수
 * 				- 밑수를 지수만큼 반복해서 곱하는 것
 */
public class Ex04_04 {

	public static void main(String[] args) {
		
		//int result = pow(2,3);
		double result = pow2(2,-3);
		//double result = recursivePow(2,0);
		double result2 = recursivePow2(2,0);
		System.out.println(result);
		System.out.println(result2);

	}//main
	
	//This method must return a result of type double
	//조건 중에 해당되는 if 문이 없으면 리턴값이 없다는 말.
	// 	=> else 만들어주기
	/*
	private static double recursivePow(int i, int j) {
		if(j == 0) 
			return 1;
		else if (j > 0) {
			return i * recursivePow(i, j-1);
		}else{
			return (1/(double)i) * recursivePow(i, j+1);
		}
	}
	*/
	
	
	private static double recursivePow2(int i, int j) {
		if(j == 1) 
			return i;
		else if (j < 0) {
			return	1 / recursivePow2(i, -j);
		}else{
			return  i * recursivePow2(i, j-1);
		}
	}

	private static int pow(int i, int j) {
		int result = 1;
		for(int k=1;k<=j;k++) {
			result *= i;
		}
		return result;
	}
	
	
	/*
	private static double pow2(int i, int j) {
		double result = 1;
		for(int k=1;k<=Math.abs(j);k++) {
			result = j>0 ? result * i : result * (1/(double)i);
		}
		return result;
	}
	*/
	
	
	private static double pow2(int i, int j) {
		double result = 1;
		int e2 = Math.abs(j);
		for(int k=1;k<= e2;k++) {
			result = j>0 ? result * i : result * (1/(double)i);
		}
		return result;
	}

}//class
