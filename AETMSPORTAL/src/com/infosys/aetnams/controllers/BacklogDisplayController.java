package com.infosys.aetnams.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.infosys.aetnams.services.BacklogService;
import com.infosys.aetnams.services.PortalTemplateService;

@Controller
public class BacklogDisplayController {
	private Log log = LogFactory.getLog(PortalTemplateController.class);
	@Autowired
	private BacklogService backlogService;
	ModelAndView mav= null;
	
	@RequestMapping("/backlogcheck_sdg1.infy")
	public ModelAndView getEmployeeDetailsSDG1(HttpServletRequest req,HttpServletResponse res)
	{
		
		mav = backlogService.getBacklogDetailsSDG1(req, res);
		return mav;
	}
	
	@RequestMapping("/backlogcheck_sdg2.infy")
	public ModelAndView getEmployeeDetailsSDG2(HttpServletRequest req,HttpServletResponse res)
	{
		
		mav = backlogService.getBacklogDetailsSDG2(req, res);
		return mav;
	}
	
	@RequestMapping("/backlogcheck_sdg3.infy")
	public ModelAndView getEmployeeDetailsSDG3(HttpServletRequest req,HttpServletResponse res)
	{
		
		mav = backlogService.getBacklogDetailsSDG3(req, res);
		return mav;
	}
	
	@RequestMapping("/backlogcheck_sdg4.infy")
	public ModelAndView getEmployeeDetailsSDG4(HttpServletRequest req,HttpServletResponse res)
	{
		
		mav = backlogService.getBacklogDetailsSDG4(req, res);
		return mav;
	}
	
	
	@RequestMapping("/backlogcheck_sdg5.infy")
	public ModelAndView getEmployeeDetailsSDG5(HttpServletRequest req,HttpServletResponse res)
	{
		
		mav = backlogService.getBacklogDetailsSDG5(req, res);
		return mav;
	}
	


	
}
