package com.infosys.vm.poc.resource;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.infosys.vm.poc.bean.Product;
import com.infosys.vm.poc.service.ProductService;

@Path("/products")
@Consumes(MediaType.APPLICATION_JSON)
@Produces( {MediaType.APPLICATION_JSON , MediaType.APPLICATION_XML})
public class ProductResource {
	
	ProductService prdSrvc = new ProductService();
	
	@GET
	public List<Product> getAllProducts(@Context HttpServletRequest request)
	{
		System.out.println("In ProductResource getAllProducts:::");
		System.out.println("Client Ip address::"+request.getRemoteAddr());
		System.out.println("Client Remote user name::"+request.getRemoteUser());
		System.out.println("Client Host name::"+request.getRemoteHost());
		
		return prdSrvc.getAllProducts();
	}
	
	
	@GET
	@Path("/{productID}")
	public Product getProductByID(@PathParam("productID") long productId )
	{  System.out.println("In ProductResource getProductByID:::");
		Product product = prdSrvc.getMessage(productId);
		return product;
	}
	
	@POST
	public Product addProduct(Product product)
	{
		System.out.println("In ProductResource addProduct:::");
		return prdSrvc.addProduct(product);
	}

	@PUT
	@Path("/{productID}")
	public Product updateProduct(@PathParam("productID") long prdctID , Product product)
	{
		System.out.println("In ProductResource updateProduct:::");
		product.setProductId(prdctID);
		return prdSrvc.updateProduct(product);
	}
	
	@DELETE
	@Path("/{productID}")
	public void deleteProduct(@PathParam("productID") long prductID)
	{
		System.out.println("In ProductResource deleteProduct:::");
		prdSrvc.removeProduct(prductID);
	}
	
}
