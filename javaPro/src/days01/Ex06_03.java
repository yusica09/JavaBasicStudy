package days01;
// alt + shift +j
/**
 * @author yusica
 * @data 2024. 12. 23. - 오후 5:03:13
 * @subject 문제와 자바의 문자열3
 * @content printf 이용해보기. 
 */
public class Ex06_03 {
	
	public static void main(String[] args) {
		// [문제] 이름을 저장할 변수를 선언하고 초기화
	   //			나이를 저장할 변수를 선언하고 초기화
		//			혈액형을 저장할 변수를 선언하고 초기화
		// 			등급을 저장할 변수를 선언하고 초기화
		// [출력형식]
		// 이름은 "홍길동"이고, 나이는 '20'살 이고, 혈액형은 'A'형 입니다.
		
		String name = "홍길동";
		int age = 20;
		String bloodType = "A";
		char grade = 'B';
		double avg = 78.99;
		
		// " 자바의 문자열 "
		// " \" "
		System.out.println("이름은 \""+ name + "\"이고, "
				+ "나이는 '" + age + "'살 이고, "
						+ "혈액형은 '" + bloodType + "'형 입니다.");
		
		// 출력형식을 가지고 출력하는 함수(메서드) : printf 	format(형식)
		// [함수(메서드) 3가지]
		// 1. 기능
		// 2. 매개변수
		// 3. 리턴값

		// printf 의 리턴값은 PrintStream 이기 때문에 .println(~~) 도 가능함
		// '%f' 말고 e f g a 등 
		System.out.printf("이름은 \"%s\"이고, 나이는 '%d'살이고, 학점은 '%c'입니다.", name, age, grade).println("\nEND");
		System.out.printf("이름은 \"%s\"이고, 나이는 '%d'살이고, 학점은 '%c'이고, 평균은 %2.2f입니다.", name, age, grade,avg);
	}

}
