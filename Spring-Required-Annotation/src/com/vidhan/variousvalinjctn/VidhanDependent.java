package com.vidhan.variousvalinjctn;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Required;

public class VidhanDependent {

	private String custname;
	private int custage;
	
	private List<CustomerDependents> customerDepList;
	private Map<Integer, String> phoneNumbers;
	private Set<OrderHistory> orderHistory;
	private Properties customerProperties;
	
	
	public VidhanDependent(List<CustomerDependents> customerDepList, Map<Integer, String> phoneNumbers,
			Set<OrderHistory> orderHistory, Properties customerProperties) {
		super();
		this.customerDepList = customerDepList;
		this.phoneNumbers = phoneNumbers;
		this.orderHistory = orderHistory;
		this.customerProperties = customerProperties;
	}
	
	public String getCustname() {
		return custname;
	}
	@Required
	public void setCustname(String custname) {
		this.custname = custname;
	}
	@Required
	public int getCustage() {
		return custage;
	}
	public void setCustage(int custage) {
		this.custage = custage;
	}
	
	public void showCustomerDetails()
	{
		System.out.println("Customer Name is :-"+custname);
		System.out.println("Customer Age is :-"+custage);
		for (CustomerDependents customerDependents : customerDepList) {
			System.out.println(customerDependents);
		}
		 for(Map.Entry m:phoneNumbers.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }
		 for(OrderHistory orderHstry : orderHistory){
			   System.out.println(orderHstry);
			}
		 System.out.println("Customer Height is :-"+customerProperties.getProperty("height"));
		 System.out.println("Customer Weight is :-"+customerProperties.getProperty("weight"));
		 
		 
	}
}
