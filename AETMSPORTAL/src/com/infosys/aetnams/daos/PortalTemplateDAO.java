package com.infosys.aetnams.daos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface PortalTemplateDAO {
	
	public ModelAndView getEmployeeDetails(HttpServletRequest req,HttpServletResponse res) ;

}
