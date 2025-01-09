package days10;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import days09.Ex04;

/**
 * @author yusica
 * @data 2025. 1. 8. - 오후 12:07:32
 * @subject		점수 입력 + 등수 계산 + 출력 + 처음배열크기 보다 많이 입력받을 시 배열크기증가
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) throws IOException {
		final int STUDENT_COUNT = 10;
		
		String [] names = new String[STUDENT_COUNT];
		int [] kors = new int[STUDENT_COUNT];
		int [] engs = new int[STUDENT_COUNT];
		int [] mats = new int[STUDENT_COUNT];
		int [] tots = new int[STUDENT_COUNT];
		double [] avgs = new double[STUDENT_COUNT];
		int [] ranks = new int[STUDENT_COUNT];
		
		int cnt = 0;
		char con = 'y';
		
		//입력받은 한 학생의 정보를 저장할 변수
		String name;
		int kor, eng, mat, tot, rank;
		double avg;
				
		Scanner scanner = new Scanner(System.in);
		
		do {
			//
			if(names.length == cnt) {
				kors = Arrays.copyOf(kors, kors.length+3);
				engs = Arrays.copyOf(engs, engs.length+3);
				mats = Arrays.copyOf(mats, mats.length+3);
				tots = Arrays.copyOf(tots, tots.length+3);
				avgs = Arrays.copyOf(avgs, avgs.length+3);
				ranks = Arrays.copyOf(ranks, ranks.length+3);
				names = Arrays.copyOf(names, names.length+3);
			}
			
			//
			System.out.print("> 이름 국어 영어 수학 점수 입력 : ");
			name = Ex04.getName();
			kor = Ex04.getScore();
			//kor = scanner.nextInt();
			eng = Ex04.getScore();
			mat = Ex04.getScore();
			
			tot = kor + eng + mat;
			avg = (double)tot/3;
			rank = 1;
			
			// 각각의 배열에 어디에 채워넣을까?
			names[cnt] = name;
			kors[cnt] = kor;
			engs[cnt] = eng;
			mats[cnt] = mat;
			tots[cnt] = tot;
			avgs[cnt] = avg;
			ranks[cnt] = rank;
			
			cnt++;
			// 계속 입력 여부
			System.out.print("> 학생 입력 계속 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con) == 'Y');
		
		//1. 등수 처리
		processingRanks(tots, ranks, cnt);
		
		//2. 출력
		printStudent(names, kors, engs, mats, tots, avgs, ranks, cnt);
		

	}//main

	private static void printStudent(String[] names, int[] kors, int[] engs, int[] mats, int[] tots, double[] avgs,
			int[] ranks, int cnt) {
		System.out.printf("> 입력받은 학생수 : %d명\n", cnt);
		for(int i=0;i<cnt;i++) {
			System.out.printf("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t\t%d\n",
					i+1,names[i],kors[i],engs[i],mats[i],tots[i],avgs[i],ranks[i]);
		}
		
	}//printStudent

	private static void processingRanks(int[] tots, int[] ranks, int cnt) {
		for (int i = 0; i < cnt; i++) {
			ranks[i] = 1;
			for (int j = 0; j < cnt; j++) {
				if(i !=j && tots[i] < tots[j]) ranks[i]++;
			}
		}
	}//processingRanks

}//class
