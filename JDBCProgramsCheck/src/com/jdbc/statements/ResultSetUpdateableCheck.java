package com.jdbc.statements;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jdbcutil.JDBCUtilType4;

public class ResultSetUpdateableCheck {

	public static void main(String[] args) {
		
		Connection con= null;
		 Statement st=null;
		 ResultSet rs=null;
		 
		 try {
			 con=JDBCUtilType4.getMySQLconnection();
			 st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			 rs=st.executeQuery("select * from customer_info");
			 System.out.println("Before any kind of operation..");
			 while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));
			}
			 //updating record in resultset
			 
			 rs.beforeFirst();
			 while (rs.next()) 
			 {
				int cid=rs.getInt(1);
				if (cid==1) 
				{
					
					System.out.println("ok fine you are inside if...");
					rs.updateString(3, "vid.mca09@gmail.com");//email column will be updated...
					rs.updateRow();
				}
			}
		//inserting record in resultset...
			 
			 rs.beforeFirst();
			 rs.moveToInsertRow();
			 rs.updateInt(1, 101);
			 rs.updateString(2,"prabhat");
			 rs.updateString(3,"prabhat@gmail.com");
			 rs.updateLong(4, 877856);
			 rs.updateDouble(5,233.44);
			 rs.insertRow();
			 
			
		} 
		 
		 catch (Exception e) {
			System.out.println("there is some problem.....");
			e.printStackTrace();
		}
		
		finally
		{
			JDBCUtilType4.cleanUP(con, st, rs);
		}
	}
	

}
