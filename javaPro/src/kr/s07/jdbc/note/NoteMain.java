package kr.s07.jdbc.note;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoteMain {
	private BufferedReader br;
	private NoteDAO note;
	
	public NoteMain() {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			note = new NoteDAO();
			
			// 메뉴호출
			callMenu();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 자원정리
			if(br!=null) try{br.close();} catch(IOException e) {}
		}
	}
	
	// 메뉴
	private void callMenu() throws IOException{
		while(true) {
			System.out.print("1. 글쓰기, 2. 목록보기, 3. 상세글보기, 4. 글수정, 5. 글삭제, 6. 종료 \n > ");
			try {
				int no = Integer.parseInt(br.readLine());
				if(no == 1) {
					System.out.println("글쓰기를 선택하셨습니다.");
					System.out.println("-".repeat(50));
					// 글쓰기
					System.out.print("이름 : ");
					String name = br.readLine();
					
					System.out.print("비밀번호 : ");
					String passwd = br.readLine();
					
					System.out.print("제목 : ");
					String subject = br.readLine();
					
					System.out.print("내용 : ");
					String content = br.readLine();
					
					System.out.print("이메일 : ");
					String email = br.readLine();
					
					//NoteDAO의 insertInfo메서드를 호출해서
					//입력받은 데이터 전달
					note.insertInfo(name, passwd, subject, content, email);
					
				} else if (no == 2) {
					System.out.println("목록보기를 선택하셨습니다.");
					System.out.println("-".repeat(50));
					// 목록보기
					note.selectInfo();
					
				} else if (no == 3) {
					System.out.println("상세글보기를 선택하셨습니다.");
					System.out.println("-".repeat(50));
					// 상세글보기
					// 목록에서 선택할 글번호를 확인
					note.selectInfo();
					System.out.print("선택한 글의 번호 : ");
					int num = Integer.parseInt(br.readLine());
					System.out.println("-".repeat(50));
					
					note.selectDetailInfo(num);
					
				} else if (no == 4) {
					System.out.println("글수정를 선택하셨습니다.");
					System.out.println("-".repeat(50));
					// 글수정
					// 목록에서 선택할 글번호를 확인
					/*
					note.selectInfo();
					System.out.print("선택한 글의 번호 : ");
					int num = Integer.parseInt(br.readLine());
					System.out.println("-".repeat(50));
					
					System.out.print("이름 : ");
					String name = br.readLine();
					
					System.out.print("비밀번호 : ");
					String passwd = br.readLine();
					
					System.out.print("제목 : ");
					String subject = br.readLine();
					
					System.out.print("내용 : ");
					String content = br.readLine();
					
					System.out.print("이메일 : ");
					String email = br.readLine();
					
					note.updateInfo(num, name, passwd, subject, content, email);
					System.out.println();
					*/
					
					// 답안
					note.selectInfo();
					System.out.print("수정할 글의 번호 : ");
					int num = Integer.parseInt(br.readLine());
					// 전달한 번호로 레코드 존재 여부 체크
					// 1: 존재, 0:미존재, -1:오류
					int count = note.checkRecord(num);
					if(count == 1) {
						note.selectDetailInfo(num);
						System.out.println("-".repeat(50));
						
						System.out.print("이름 : ");
						String name = br.readLine();
						
						System.out.print("비밀번호 : ");
						String passwd = br.readLine();
						
						System.out.print("제목 : ");
						String subject = br.readLine();
						
						System.out.print("내용 : ");
						String content = br.readLine();
						
						System.out.print("이메일 : ");
						String email = br.readLine();
						
						note.updateInfo(num, name, passwd, subject, content, email);
						
					} else if(count == 0) {
						System.out.println("번호를 잘못 입력했습니다.");
					} else {
						System.out.println("정보처리중 오류발생");
					}
					
				} else if (no == 5) {
					System.out.println("글삭제를 선택하셨습니다.");
					System.out.println("-".repeat(50));
					// 글삭제
					// 목록에서 선택할 글번호를 확인
					note.selectInfo();
					System.out.print("선택한 글의 번호 : ");
					int num = Integer.parseInt(br.readLine());
					System.out.println("-".repeat(50));
					
					//전달한 번호로 레코드 존재 여부 체크
					int count = note.checkRecord(num);
					//1:존재,0:미존재,-1:오류
					if(count == 1) {
						note.deleteInfo(num);
					}else if(count == 0) {
						System.out.println("번호를 잘못 입력했습니다.");
					}else {
						System.out.println("정보 처리 중 오류 발생");
					}

					
				} else if (no == 6) {
					// 종료
					System.out.println("프로그램을 종료합니다.");
					break;
				} else {
					System.out.println("잘못 입력했습니다.");
				}
			} catch (NumberFormatException e) {
				System.out.println("[숫자만 입력 가능]");
			}
		}
	}
	
	public static void main(String[] args) {
		
		new NoteMain();
		
	}//main

}
