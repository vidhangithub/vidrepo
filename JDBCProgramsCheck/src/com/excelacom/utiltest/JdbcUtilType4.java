package com.infosys.utiltest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtilType4 {

public static JdbcUtilType4 jdbcutil;
private JdbcUtilType4(){}
static
{
jdbcutil= new JdbcUtilType4();	
}
public static JdbcUtilType4 getMyObject()
{
	return jdbcutil;
}

public Connection getOracleConnection() throws SQLException,ClassNotFoundException
{   Connection con=null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system" ,"vidhan");
		
	} catch (Exception e) {
		System.out.println("problem to get oracle connection...");
		e.printStackTrace();
	}
		
		return con;
}

public  Connection getMySQLconnection() throws SQLException,ClassNotFoundException
{Connection con=null;
try {
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/viddB", "root" ,"vidhan");
	
} catch (Exception e) {
	System.out.println("problem to get MySQL connection...");
	e.printStackTrace();
}
	return con;
}
public  void cleanUP(Connection con,Statement st,ResultSet rs)
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
		System.out.println("resources cleaned...");
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public  void cleanUP(Connection con,Statement st)
{try {
	System.out.println("cleaning resources...");
	if (con!=null) {
		con.close();
	}
	if (st!=null) {
		con.close();
	}
	System.out.println("resources cleaned...");
} catch (Exception e) {
	e.printStackTrace();
}
	
}
}
