package com.infosys.aetnams.daos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface ShiftDisplayDAO {

	

	//pritam-------------start-------------
	public ModelAndView getShiftDetails(HttpServletRequest req,HttpServletResponse res) ;
	//pritam-----------end-----------------
}
