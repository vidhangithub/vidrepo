package com.jdbc.statements;

import java.sql.Connection;

import com.jdbcutil.JDBCUtilType4;
import com.mysql.jdbc.CallableStatement;

public class CallableStatementCheck {

    static Connection con=null;
    static CallableStatement cs=null;
    
	public static void main(String[] args) {
	
		try 
		{
			con=JDBCUtilType4.getOracleconnection();
			
		      
		} catch (Exception e) {
			e.printStackTrace();
		}
      finally
      {
    	  JDBCUtilType4.cleanUP(con,cs);
      }
	}

}
