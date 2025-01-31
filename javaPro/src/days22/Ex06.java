package days22;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author yusica
 * @data 2025. 1. 24. - 오전 10:31:03
 * @subject
 * @content		RandomAccessFile
 * 							랜덤	  접근  파일
 * 						파일의 임의의 위치에 읽기/쓰기가 가능한 장점이 있는 스트림
 * 
 * 						 readXXX()
 * 						 writeXXX()
 * 						 seek(위치)
 * 
 * 						 읽기 / 쓰기 모두 가능 
 */
public class Ex06 {
	
	public static void main(String[] args) throws IOException {
		String s = "I Love normal Java";
		String q = "javabook";
		
		// RandomAccessFile 파일 쓰기(저장)
		String name = "random.txt";
		String mode = "rw"; // read , write
		try (RandomAccessFile raf = new RandomAccessFile(name, mode);){
			 // raf.getFilePointer() 확인  파일포인터
			raf.writeBytes(s);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		일시정지();
		
		try (RandomAccessFile raf = new RandomAccessFile(name, mode);){
			 // raf.getFilePointer() 확인  파일포인터
			raf.seek(7); // 파일포인터 위치 설정
			raf.writeBytes(q);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		일시정지();
		
		try (RandomAccessFile raf = new RandomAccessFile(name, mode);){
			 // raf.getFilePointer() 확인  파일포인터
			raf.seek(2); // 파일포인터 위치 설정
			String line = raf.readLine();
			System.out.println(line);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}//main

	public static void 일시정지() throws IOException {
		System.out.println("> 엔터치면 진행합니다.");
		System.in.read(); // 일시정지
		System.in.skip(System.in.available()); // 13, 10 제거
		
	}

}
