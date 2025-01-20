package days17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author yusica
 * @data 2025. 1. 17. - 오전 10:07:14
 * @subject		복습문제 풀이		-1번
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) {
		
		String [][] teamArr = new String[3][5];
		String fileName = ".\\src\\days16\\학생명단.txt";
		String saveFileName = ".\\src\\days17\\SiStE-Team.html";

		String name = null;
		try(FileReader reader = new FileReader(fileName);
				BufferedReader br = new BufferedReader(reader);) {
			FileWriter writer = new FileWriter(saveFileName);

			writer.write("<html>");
			writer.write("<head>");
			writer.write("</head>");
			writer.write("<body>");
			writer.write("<h3>(주)쌍용교육센터 E강의실 학생 명단</h3>");
			writer.write("<ol>");
			
			int cnt = 0;
			int cols = teamArr[0].length;
			while ( (name = br.readLine()) != null ) {
				teamArr[cnt/cols][cnt%cols] = name;
				cnt++;
			} // while
			
			for (int i = 0; i < teamArr.length; i++) {
				writer.write("<h3>"+(i+1)+"조</h3>");
				writer.write("<ol>");
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
		System.out.println("  end  ");

	}

}
