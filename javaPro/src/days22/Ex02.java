package days22;

import java.io.FileWriter;

/**
 * @author yusica
 * @data 2025. 1. 24. - 오전 9:23:57
 * @subject Data[InputStream] / Data[OutputStream]
 * @content  - 바이트 스트림
 * 					- 기본형 8가지를 읽기/쓰기 가능한 바이트 스트림
 * 
 * 					Ex02.java / Ex02_02.java
 * 					Ex03.java / Ex03_02.java
 */
public class Ex02 {
	
	public static void main(String[] args) {
		String name = "김이름";
		int kor = 87, eng = 79, mat = 80;
		int tot = kor + eng + mat;
		double avg = (double)tot/3;
		boolean gender = true;
		
		//위의 한 학생의 정보를 문자스트림(FileWriter) -> 파일로 저장
		String fileName = "student.txt";
		
		//마지막에 true (Boolean)는 새로운 정보로 바꾸면 append 하겠다. 라는 의미
		try (FileWriter writer = new FileWriter(fileName, true);){
			String data = String.format("%s,%d,%d,%d,%d,%f,%b\n",
					name, kor, eng, mat, tot, avg, gender);
			writer.write(data);
			writer.flush();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		
	}//main

}
