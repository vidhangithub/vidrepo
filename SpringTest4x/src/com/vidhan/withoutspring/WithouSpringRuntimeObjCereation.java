package com.vidhan.withoutspring;

public class WithouSpringRuntimeObjCereation {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		/*TestInterface testintrfc = new Test();*/
		
		TestInterface testintrfc = (Test)Class.forName(args[0]).newInstance();
		testintrfc.testme();		

	}

}
