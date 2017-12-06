package com.vidhan.crudtest.pojos;

public class Employee {

	private long employeeID;
	private String employeeName;
	private String role;
	private int salary;
	private int phoneNo;
	private boolean snrctznFLAG ;
	public Employee(long employeeID, String employeeName, String role,
			int salary, int phoneNo, boolean snrctznFLAG) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.role = role;
		this.salary = salary;
		this.phoneNo = phoneNo;
		this.snrctznFLAG = snrctznFLAG;
	}

	public long getEmployeeID() {
		return employeeID;
	}
	
	
	
	
	



	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public boolean isSnrctznFLAG() {
		return snrctznFLAG;
	}
	public void setSnrctznFLAG(boolean snrctznFLAG) {
		this.snrctznFLAG = snrctznFLAG;
	}
	
	
}
