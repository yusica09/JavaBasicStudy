package kr.s07.jdbc.note;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.util.DBUtil;

/**
 * @author yusica
 * @data 2025. 2. 12. - 오후 3:32:49
 * @subject DAO
 * @content
 * 		DAO : Data Access Object
 * 				  데이터베이스의 데이터를 전문적으로 호출하고 제어하는 객체
 */
public class NoteDAO {
	// 글쓰기
	public void insertInfo(String name, String passwd, 
			String subject, String content,String email) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		int cnt = 0;
		
		try {
			// JDBC 수행 1,2 단계
			conn = DBUtil.getConnection();
			// SQL문 작성
			sql = "INSERT INTO note VALUES (note_seq.nextval,?,?,?,?,?,SYSDATE)";
			// JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			// ?에 데이터 바인딩
			pstmt.setString(++cnt, name); 
			pstmt.setString(++cnt, passwd);
			pstmt.setString(++cnt, subject);
			pstmt.setString(++cnt, content);
			pstmt.setString(++cnt, email);
			
			// JDBC 수행 4단계
			int count = pstmt.executeUpdate();
			System.out.println(count + "개의 행을 삽입했습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
		
	}
	// 목록보기
	public void selectInfo() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			// JDBC 수행 1,2 단계
			conn = DBUtil.getConnection();
			// SQL문 작성
			sql = "SELECT * FROM note ORDER BY num DESC";
			// JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			
			// JDBC 수행 4단계
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				System.out.println("번호\t작성자\t\t작성일\t\t\t제목");
				System.out.println("-".repeat(50));
				do {
					System.out.print(rs.getInt("num"));
					System.out.print("\t");
					System.out.print(rs.getString("name"));
					System.out.print("\t\t");
					System.out.print(rs.getDate("reg_date"));
					System.out.print("\t");
					System.out.println(rs.getString("subject"));
					
				} while (rs.next());
			}else {
				System.out.println("표시할 데이터가 없습니다.");
			}
			System.out.println("-".repeat(50));
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}
	// 상세글보기
	public void selectDetailInfo(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			// JDBC 수행 1,2 단계
			conn = DBUtil.getConnection();
			// SQL문 작성
			sql = "SELECT * FROM note WHERE num=?";
			// JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			// ?에 데이터 할당
			pstmt.setInt(1, num);
			// JDBC 수행 4단계
			rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("글번호 : " + rs.getInt("num"));
				System.out.println("이름 : " + rs.getString("name"));
				System.out.println("비밀번호 : " + rs.getString("passwd"));
				System.out.println("제목 : " + rs.getString("subject"));
				System.out.println("내용 : " + rs.getString("content"));
				
				String email = rs.getString("email");
				if(email == null) email ="";
				
				System.out.println("이메일 : "+email);
				System.out.println("작성일 : " + rs.getDate("reg_date"));
				System.out.println();
				
				
			} else {
				System.out.println("검색된 정보가 없습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}
	
	public int checkRecord(int num) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int count = 0;
		
		try {
			
			// JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			// SQL문 작성
			sql = "SELECT * FROM note WHERE num=?";
			// JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			// ?에 데이터 바인딩
			pstmt.setInt(1, num);
			// JDBC 수행 4단계
			rs = pstmt.executeQuery();
			if(rs.next()) count = 1;
			
		} catch (Exception e) {
			e.printStackTrace(); count= -1;
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
		
		return count;
	}
	
	// 글수정
	public void updateInfo(int num, String name, String passwd, 
			String subject, String content, String email) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		
		try {
			// JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			// SQL문 작성
			sql = "UPDATE note SET name=?, passwd=?, subject=?, content=?,email=?"
					+ "WHERE num=?";
			// JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			// ?에 데이터 바인딩
			pstmt.setString(1, name);
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);
			pstmt.setString(5, email);
			pstmt.setInt(6, num);
			
			// JDBC 수행 4단계
			int count = pstmt.executeUpdate();
			System.out.println(count + "개의 행을 수정했습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
		
		
	}
	// 글삭제
	public void deleteInfo(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			
			// JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			// SQL문 작성
			sql = "DELETE FROM note WHERE num=?";
			// JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			// ?에 데이터 바인딩
			pstmt.setInt(1, num);
			// JDBC 수행 4단계
			int count = pstmt.executeUpdate();
			System.out.println(count + "개의 행을 삭제했습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
	

}
