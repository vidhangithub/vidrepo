package com.infosys.aetnams.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface ApplicationDisplayService {


	
	public ModelAndView getApplicationDetails1(HttpServletRequest req,HttpServletResponse res) ;
	public ModelAndView getApplicationDetails2(HttpServletRequest req,HttpServletResponse res) ;
	public ModelAndView getApplicationDetails3(HttpServletRequest req,HttpServletResponse res) ;
	public ModelAndView getApplicationDetails4(HttpServletRequest req,HttpServletResponse res) ;
	public ModelAndView getApplicationDetails5(HttpServletRequest req,HttpServletResponse res) ;
	
}
