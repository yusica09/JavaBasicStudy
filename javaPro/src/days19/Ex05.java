package days19;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import days11.Student;

public class Ex05 {

	public static void main(String[] args) throws IOException {

		// 한 반에 30명 학생들의 이름, 국어, 영어, 수학, 총점, 평균, 등수 관리
		// days09.Ex04.java		String [] names, int [] kors ..
		// days11.Ex10.java		Student [] students = new Student[STUDENT_COUNT] ..
		// ArrayList 컬렉션 클래스 사용

		Student student = null;

		ArrayList list = new ArrayList();
		
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
			student = new Student();

			student.name = name;
			student.kor = kor;
			student.eng = eng;
			student.mat = mat;
			student.tot = tot;
			student.avg = avg;
			student.rank = rank;

			list.add(student);

			// 계속 입력 여부
			System.out.print("> 학생 입력 계속 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con) == 'Y');

		int cnt = list.size();
		// 모든 학생들의 등수를 처리..
		for (int i = 0; i < cnt; i++) {
			student = (Student)list.get(i);
			student.rank = 1;
			for (int j = 0; j < cnt; j++) {
				if(i !=j && student.tot <= ((Student)list.get(j)).tot)  student.rank++;
			}
		}

		System.out.printf("> 입력받은 학생수 : %d명\n", cnt);
		
		//출력
		
		//[1] - for문
		/*
		for(int i=0;i<cnt;i++) {
			System.out.printf("[%d번]\t%s\n",i+1,((Student)list.get(i)));
		}
		*/
		
		//[2] - iterator
		/*
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			Student s = (Student)ir.next();
			System.out.println(s);
		}
		*/
		
		//[3] - stream
		list.stream().forEach(System.out::println);

	}//main

	public static String getName() {

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

}
