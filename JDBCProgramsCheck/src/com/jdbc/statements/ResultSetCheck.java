package com.jdbc.statements;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jdbcutil.JDBCUtilType4;

public class ResultSetCheck {

	
	public static void main(String[] args) {
	 Connection con= null;
	 Statement st=null;
	 ResultSet rs=null;
	 
	 try {
		 con=JDBCUtilType4.getMySQLconnection();
		 st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		 System.out.println("resultset type:-"+st.getResultSetType());
		 System.out.println("resultset concureency"+st.getResultSetConcurrency());
		 System.out.println("close crsr ovr cmt"+ResultSet.CLOSE_CURSORS_AT_COMMIT);
		 System.out.println("read only"+ResultSet.CONCUR_READ_ONLY);
		 System.out.println(ResultSet.CONCUR_UPDATABLE);
		 System.out.println(ResultSet.FETCH_FORWARD);
		 System.out.println(ResultSet.FETCH_REVERSE);
		 System.out.println(ResultSet.FETCH_UNKNOWN);
		 System.out.println(ResultSet.HOLD_CURSORS_OVER_COMMIT);
		 System.out.println(ResultSet.TYPE_FORWARD_ONLY);
		 System.out.println("scroll insensitive"+ResultSet.TYPE_SCROLL_INSENSITIVE);
		 System.out.println("scroll sensitive"+ResultSet.TYPE_SCROLL_SENSITIVE);
		 
		 rs=st.executeQuery("select * from user_master");
		 System.out.println(" All in forward order...");
		 while (rs.next()) {
			System.out.println("username:-"+rs.getString(1)+"\t"+"password:-"+rs.getString(2));
		}
		System.out.println("All in backward order...");
		while (rs.previous()) {
			//rs.afterLast();
			System.out.println("username:-"+rs.getString(1)+"\t"+"password:-"+rs.getString(2));
		}
	} 
	 
	 catch (Exception e) {
		System.out.println("there is some problem....");
		e.printStackTrace();
	}
     finally
     {
    	 JDBCUtilType4.cleanUP(con, st, rs);
     }
	}

}
