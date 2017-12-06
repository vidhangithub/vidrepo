package com.mypackage;

import com.test.StringCheck;

public class MyClass {

	public  String reverse(String s)
	{
		if(s.length()==1)
			return s; //returns the original string only if it is one character

		else
			reverse(s.substring(1) + s.charAt(0));//calls the reverse method to take the first character and reverse it
			return s;
	}
	 public static StringCheck sk=null;
	public static void main(String[] args) throws Exception
	{      
		MyClass my= new MyClass();
		try{
			String string="rahul";
			System.out.println(my.reverse(string));
		/*String s1="vidhan";
		sk=StringCheck.getMyObject();
		System.out.println(sk.emptyString(s1));*/
		//String s2="";
		/*int i=10;
		int k=i/0;
		System.out.println(k);*/
		
		/*char ch[]=s1.toCharArray();
		for (int j = 0; j < ch.length; j++) {
			if (condition) {
				
			}
			System.out.println(ch[j]);
		}*/
		
		/*String s2="    vidhan     ";
		System.out.println(s2);
		System.out.println(s2.length());
		s2=s2.trim();
		System.out.println(s2.length());
		System.out.println(s2);
        
		
		String s3="      ";
		System.out.println(s3.length());
		s3=s3.trim();
		System.out.println(s3.length());
		System.out.println();
		
		String s4="chandra";*/
		
		/*String sv="vidhan";
		  String reverse = new StringBuffer(sv).reverse().toString();
		  System.out.println(reverse);*/
		
		
		
		}
		catch (Exception e) {
			System.out.println("i am here...");
			System.out.println(e);
			e.printStackTrace();
		}
		

	}

}
