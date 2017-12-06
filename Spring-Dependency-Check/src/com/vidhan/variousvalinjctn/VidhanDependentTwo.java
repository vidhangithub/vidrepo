package com.vidhan.variousvalinjctn;

public class VidhanDependentTwo {

	private String custAddress;
	private int custCountryCode;
	public VidhanDependentTwo(String custAddress, int custCountryCode) {
		super();
		this.custAddress = custAddress;
		this.custCountryCode = custCountryCode;
	}
	
	public void showCstomerGeoDetails()
	{
		System.out.println("Customer Address is :-" +custAddress);
		System.out.println("Customer Contry code is :-" +custCountryCode);
	}
}
