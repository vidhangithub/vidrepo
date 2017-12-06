package com.jdbc.statements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jdbcutil.JDBCUtilType4;

public class PreparedStatementCheck {
 
	static Connection con=null;
	static PreparedStatement ps= null;
	static ResultSet rs= null;
	public static void main(String[] args) 
	{   
		String uname=args[0];
		String pwd=args[1];
		
		try 
		{
			con=JDBCUtilType4.getMySQLconnection();
			
			ps=con.prepareStatement("insert into user_master values (?,?)");
			ps.setString(1,uname);
			ps.setString(2, pwd);
			int x=ps.executeUpdate();
			System.out.println(x);
			if (x==1) {
				
				System.out.println(" row inserted");
			} else {
                  System.out.println("insertion failed");
			}
			ps=con.prepareStatement("select * from user_master");
			rs=ps.executeQuery();
			System.out.println(rs.getFetchSize());
			System.out.println(rs.getConcurrency());
			//System.out.println(rs.getCursorName());
			
			while (rs.next()) {
				System.out.println("UserName:-"+rs.getString(1)+"\t"+"password:-"+rs.getString(2));
			}
			
		} catch (Exception e) {
			System.out.println("there is some problem...");
			e.printStackTrace();
		}
		finally
		{
			JDBCUtilType4.cleanUP(con, ps,rs);
		}
		
	}

}
