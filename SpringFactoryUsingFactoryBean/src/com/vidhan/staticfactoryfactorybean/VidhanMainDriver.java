package com.vidhan.staticfactoryfactorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VidhanMainDriver {

	public static void main(String[] args) {
		System.out.println("Trying to start J2EE container");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("vid-context.xml");
		System.out.println("Started:::");
		VidhanCars vidcar = (VidhanCars) ctx.getBean("vidCarFact");
		vidcar.drive();
	}

}
