package kr.s04.jdbc.preparedstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.util.DBUtil;

public class DeleteMain {
	public static void main(String[] args) {
		BufferedReader br = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("번호: ");
			int num = Integer.parseInt(br.readLine());
			
			// JDBC 수행 1,2 단계
			conn = DBUtil.getConnection();
			
			System.out.println("test3 테이블의 데이터를 삭제합니다.");
			
			// SQL문 작성
			sql = "DELETE FROM test3 WHERE num=?";
			
			// JDBC 수행 3단계 : preparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			
			// ?에 데이터 바인딩
			pstmt.setInt(1, num);
			
			// JDBC 수행 4단계 : SQL문 실행
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행을 삭제했습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(null, pstmt, conn);
			if(br!=null)try {br.close();} catch (IOException e) {}
		}
		
	}//main
}
