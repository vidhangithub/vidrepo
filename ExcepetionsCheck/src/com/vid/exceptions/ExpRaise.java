package com.vid.exceptions;

class InsufficientFundException extends Exception
{
	private static final long serialVersionUID = 1L;
    int amount=1000;
    
    public InsufficientFundException() {
		// TODO Auto-generated constructor stub
	}
   
	public InsufficientFundException(int amount) {
		super();
		this.amount = amount;
	}

	public String toString()
	{
		return +amount+":::is not a valid amount to open an Account";
	}
	
}

class InValidUserIdFormat extends Exception
{
	private static final long serialVersionUID = 1L;
    String userid;
    
    public InValidUserIdFormat() {
		// TODO Auto-generated constructor stub
	}
    
	
	public InValidUserIdFormat(String userid) {
		super();
		this.userid = userid;
	}



	public String toString()
	{
		return userid +":::: format is not ok...";
	}
	
}

public class ExpRaise {
	int x=0;
	public int m1() throws Exception
	{
		try 
	    { System.out.println("i am ok in try..");
			int x=1/1;			
			System.out.println(x);
			return x;
		} 
		catch (Exception e) 
		{
			System.out.println("some problem...");
		    e.printStackTrace();	
		}
		finally
		{
			System.out.println("i am always there...");
			//return x;
		}
	return x;
	}
	

}
