package days11;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author yusica
 * @data 2025. 1. 9. - 오후 5:04:38
 * @subject	Student 클래스 선언
 * @content	클래스 배열 선언 코딩 수정. (유지, 보수)
 */
public class Ex10 {

	public static void main(String[] args) throws IOException {
		
		final int STUDENT_COUNT = 30;
		
		Student[] students = new Student[STUDENT_COUNT];
		
		
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
			kor = getScore();
			eng = getScore();
			mat = getScore();
			
			tot = kor + eng + mat;
			avg = (double)tot/3;
			rank = 1;
			
			// 객체 생성 후 채워넣기
			students[cnt] = new Student();
			
			students[cnt].name = name;
			students[cnt].kor = kor;
			students[cnt].eng = eng;
			students[cnt].mat = mat;
			students[cnt].tot = tot;
			students[cnt].avg = avg;
			students[cnt].rank = rank;
			
			cnt++;
			// 계속 입력 여부
			System.out.print("> 학생 입력 계속 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con) == 'Y');
		
		// 모든 학생들의 등수를 처리..
	
		for (int i = 0; i < cnt; i++) {
			students[i].rank = 1;
			for (int j = 0; j < cnt; j++) {
				if(i !=j && students[i].tot <= students[j].tot) students[i].rank++;
			}
		}

		
		System.out.printf("> 입력받은 학생수 : %d명\n", cnt);
		//출력
		for(int i=0;i<cnt;i++) {
			System.out.printf("[%d번]\t%s\n",i+2,students[i].getStudentInfo_2());
		}

	}//main
	
	public static String getName() {
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
