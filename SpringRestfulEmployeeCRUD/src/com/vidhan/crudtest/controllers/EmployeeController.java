package com.vidhan.crudtest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.vidhan.crudtest.pojos.Employee;
import com.vidhan.crudtest.services.EmployeeService;


@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@RequestMapping(value = "/employee/", method = RequestMethod.POST)
	public ResponseEntity<Void> createEmployee(@RequestBody Employee employee, UriComponentsBuilder ucBuilder)
	{   
		System.out.println("Inside Employee Controller --Trying to save Employee");
		empService.saveEmployee(employee);
		System.out.println("Employee Saved Successfully:::");
		HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/employee/{id}").buildAndExpand(employee.getEmployeeID()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

}
