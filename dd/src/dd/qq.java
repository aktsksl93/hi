package dd;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DB;

public class qq {

	public static void main(String[] args) {

		Connection conn = null; // DB와 연결하는 인터페이스
		PreparedStatement psmt = null; // sql 문 객체
		
		
		try {
			conn = DB.get(); // DB연결
			
			String sql = "insert into emp1(empno,ename,job) values(?,?,?)";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "4444");
			psmt.setString(2, "JA");
			psmt.setString(3, "LYST");
			
			int n = psmt.executeUpdate();

			System.out.println(n > 0 ? "성공" : "실패");
			
			// 닫아주기
			psmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}