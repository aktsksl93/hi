package dd;

import java.sql.Connection;

import java.sql.DriverManager;

public class Cc {
	//커밋테스트
	public static Connection con;

	public static Connection get() {

		Connection conn = null;

		try {

			String id = "SJW";
			String pw = "rhdkfk1351";
			String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// JDBC 드라이버를 로딩하는 코드=> DriverManager에 등록됨

			conn = DriverManager.getConnection(url, id, pw);

			// Connection객체를 얻음 ..conn은 실제로 데이터베이스와 연결하여

			// 작업을 수행할 수 있는 통로로 작용하는 중요한 객체 변수로 사용됨

			System.out.println("데이터베이스에 연결됐다");

		}

		catch (Exception e) {

			System.out.println("로딩 실패");

		}

		return conn;

	}

}
