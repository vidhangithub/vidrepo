package com.vidhan.springtestresource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MyMain {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(VidhanConfig.class);
		Application app = (Application)ctx.getBean("application");
		app.getApplicationUserName();
		ctx.registerShutdownHook();
		ctx.close();

	}

}
