package com.genericscheck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student
{int sid;
String sname;
long phone;
public Student(){}
public Student(int sid, String sname, long phone) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.phone = phone;
}
public String toString()
{
	return "\t"+sid+"\t"+sname+"\t"+phone;
}
}


class SnameComparator implements Comparator<Student>
{

	public int compare(Student s1, Student s2) {
		int x=s1.sname.compareTo(s2.sname);
		return x;
	}
	
}

public class OnlyComaparatorCheck {
	
	public static void main(String[] args) {
		
		Student s1= new Student(123,"vidhan",987909878);
		Student s2= new Student(197,"prabhat",987987678);
		Student s3= new Student(322,"akhilesh",987900988);
		Student s4= new Student(456,"jayant",987906348);
		ArrayList<Student> al= new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		System.out.println("********Before sorting*********");
		for(Student s : al)
		{
			System.out.println(s);
		}
		System.out.println("*********After sorting*******");
		Collections.sort(al, new SnameComparator());
		for(Student s : al)
		{
			System.out.println(s);
		}
	}

}
