package com.vidhan.staticfactory;

public class VidhanCarFactory {

	private static String carname;

	public static void setCarname(String carname) {
		VidhanCarFactory.carname = carname;
	}
	
	public static VidhanCars getCars() throws Exception
	{
		return (VidhanCars) Class.forName(carname).newInstance();
	}
}
