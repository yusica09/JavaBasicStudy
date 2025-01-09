package days10;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.IntStream;

import days09.Ex04;

/**
 * @author yusica
 * @data 2025. 1. 8. - 오후 12:09:09
 * @subject		3반 -> 한 반 30명 이름/국/영/수/총/평/등 입력 -> 성적처리 -> 출력
 * @content		2/3차원 배열 사용
 */
public class Ex02_03 {

	public static void main(String[] args) throws IOException {
		final int STUDENT_COUNT = 30;
		
		String [][] names = new String[3][STUDENT_COUNT];
		double [][] avgs = new double[3][STUDENT_COUNT];
		
		int [][][] infos = new int[3][STUDENT_COUNT][6];
		
		char con = 'y';
		// cnts[0] 1반 학생의 입력받은 학생 수 
		// cnts[1] 2반 학생의 입력받은 학생 수 
		// cnts[2] 3반 학생의 입력받은 학생 수 
		int [] cnts = new int[3];
		
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
			System.out.printf("> 2. %d반의 [%d번] 학생 이름, 국어, 영어, 수학 점수 입력 : ",ban,cnts[ban-1]+1);
			name = Ex04.getName();
			kor = Ex04.getScore();
			eng = Ex04.getScore();
			mat = Ex04.getScore();
			
			tot = kor + eng + mat;
			avg = (double)tot/3;
			rank = 1;
			wrank=1;
			
			// 각각의 배열에 어디에 채워넣을까?
			studentNum = cnts[ban-1];
			
			names[ban-1][studentNum]= name;
			avgs[ban-1][studentNum]= avg;
			infos[ban-1][studentNum][0] = kor;
			infos[ban-1][studentNum][1] = eng;
			infos[ban-1][studentNum][2] = mat;
			infos[ban-1][studentNum][3] = tot;
			infos[ban-1][studentNum][4] = rank;
			infos[ban-1][studentNum][5] = wrank;
			
			cnts[ban-1]++;
			// 계속 입력 여부
			System.out.print("> 학생 입력 계속 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con) == 'Y');
		
		// [반, 전교 등수 처리]
		// 1)반 등수
		for (int i = 0; i < studentNum; i++) {
			infos[ban-1][i][4] = 1;
			for (int j = 0; j < studentNum; j++) {
				if(i !=j && infos[ban-1][i][3] <= infos[ban-1][j][3]) 
					infos[ban-1][i][4]++;
			}
		}
		// 2)전교등수
		for (int i = 0; i < cnts.length; i++) { //반
			for (int j = 0; j < cnts[i]; j++) { //그 반의 수
				//infos[i][j][3] 총점
				infos[i][j][4] = 1;
				infos[i][j][5] = 1;
				for (int i2 = 0; i2 < cnts.length; i2++) { 
					for (int j2 = 0; j2 < cnts[i2]; j2++) {
						if(infos[i][j][3] < infos[i2][j2][3]) {
							infos[i][j][5]++;
							if(i == i2){
								infos[i][j][4]++;
							}
						}	
					}		
				}
			}
			
		}
		
		// 전교생 출력
		int totalCnt = IntStream.of(cnts).sum();
		System.out.printf("[전체 학생 수 : %d명]\n", totalCnt);
//		for (int i = 0; i < cnts.length; i++) {
//			System.out.printf("[%d]반 학생 수 :  %d명\n", i+1, cnts[i]);
//		}
		
		for (int i = 0; i < cnts.length; i++) {
			System.out.printf("[%d]반 학생 수 :  %d명\n", i+1, cnts[i]);
			for (int j = 0; j < cnts[i]; j++) {
				System.out.printf(
		                  "\t%d.\t%s\t%d\t%d\t%d\t%d\t%.2f\t\t%d\t%d\n"
		                  , j+1
		                  , names[i][j]
		                  , infos[i][j][0], infos[i][j][1]
		                  , infos[i][j][2], infos[i][j][3]
		                  , avgs[i][j]
		                  , infos[i][j][4], infos[i][j][5]);
		         }
			}

	}//main

}//class
