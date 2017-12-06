package com.enumtest;


class A
{
	public static final int MON=0;
	public static final int TUE=1;
}
enum Days
{
	MON,TUE,WED,THU,FRI,SAT,SUN;
}
public class EnumCheck {

	
	public static void main(String[] args) {
		
      System.out.println(A.MON);
      A obj=null;
      obj=new A();
      //obj=A.MON;
      Days d=null;
      d=Days.MON;
      Days d1;
      d1=Days.WED;
      //d=new Days();
      System.out.println(d+"\t" +d.ordinal()+"\t" +d.name());
      System.out.println(Days.MON);
      System.out.println(Days.TUE);
      System.out.println(d1);
      System.out.println(d1.ordinal());
      Days d2;
      d2=Days.SUN;
      System.out.println(d2.ordinal());
}
}
