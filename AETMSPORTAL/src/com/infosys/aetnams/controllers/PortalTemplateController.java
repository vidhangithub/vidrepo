package com.infosys.aetnams.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.infosys.aetnams.constants.PortalConstant;
import com.infosys.aetnams.services.PortalTemplateService;

@Controller
public class PortalTemplateController {
	
	private Log log = LogFactory.getLog(PortalTemplateController.class);
	HttpSession session =null;
	@Autowired
	private PortalTemplateService portalService;
	
	ModelAndView mav= null;
	
	@RequestMapping(value="/index.infy")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/funMS.infy")
	public String funDetail() {
		return "funActivity";
	}
	
	@RequestMapping(value="/srDetail.infy")
	public String srDetail() {
		return "srDetail";
	}
	
	@RequestMapping("/contact.infy")
	public String redirect()
	{
		return "contact";
	}
	@RequestMapping("/login.infy")
	public ModelAndView adminlogin( HttpServletRequest req, HttpServletResponse res)
	{
		ModelAndView mav = null;
		session = req.getSession();
	   String userName=(String)session.getAttribute("INFYID");
	    if (userName==null) {
	    	mav = new ModelAndView("login");
	    	return mav;
		}
	    else 
	    {
	    	mav = new ModelAndView("adminDataUpload", "SCSMSG", PortalConstant.ALREADYLOGGEDIN);
	    	return mav;
	    }
		
	}
	@RequestMapping("/calcPrdctivty.infy")
	public String calCulateProductivity()
	{
		return "productivityCalculation";
	}
	@RequestMapping("/queryReview.infy")
	public String queryReviewRedirect()
	{
		return "queryReview";
	}
	
	@RequestMapping("/check.infy")
	public ModelAndView getEmployeeDetails(HttpServletRequest req,HttpServletResponse res)
	{
		
		
		mav = portalService.getEmployeeDetails(req, res);
		return mav;
	}

}
