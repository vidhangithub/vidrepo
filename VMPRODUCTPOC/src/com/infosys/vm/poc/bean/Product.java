package com.infosys.vm.poc.bean;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

@XmlRootElement
public class Product  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String productId;
	private String productDscrptn;
	private int productPrice; 
	private boolean productAvlblty;
	private Date productActvtnDate;
	private int offerPrice;
	private boolean offerFlag;
	private int productCategory;
	
	
	public Product() {}
	
	public Product(String productId, String productDscrptn, int productPrice, boolean productAvlblty,int offerPrice, boolean offerFlag,int productCategory) {
		super();
		this.productId = productId;
		this.productDscrptn = productDscrptn;
		this.productPrice = productPrice;
		this.productAvlblty = productAvlblty;
		this.productActvtnDate = new Date();
		this.offerPrice = offerPrice;
		this.offerFlag = offerFlag;
		this.productCategory = productCategory;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductDscrptn() {
		return productDscrptn;
	}

	public void setProductDscrptn(String productDscrptn) {
		this.productDscrptn = productDscrptn;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public boolean isProductAvlblty() {
		return productAvlblty;
	}

	public void setProductAvlblty(boolean productAvlblty) {
		this.productAvlblty = productAvlblty;
	}
	
	@JsonSerialize(using=DateSerializer.class)
	public Date getProductActvtnDate() {
		return productActvtnDate;
	}

	public void setProductActvtnDate(Date productActvtnDate) {
		this.productActvtnDate = productActvtnDate;
	}

	public int getOfferPrice() {
		return offerPrice;
	}

	public void setOfferPrice(int offerPrice) {
		this.offerPrice = offerPrice;
	}

	public boolean isOfferFlag() {
		return offerFlag;
	}

	public void setOfferFlag(boolean offerFlag) {
		this.offerFlag = offerFlag;
	}

	public int getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(int productCategory) {
		this.productCategory = productCategory;
	}
	

	
	

	
	

}
