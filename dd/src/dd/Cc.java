package dd;

import java.sql.Connection;

import java.sql.DriverManager;

public class Cc {

	public static Connection con;

	public static Connection get() {

		Connection conn = null;

		try {

			String id = "SJW";
			String pw = "rhdkfk1351";
			String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// JDBC ����̹��� �ε��ϴ� �ڵ�=> DriverManager�� ��ϵ�

			conn = DriverManager.getConnection(url, id, pw);

			// Connection��ü�� ���� ..conn�� ������ �����ͺ��̽��� �����Ͽ�

			// �۾��� ������ �� �ִ� ��η� �ۿ��ϴ� �߿��� ��ü ������ ����

			System.out.println("�����ͺ��̽��� ����ƴ�");

		}

		catch (Exception e) {

			System.out.println("�ε� ����");

		}

		return conn;

	}

}
