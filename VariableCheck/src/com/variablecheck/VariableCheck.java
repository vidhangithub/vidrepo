package com.variablecheck;
class A
{
	static void m1()
	{
		System.out.println("i am A-m1()");
	}
}

class B extends A
{ 
	static boolean b= false;
	static void m1()
	{
		System.out.println("i am B-m1()");
		StringBuilder s1= new StringBuilder("rahul");//used for single thread bcz it's by default not synchrozied
		StringBuffer sb= new StringBuffer("kumar");//used for mutilple thread bcz it's by default synchronized
		System.out.println(sb.append(b));
		System.out.println(s1.append(b));
		
	}
	
	
		
}



/*class Test
{ static int a;
  static int b;
  volatile int v;
  int c;
  int d;
  int e;
  transient int t;*/
 
/*  Test( int l,int m)
  {
    l=c;
    m=d;
	  c=l;
	  d=m;
    System.out.println(l);
    System.out.println(m);
    System.out.println(c);
    System.out.println(d);
  }
  
  Test(int c,int d,int e) 
   {
	 this.c=c;
	 this.d=d;
	 this.e=e;
	 
	 

   }*/
  
//}
public class VariableCheck {
 
	
	
	public static void main(String[] args) {
		/*Test t=null;
		
		Test t= new Test(10,20);
		Test t1=new Test(30,40,50);
		System.out.println(Test.a);
		System.out.println(Test.b);
		System.out.println(t.v);*/
        A a= new B();// due to static keyword
        a.m1();
        B b= new B();
        b.m1();
		
		
	}

}
