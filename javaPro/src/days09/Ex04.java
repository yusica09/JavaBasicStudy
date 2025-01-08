package days09;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import days07.Sample;

/**
 * @author yusica
 * @data 2025. 1. 7. - 오전 11:20:39
 * @subject	(시험)
 * @content	한 반(30명) 학생들의 성적 관리
 * 				(이름, 국어, 영어, 수학, 총점, 평균, 등수)
 * 				1. 이름, 국, 영, 수 입력
 * 				2. 총점, 평균, 등수 계산 처리
 * 				3. 모든 학생 정보를 출력
 */
public class Ex04 {

	public static void main(String[] args) throws IOException {
		
		final int STUDENT_COUNT = 30;
		
		String [] names = new String[STUDENT_COUNT];
		int [] kors = new int[STUDENT_COUNT];
		int [] engs = new int[STUDENT_COUNT];
		int [] mats = new int[STUDENT_COUNT];
		int [] tots = new int[STUDENT_COUNT];
		double [] avgs = new double[STUDENT_COUNT];
		int [] ranks = new int[STUDENT_COUNT];
		
		int cnt = 0;	// 입력받은 학생의 수
		char con = 'y';
		
		//입력받은 한 학생의 정보를 저장할 변수
		String name;
		int kor, eng, mat, tot, rank;
		double avg;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			//
			System.out.print("> 이름 국어 영어 수학 점수 입력 : ");
			name = getName();
			//kor = getScore();
			kor = scanner.nextInt();
			eng = getScore();
			mat = getScore();
			
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
		
		// 모든 학생들의 등수를 처리..
		for (int i = 0; i < cnt; i++) {
			ranks[i] = 1;
			for (int j = 0; j < cnt; j++) {
				if(i !=j && tots[i] <= tots[j]) ranks[i]++;
			}
		}
		
		System.out.printf("> 입력받은 학생수 : %d명\n", cnt);
		//출력
		for(int i=0;i<cnt;i++) {
			System.out.printf("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t\t%d\n",
					i+1,names[i],kors[i],engs[i],mats[i],tots[i],avgs[i],ranks[i]);
		}
		
		// 국어 점수가 가장 높은 학생의 이름과 국어점수를 출력
		boolean [] highKors = new boolean[cnt];
		int highIndex = 0;
		
		for (int i = 0; i < cnt; i++) {
			if(kors[i]>kors[highIndex]) {
				Arrays.fill(highKors, false);
				highKors[i] = true;
				highIndex = i;
			}
			else if(kors[i] == kors[highIndex])
				highKors[i] = true;
		}
		
		for (int i = 0; i < highKors.length; i++) {
			if(highKors[i]) {
				System.out.printf("> 국어 점수가 가장 높은 학생 : %s, 점수 : %d\n",names[i],kors[i]);
			}
		}
		

	}//main
	
	private static String getName() {
		// '가 ~ '힣'
		//44032 ~ 55203
		
		// 5 ~ 13
		// 5 <= (int)(Math.random()*9)+5 <= 13
		
		//Random rnd = new Random();
		//char one = (char)(rnd.nextInt('힣'-'가'+1)+'가');
		
		char [] nameArr = new char[3];
		Random rnd = new Random();
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = (char)(rnd.nextInt('힣'-'가'+1)+'가');
		}
		// char[] -> String 변환
		return new String(nameArr);
	}

	public static int getScore() {
		return (int)(Math.random()*101);
	}

}//class
