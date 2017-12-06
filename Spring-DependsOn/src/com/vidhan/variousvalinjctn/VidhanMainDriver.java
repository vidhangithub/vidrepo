package com.vidhan.variousvalinjctn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VidhanMainDriver {

	public static void main(String[] args) {
		System.out.println("Trying to start J2EE container");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("vid-context.xml");
		System.out.println("Started:::");
		VidhanCompeleteCustomerInfo vidcompleteInfo = (VidhanCompeleteCustomerInfo)ctx.getBean("vidcmpltinfo");
		vidcompleteInfo.showFullCustomerInfo();
	}

	
	/*Progrma won't run as depands-on attribute has been depricated 
	 * from spring 3.2  to run this needs to have spring 2.5 jars with 2.5 xsd*/
	

}
