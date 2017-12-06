package com.test;

public class StringCheck {

	public static StringCheck strcheck;
	
	private StringCheck()
	{
		
	}
	static
	{
		strcheck=new StringCheck();
	}
	public static StringCheck getMyObject()
	{
		return strcheck;
	}
	public boolean emptyString(String str)
	{   
		boolean b=false;
		if(str.length()== 0)
		{
			b=true;
		}
		else {
			b=false;
		}
		return b;
	}
	

}
