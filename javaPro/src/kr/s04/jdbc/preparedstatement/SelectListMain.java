package kr.s04.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.util.DBUtil;

public class SelectListMain {
	public static void main(String[] args) {
	
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			// JDBC 수행 1,2 단계
			conn = DBUtil.getConnection();
			
			// SQL문 작성
			sql = "SELECT * FROM test3 ORDER BY num DESC";
			
			// JDBC 수행 3단계 : preparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			
			// JDBC 수행 4단계 : SQL문 실행 결과를 ResultSet에 담아 변환
			rs = pstmt.executeQuery();
			System.out.println("번호\t제목\t작성자\t등록일");
			
			while (rs.next()) {// 다중행이라 while 사용
				System.out.print(rs.getInt("num"));
				System.out.print("\t");
				System.out.print(rs.getString("title"));
				System.out.print("\t");
				System.out.print(rs.getString("name"));
				System.out.print("\t");
				System.out.println(rs.getDate("reg_date"));
			} // while
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
		
	}//main
}
