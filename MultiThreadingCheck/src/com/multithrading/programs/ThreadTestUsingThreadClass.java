package com.multithrading.programs;

class A extends Thread
{
	A(String tname)
	{
		super(tname);
		start();
	}
	
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(i+":-By" +Thread.currentThread().getName());
		}
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

public class ThreadTestUsingThreadClass {

	
	public static void main(String[] args) {
		
		new A("vidhan");
		new A("chandra");
		new A("SPI");
		new A("mysore");		
			for(int i=0;i<=5;i++)
			{
			System.out.println(i+":-By" +Thread.currentThread().getName());
			}
			try {
				 Thread.sleep(5000);
			    } 
			catch (Exception e) {
				e.printStackTrace();
			}
			
		
		
		
	}

}
