package com.vidhan.propertyreadusingexprsn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("databaseConUtil")
public class DatabaseConnectionUtil {

	/*@Autowired*/
	private static  String dbUrl;

	/*@Autowired*/
	private static String dbUserName;

	/*@Autowired*/
	private static String dbPassword;
	
	public String getDbUrl() {
		return dbUrl;
	}
	@Value("${db.url}")
	public void setDbUrl(String dbUrl) {
		DatabaseConnectionUtil.dbUrl = dbUrl;
	}
	public String getDbUserName() {
		return dbUserName;
	}
	@Value("${db.username}")
	public void setDbUserName(String dbUserName) {
		DatabaseConnectionUtil.dbUserName = dbUserName;
	}
	
	public  String getDbPassword() {
		return dbPassword;
	}
	@Value("${db.password}")
	public void setDbPassword(String dbPassword) {
		DatabaseConnectionUtil.dbPassword = dbPassword;
	}

	
	
	
	
}
