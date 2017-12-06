package com.jdbc.statements;

import java.sql.Connection;

import java.sql.Statement;

import com.jdbcutil.JDBCUtilType4;

public class BatchUpdateTest {

	
	public static void main(String[] args) {
		Connection con= null;
		 Statement st=null;
		 
		 
		 try 
		 {
			 con=JDBCUtilType4.getMySQLconnection();
			 st=con.createStatement();
			 st.addBatch("delete from user_master");
			 st.addBatch("insert into user_master values('vidhan','chandra')");
			 int x[]=st.executeBatch();
			 for(Object o : x)
			 {
				 System.out.println(o);
			 }
			 
		 } 
		 catch (Exception e) 
		 {
			System.out.println("there is some problem");
			e.printStackTrace();
		 }
       finally
       {
    	   JDBCUtilType4.cleanUP(con, st);
       }
	}

}
