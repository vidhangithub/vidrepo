package com.infosys.aetnams.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.infosys.aetnams.services.ShiftDisplayService;

@Controller
public class ShiftDisplayController {
	
	
	ModelAndView mav= null;
	
	@Autowired
	private ShiftDisplayService shiftDisplayService;
	
	
	@RequestMapping("/shiftTracker.infy")
	public ModelAndView manageEmployeeShift(HttpServletRequest req,HttpServletResponse res)
	{
		mav = shiftDisplayService.getShiftDetails(req, res);
		return mav;
	}
}
