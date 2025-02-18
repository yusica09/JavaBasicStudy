package kr.s09.jdbc.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.util.DBUtil;

public class MemberDAO {
	// 사용자 로그인 체크(로그인 성공 true, 로그인 실패 false 반환)
	public boolean  loginCheck(String me_id, String me_passwd) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		boolean flag = false;
		
		try {
			// JDBC 수행 1,2 단계
			conn = DBUtil.getConnection();
			// sql문 작성
			sql = "SELECT me_id FROM member WHERE me_id=? AND me_passwd=?";
			// JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, me_id);
			pstmt.setString(2, me_passwd);
			//JDBC 수행 4단계
			rs = pstmt.executeQuery();
			if(rs.next()) {
				flag = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
		
		return flag;
	}

}
