package com.interfacecheck;

interface Washable
{
	void wash();
}
 

abstract class Vechile implements Washable
 {
	 public abstract void wash();
 }
 

abstract class Cloths implements Washable
 {
	 public abstract void wash();
 }


class Car extends Vechile
{
	public void wash() 
	{
		System.out.println(" iam ready to wash car...");
	}
}


class Truck extends Vechile
{
	public void wash() 
	{
		System.out.println("i am ready to wwash truck");
	}
}


class PartyWear extends Cloths
{
	public void wash() 
	{
		System.out.println("i am ready to wash partywear");
	}
}



class FormalWear extends Cloths
{
	public void wash() 
	{
		System.out.println("i am ready to wash formalwear");
	}
}


public class InterfaceTest {
	public static void main(String[] args) {
		Cloths c= new FormalWear();
		c.wash();
	}
}
