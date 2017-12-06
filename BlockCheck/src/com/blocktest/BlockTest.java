package com.blocktest;
 class MindTuner
 {
	 static final int i=10;
	 static
	 {
		 System.out.println(" i am in static block Mindtuner::");
	 }
 }
class A
{
	
	static class InnerA1
	{
		void m1()
		{
			System.out.println("i am  method of  static inner class InnerA1  of A");
		}
	}
	class InnerA2
	{
		
	}
	static
	{
		
		class InnerA
		{
			void m1()
			{
				System.out.println("i am  method of inner class InnerA inside static block of A");
				
			}
			
		}
		{
			System.out.println("i am instance block of static block");
		}
		
		
	System.out.println("i am static block of class A");
	
	}
	
	{
	System.out.println("i am instance block of class A");	
	}
}

 class B
{
	/*private B()
	{
		
	}*/
	 
	 /*final B()
	 {
		 
	 }*/
}
 class C extends B
 {
	 
 }


public class BlockTest {
	/*static int x=10;
	
	static
	{ System.out.println("i am 2nd static block");
		x=x/3;
		System.out.println(x);
	}
	static
	{System.out.println("i am 1st static block");
		x=x+5;
		System.out.println(x);
	}*/

	
	public static void main(String[] args)
	
	{
		/*A aobj= new A();
		A.InnerA1 aobj1= new A.InnerA1();
		aobj1.m1();
		B bobj= new B();*/
		/*System.out.println(x);*/
		System.out.println(MindTuner.i);
		
	}

}
