package com.vidhan.variousvalinjctn;

public class VidhanCompeleteCustomerInfo {

	private VidhanDependent viddepone;
	private VidhanDependentTwo viddeptwo;
	public VidhanDependent getViddepone() {
		return viddepone;
	}
	public void setViddepone(VidhanDependent viddepone) {
		this.viddepone = viddepone;
	}
	public VidhanDependentTwo getViddeptwo() {
		return viddeptwo;
	}
	public void setViddeptwo(VidhanDependentTwo viddeptwo) {
		this.viddeptwo = viddeptwo;
	}
	
	public void showFullCustomerInfo()
	{
		viddepone.showCustomerDetails();
		viddeptwo.showCstomerGeoDetails();
		
	}
	
}
