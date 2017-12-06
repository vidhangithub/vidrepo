package com.vidhan.coretest;

import java.lang.reflect.Method;

public class ClassLoaderTesting {
	
	class Customer{
		
	}
	class GoldCustomer extends Customer{
		
	}
	class SilverCustomer extends GoldCustomer{
		
	}
	public static void main(String[] args) throws ClassNotFoundException {
		Class classobj = Class.forName("SilverCustomer").getClass();
		
	}

}
