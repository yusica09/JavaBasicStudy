package days23;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yusica
 * @data 2025. 1. 31. - 오후 2:28:58
 * @subject
 * @content
 */
public class Ex03_06 {
	
	public static void main(String[] args) {
		// C:\\Temp
		// 			ㄴ 2025.01.31(금)
		//				ㄴ 1조
		//					ㄴ 김하나
		//					ㄴ 김두울
		//					ㄴ 김세엣
		//					ㄴ 김네엣
		//					ㄴ 김다섯
		//				ㄴ 2조
		//				ㄴ 3조
		String fileName = ".\\src\\days20\\1차조편성.txt";
		String pathname= "C:\\Temp\\";
		
		Date d = new Date();
		String pattern = "yyyy.MM.dd(E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String now = sdf.format(d);
		pathname += now;
		
		try (
				FileReader in = new FileReader(fileName) ;
				BufferedReader br = new BufferedReader(in);
				){
			String line = null;
			while((line = br.readLine()) != null) {
				//System.out.println(line);
				String teamName = line.substring(0,line.indexOf(":")-1);
				//System.out.println(teamName);
				//pathname += "\\" + teamName;
				System.out.println(pathname +"\\"+ teamName );
				
				String teamMember = line.substring(line.indexOf(":")+2);
				String [] teamMemberArr = teamMember.split("\\s*,\\s*");
				for (int i = 0; i < teamMemberArr.length; i++) {
					String name = teamMemberArr[i];
					//System.out.println(name);
					System.out.println(pathname +"\\"+ teamName + "\\" + name);
					File f = new File(pathname +"\\"+ teamName + "\\" + name);
					if(!f.exists()) {
						System.out.println(f.mkdirs());
					}
				} //for i
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//main

}
