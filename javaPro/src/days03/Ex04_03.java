package days03;

/**
 * @author yusica
 * @data 2024. 12. 26. - 오후 12:43:35
 * @subject 비교연산자
 * @content  비교연산자의 결과는 true / false  -> boolean형 이다.
 * 					  ex)  ==   !=  >   <   >=    <=
 */
public class Ex04_03 {

	public static void main(String[] args) {
		
		int i =10, j = 5;
		
		System.out.println(i == j); //F
		System.out.println(i != j); //T
		System.out.println(i > j); //T
		System.out.println(i < j); //F
 		System.out.println(i >= j); //T
		System.out.println(i <= j); //F
		
		// <주의할 점>
		System.out.println(i = j); //5
		//The left-hand side of an assignment must be a variable
		//System.out.println(10 = 5);
		//The operator ! is undefined for the argument type(s) int
		//System.out.println(i =! j);

	}

}
