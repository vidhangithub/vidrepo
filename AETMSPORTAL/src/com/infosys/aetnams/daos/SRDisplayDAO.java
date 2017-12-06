package com.infosys.aetnams.daos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface SRDisplayDAO {

	public	ModelAndView getSrDetails5(HttpServletRequest req, HttpServletResponse res);
	public ModelAndView getSRETotal5(HttpServletRequest req,
			HttpServletResponse res);
	
	
public	ModelAndView getSrDetails1(HttpServletRequest req, HttpServletResponse res);
	
	public ModelAndView getSRETotal1(HttpServletRequest req,
			HttpServletResponse res);
	
	
	public	ModelAndView getSrDetails2(HttpServletRequest req, HttpServletResponse res);
	
	public ModelAndView getSRETotal2(HttpServletRequest req,
			HttpServletResponse res);
	
public	ModelAndView getSrDetails3(HttpServletRequest req, HttpServletResponse res);
	
	public ModelAndView getSRETotal3(HttpServletRequest req,
			HttpServletResponse res);
	
public	ModelAndView getSrDetails4(HttpServletRequest req, HttpServletResponse res);
	
	public ModelAndView getSRETotal4(HttpServletRequest req,
			HttpServletResponse res);
	
}
