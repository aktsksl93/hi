package dd;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

public class Xx {

 public static void main(String[] args) throws SQLException {

  

  Connection conn=null; //DB�� �����ϴ� �������̽�

  PreparedStatement psmt=null; //sql�� ��ü

  ResultSet rs=null; //sql�� ���� ��ȯ(���� ���࿡ ���� ����� ����)

  

  try {

   

   String que="select * from emp1";

   

   conn=Cc.get(); //DB����

   

   psmt=conn.prepareStatement(que);

   rs=psmt.executeQuery();

   //select => executeQuery()

   //DML(insert,update,delete) => executeUpdate();

   

   while(rs.next()) {

    //DB�� �ִ� ������ ������ 

    String empno=rs.getString(1);

    String ename=rs.getString(2);

    String job=rs.getString(3);

//    int mgr=rs.getInt(4);
//
//    
//
//    java.sql.Date hiredate=rs.getDate(5);
//
//    int sal=rs.getInt(6);
//
//    int comm=rs.getInt(7);
//
//    int deptno=rs.getInt(8);

    

    System.out.println(empno+" "+ename+" "+job); 

   }

   

  }

  catch(Exception e) {

   e.printStackTrace();

  }

  rs.close();

  psmt.close();

  conn.close();

 }

}
