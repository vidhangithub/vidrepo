package com.infosys.aetnams.utils;

import java.util.Calendar;
import java.util.Date;

public class NoOfMonday {
	public  static int  getNoOfMondays(int m, int y) {
		
		
		 Calendar calendar = Calendar.getInstance();
	     int  month = m; 
	 int year = y;
	 int date = 1 ;

	     calendar.set(year, month, date);

	 int MaxDay = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
	 int mon=0;

	     for(int i = 1 ; i < MaxDay ; i++)
	 {        
	     calendar.set(Calendar.DAY_OF_MONTH, i);
	         if (calendar.get(Calendar.DAY_OF_WEEK) == calendar.MONDAY ) 
	                 mon++;      
	 }

	return mon;	
	}
	
	
}
