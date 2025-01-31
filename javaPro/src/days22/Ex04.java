package days22;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author yusica
 * @data 2025. 1. 24. - 오전 10:12:50
 * @subject	Sequence[InputStream]
 * @content  순차적인	바이트스트림(입력용)
 * 						ㄴ	여러 개의 입력스트림을 연속적으로 연결해서
 * 							하나의 스트림으로 데이터를 처리할 수 있는 바이트 스트림
 * 						  ex) 용량이 큰 파일을 여러 개의 작은 파일로 생성
 * 							-> 하나의 스트림 처리
 */
public class Ex04 {
	
	public static void main(String[] args) throws IOException {
		byte [] n = {1,2,3};
		byte [] m = {4,5,6};
		byte [] k = {7,8,9};
		
		//byte [] -> 메모리 스트림 변환
		ByteArrayInputStream baisN = new ByteArrayInputStream(n);
		ByteArrayInputStream baisM = new ByteArrayInputStream(m);
		ByteArrayInputStream baisK = new ByteArrayInputStream(k);
		
		// 위의 3개의 스트림을 하나의 스트림으로 생성 + 처리
		
		/*[1] - 붙인 곳에 계속 덧붙여야 하므로 너무 귀찮은 작업
		SequenceInputStream sis = new SequenceInputStream(baisN,baisM);
		SequenceInputStream sis2 = new SequenceInputStream(sis,baisK);
		*/

		//[2]
		Vector<ByteArrayInputStream> v = new Vector<>();
		v.add(baisN);
		v.add(baisM);
		v.add(baisK);
		
		Enumeration<ByteArrayInputStream> en = v.elements();
		SequenceInputStream sis = new SequenceInputStream(en);
		
		int b;
		while ((b = sis.read())!= -1) {
			System.out.println(b);
		} // while
		
		
	}//main

}
