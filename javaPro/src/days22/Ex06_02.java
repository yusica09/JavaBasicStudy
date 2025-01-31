package days22;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ex06_02 {
	
	public static void main(String[] args) throws IOException {
		int [] score = {
                // 번호 	 국   	영   	수
                     1, 	100,	90, 	90,
                     2,		70,	90,	100,
                     3,		100,	100,	100,
                     4,		70,	60,	80,
                     5,		70,	90,	100
              };
		
		String name = "score.dat";
		String mode = "rw"; // read , write
		try (RandomAccessFile raf = new RandomAccessFile(name, mode);){
			for (int i = 0; i < score.length; i++) {
				System.out.printf("> 현재 FP : %d - %d\n",
						raf.getFilePointer(),score[i]);
				raf.writeInt(score[i]);
			} //for i
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		Ex06.일시정지();
		
		
		// [문제1]
		// 모든 학생의 번호, 국어, 영어, 수학 성적 정보를 출력
		int no,kor, eng,mat,tot;
		double avg;
		
		try (RandomAccessFile raf = new RandomAccessFile(name, "r");){
			// raf.getFilePointer()  0   seek(0) 이동
			for (int i = 0; i < score.length/4; i++) {
				no = raf.readInt();  // 4
				kor = raf.readInt(); // 4
				eng = raf.readInt(); // 4
				mat = raf.readInt(); // 4

				tot = kor + eng +mat;
				avg = (double)tot/3;

				System.out.printf(
						"번호:%d, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%.2f\n", 
						no, kor, eng, mat, tot, avg);
			} //for i
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		Ex06.일시정지();
		
	    // [문제2]
	    // 3번 학생의 수학 점수(100)를 20점으로 수정하는 코딩..하세요.  
	      
		try (RandomAccessFile raf = new RandomAccessFile(name, mode);){
			 // 3번 학생의 수학 20 수정
			// 파일포인터 위치 설정 - 한 학생: 4*4, 수학바꿔야하므로 4(번호) + 4(국) + 4(영)
			raf.seek((4*4)*2 + 4*3); 
			raf.writeInt(20);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		Ex06.일시정지();
		
	    // [문제3]
	    // 3번 학생의 번호,국어,영어,수학  성적 정보를 출력.
		
		try (RandomAccessFile raf = new RandomAccessFile(name, "r");){
			raf.seek((4*4)*2); //세번째학생 시작지점
			no = raf.readInt();  
			kor = raf.readInt();
			eng = raf.readInt();
			mat = raf.readInt();

			tot = kor + eng +mat;
			avg = (double)tot/3;

			System.out.printf(
					"번호:%d, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%.2f\n", 
					no, kor, eng, mat, tot, avg);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}//main

}
