package com.infosys.vm.poc.constants;

import java.util.HashMap;
import java.util.Map;

import com.infosys.vm.poc.bean.Product;

public class FakeDataBase {

	private static Map<Long, Product> products = new HashMap<>();

	public static Map<Long, Product> getProducts() {
		return products;
	}

	public static void setProducts(Map<Long, Product> products) {
		FakeDataBase.products = products;
	}
	
	
	
}
