package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

	public static Connection get() {
		Connection conn = null;
		
		try {
			String id = "SJW";
			String pw = "rhdkfk1351";
			String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";

			// JDBC ����̹��� �ε��ϴ� �ڵ� => DriverManager�� ���
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, id, pw);
			//System.out.println("�����ͺ��̽��� ����Ǿ���.");
			
		} catch (Exception e) {
			System.out.println("�ε� ����");
		}
		
		return conn;
	}
}