package com.infosys.aetnams.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.infosys.aetnams.services.SRDisplayService;

@Controller
public class SRDisplayController {
ModelAndView mav= null;
	
@Autowired
private SRDisplayService srDisplayService;


@RequestMapping("/srd5.infy")
public ModelAndView getApplicationDetails5(HttpServletRequest req,HttpServletResponse res)
{
	
	mav = srDisplayService.getSrDetails5(req, res);
	return mav;
}

@RequestMapping("/calcSRE5.infy")
public ModelAndView getSRETotal5(HttpServletRequest req,HttpServletResponse res)
{
	
	mav = srDisplayService.getSRETotal5(req, res);
	return mav;
}


@RequestMapping("/srd1.infy")
public ModelAndView getApplicationDetails1(HttpServletRequest req,HttpServletResponse res)
{
	
	mav = srDisplayService.getSrDetails1(req, res);
	return mav;
}

@RequestMapping("/calcSRE1.infy")
public ModelAndView getSRETotal1(HttpServletRequest req,HttpServletResponse res)
{
	
	mav = srDisplayService.getSRETotal1(req, res);
	return mav;
}

@RequestMapping("/srd2.infy")
public ModelAndView getApplicationDetails2(HttpServletRequest req,HttpServletResponse res)
{
	
	mav = srDisplayService.getSrDetails2(req, res);
	return mav;
}

@RequestMapping("/calcSRE2.infy")
public ModelAndView getSRETotal2(HttpServletRequest req,HttpServletResponse res)
{
	
	mav = srDisplayService.getSRETotal2(req, res);
	return mav;
}

@RequestMapping("/srd3.infy")
public ModelAndView getApplicationDetails3(HttpServletRequest req,HttpServletResponse res)
{
	
	mav = srDisplayService.getSrDetails3(req, res);
	return mav;
}

@RequestMapping("/calcSRE3.infy")
public ModelAndView getSRETotal3(HttpServletRequest req,HttpServletResponse res)
{
	
	mav = srDisplayService.getSRETotal3(req, res);
	return mav;
}

@RequestMapping("/srd4.infy")
public ModelAndView getApplicationDetails4(HttpServletRequest req,HttpServletResponse res)
{
	
	mav = srDisplayService.getSrDetails4(req, res);
	return mav;
}

@RequestMapping("/calcSRE4.infy")
public ModelAndView getSRETotal4(HttpServletRequest req,HttpServletResponse res)
{
	
	mav = srDisplayService.getSRETotal4(req, res);
	return mav;
}

}