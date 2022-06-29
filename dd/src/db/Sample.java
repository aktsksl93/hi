package db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Sample {
	public static void main(String[] args) throws SQLException {
		Connection conn = null; // DB�� �����ϴ� �������̽�
		PreparedStatement psmt = null; // sql �� ��ü
		ResultSet rs = null; // sql�� ���� ��ȯ(���� ���࿡ ���� ����� ����
		
		
		try {
//			String que = "select * from emp1";
			String que = "execute proc_emp1_getall()";
			
			
			conn = DB.get(); // DB����
			psmt = conn.prepareStatement(que);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				int empno = rs.getInt(1);
				// String empno = rs.getString(1);
				String ename = rs.getString(2);
				String job = rs.getString("JOB");
				Date hiredate = rs.getDate("hiredate");
				
				int sal = rs.getInt("sal");
				int comm = rs.getInt("COMM");
				System.out.println(empno + " | " + ename + "\t| " + job + "\t| " + hiredate + "\t|" + rs.getInt("deptno"));
			}
			
			rs.close();
			psmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
}