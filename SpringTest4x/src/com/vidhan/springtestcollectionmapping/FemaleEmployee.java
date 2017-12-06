package com.vidhan.springtestcollectionmapping;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class FemaleEmployee implements EmployeeOperations{
	
	private int employeeID;
	private String employeeName;
	private List<Address> addresses;
	private Set<String> technologies;
	private Map<Integer, String> lastAvailbleCRRS;
	
	
	public FemaleEmployee(int employeeID, String employeeName,
			List<Address> addresses, Set<String> technologies,
			Map<Integer, String> lastAvailbleCRRS) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.addresses = addresses;
		this.technologies = technologies;
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
