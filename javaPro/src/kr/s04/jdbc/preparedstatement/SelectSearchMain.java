package kr.s04.jdbc.preparedstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.util.DBUtil;

public class SelectSearchMain {
	
	public static void main(String[] args) {
		BufferedReader br = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("제목 검색어: ");
			String keyword = br.readLine();
			
			// JDBC 수행 1,2 단계
			conn = DBUtil.getConnection();
			// SQL문 작성
			sql = "SELECT * FROM test3 WHERE title LIKE '%' || ? || '%'";
			// JDBC 수행 3단계 : preparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			// ?에 데이터 바인딩
			pstmt.setString(1, keyword);
			// JDBC 수행 4단계 : SQL문 실행
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				System.out.println("번호\t제목\t작성자\t등록일");
				// if 문에서 rs.next()를 하고 while문에서 바로 rs.next()를 사용하면 다음 행으로 넘어감.
				// 따라서 do-while문으로 if에서 rs.next()되어있는 행을 출력 후, 다음 행 넘어가게 하기
				do { 
					System.out.print(rs.getInt("num"));
					System.out.print("\t");
					System.out.print(rs.getString("title"));
					System.out.print("\t");
					System.out.print(rs.getString("name"));
					System.out.print("\t");
					System.out.println(rs.getDate("reg_date"));
				} while (rs.next());
				
			} else {
				System.out.println("검색된 데이터가 없습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
			if(br!=null)try {br.close();} catch (IOException e) {}
		}
	}//main

}
