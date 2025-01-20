package days17;

/**
 * @author yusica
 * @data 2025. 1. 17. - 오전 10:39:25
 * @subject		복습문제풀이  - 2번
 * @content
 */
public class Ex01_04 {

	public static void main(String[] args) {
		String data = "안녕하세요. 홍길동입니다. 이름은 홍길동입니다. 별명도 홍길동입니다.";
		String word = "홍길동";
		
		int wordLength = word.length();
		int fromIndex = 0;		// 찾기 시작 위치
		int index = -1;		// 찾은 위치
		int cnt = 1;
		int first = -1, end = -1;
		// 어차피 없으면 -1 출력이므로 굳이 data 길이는 따지지 않아도 된다.
		while ((index = data.indexOf(word,fromIndex)) != -1) {
			System.out.printf("> %d번째 찾은 위치 : %d\n", cnt++, index);
			fromIndex = index + wordLength;
			if(cnt == 3)
				first = index; end = fromIndex;
		}
		// String -> StringBuffer 변환 : String은 불변하다는 성질 때문에
		StringBuffer sb = new StringBuffer(data);
		sb.replace(first, end, "김이름");
		
		String ndata = sb.toString();
		System.out.println(ndata);
	}

}
