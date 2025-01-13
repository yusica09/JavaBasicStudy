package days12;

/**
 * @author yusica
 * @data 2025. 1. 10. - 오후 4:48:34
 * @subject		가변인자를 사용할 때 주의해야할 점 / 알아둬야할 점
 * @content
 */
public class Ex11_03 {

	public static void main(String[] args) {
		
		System.out.printf("%s_%d_%.2f_%c_%b","이름",20,3.14,'A',false);
		
		/*
		 * [ 가변 인자를 사용할 때 주의할 점]
		 * - 가변 인자는 내부적으로 배열을 사용.
		 * - 오버로딩을 하지 않는게 좋다.
		 * - 비효율적이다.( 꼭 필요한 곳에만 사용 )
		 * - 제일 마지막에 가변 인자를 선언한다.
		 * 
		 * */
		
		String [] names = {
				"이름1",
				"이름2",
				"이름3",
				"이름4"
		};
		//"이름"-"이름"-"이름"
		// 구분자(구분기호) == delimiter
		// 이름 문자열을 연결 ..
		System.out.println(concateNames("-",names));
		System.out.println(concateNames("/","aaa","bbb","ccc"));

	}//main

	private static String concateNames(String delimiter, String...args) {
		/*
		String result ="";
		for (int i = 0; i < args.length; i++) {
			result += args[i] + delimiter;
		}
		return result;
		*/
		return String.join(delimiter, args);
	}

}//class
