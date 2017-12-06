package com.sysnchronization;

class Hello
{
	synchronized void m1()
	{
		System.out.println("m1-begin");
		System.out.println("m1-1");
		System.out.println("m1-2");
	}
	synchronized void m2()
	{
		System.out.println("m2-begin");
		System.out.println("m2-1");
		System.out.println("m2-2");	
	}
}
class Vidhan implements Runnable
{   Hello h=null;
    public Vidhan(Hello h) {
		Thread t1= new Thread(this,"vidhan");
		//Thread t2= new Thread(this,"chandra");
		this.h=h;
		t1.start();
		//t2.start();
	}
    
	public void run() {
		h.m1();
		
	}
	
}

class Chandra implements Runnable
{   Hello h=null;
    public Chandra(Hello h) {
		Thread t1= new Thread(this,"chandra");
		//Thread t2= new Thread(this,"chandra");
		this.h=h;
		t1.start();
		//t2.start();
	}
    
	public void run() {
		h.m2();
		
	}
	
}
public class SynchrnznTest {

	
	public static void main(String[] args) {
		Hello h= new Hello();
		new Vidhan(h);
		new Chandra(h);

	

	
	}

}
