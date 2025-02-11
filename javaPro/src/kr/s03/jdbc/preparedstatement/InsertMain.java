package kr.s03.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.util.DBUtil;

public class InsertMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC 수행  1,2 단계
			conn = DBUtil.getConnection();
			
			//SQL문 작성
			sql = "INSERT INTO test2 (id, name, age, reg_date) VALUES (?,?,?,SYSDATE)";
			
			// JDBC 수행 3단계 : PreparedStatement 객체생성
			pstmt = conn.prepareStatement(sql);
			// ?에 데이터 바인딩
			pstmt.setString(1, "red"); //1번 ?에 데이터 전달
			pstmt.setString(2, "박문수"); //2번 ?에 데이터 전달
			pstmt.setInt(3, 40); //3번 ?에 데이터 전달
			
			//JDBC 수행 4단계 : SQL문을 실행해서 테이블에 행을 추가
			// sql 여기 넣는거 아님 주의
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행을 추가했습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 자원정리
			DBUtil.executeClose(null, pstmt, conn);
		}
	}//main
}
