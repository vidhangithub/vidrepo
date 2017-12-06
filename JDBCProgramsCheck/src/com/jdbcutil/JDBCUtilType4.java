package com.jdbcutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCUtilType4 {
	
	public static Connection getOracleconnection()
	{Connection con=null;
	
	try {
		System.out.println("Trying to get Oracle Connection:::");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system" ,"vidhan");
		System.out.println("Connected to Oracle Engine:::");
	} catch (Exception e) {
		System.out.println("problem to get oracle connection...");
		e.printStackTrace();
	}
		
		return con;
	}
	public static Connection getMySQLconnection()
	{Connection con=null;
    try {
    	System.out.println("Trying to get MySQL Connection:::");
    	Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/viddB", "root" ,"vidhan");
		System.out.println("Connected to MySql Engine:::");
	} catch (Exception e) {
		System.out.println("problem to get MySQL connection...");
		e.printStackTrace();
	}
		return con;
	}
	public static void cleanUP(Connection con,Statement st,ResultSet rs)
	{
	
		try {
			System.out.println("cleaning resources....");
			if (con!=null) {
				con.close();
			}
			if (st!=null) {
				con.close();
			}
			if (rs!=null) {
				con.close();
			}
			System.out.println("All Resources Cleaned::::");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void cleanUP(Connection con,Statement st)
	{try {
		System.out.println("cleaning resources...");
		if (con!=null) {
			con.close();
		}
		if (st!=null) {
			con.close();
		}
		System.out.println("All Resources Cleaned::::");	
	} catch (Exception e) {
		e.printStackTrace();
	}
		
	}
}
