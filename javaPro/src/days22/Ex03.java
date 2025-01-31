package days22;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * @author yusica
 * @data 2025. 1. 24. - 오전 9:45:01
 * @subject Data[InpurStream] / Data[OutputStream]
 * @content  - 바이트 스트림
 * 					- 기본형 8가지를 읽기/쓰기 가능한 바이트 스트림
 * 
 * 					Ex02.java / Ex02_02.java
 * 					Ex03.java / Ex03_02.java
 */
public class Ex03 {
	
	public static void main(String[] args) {
		String name = "김이름";
		int kor = 87, eng = 79, mat = 80;
		int tot = kor + eng + mat;
		double avg = (double)tot/3;
		boolean gender = true;
		
		//위의 한 학생의 정보를 파일에 저장 - 이진데이터로 저장된다
		String fileName = "student.dat";
		
		try (
				FileOutputStream fos = new FileOutputStream(fileName, true);
				DataOutputStream dos = new DataOutputStream(fos);){
			
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(mat);
			dos.writeInt(tot);
			dos.writeDouble(avg);
			dos.writeBoolean(gender);
			
			dos.flush();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}//main

}
