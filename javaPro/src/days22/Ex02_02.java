package days22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex02_02 {
	
	public static void main(String[] args) {
		String name ;
		int kor, eng, mat;
		int tot;
		double avg ;
		boolean gender;
		
		//위의 한 학생의 정보를 문자스트림(FileWriter) -> [파일로 저장 -> 읽어와서 출력]
		String fileName = "student.txt";
		
		try (FileReader reader = new FileReader(fileName);
			   BufferedReader br = new BufferedReader(reader);){
			String line;
			while ((line = br.readLine()) != null) {
				
				String [] datas = line.split(",");
				
				name = datas[0];
				kor = Integer.parseInt(datas[1]);
				eng = Integer.parseInt(datas[2]);
				mat = Integer.parseInt(datas[3]);
				tot = Integer.parseInt(datas[4]);
				avg = Double.parseDouble(datas[5]);
				gender = Boolean.parseBoolean(datas[6]);
				
				System.out.printf("%s,%d,%d,%d,%d,%f,%b\n",
						name, kor, eng, mat, tot, avg, gender);
			} // while
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}//main

}
