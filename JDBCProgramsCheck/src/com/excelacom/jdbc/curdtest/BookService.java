package com.infosys.jdbc.curdtest;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.infosys.utiltest.JdbcUtilType4;

public class BookService {
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	public int verifyUser(String un,String pw)
	{
		int x=0;
		try {
			con=JdbcUtilType4.getMyObject().getMySQLconnection();
			ps=con.prepareStatement("select * from user_master where userName=? and password=? ");
			ps.setString(1, un);
			ps.setString(2, pw);
			rs=ps.executeQuery();
			if (rs.next()) {
				x=1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			JdbcUtilType4.getMyObject().cleanUP(con, ps, rs);
		}
		return x;
	}
	
	public int addBook(BookBean bo)
	{
		int x=0;
		try {
			con=JdbcUtilType4.getMyObject().getMySQLconnection();
			ps=con.prepareStatement("insert into Book_info values(?,?,?,?,?,?,?)");
			ps.setString(1,bo.getBid());
			ps.setString(2, bo.getBname());
			ps.setString(3,bo.getAuthor());
			ps.setString(4, bo.getPublication());
			ps.setString(5,bo.getCost());
			ps.setString(6, bo.getEdition());
			ps.setString(7,bo.getISBN());
			x=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			JdbcUtilType4.getMyObject().cleanUP(con, ps);
		}
		return x;
	}

	
	public int updateBook(BookBean bo)
	{
		int x=0;
		try {
			con=JdbcUtilType4.getMyObject().getMySQLconnection();
			ps=con.prepareStatement("update Book_info set bname=?,author=?,publication=?,cost=?, edition=?,isbn=? where bid=?");
			ps.setString(7,bo.getBid());
			ps.setString(1, bo.getBname());
			ps.setString(2,bo.getAuthor());
			ps.setString(3, bo.getPublication());
			ps.setString(4,bo.getCost());
			ps.setString(5, bo.getEdition());
			ps.setString(6,bo.getISBN());
			x=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			JdbcUtilType4.getMyObject().cleanUP(con, ps);
		}
		return x;
	}
	public int deleteBook(String bid)
	{
		int x=0;
		try {
			con=JdbcUtilType4.getMyObject().getMySQLconnection();
			ps=con.prepareStatement("delete from Book_info  where bid=?");
			ps.setString(1,bid);
			x=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			JdbcUtilType4.getMyObject().cleanUP(con, ps);
		}
		return x;
	}
	public BookBean getBookByBid(String bid)
	{
		BookBean bookBean=null;
		try {
			con=JdbcUtilType4.getMyObject().getMySQLconnection();
			ps=con.prepareStatement("select * from Book_info  where bid=?");
			ps.setString(1,bid);
			rs=ps.executeQuery();
			while (rs.next()) {
				bookBean= new BookBean();
				bookBean.setBid(rs.getString(1));
				bookBean.setBname(rs.getString(2));
				bookBean.setAuthor(rs.getString(3));
				bookBean.setPublication(rs.getString(4));
				bookBean.setCost(rs.getString(5));
				bookBean.setEdition(rs.getString(6));
				bookBean.setISBN(rs.getString(7));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			JdbcUtilType4.getMyObject().cleanUP(con, ps,rs);
		}
		return bookBean;
	}
	
	public List<BookBean> getAllBook()
	{
		List<BookBean> bookList=new ArrayList<BookBean>();
		try {
			System.out.println("inside try");
			con=JdbcUtilType4.getMyObject().getMySQLconnection();
			ps=con.prepareStatement("select * from Book_info");
			rs=ps.executeQuery();
			while (rs.next()) {
				BookBean bookBean= new BookBean();
				bookBean.setBid(rs.getString(1));
				bookBean.setBname(rs.getString(2));
				bookBean.setAuthor(rs.getString(3));
				bookBean.setPublication(rs.getString(4));
				bookBean.setCost(rs.getString(5));
				bookBean.setEdition(rs.getString(6));
				bookBean.setISBN(rs.getString(7));
				bookList.add(bookBean);
			}
		} catch (Exception e) {
			System.out.println("inside catch");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("inside finally>>>>");
			JdbcUtilType4.getMyObject().cleanUP(con, ps,rs);
		}
		return bookList;
	}
}
