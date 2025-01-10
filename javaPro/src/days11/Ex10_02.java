package days11;

import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

import days09.Ex04;

/**
 * @author yusica
 * @data 2025. 1. 9. - 오후 5:36:18
 * @subject	반이 여러개일때 성적입력받고 출력 Person 클래스 이용하기
 * @content
 */
public class Ex10_02 {

	public static void main(String[] args) throws IOException {
		final int STUDENT_COUNT = 30;
		final int CLASS_COUNT = 5;

		Student[][] students = new Student[CLASS_COUNT][STUDENT_COUNT];

		char con = 'y';
		// cnts[0] 1반 학생의 입력받은 학생 수 
		// cnts[1] 2반 학생의 입력받은 학생 수 
		// cnts[2] 3반 학생의 입력받은 학생 수 
		int [] cnts = new int[CLASS_COUNT];

		//입력받은 한 학생의 정보를 저장할 변수
		String name;
		int kor, eng, mat, tot, rank, wrank;
		double avg;

		Scanner scanner = new Scanner(System.in);

		int ban; int studentNum;

		do {
			// 1. 반 입력 ? 
			System.out.print("> 1. 반 입력 : ");
			ban = scanner.nextInt();

			// 2. 학생 정보 입력 ?
			studentNum = cnts[ban-1];
			System.out.printf("> 2. %d반의 [%d번] 학생 이름, 국어, 영어, 수학 점수 입력 : ",ban,studentNum+1);
			name = Ex04.getName();
			kor = Ex04.getScore();
			eng = Ex04.getScore();
			mat = Ex04.getScore();

			tot = kor + eng + mat;
			avg = (double)tot/3;
			rank = 1;
			wrank=1;

			// 각각의 배열에 어디에 채워넣을까?
			students[ban-1][studentNum] = new Student();

			students[ban-1][studentNum].name = name;
			students[ban-1][studentNum].kor = kor;
			students[ban-1][studentNum].eng = eng;
			students[ban-1][studentNum].mat = mat;
			students[ban-1][studentNum].tot = tot;
			students[ban-1][studentNum].avg = avg;
			students[ban-1][studentNum].rank = rank;
			students[ban-1][studentNum].wrank = wrank;

			cnts[ban-1]++;

			// 계속 입력 여부
			System.out.print("> 학생 입력 계속 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con) == 'Y');
		

		// [반, 전교 등수 처리]
		processingRanks(cnts,students);
		// 출력
		printStudents(cnts,students);


	}//main
	

	private static void printStudents(int[] cnts, Student[][] students) {
		// 전교생 출력
		int totalCnt = IntStream.of(cnts).sum();
		System.out.printf("[전체 학생 수 : %d명]\n", totalCnt);

		for (int i = 0; i < cnts.length; i++) {
			System.out.printf("[%d]반 학생 수 :  %d명\n", i+1, cnts[i]);
			for (int j = 0; j < cnts[i]; j++) {
				System.out.printf("[%d번]\t%s\n",j+1,students[i][j].getStudentInfo());
			}
		}

	}


	private static void processingRanks(int[] cnts, Student[][] students) {
		for (int i = 0; i < cnts.length; i++) { //반
			for (int j = 0; j < cnts[i]; j++) { //그 반의 수
				students[i][j].rank = 1;
				students[i][j].wrank = 1;
				for (int i2 = 0; i2 < cnts.length; i2++) { 
					for (int j2 = 0; j2 < cnts[i2]; j2++) {
						if(students[i][j].tot < students[i2][j2].tot) {
							students[i][j].wrank++;
							if(i == i2){
								students[i][j].rank++;
							}
						}	
					}		
				}
			}
		}
		
	}

}//class
