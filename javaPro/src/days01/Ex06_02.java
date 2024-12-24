package days01;
// alt + shift +j
/**
 * @author yusica
 * @data 2024. 12. 23. - 오후 5:03:13
 * @subject 문제와 자바의 문자열
 * @content "와 같은 특수한 경우 \를 사용해서 출력할 수 있다.
 */
public class Ex06_02 {
	
	public static void main(String[] args) {
		// [문제] 이름을 저장할 변수를 선언하고 초기화
	   //			나이를 저장할 변수를 선언하고 초기화
		
		// 출력형식 
		// 이름은 "홍길동"이고, 나이는 '20'살 입니다.
		
		String name = "홍길동";
		int age = 20;
		
		// " 자바의 문자열 "
		// " \" "
		System.out.println("이름은 "+ "\""+ name + "\"" + "이고, "
				+ "나이는 " + "'" + age + "'살 입니다.");
		
	}

}
