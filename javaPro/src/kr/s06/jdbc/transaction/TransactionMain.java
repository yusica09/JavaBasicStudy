package kr.s06.jdbc.transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kr.util.DBUtil;

public class TransactionMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		PreparedStatement pstmt3 = null;
		String sql = null;
		
		try {
			conn = DBUtil.getConnection();
			
			// 트랜잭션을 수동처리 하기 위해 auto commit 해제
			conn.setAutoCommit(false);
			
			sql = "INSERT INTO test1 VALUES ('서울',500)";
			pstmt1 = conn.prepareStatement(sql);
			pstmt1.executeUpdate();
			
			sql = "INSERT INTO test1 VALUES ('부산',400)";
			pstmt2 = conn.prepareStatement(sql);
			pstmt2.executeUpdate();
			
			// 테스트용으로 오류가 있는 SQL문 사용
			sql = "INSERT INTO test1 VALUES ('제주',300";
			pstmt3 = conn.prepareStatement(sql);
			pstmt3.executeUpdate();
		
			// 정상적으로 작업 완료되면 commit
			conn.commit();
			
			System.out.println("작업 완료!");
			
		} catch (Exception e) {
			e.printStackTrace();
			// 예외가 발생했을 경우 ROLLBACK
			try {
				conn.rollback();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		} finally {
			DBUtil.executeClose(null, pstmt3, null);
			DBUtil.executeClose(null, pstmt2, null);
			DBUtil.executeClose(null, pstmt1, conn);
			
		}
	}//main

}
