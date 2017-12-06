package com.infosys.vm.poc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.infosys.vm.poc.bean.Product;
import com.infosys.vm.poc.constants.FakeDataBase;

public class ProductService {
	
	private Map<Long, Product> prodcuts = FakeDataBase.getProducts();
	public ProductService() {
		prodcuts.put(1L, new Product(1, "1mbps-TV-VOIP", 20, true,15,true,1));
		prodcuts.put(2L, new Product(2, "2mbps-VOIP-Commercial", 202, true,155,false,1));
		prodcuts.put(3L, new Product(3, "6mbps-TV-Movies", 2077, true,1555,true,1));
		prodcuts.put(4L, new Product(4, "2mbps-TV-VOIP", 270, false,155,false,1));
		prodcuts.put(5L, new Product(5, "2mbps-VOIP-Non-Commercial", 1120, true,1005,true,1));
		prodcuts.put(6L, new Product(6, "1gbps-TV-VOIP-Movies-Games-Commercial", 45120, true,39015,true,1));
	}

	public List<Product> getAllProducts()
	{
		/*Product product1 = new Product(1, "testProduct561", 20, true,15,true,1);
		Product product2 = new Product(2, "testProduct551", 202, true,155,false,1);
		Product product3 = new Product(3, "testProduct122", 2077, true,1555,true,1);
		Product product4 = new Product(4, "testProduct152", 270, false,155,false,1);
		Product product5 = new Product(5, "testProduct142", 1120, true,1005,true,1);
		Product product6 = new Product(6, "testProduct421", 4120, true,3915,true,1);
		
		Product product7 = new Product(7, "testProduct4241", 1120, true,915,false,2);
		Product product8 = new Product(8, "testProduct1424", 4120, true,3315,true,2);
		Product product9 = new Product(9, "testProduct4241", 2140, false,1915,false,2);
		Product product10 = new Product(10, "testProduct142", 240, true,235,true,2);
		Product product11 = new Product(11, "testProduct111", 210, true,159,true,2);
		Product product12 = new Product(12, "testProduct551", 2110, true,1556,false,2);
		
		
		Product product13 = new Product(13, "testProduct144", 8720, true,7915,true,3);
		Product product14 = new Product(14, "testProduct1242", 520, true,415,false,3);
		Product product15 = new Product(15, "testProduct4241", 620, true,515,true,3);
		Product product16 = new Product(16, "testProduct142", 208, true,159,true,3);
		Product product17 = new Product(17, "testProduct14242", 280, false,215,false,3);
		Product product18 = new Product(18, "testProduct1424", 720, false,615,false,3);
		
		
		Product product19 = new Product(19, "testProduct42741", 720, false,615,false,1);
		Product product20 = new Product(20, "testProduct144", 920, true,915,true,1);
		Product product21 = new Product(21, "testProduct441", 250, true,215,true,1);
		Product product22 = new Product(22, "testProduct1424", 280, true,215,false,1);
		Product product23 = new Product(23, "testProduct185", 270, true,215,true,1);
		Product product24 = new Product(24, "testProduct521", 250, true,215,true,1);
		
		
		List<Product> prdctlist = new ArrayList<Product>();
		prdctlist.add(product1);
		prdctlist.add(product2);
		prdctlist.add(product3);
		prdctlist.add(product4);
		prdctlist.add(product5);
		prdctlist.add(product6);
		
		prdctlist.add(product7);
		prdctlist.add(product8);
		prdctlist.add(product9);
		prdctlist.add(product10);
		prdctlist.add(product11);
		prdctlist.add(product12);
		
		prdctlist.add(product13);
		prdctlist.add(product14);
		prdctlist.add(product15);
		prdctlist.add(product16);
		prdctlist.add(product17);
		prdctlist.add(product18);
		
		prdctlist.add(product19);
		prdctlist.add(product20);
		prdctlist.add(product21);
		prdctlist.add(product22);
		prdctlist.add(product23);
		prdctlist.add(product24);*/
		
		return new ArrayList<Product>(prodcuts.values()); 
	}
	
	public Product getMessage(long id) {
		Product product = prodcuts.get(id);
		if (product == null) {
			return null;
		}
		return product;
	}
	
	
	public Product addProduct(Product product)
	{
		product.setProductId(prodcuts.size() +1);
		prodcuts.put(product.getProductId(), product);
		return product;
	}
	
	
	
	public Product updateProduct(Product product)
	{
		if (product.getProductId() <=0 ) {
			return null;
		}
		
		prodcuts.put(product.getProductId(), product);
		return product;
	}
	
	
	public Product removeProduct(long id) {
		return prodcuts.remove(id);
	}
	
	
}
