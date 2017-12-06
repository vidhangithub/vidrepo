package com.genericscheck;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>
{
   int empid;
   String ename;
   long phone;
   Employee(){}
   
	public Employee(int empid, String ename, long phone) {
	super();
	this.empid = empid;
	this.ename = ename;
	this.phone = phone;
}
 public String toString()
 {
	 return "\t"+empid+"\t"+ename+"\t"+phone;
 }
	public int compareTo(Employee emp) {
		int x= this.empid-emp.empid;
		return x;
	}
	
}
public class OnlyComparabale {

	
	public static void main(String[] args) {
		Employee emp1= new Employee(1234,"sidhan",98876990);
		Employee emp2= new Employee(17,"kanha",988769889);
		Employee emp3= new Employee(12,"Akhilesh",988786878);
		Employee emp4= new Employee(334,"kumar",988769668);
		
		ArrayList<Employee> al= new ArrayList<Employee>();
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		al.add(emp4);
		
		System.out.println("****before Sorting*****");
		for(Employee e : al)
		{
			System.out.println(e);
		}
		System.out.println("*********after sorting*****");
		Collections.sort(al);
		for(Object e : al)
		{
			System.out.println(e);
		}
	}

}
