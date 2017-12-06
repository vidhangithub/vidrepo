package com.vidhan.myrestful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/vidhanrest")
public class MyRestfulService {
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHelloToText()
	
	{
		return "Hello Vidhan how are you"; 
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHelloToXML()
	
	{
		return "<?xml version=\"1.0\"?>" + "<hello> Hello Vidhan how are you" + "</hello>"; 
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloToHTML()
	
	{
		return "<html> " + "<title>" + "Hello Vidhan how are you" + "</title>"  
		        + "<body><h1>" + "Hope you are doing good" + "</h1></body>" + "</html> ";  
	}

}
