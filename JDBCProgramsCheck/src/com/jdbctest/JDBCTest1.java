package com.jdbctest;

import java.sql.Connection;
import java.sql.Statement;

import com.jdbcutil.*;

public class JDBCTest1 {
	
	static Connection con=null;
	static Statement st=null;
public static void main(String[] args) {
	 
	try {
		Connection con=JDBCUtilType2.getOracleConnection();
		Statement st=con.createStatement();
		String sql="insert into user_master values('vidhan','chandra123')";
		int x=st.executeUpdate(sql);
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
		System.out.println("cleaning resources");
		JDBCUtilType2.cleanUP(con, st);
		
	}
	
	
	
}

}
