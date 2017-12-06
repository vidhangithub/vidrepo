package com.genericscheck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Customer implements Comparable<Customer>
{
    int cid;
    String cname;
    long phone;
    Customer()
    {
    	
    }
    
	public Customer(int cid, String cname, long phone) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.phone = phone;
	}
	public String toString()
	{
		String str="\t"+cid+"\t"+cname+"\t"+phone;
		return str;
	}

	public int compareTo(Customer c) {
		System.out.println("i am inside compareTo...");
		System.out.println("value of this.cid="+this.cid);
		System.out.println("value of c.cid="+c.cid);
		int x=this.cid-c.cid;
		System.out.println(x);
		return x;
	}
	
}

class CnameComparator implements Comparator<Customer>
{

	public int compare(Customer c1, Customer c2) {
		System.out.println("i am inside comapre...");
		System.out.println("value of c1.cname="+c1.cname);
		System.out.println("value of c2.cname="+c2.cname);
		int x=c1.cname.compareTo(c2.cname);
		System.out.println(x);
		return x;
}	
}

class PhoneComparator implements Comparator<Customer>
{

	public int compare(Customer c1, Customer c2) {
		int x=(int)(c1.phone-c2.phone);
		return x;
	}
	
}


public class ComparableVsComparator {

	
	public static void main(String[] args) {
		
		Customer c4=new Customer(115,"tuhin",845374238);
		Customer c1=new Customer(101,"vidhan",84533352);
		Customer c2=new Customer(108,"rahul",84530952);
		Customer c3=new Customer(111,"giri",845338876);
        ArrayList<Customer> al= new ArrayList<Customer>();
        al.add(c2);
        al.add(c3);
        al.add(c1);
        al.add(c4);
        
        
        System.out.println("***********Before Sorting*******");
        for (Customer c : al) {
			System.out.println(c);
		}
        System.out.println("After sorting by cid using comparable...");
        Collections.sort(al);
        for(Customer c : al)
        {
        	System.out.println(c);
        }
        
        System.out.println("*********After sorting by cname using Comparator");
        Collections.sort(al, new CnameComparator());
        for(Customer c : al)
        {
        	System.out.println(c);
        }
        
        System.out.println("*********After sorting by phone using Comparator");
        Collections.sort(al, new PhoneComparator());
        for(Customer c : al)
        {
        	System.out.println(c);
        }
        
	}

}
