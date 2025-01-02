package days05;

import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author yusica
 * @data 2024. 12. 30. - 오후 12:39:50
 * @subject
 * @content
 */
public class Ex01_05 {

	public static void main(String[] args) {
		/*
		// 자바) 람다식과 스트림(Stream)
		IntStream stream = new Random().ints(0, 101).limit(10);
		stream.forEach( n -> {
			System.out.println(n);
		});
		
		stream.max();
		// 아래처럼 작성하면 한줄코딩 가능
		// IntStream stream = new Random().ints(0, 101).limit(10).max();

		OptionalInt oi = stream.max();
		if(oi.isPresent()) {
			System.out.println(oi.getAsInt());
		}
		*/
	    int [] m = { 96, 11, 67, 94, 20, 99, 38, 93, 3, 83 };
	      
	    OptionalInt oi = IntStream.of(m).max();
	    System.out.println( oi.getAsInt() );
	}//main

}//class
