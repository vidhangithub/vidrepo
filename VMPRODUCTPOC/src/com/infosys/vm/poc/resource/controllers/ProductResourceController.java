package com.infosys.vm.poc.resource.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.vm.poc.bean.Product;
import com.infosys.vm.poc.service.ProductServiceImpl;

@RestController
public class ProductResourceController {
	ProductServiceImpl prdSrvc = new ProductServiceImpl();
	
	 @RequestMapping("/")
	    public String welcome() {//Welcome page, non-rest
		 System.out.println("Just Test Welcome::::");
	        return "Welcome to RestTemplate Example.";
	    }
	
	@RequestMapping("/products")
	public List<Product> getAllProducts(@Context HttpServletRequest request)
	{
		System.out.println("In ProductResource getAllProducts:::");
		System.out.println("Client Ip address::"+request.getRemoteAddr());
		System.out.println("Client Remote user name::"+request.getRemoteUser());
		System.out.println("Client Host name::"+request.getRemoteHost());
		
		return prdSrvc.getAllProducts();
	}

}
