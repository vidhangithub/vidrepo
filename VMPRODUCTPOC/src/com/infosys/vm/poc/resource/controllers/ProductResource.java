package com.infosys.vm.poc.resource.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.infosys.vm.poc.bean.Product;
import com.infosys.vm.poc.service.ProductServiceImpl;

@Path("/products")
@Consumes(MediaType.APPLICATION_JSON)
@Produces( {MediaType.APPLICATION_JSON , MediaType.APPLICATION_XML})
public class ProductResource {
	
	ProductServiceImpl prdSrvc = new ProductServiceImpl();
	
	@GET
	public List<Product> getAllProducts(@Context HttpServletRequest request)
	{
		System.out.println("In ProductResource getAllProducts:::");
		System.out.println("Client Ip address::"+request.getRemoteAddr());
		System.out.println("Client Remote user name::"+request.getRemoteUser());
		System.out.println("Client Host name::"+request.getRemoteHost());
		
		return prdSrvc.getAllProducts();
	}

}
