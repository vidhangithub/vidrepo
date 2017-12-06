package com.vidhan.setrcontr;

public class VidhanDependent {

	private String custname;
	private int custage;
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public int getCustage() {
		return custage;
	}
	public void setCustage(int custage) {
		this.custage = custage;
	}
	
	public void showCustomerDetails()
	{
		System.out.println("Customer Name is :_ "+custname);
		System.out.println("Customer Age is :_ "+custage);
	}
}
