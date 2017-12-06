package com.jdbcutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class JDBCUtilType2 {
	
	
	public static Connection getOracleConnection()
	{
		Connection con=null;
	    try {
	    	System.out.println("trying to get Oracle connection..");
	    	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	    	con=DriverManager.getConnection("jdbc:odbc:vidDSN", "system" , "vidhan");
	    	
			
		} catch (Exception e) {
			System.out.println("there is some problem to get oracle connection..");
			e.printStackTrace();
		}
		
		return con;
	}



public static Connection getMySQLConnection()
{
	Connection con=null;
    try {
    	
		
	} catch (Exception e) {
		System.out.println("there is some problem to get MySQL connection..");
		e.printStackTrace();
	}
	
	return con;
}

public static void cleanUP(Connection con,Statement st,ResultSet rs)
{
	try {
		if(con!=null)
		{
			con.close();
		}
		if(st!=null)
		{
			con.close();
		}
		if(rs!=null)
		{
			con.close();
		}
		
	} catch (Exception e) {
		System.out.println("There is some problem to clean the resource");
		
	}
	
}
	
	public static void cleanUP(Connection con,Statement st)
	{
		try {
			if(con!=null)
			{
				con.close();
			}
			if(st!=null)
			{
				con.close();
			}
			
			
			
		} catch (Exception e) {
			System.out.println("There is some problem to clean the resource");
			
		}
}

}

