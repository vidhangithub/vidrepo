package com.vidhan.springtestautowire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MyMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(VidhanConfig.class);
		VidhanBatch vidBatch = (VidhanBatch) ctx.getBean("vidhanBatch");
		vidBatch.getStudentName();
		ctx.registerShutdownHook();
		ctx.close();
	}

}
