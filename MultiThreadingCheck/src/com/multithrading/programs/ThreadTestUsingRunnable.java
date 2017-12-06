package com.multithrading.programs;


class D implements Runnable
{

	D()
	{
	Thread t1= new Thread(this,"vidhan");
	Thread t2= new Thread(this,"chandra");
	t1.start();
	t2.start();
	}
	public void run() {
		for(int i=0;i<=5;i++)
		{
			System.out.println(i+":-by" +Thread.currentThread().getName());
		}
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
}
public class ThreadTestUsingRunnable {

	
	
	public static void main(String[] args) {
		
      /* try {
		Class.forName("com.multithrading.programs.D");
	} catch (ClassNotFoundException e) {
		System.out.println("some problem.....");
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
       new D();
	}

}
