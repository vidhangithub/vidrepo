package com.vid.exceptions;


public class ExceptionTest {

	
	public static void main(String[] args) throws InValidUserIdFormat,InsufficientFundException
	
	{
		int amount=100;
		String userid="raj_100";
			try 
			{
				
				if (amount == 1000 && userid.startsWith("vid_"))
				{
					System.out.println("ok..Account open");
				}
				else if (amount<1000 && !userid.startsWith("vid_")) {
					throw new InsufficientFundException(amount);
					//throw new InValidUserIdFormat(userid);//we can't do this
				}
				else {
					throw new InValidUserIdFormat(userid);
				}
				
				/* we can do this......*/
				/*else
				{
				throw new InsufficientFundException(amount);
				//throw new InValidUserIdFormat(userid);//but we can't do this...
			
				}*/
				
			} 
			catch (InsufficientFundException ef) 
			{
			//System.out.println(ef);
			ef.printStackTrace();
			}
			catch (InValidUserIdFormat eu) 
			{
			//System.out.println(eu);
			eu.printStackTrace();
			}
			finally
			{
			System.out.println(" i am always here...");	
			}
	
		ExpRaise e= new ExpRaise();
		try {
			e.m1();
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}

	}

}
