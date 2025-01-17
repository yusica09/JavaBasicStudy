package days16;

import java.util.Arrays;

/**
 * @author yusica
 * @data 2025. 1. 16. - 오후 3:27:16
 * @subject
 * @content
 */
public class Ex04_05 {

	public static void main(String[] args) {
		
		String team1 = "권이름, 김이름, 최이름, 박이름, 이이름";
		
		String regex = "\\s*,\\s*";
		String [] nameArr = team1.split(regex);
		
		
		// [람다와 스트림]
		//            T...a
		//            T  String
		// String []  -> List<String>  변환
		/* [1]
		List<String> list = Arrays.asList(nameArr);
		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String name) { 
				System.out.println(name);
			}
			
		});
		*/
		
		// [2]
		// Arrays.asList(nameArr).forEach(name -> System.out.println(name));
		
		// [3]
		Arrays.asList(nameArr).forEach( System.out::println );

		
		/*
		 * 
		 * 
		 * <ol>
		 * 			<li>권이름</li>
		 * 					:
		 * 			<li>이이름</li>
		 * </ol>
		 * 
		 * */
		
		/*
		String content = "<ol>";
		for (int i = 0; i < nameArr.length; i++) {
			content += String.format("<li>%s</li>", nameArr[i]);
		}
		content += "</ol>";
		System.out.println(content);
		*/
		
		String content = 
				"<ol><li>"
				.concat(  String.join("</li><li>", nameArr)  )
				.concat("</li></ol>");
		
		System.out.println( content );

		
		
	}

}
