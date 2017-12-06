package com.jdbctest;

import java.sql.Connection;
import java.sql.Statement;


import com.jdbcutil.JDBCUtilType4;

public class JDBCTest2Type4 {

static Connection con=null;
static	Statement st=null;
	
	public static void main(String[] args) {
		
		try {
			System.out.println("trying to get connection...");
			//Connection con=JDBCUtilType4.getOracleconnection();
			Connection con=JDBCUtilType4.getMySQLconnection();
			Statement st=con.createStatement();
			System.out.println("connected..");
			System.out.println(con);
			System.out.println(st);
			String sql="insert into user_master values('vidhan','chandra123')";
			int x=st.executeUpdate(sql);
			System.out.println(x);
			if(x==1)
			{
				System.out.println("row inserted");
			}
			else
			{
				System.out.println("insertion failed");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally
		{
			JDBCUtilType4.cleanUP(con, st);
		}
	}

}
