package com.infosys.aetnams.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface PortalTemplateService {
	
	public ModelAndView getEmployeeDetails(HttpServletRequest req,HttpServletResponse res) ;

}
