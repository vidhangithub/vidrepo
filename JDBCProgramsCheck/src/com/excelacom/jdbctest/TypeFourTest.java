package com.excelacom.jdbctest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.excelacom.utiltest.JdbcUtilType4;

public class TypeFourTest {	
public static void main(String[] args) 
{
	String sname;
	String fname;
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
try 
{
	con=JdbcUtilType4.getMyObject().getOracleConnection();
    st=con.createStatement();
	String SQL="insert into student values ('vid','giri')";
	int x=st.executeUpdate( SQL);
	if (x==1) {
		System.out.println("ok done");
	} else {
System.out.println("some problem");
	}
	String SQL1="select * from student";
    rs=st.executeQuery(SQL1);
	while (rs.next()) {
		sname=rs.getString(1);
		fname=rs.getString(2);
		System.out.println("student name="+sname+"\t"+"Father's name="+fname);
	}
} catch (Exception e) {
	e.printStackTrace();
}		
finally
{
	JdbcUtilType4.getMyObject().cleanUP(con, st, rs);
}
}

}
