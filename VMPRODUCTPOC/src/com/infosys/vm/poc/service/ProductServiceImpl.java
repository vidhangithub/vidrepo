package com.infosys.vm.poc.service;

import java.util.ArrayList;
import java.util.List;

import com.infosys.vm.poc.bean.Product;

public class ProductServiceImpl {
	
	public ProductServiceImpl() {

	}

	public List<Product> getAllProducts()
	{
		Product product1 = new Product("VM01", "testProduct561", 20, true,15,true,1);
		Product product2 = new Product("VM02", "testProduct551", 202, true,155,false,1);
		Product product3 = new Product("VM03", "testProduct122", 2077, true,1555,true,1);
		Product product4 = new Product("VM04", "testProduct152", 270, false,155,false,1);
		Product product5 = new Product("VM05", "testProduct142", 1120, true,1005,true,1);
		Product product6 = new Product("VM06", "testProduct421", 4120, true,3915,true,1);
		
		Product product7 = new Product("VM07", "testProduct4241", 1120, true,915,false,2);
		Product product8 = new Product("VM08", "testProduct1424", 4120, true,3315,true,2);
		Product product9 = new Product("VM09", "testProduct4241", 2140, false,1915,false,2);
		Product product10 = new Product("VM10", "testProduct142", 240, true,235,true,2);
		Product product11 = new Product("VM11", "testProduct111", 210, true,159,true,2);
		Product product12 = new Product("VM12", "testProduct551", 2110, true,1556,false,2);
		
		
		Product product13 = new Product("VM13", "testProduct144", 8720, true,7915,true,3);
		Product product14 = new Product("VM14", "testProduct1242", 520, true,415,false,3);
		Product product15 = new Product("VM15", "testProduct4241", 620, true,515,true,3);
		Product product16 = new Product("VM16", "testProduct142", 208, true,159,true,3);
		Product product17 = new Product("VM17", "testProduct14242", 280, false,215,false,3);
		Product product18 = new Product("VM18", "testProduct1424", 720, false,615,false,3);
		
		
		Product product19 = new Product("VM19", "testProduct42741", 720, false,615,false,1);
		Product product20 = new Product("VM20", "testProduct144", 920, true,915,true,1);
		Product product21 = new Product("VM21", "testProduct441", 250, true,215,true,1);
		Product product22 = new Product("VM22", "testProduct1424", 280, true,215,false,1);
		Product product23 = new Product("VM23", "testProduct185", 270, true,215,true,1);
		Product product24 = new Product("VM24", "testProduct521", 250, true,215,true,1);
		
		
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
		prdctlist.add(product24);
		
		return prdctlist;
	}
	
	
	
}
