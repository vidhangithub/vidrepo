package com.jdbc.statements;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import com.jdbcutil.JDBCUtilType4;

public class StatementCheck {

	 static Connection con=null;
	 static Statement st=null;
	 static ResultSet rs= null;
	public static void main(String[] args) {
		try 
		{
			  con=JDBCUtilType4.getMySQLconnection();
			  st=con.createStatement();
			  System.out.println(con.getAutoCommit());
			  String sql="select * from user_master";
			 /* String sql1="insert into user_master values('giri','bharti')";
			  int x=st.executeUpdate(sql1);
			  if(x==1)
			  {
				System.out.println("record inserted..");  
			  }
			  else
				  System.out.println("record insertion failed...");*/
			  
			 /* boolean b=st.execute(sql1);
			  System.out.println(b);*/
			  
			  rs=st.executeQuery(sql);
			   while(rs.next())
			  {
				 System.out.println("UserName:="+rs.getString(1)+"\t"+"Password:="+rs.getString(2)); 
				 //System.out.println(rs.absolute(1));
				 //System.out.println(rs.findColumn("vidhan"));
			  }
			  
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			JDBCUtilType4.cleanUP(con, st, rs);
		}
		
   
	}

}
