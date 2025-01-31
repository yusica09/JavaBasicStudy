package days22;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Ex03_02 {
	
	public static void main(String[] args) {
		String name ;
		int kor, eng, mat;
		int tot;
		double avg ;
		boolean gender;
		
		//[파일로 저장 -> 읽어와서 출력] - 이진 파일을 원래 상태로 읽어옴
		String fileName = "student.dat";
		
		try (FileInputStream fis = new FileInputStream(fileName);
			   DataInputStream dis = new DataInputStream(fis);){

			while (dis.available() > 0) {
				
				name = dis.readUTF();
				kor = dis.readInt();
				eng = dis.readInt();
				mat = dis.readInt();
				tot = dis.readInt();
				avg = dis.readDouble();
				gender = dis.readBoolean();
				
				System.out.printf("%s,%d,%d,%d,%d,%f,%b\n",
						name, kor, eng, mat, tot, avg, gender);
			} // while
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}//main

}
