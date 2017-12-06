package com.vidhan.variousvalinjctn;

public class CustomerDependents {
	
	private String dependentName;
	private int dependentAge;
	public String getDependentName() {
		return dependentName;
	}
	public void setDependentName(String dependentName) {
		this.dependentName = dependentName;
	}
	public int getDependentAge() {
		return dependentAge;
	}
	public void setDependentAge(int dependentAge) {
		this.dependentAge = dependentAge;
	}

	@Override
	public String toString() {
	
		return "Dependent name is ::-"+dependentName+"\t" +"Dependent Age is::-"+dependentAge;
	}

}
