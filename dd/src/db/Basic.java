package db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Basic {
	public static void main(String[] args) throws SQLException {
		
		////////////////////////////////
		// ��� ������ ���� ����
		////////////////////////////////
		Connection conn = null; // DB�� �����ϴ� �������̽�
		PreparedStatement psmt = null; // sql �� ��ü
		ResultSet rs = null; // sql�� ���� ��ȯ(���� ���࿡ ���� ����� ����


		////////////////////////////////
		// ��� ���� �� ���� ����
		////////////////////////////////
		try {
			
			// ������ �ۼ�
			String sql = "select * from emp1";
			
			
			// ��� ����, ����
			conn = DB.get(); // DB����
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			
			
			// ��� �ݱ�
			rs.close();
			psmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
}