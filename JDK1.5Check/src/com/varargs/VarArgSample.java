package com.varargs;

public class VarArgSample {
	
	public void myMethod(int ... a)
	{
		System.out.println("myMethod() of VarArgSample ");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("inside for loop....");
			System.out.println(a[i]);
		}
		int s=0;
		for (int x : a) 
		{
			System.out.println("inside enhancedforloop");
			System.out.println(x);
			s=s+x;
		}
		System.out.println(s);
		
		
	}
	
	
	public void myMethod(int a,int b)
	{
		System.out.println("**myMethod(int a,int b)****");
		System.out.println(a+b);
	}
	
	
	public void myMethod(int a,int b,int c)
	{
		System.out.println("**myMethod(int a,int b,int c)****");
		System.out.println(a*b*c);
	}
}
