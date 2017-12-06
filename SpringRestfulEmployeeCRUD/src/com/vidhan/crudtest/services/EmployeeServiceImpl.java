package com.vidhan.crudtest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vidhan.crudtest.pojos.Employee;

@Service("empService")
@Transactional
public class EmployeeServiceImpl  implements EmployeeService{
	
	private static final AtomicLong counter = new AtomicLong();
    
    private static List<Employee> employees;
    static{
    	employees = populateDummyEmployees();
    }

	@Override
	public void saveEmployee(Employee employee) {
		System.out.println("Inside EmployeeServiceImpl:::");
		employee.setEmployeeID(counter.incrementAndGet());
		employees.add(employee);
		System.out.println("Inside EmployeeServiceImpl:::");
	}
	
	
	 private static List<Employee> populateDummyEmployees(){
	       /* List<User> users = new ArrayList<User>();
	        users.add(new User(counter.incrementAndGet(),"Sam",30, 70000));
	        users.add(new User(counter.incrementAndGet(),"Tom",40, 50000));
	        users.add(new User(counter.incrementAndGet(),"Jerome",45, 30000));
	        users.add(new User(counter.incrementAndGet(),"Silvia",50, 40000));
	        return users;*/
		 
		 List<Employee> employees = new ArrayList<Employee>();
		 employees.add(new Employee(counter.incrementAndGet(), "vidhan", "TL", 5000, 54236, false));
		 employees.add(new Employee(counter.incrementAndGet(), "vidhanA", "TLA", 5001, 54237, false));
		 employees.add(new Employee(counter.incrementAndGet(), "vidhanB", "TLB", 5002, 54238, true));
		 employees.add(new Employee(counter.incrementAndGet(), "vidhanC", "TLC", 5003, 54239, true));
		 
		 return employees;
	    }

}
