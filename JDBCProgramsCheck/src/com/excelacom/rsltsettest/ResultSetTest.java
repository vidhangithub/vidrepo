package com.excelacom.rsltsettest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.excelacom.utiltest.JdbcUtilType4;

public class ResultSetTest {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			con=JdbcUtilType4.getMyObject().getMySQLconnection();
			String SQL="select * from customer_info";
			//ps=con.prepareStatement(SQL);
			ps=con.prepareStatement(SQL, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs=ps.executeQuery();
			/*System.out.println(ps.getResultSetType());
			System.out.println(ps.getResultSetHoldability());
			System.out.println(rs.getFetchSize());*/
			while (rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));
				//System.out.println(rs.getString(6));
				/*System.out.println(rs.getString(7));
				System.out.println(rs.getString(8));*/
				//System.out.println(rs);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally
		{
			JdbcUtilType4.getMyObject().cleanUP(con, ps, rs);
		}
	}

}
