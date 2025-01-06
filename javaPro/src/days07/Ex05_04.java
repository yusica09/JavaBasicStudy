package days07;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author yusica
 * @data 2025. 1. 3. - 오후 4:47:48
 * @subject
 * @content
 */
public class Ex05_04 {

	public static void main(String[] args) {
		
		// *** 람다와 스트림
		// 1~ 45 중 하나의 int스트림
		
		//IntStream은 기본형 int 전용 스트림.
		//IntStream은 Stream<Integer>보다 메모리 사용이 적고 성능이 좋음.
		//1부터 45(46 미만)까지의 난수를 무한 스트림으로 생성
		IntStream st = new Random().ints(1,46);
		
		//distinct() = 중복값 제거 이후 새로운 IntStream 반환
		//limit(6) = 처음 6개의 요소만 선택. 스트림의 크기 제한
		Stream<String> lotto = st.distinct().limit(6).sorted()
				// mapToObj() = 기본형 스트림(IntStream)을 
				//					객체 스트림(Stream<String>)으로 변환.
				.mapToObj(i-> i+", ");	
				// i-> i+", " 은 람다 표현식으로 각 정수를 문자열로 변환하고 숫자뒤 "," 추가
		//System.out::print = 메소드 참조
		lotto.forEach(System.out::print);
}

}
