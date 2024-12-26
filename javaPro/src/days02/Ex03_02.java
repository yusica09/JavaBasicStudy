package days02;

/**
 * @author yusica
 * @data 2024. 12. 24. - 오전 11:04:50
 * @subject 지역변수_2
 * @content 헷갈리는 상황
 */
public class Ex03_02 {

	public static void main(String[] args) {
		
		/*
		 * try {
		 * 
		 * String name = "최지우";
		 * 
		 * }catch(Exception e) {
		 * 
		 * } //name은 지역변수라 여기서 변수 값 변경은 불가능함 
		 * name = "이름바꾸기 실패"; }
		 */
		String name;
		try {
		
			name = "최지우";
		
		}catch(Exception e) {
			
		}
		
		name = "이름바꾸기 성공";
	}

}
