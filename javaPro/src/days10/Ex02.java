package days10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yusica
 * @data 2025. 1. 8. - 오전 11:18:32
 * @subject
 * @content
 * 
 * 1. 한 반에 10명인 학생의 성적 관리
         ( 이름, 국어, 영어, 수학, 총점, 평균, 등수  )
         1. 이름, 국,영,수 입력
         2. 총,평, 등 계산 처리
         3. 모든 학생 정보를 출력..
    조건) 등수 처리하는 메서드를 만드세요. 
    조건) 학생 이름,국,영,수 입력은 자동으로 처리하는 메서드를 만드세요.
    조건) 배열의 크기보다 학생 입력을 많이 할 경우 자동으로 배열의 크기를 
    		3증가 시키는 코딩을 추가하세요.
 */
public class Ex02 {

	public static void main(String[] args) {
		// 한 반 학생 10명
		final int STUDENT_NUM = 10;
		int cnt = 0;

		// 값 저장할 배열
		String [] names = new String[STUDENT_NUM];
		int [] kors = new int[STUDENT_NUM];
		int [] engs = new int[STUDENT_NUM];
		int [] mats = new int[STUDENT_NUM];
		int [] tots = new int[STUDENT_NUM];
		double [] avgs = new double[STUDENT_NUM];
		int [] ranks = new int[STUDENT_NUM];
		
		// 이름, 국, 영, 수 입력 자동 처리 메서드
		do {
			getInfo(cnt, names, kors, engs, mats, tots, avgs);	
		} while (cnt <= STUDENT_NUM);
		
		// 등수 처리 메서드
		Arrays.fill(ranks, 1);
		studentsRank(cnt, tots, ranks);
		
		
		

	}

	private static void studentsRank(int cnt, int[] tots, int[] ranks) {
		int rank = 1;
		for(int i=0; i < cnt; i++) {
			
		}
		
	}


	private static void getInfo(int cnt, String[] names, int[] kors, int[] engs, int[] mats, int[] tots, double[] avgs) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 이름 국어 영어 수학 점수 입력 : ");
		String name = scanner.next();
		int kor = scanner.nextInt();
		int eng = scanner.nextInt();
		int mat = scanner.nextInt();
		int tot = kor+eng+mat;

		names[cnt] = name;
		kors[cnt] = kor;
		engs[cnt] = eng;
		mats[cnt] = mat;
		tots[cnt] = kor+eng+mat;
		avgs[cnt] = (double)tot/3;
	}

}
