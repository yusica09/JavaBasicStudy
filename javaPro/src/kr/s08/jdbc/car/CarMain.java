package kr.s08.jdbc.car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarMain {
	private BufferedReader br;
	private CarDAO dao;

	public CarMain() {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			dao = new CarDAO();
			callMenu();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if(br!=null)try {br.close();} catch (IOException e) {}
		}

	}

	//메뉴
	private void callMenu() throws IOException{
		while(true) {
			System.out.print("1.등록, 2.목록보기, 3.상세정보, 4.정보수정, 5.정보삭제, 6.종료\n > ");
			try {
				int no = Integer.parseInt(br.readLine());
				if(no == 1) {
					System.out.println("등록을 선택하셨습니다.");
					//자동차 정보 등록
					System.out.print("이름:");
					String name = br.readLine();

					System.out.print("색상:");
					String color = br.readLine();

					System.out.print("제조사:");
					String maker = br.readLine();

					int price = parseInputData("가격:");

					dao.insertCar(name, color, maker, price);

				}else if (no == 2) {
					System.out.println("목록보기를 선택하셨습니다.");
					dao.selectCar();

				}else if (no == 3) {
					System.out.println("상세정보를 선택하셨습니다.");
					dao.selectCar();
					System.out.print("선택한 자동차 관리 번호:");
					int num = Integer.parseInt(br.readLine());
					int count = dao.checkRecord(num);
					if(count==1) {
						dao.selectDetailCar(num);
					}else if(count==0) {
						System.out.println("번호를 잘못 입력했습니다.");
					}else {
						System.out.println("정보 처리 중 오류 발생");
					}

				}else if (no == 4) {
					System.out.println("정보수정을 선택하셨습니다.");
					//정보수정
					dao.selectCar();

					System.out.print("수정할 자동차 정보의 관리 번호:");
					int num = Integer.parseInt(br.readLine());
					int count = dao.checkRecord(num);
					if(count==1) {

						dao.selectDetailCar(num);

						System.out.print("이름:");
						String name = br.readLine();

						System.out.print("색상:");
						String color = br.readLine();

						System.out.print("제조사:");
						String maker = br.readLine();

						int price = parseInputData("가격:");

						dao.updateCar(num, name, color, maker, price);
					}else if(count==0){
						System.out.println("번호를 잘못 입력하셨습니다.");
					}else {
						System.out.println("정보 처리 중 오류 발생");
					}


				}else if (no == 5) {
					System.out.println("정보삭제를 선택하셨습니다.");
					//정보삭제
					dao.selectCar();

					System.out.print("삭제할 정보의 관리 번호:");
					int num = Integer.parseInt(br.readLine());
					int count = dao.checkRecord(num);
					if(count==1) {
						dao.deleteCar(num);
					}else if(count==0) {
						System.out.println("번호를 잘못 입력했습니다.");
					}else {
						System.out.println("정보 처리 중 오류 발생");
					}

				}else if (no == 6) {
					System.out.println("프로그램 종료");
					break;
				}else {
					System.out.println("잘못입력했습니다.");
				}
			} catch (NumberFormatException e) {
				System.out.println("[숫자만 입력 가능]");
			}
		}
	}

	public int parseInputData(String item) throws IOException{
		while(true) {
			System.out.print(item);
			try {
				int num = Integer.parseInt(br.readLine());

				//0이하면 오류 발생
				if(num<=0 || num > 999999999) {
					throw new NotAcceptableValueException(
							"1~999,999,999까지만 입력 가능");
				}
				return num;//정상 값 반환
			}catch(NumberFormatException e) {
				System.out.println(
						"[숫자를 입력하지 않았거나 숫자 입력 범위를 초과했습니다.]");
			}catch(NotAcceptableValueException e) {
				System.out.println(e.getMessage());
			}
		}
	}


	public static void main(String[] args) {
		new CarMain();
	}//main

}
