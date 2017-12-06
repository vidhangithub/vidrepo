package com.vidhan.springtestresource;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("application")
public class Application {
	
	@Resource(name ="applicationUser")
	private ApplicationUser appUser;
	
	
	public String getApplicationUserName()
	{
		System.out.println(appUser.getAppUserName());
		return appUser.getAppUserName();
	}

}
