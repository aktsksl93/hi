package dd;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DB;

public class qq {

	public static void main(String[] args) {

		Connection conn = null; // DB�� �����ϴ� �������̽�
		PreparedStatement psmt = null; // sql �� ��ü
		
		
		try {
			conn = DB.get(); // DB����
			
			String sql = "insert into emp1(empno,ename,job) values(?,?,?)";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "4444");
			psmt.setString(2, "JA");
			psmt.setString(3, "LYST");
			
			int n = psmt.executeUpdate();

			System.out.println(n > 0 ? "����" : "����");
			
			// �ݾ��ֱ�
			psmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}