package com.vidhan.springtestcollectionmapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vidhanTeam")
public class VidhanTeam {
	
	@Autowired
	private EmployeeOperations empOperations;
	
	public void showEmployee()
	{
		empOperations.getEmpoyeeDetails();
	}

}
