package com.vidhan.setrcontr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class VidhanCompeleteCustomerInfo {

	@Qualifier(value="viddeponeDUPLCT")
	@Autowired
	private VidhanDependent viddepone;
	@Autowired
	private VidhanDependentTwo viddeptwo;
	
	
	
/*	public VidhanCompeleteCustomerInfo(VidhanDependent viddepone, VidhanDependentTwo viddeptwo) {
		super();
		this.viddepone = viddepone;
		this.viddeptwo = viddeptwo;
	}*/
	public VidhanDependent getViddepone() {
		return viddepone;
	}
	/*public void setViddepone(VidhanDependent viddepone) {
		this.viddepone = viddepone;
	}*/
	public VidhanDependentTwo getViddeptwo() {
		return viddeptwo;
	}
	/*public void setViddeptwo(VidhanDependentTwo viddeptwo) {
		this.viddeptwo = viddeptwo;
	}
	*/
	public void showFullCustomerInfo()
	{
		viddepone.showCustomerDetails();
		viddeptwo.showCstomerGeoDetails();
		
	}
	
}
