package com.oopscheck;

import java.sql.SQLException;



abstract class AbsA
{
	public AbsA()
	{
		
	}
	public abstract void m1();
	public abstract void m2();
	void m3()
	{
		
	}
	void m4()
	{
		
	}
	public static void m5()
	{
		
	}
	
}

interface i1 
{
	
}
class A
{  
	private int a;
	private int b;
	A()
	{
		System.out.println("i am default con of class A");
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
}
class B extends A
{
	public void myUse() throws Exception
	{
		
	}
	
	public int myUse(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
		return c;
	}
	public String myUse(String s1,String s2)
	{
		String s3=s1+ "\t" +s2;
		System.out.println(s3);
		return s3;
	}
	public String toString()
	{
		return new String();
	}
}

class C extends B
{
	public void myUse() throws SQLException
	{   int x;
	
		try 
		{
		
		} 
		catch (Exception e) 
		{
			
		}
	}
	
	
	
}

public class OopsTest {

	
	public static void main(String[] args) {
		
		A aobj= new B();
		A aobj1= new C();
		B bobj= new B();
		bobj.myUse("vidhan", "chandra");
		
	}

}
