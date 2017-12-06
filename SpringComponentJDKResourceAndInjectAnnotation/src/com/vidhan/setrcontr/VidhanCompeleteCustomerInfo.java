package com.vidhan.setrcontr;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

  @Named("vidcmpltinfo")
/*@Component("vidcmpltinfo")*/
public class VidhanCompeleteCustomerInfo {

	@Qualifier(value="viddeponeDUPLCT")
	/*@Autowired*/
	/*@Inject*/
	@Resource
	private VidhanDependent viddepone;
	
	/*@Autowired*/
/*	@Inject*/
	@Resource
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
