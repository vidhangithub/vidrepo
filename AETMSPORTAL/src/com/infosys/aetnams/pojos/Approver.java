package com.infosys.aetnams.pojos;

/**
 * @author sampad_chakraborty
 *
 */
public class Approver {

	private String firstName;
	private String lastName;
	private String approverNID;
	private String login_Id;
	private String password;
	
	
	
	//getter setter
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLogin_Id() {
		return login_Id;
	}
	public void setLogin_Id(String login_Id) {
		this.login_Id = login_Id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getApproverNID() {
		return approverNID;
	}
	public void setApproverNID(String approverNID) {
		this.approverNID = approverNID;
	}
	
	

}
