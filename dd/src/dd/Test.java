package dd;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DB;


public class Test {
	public static void main(String[] args) throws SQLException {
		
		////////////////////////////////
		// 디비 연결할 변수 선언
		////////////////////////////////
		Connection conn = null; // DB와 연결하는 인터페이스
		PreparedStatement psmt = null; // sql 문 객체
		ResultSet rs = null; // sql에 대한 반환(쿼리 실행에 대한 결과값 저장


		////////////////////////////////
		// 디비 연결 및 쿼리 실행
		////////////////////////////////
		try {
			
			// 쿼리문 작성
			String sql = "select * from emp1";
			
			
			// 디비 연결, 실행
			conn = DB.get(); // DB연결
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			
			
			// 디비 닫기
			rs.close();
			psmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
}