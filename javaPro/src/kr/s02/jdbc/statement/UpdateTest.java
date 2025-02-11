package kr.s02.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {
	public static void main(String[] args) {
		String db_driver = "oracle.jdbc.OracleDriver";
		String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
		String db_id = "user01";
		String db_password = "1234";

		Connection conn = null;
		Statement stmt = null;
		String sql = null;
		
		try {
			// JDBC 수행 1단계 : 드라이버 로드
			Class.forName(db_driver);
			
			// JDBC 수행 2단계 : Connection 객체 생성
			//							(오라클 접속을 위한 인증)
			conn = DriverManager.getConnection(
					db_url,db_id,db_password);
			
			// SQL문 작성
			sql = "UPDATE test1 SET age=90 WHERE id='SKY'";
			 
			// JDBC 수행 3단계 : Statement 객체 생성
			stmt = conn.createStatement();
			
			// JDBC 수행 4단계 : SQL문을 실행
			// update문을 실행해서 테이블의 행을 수정하고 update한 행의 갯수를 반환
			int count = stmt.executeUpdate(sql);
			System.out.println(count+"개 행의 정보를 수정했습니다."); 
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// JDBC 수행 5단계 : 자원정리
			if(stmt != null) try {stmt.close();}catch(SQLException e) {}
			if(conn != null) try {conn.close();}catch(SQLException e) {}
		}
	}
}
