package com.vidhan.usermange.pojo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.internal.txw2.annotation.XmlElement;


@XmlRootElement
public class MyUser implements Serializable {
	
	
	private static final long serialVersionUID = 4121749179786947511L;
	private int userId;
	private String userName;
	private String role;
	public MyUser() {}
	public MyUser(int userId, String userName, String role) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.role = role;
	}
	public int getUserId() {
		return userId;
	}
	@XmlElement
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	@XmlElement
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRole() {
		return role;
	}
	@XmlElement
	public void setRole(String role) {
		this.role = role;
	}
	
	

}
