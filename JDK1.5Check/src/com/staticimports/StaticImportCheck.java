package com.staticimports;

import static com.staticimports.classes.Hello.*;
import static com.staticimports.classes.Hi.*;

import com.staticimports.classes.Hello;

public class StaticImportCheck {

	
	
	
	public static void main(String[] args) {
	//m1();//The method m1() is ambiguous for the type StaticImportCheck
    m2();
		
	}

}
