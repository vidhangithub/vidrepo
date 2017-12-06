package com.datatypecheck;

class Test
{
	byte b;
	short s;
	int i;
	long l;
	double d;
	float f;
	char c;
	boolean bl;
	
	void show()
	{
		System.out.println("byte default val"+b);
		System.out.println("short default val"+s);
		System.out.println("integer default val"+i);
		System.out.println("long default val"+l);
		System.out.println("double default val"+d);
		System.out.println("float default val"+f);
		System.out.println("charcter default val"+c);
		System.out.println("boolean default val"+bl);
		
	}
	
}


public class DataTypeTest {
	
	public static void main(String[] args) {
		Test t= new Test();
		t.show();
		
	}

}
