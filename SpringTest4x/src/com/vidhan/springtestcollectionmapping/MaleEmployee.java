package com.vidhan.springtestcollectionmapping;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class MaleEmployee implements EmployeeOperations{
	
	private int employeeID;
	private String employeeName;
	private List<Address> addresses;
	private Set<String> technologies;
	private Map<Integer, String> lastAvailbleCRRS;
	
	
	
	public int getEmployeeID() {
		return employeeID;
	}



	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}



	public String getEmployeeName() {
		return employeeName;
	}



	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	public List<Address> getAddresses() {
		return addresses;
	}



	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}



	public Set<String> getTechnologies() {
		return technologies;
	}



	public void setTechnologies(Set<String> technologies) {
		this.technologies = technologies;
	}



	public Map<Integer, String> getLastAvailbleCRRS() {
		return lastAvailbleCRRS;
	}



	public void setLastAvailbleCRRS(Map<Integer, String> lastAvailbleCRRS) {
		this.lastAvailbleCRRS = lastAvailbleCRRS;
	}



	@Override
	public void getEmpoyeeDetails() {
		System.out.println(employeeID);
		System.out.println(employeeName);
		System.out.println(addresses);
		System.out.println(technologies);
		System.out.println(lastAvailbleCRRS);
		
	}

}
