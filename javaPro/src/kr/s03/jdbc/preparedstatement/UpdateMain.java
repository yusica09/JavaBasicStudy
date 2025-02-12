package kr.s03.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.util.DBUtil;

public class UpdateMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC 수행  1,2 단계
			conn = DBUtil.getConnection();
			
			//SQL문 작성
			sql = "UPDATE test2 SET name=?, age=? WHERE id=?";
			// age = ? 뒤에 , 쓰지 않도록 주의..
			
			// JDBC 수행 3단계 : PreparedStatement 객체생성
			pstmt = conn.prepareStatement(sql);
			
			/* Prepared ? prepare?
			 * 
			 * PreparedStatement -> 클래스명은 명사로 씀 
			 * prepareStatement -> 메소드명은 동사로 씀
			 * 
			 */
			
			// ?에 데이터 바인딩
			pstmt.setString(1, "강호동");
			pstmt.setInt(2, 40);
			pstmt.setString(3, "sky");
			
			// JDBC 수행 4단계
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행의 정보를 수정했습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 자원정리
			DBUtil.executeClose(null, pstmt, conn);
		}
	}//main
}
