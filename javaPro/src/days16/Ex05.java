package days16;

public class Ex05 {

	public static void main(String[] args) {
		// StringBuffer 클래스  - 멀티스레드 O
	    // StringBuilder 클래스 - 멀티스레드 x ( == 동기화 처리 x)


		//불변
		String str = "다른 문자열 안녕하세요. 홍길동 안녕입니다.";
		
		//"안녕" 문자열 뒤에 (hello) 문자열 삽입
		StringBuffer sb = new StringBuffer(str);
		//System.out.println(sb);
		
		int fromIndex = sb.indexOf("안녕") + "안녕".length(); //9
		int offset = sb.indexOf("안녕",fromIndex) + "안녕".length();
		sb.insert(offset, "(hello)");
		
		// 홍길동 삭제
		//sb.replace(start, end, "");
		int start = str.indexOf("홍길동");
		int end = start + "홍길동".length();
		sb.delete(start, end);
		
		//추가
		sb.append("~~~");
		
		sb.reverse();
		
		System.out.println(sb);
		
	}

}
