package com.vidhan.usermange.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vidhan.usermange.dao.UserDao;
import com.vidhan.usermange.pojo.MyUser;

@Path("/vidhanService")
public class VidhanUserService {
	
	UserDao userDao = new UserDao();
	
	@GET
	@Path("/getAllUser")
	@Produces(MediaType.APPLICATION_XML)
	public List<MyUser> getuser()
	{
		return userDao.getAllUsers();
	}

}
