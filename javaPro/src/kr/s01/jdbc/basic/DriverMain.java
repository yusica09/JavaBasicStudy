package kr.s01.jdbc.basic;

public class DriverMain {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("오라클 드라이버가 정상적으로 로드 되었습니다");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
