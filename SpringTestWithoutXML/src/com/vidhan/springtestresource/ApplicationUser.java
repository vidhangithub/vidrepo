package com.vidhan.springtestresource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("applicationUser")
public class ApplicationUser {

	@Value("vidhan Chandra")
	private String appUserName;

	public String getAppUserName() {
		return appUserName;
	}

	public void setAppUserName(String appUserName) {
		this.appUserName = appUserName;
	}
	
	
}
