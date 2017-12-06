package com.infosys.aetnams.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.infosys.aetnams.services.ApplicationDisplayService;

@Controller
public class ApplicationDisplayController {
	
	ModelAndView mav= null;
	
	@Autowired
	private ApplicationDisplayService applicationService;
	
	
	
	
	@RequestMapping("/appl1.infy")
	public ModelAndView getApplicationDetails1(HttpServletRequest req,HttpServletResponse res)
	{
		
		
		mav = applicationService.getApplicationDetails1(req, res);
		return mav;
	}
	
	@RequestMapping("/appl2.infy")
	public ModelAndView getApplicationDetails2(HttpServletRequest req,HttpServletResponse res)
	{
		
		
		mav = applicationService.getApplicationDetails2(req, res);
		return mav;
	}
	
	@RequestMapping("/appl3.infy")
	public ModelAndView getApplicationDetails3(HttpServletRequest req,HttpServletResponse res)
	{
		
		
		mav = applicationService.getApplicationDetails3(req, res);
		return mav;
	}
	
	@RequestMapping("/appl4.infy")
	public ModelAndView getApplicationDetails4(HttpServletRequest req,HttpServletResponse res)
	{
		
		
		mav = applicationService.getApplicationDetails4(req, res);
		return mav;
	}
	
	@RequestMapping("/appl5.infy")
	public ModelAndView getApplicationDetails5(HttpServletRequest req,HttpServletResponse res)
	{
		
		
		mav = applicationService.getApplicationDetails5(req, res);
		return mav;
	}
}
