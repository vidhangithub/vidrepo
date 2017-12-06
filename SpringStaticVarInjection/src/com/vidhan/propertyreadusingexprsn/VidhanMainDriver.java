package com.vidhan.propertyreadusingexprsn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VidhanMainDriver {

	public static void main(String[] args) {
		System.out.println("Trying to start J2EE container");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("vid-context.xml");
		System.out.println("Started:::");
		DatabaseConnectionUtil dbutil = (DatabaseConnectionUtil)ctx.getBean("databaseConUtil");
		System.out.println(dbutil.getDbUrl());
		System.out.println(dbutil.getDbUserName());
		System.out.println(dbutil.getDbPassword());
	}

}
