package com.vidhan.staticfactoryfactorybean;

import org.springframework.beans.factory.FactoryBean;

public class VidhanCarFactory implements FactoryBean<VidhanCars>{
	private String carName; 

	public void setCarName(String carName) {
		this.carName = carName;
	}

	@Override
	public VidhanCars getObject() throws Exception {
		
		return  (VidhanCars) Class.forName(carName).newInstance();
	}

	@Override
	public Class<VidhanCars> getObjectType() {
		
		return VidhanCars.class;
	}

	@Override
	public boolean isSingleton() {
		
		return true;
	}

}
