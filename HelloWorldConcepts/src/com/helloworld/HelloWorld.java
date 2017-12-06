package com.helloworld;

import java.io.PrintStream;

public  abstract class HelloWorld {

	
	public static void main(String[] args) {
     System.out.println("hi vidhan...");
     PrintStream ps=System.out;
     ps.println("main hu na....");
     //int i=Integer.parseInt(args[0]);
	/* System.out.println(args[0]);	
     System.out.println(args[1]);
     System.out.println(args[2]);
     System.out.println(args[3]);*/
		System.out.println("i am in main()");
     
	}
	
	public static void main()
	{
		System.out.println("overloaded main()...");
	}

}
