package com.autoboxingandunboxing;

import java.util.ArrayList;
import java.util.Iterator;
public class BoxingUnBoxingCheck {
public static void main(String[] args) {
	
	System.out.println("*********with jdk1.4******");
	ArrayList al= new ArrayList();
	al.add(new Integer(20));//boxing(primitive to wrapper)
	al.add(new Integer(30));//boxing(primitive to wrapper)
	Iterator it=al.iterator();
	while (it.hasNext()) {
		Integer i=(Integer)it.next();
		System.out.println(i);
		//int x=i.intValue();//unboxing(wrapper to primitive)
		//System.out.println(x);
		//System.out.println(it.next());
		
	}
	
	System.out.println("*******in jdk1.5*******");
	ArrayList<Integer> al1= new ArrayList<Integer>();
	al1.add(12);//boxing(primitive to wrapper)
	al1.add(13);//boxing(primitive to wrapper)
	
	for(int l : al1)//unboxing(wrapper to primitive)
	{
		System.out.println(l);
	}
}
}
