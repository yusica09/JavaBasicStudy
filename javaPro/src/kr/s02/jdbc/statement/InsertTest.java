package kr.s02.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
	// 명시하지않고 try - catch 문 쓰면 auto COMMIT 된다.
	// 그냥 sql문이 잘 실행된다면 commit, 만약 오류가 생겨서 catch로 가거나하면
	// rollback 된다
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
			// '를 저장하고 싶으면 '' 이렇게 입력해야함
			//sql = "INSERT INTO test1(id,age) VALUES('s't',10)"; -> 에러남
			//sql = "INSERT INTO test1(id,age) VALUES('s''t',10)"; -> 올바른 입력
			sql = "INSERT INTO test1(id,age) VALUES('s''t',10)";
			 
			// JDBC 수행 3단계 : Statement 객체 생성
			stmt = conn.createStatement();
			
			// JDBC 수행 4단계 : SQL문을 실행해서 하나의 행을 삽입
			// 삽입 작업 후 삽입한 행의 갯수를 반환
			int count = stmt.executeUpdate(sql);
			
			System.out.println(count+"개의 행을 추가했습니다."); 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// JDBC 수행 5단계 : 자원정리
			if(stmt != null) try {stmt.close();}catch(SQLException e) {}
			if(conn != null) try {conn.close();}catch(SQLException e) {}
		}
	}


}
