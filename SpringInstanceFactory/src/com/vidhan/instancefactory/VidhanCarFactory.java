package com.vidhan.instancefactory;

public class VidhanCarFactory {
	
	private String carName;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	public VidhanCars getCars() throws Exception
	{
		return (VidhanCars) Class.forName(carName).newInstance();
	}
	
}
