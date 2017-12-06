package com.infosys.aetnams.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.infosys.aetnams.daos.ApplicationDisplayDAO;

public class ApplicationDisplayServiceImpl implements ApplicationDisplayService {
    private ApplicationDisplayDAO applicationDAO;
	
	private ModelAndView mav = null;

	
	public void setApplicationDAO(ApplicationDisplayDAO applicationDAO) {
		this.applicationDAO = applicationDAO;
	}

	
	
	@Override
	public ModelAndView getApplicationDetails1(HttpServletRequest req,
			HttpServletResponse res) {
		mav = applicationDAO.getApplicationDetails1(req, res);
		return mav;
	}
	
	@Override
	public ModelAndView getApplicationDetails2(HttpServletRequest req,
			HttpServletResponse res) {
		mav = applicationDAO.getApplicationDetails2(req, res);
		return mav;
	}
	
	@Override
	public ModelAndView getApplicationDetails3(HttpServletRequest req,
			HttpServletResponse res) {
		mav = applicationDAO.getApplicationDetails3(req, res);
		return mav;
	}
	
	@Override
	public ModelAndView getApplicationDetails4(HttpServletRequest req,
			HttpServletResponse res) {
		mav = applicationDAO.getApplicationDetails4(req, res);
		return mav;
	}
	
	
	@Override
	public ModelAndView getApplicationDetails5(HttpServletRequest req,
			HttpServletResponse res) {
		mav = applicationDAO.getApplicationDetails5(req, res);
		return mav;
	}
	
}
