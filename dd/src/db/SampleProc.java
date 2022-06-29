package db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SampleProc {
	public static void main(String[] args) throws SQLException {
		Connection conn = null; // DB�� �����ϴ� �������̽�
		PreparedStatement psmt = null; // sql �� ��ü
		ResultSet rs = null; // sql�� ���� ��ȯ(���� ���࿡ ���� ����� ����

		try {
			conn = DB.get(); // DB����

			/////////////////////////////////////
			// ���ν����� �����ϴ� ��� ����
			/////////////////////////////////////
			CallableStatement cs = conn.prepareCall("begin proc_emp_get_all(?); end;");
			cs.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
			cs.execute();
			rs = (ResultSet) cs.getObject(1); // �ε��� ����

//			CallableStatement cs = conn.prepareCall("begin proc_emp_get_with_empno(? , ?); end;");
//			cs.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
//			cs.setString(2, "7839");
			
			
			/////////////////////////////////////
			// ���ڵ�� �޾ƿ���
			/////////////////////////////////////
			cs.execute();
			rs = (ResultSet) cs.getObject(1);

			/////////////////////////////////////
			// ���ڵ�� ������ ���� �ϱ�.
			/////////////////////////////////////
			while (rs.next()) {
				int empno = rs.getInt(1);
				// String empno = rs.getString(1);
				String ename = rs.getString(2);
				String job = rs.getString("JOB");
				Date hiredate = rs.getDate("hiredate");

				int sal = rs.getInt("sal");
				int comm = rs.getInt("COMM");
				System.out.println(
						empno + " | " + ename + "\t| " + job + "\t| " + hiredate + "\t|" + rs.getInt("deptno"));
			}

			rs.close();
			cs.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}