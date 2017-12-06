package com.vidhan.creational;

import java.io.PrintStream;

interface VendorPayement
{
	void payment();
}

class IndividualVendor implements VendorPayement
{

	@Override
	public void payment() {
		System.out.println("Payment method of IndividualVendor::");
		PrintStream vidhan = System.out;
		vidhan.println("Just To test Syso::");
		
	}
	
}

class SmallMarketVendor implements VendorPayement{

	@Override
	public void payment() {
		System.out.println("Payment method of SmallMarketVendor::");
		
	}
	
}

class MiddleMarketVendor implements VendorPayement{

	@Override
	public void payment() {
		System.out.println("Payment method of MiddleMarketVendor::");
		
	}
	
}

class NationalAccountVendor implements VendorPayement{

	@Override
	public void payment() {
		System.out.println("Payment method of NationalAccountVendor::");
		
	}
	
}

class VendorPaymentFactory {
	
	VendorPayement vendorpayment = null;
	public VendorPayement getInstance(int numberOfenrolledPerson){
		
		 if (numberOfenrolledPerson == 0 )
		  {
			 
			  return null;
		  }
			
	  if (numberOfenrolledPerson == 1 )
	  {
		  vendorpayment = new IndividualVendor();
		  return vendorpayment;
	  }
		
	  if (numberOfenrolledPerson > 1 && numberOfenrolledPerson <= 500)
	  {
		  vendorpayment = new SmallMarketVendor();
		  return vendorpayment;
	  }
	  if (numberOfenrolledPerson > 500 && numberOfenrolledPerson <= 10000 )
	  {
		  vendorpayment = new MiddleMarketVendor();
		  return vendorpayment;
	  }
	  if (numberOfenrolledPerson > 10000 )
	  {
		  vendorpayment = new NationalAccountVendor();
		  return vendorpayment;
	  }
		return null;
		
	}
}

public class FactoryDesignPattern {

	public static void main(String[] args) {
		
		VendorPaymentFactory vfactory = new VendorPaymentFactory();
		
		VendorPayement individual = vfactory.getInstance(1);
		individual.payment();
	}

}
