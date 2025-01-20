package days17;

public class Ex04 {

	public static void main(String[] args) {
		/*
		 * [ 문제 ]
		 * 길이가 n이고, "수박수박수..."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, 
		 * solution을 완성하세요.
		 * 
		 * 예를 들어 n이 4이면 "수박수박" 리턴, n이 3이면 "수박수" 리턴
		 * 
		 * */
		
		System.out.println(solution(7));

	}

	private static String solution(int n) {
		 /* [1]
   			StringBuffer sb = new StringBuffer("");
      		for (int i = 0; i < n; i++) {
         		if(i%2 ==0)
            		sb.append("수");
         		else
            		sb.append("박");
      		} 
		 */
		 /*[2]
		  String word = "수박";
		  StringBuffer sb = new StringBuffer(word.repeat(n/2));

		   if(n%2 == 1)
		      sb.append("수");
		 */
		
		StringBuffer sb = new StringBuffer("");
		int num = n/2;
		for (int i = 0; i < num; i++) {
			sb.append("수박");
		}

		if(n%2 == 1)
			sb.append("수");
		
		return sb.toString();
	}

}
