package com.infosys.aetnams.utils;

import java.util.Calendar;
import java.util.Date;

public class DatePicking {
	public  static Date getDate(int day, int weekNo, int month, int year) {
	    Calendar cal = Calendar.getInstance();
	    cal.set(Calendar.DATE,1);
	    cal.set(Calendar.YEAR, year);
	    cal.set(Calendar.MONTH, month);
	    int MaxDay = cal.getActualMaximum(cal.DAY_OF_MONTH);
	    for (int i = 0; i < MaxDay; i++) {
	        if (cal.get(Calendar.WEEK_OF_MONTH) == weekNo
	                && cal.get(Calendar.DAY_OF_WEEK) == day) {
	            return cal.getTime();
	        }
	        cal.add(Calendar.DATE,1);
	    }
	    return null;
	  }

}
