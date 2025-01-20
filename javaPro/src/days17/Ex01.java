package days17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author yusica
 * @data 2025. 1. 17. - 오전 10:07:00
 * @subject		복습문제 풀기
 * @content
 */
public class Ex01 {

	public static void main(String[] args) { 
		/*[1]
		String [][] teamArr = new String[3][5];

		String fileName = ".\\src\\days16\\학생명단.txt";
		String saveFileName = ".\\src\\days17\\SiStE.html";

		String name = null; // line
		try (FileReader reader = new FileReader(fileName );
				BufferedReader br = new BufferedReader(reader);
				FileWriter writer = new FileWriter(saveFileName)	) {

			writer.write("<html>");
			writer.write("<head>");
			writer.write("</head>");
			writer.write("<body>");
			writer.write("<h3>(주)쌍용교육센터 E강의실 학생 명단</h3>");
			
			// 2차원 배열에 넣는 작업
			int cnt = 0;
			while ( (name = br.readLine()) != null ) {
				teamArr[cnt/5][cnt%5] = name;
				cnt++;
			}
			// body 작성
			String str;
			for (int i = 0; i < teamArr.length; i++) {
				writer.write("<ol>");
				str = String.format("<h2 style='text-align: left; margin-left: -40px;'>%d조</h2>", i+1) ;
				writer.write(str);
				for (int j = 0; j < teamArr[i].length; j++) {
					String li = String.format("<li>%s</li>", teamArr[i][j]);
					writer.write(li);
				}
				writer.write("</ol>");
			}

			writer.write("</body>");
			writer.write("</html>");

		} catch (Exception e) {
			System.out.println( e );
		}

		System.out.println(" end ");
		*/
		
		
		/*[2]
		String data = "안녕하세요. 홍길동입니다. 이름은 홍길동입니다. 별명도 홍길동입니다.";
		StringBuffer sb = new StringBuffer(data);
		
		int i = 0, index, num = 1;
		
		while(i < data.length()) {
			index = data.indexOf("홍길동", i);
			if(index == -1) {
				break;
			}else {
				i = index + "홍길동".length();
				if(num == 2) {
					sb.insert(i, "최지우");
					sb.delete(index, i);
				}
				System.out.printf("> %d번째 찾은 위치 : %d\n", num++,index);
			}
		}
		System.out.println(sb);
		*/
		
		
	}//main

}
