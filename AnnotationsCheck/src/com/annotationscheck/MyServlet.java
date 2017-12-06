package com.annotationscheck;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException
	{
		System.out.println("i am in service...");
	}
	
}
