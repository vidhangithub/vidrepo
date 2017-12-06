package com.varargs;
public class VarArgsCheck {

public static void main(String[] args) {
	
	VarArgSample vr= new VarArgSample();
	//vr.myMethod();
	//vr.myMethod(10,20);
	//vr.myMethod(10,20,30,40,50);
	vr.myMethod(19,18,17,16,15,14,13,12,11);
	vr.myMethod(10, 10, 10);
}	
	

}
