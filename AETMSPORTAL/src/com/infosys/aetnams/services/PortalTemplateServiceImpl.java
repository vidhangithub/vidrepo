package com.infosys.aetnams.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.infosys.aetnams.daos.PortalTemplateDAO;

public class PortalTemplateServiceImpl implements PortalTemplateService {
	
	private PortalTemplateDAO portalDAO;
	
	private ModelAndView mav = null;
	
	public void setportalDAO(PortalTemplateDAO portalDAO) {
		this.portalDAO = portalDAO;
	}


	@Override
	public ModelAndView getEmployeeDetails(HttpServletRequest req,
			HttpServletResponse res) {
		mav = portalDAO.getEmployeeDetails(req, res);
		return mav;
		
	}

}
