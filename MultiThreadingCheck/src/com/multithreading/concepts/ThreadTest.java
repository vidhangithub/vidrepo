package com.multithreading.concepts;

public class ThreadTest {
	
	public static void main(String[] args) {
		
		Thread t= Thread.currentThread();
	    t.setName("vidhan");
	    t.setPriority(6);
	    System.out.println(t);
	    System.out.println(t.getName());
	    System.out.println(t.getPriority());
	    
	    ThreadGroup tg=t.getThreadGroup();
	    System.out.println(tg.getName());
	}

}
