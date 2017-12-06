package com.vidhan.variousvalinjctn;

public class OrderHistory {

	private int orderID;
	private String orderDescription;
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public String getOrderDescription() {
		return orderDescription;
	}
	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}
	
	
	@Override
	public String toString() {
	
		return "Order ID is ::-"+orderID+"\t" +"Product which was ordered::-"+orderDescription;
	}
	
}
