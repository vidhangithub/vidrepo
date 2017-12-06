package com.vidhan.propertyreadusingexprsn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VidhanMainDriver {

	public static void main(String[] args) {
		System.out.println("Trying to start J2EE container");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("vid-context.xml");
		System.out.println("Started:::");
		DatabaseConnectionUtil dbutil = (DatabaseConnectionUtil)ctx.getBean("databaseConUtil");
		String dburl = dbutil.getDbUrl();
		String dbusrid = dbutil.getDbUserName();
		String dbpassword = dbutil.getDbPassword();
		System.out.println(dburl);
		System.out.println(dbusrid);
		System.out.println(dbpassword);
		
	}

}
