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

import com.infosys.aetnams.services.QueryReviewService;

/**
 * @author sampad_chakraborty
 * 
 */

@Controller
public class QueryReviewControler {

	@Autowired
	QueryReviewService queryReviewService;

	ModelAndView mav = null;

	private Log log = LogFactory.getLog(QueryReviewControler.class);

	private String whoIsLoggingIn;

	@RequestMapping(value = "/qrLogin.infy")
	public ModelAndView queryReviewLoginView(HttpServletRequest req,
			HttpServletResponse res) {

		mav = new ModelAndView("qrLoginView");
		return mav;

	}

	@RequestMapping(value = "/qrLoginIn.infy")
	public ModelAndView queryReviewLogin(HttpServletRequest req,
			HttpServletResponse res) {

		whoIsLoggingIn = req.getParameter("whoIsSubmitting");

		if (whoIsLoggingIn.equalsIgnoreCase("submitter")) {

			mav = queryReviewService.queryReviewLoginForSubmitter(req, res);

		} else {
			mav = queryReviewService.queryReviewLoginForApprover(req, res);
		}

		return mav;
	}
	
	
	@RequestMapping(value="/submitterLogout.infy")
	public ModelAndView adminLogout(HttpServletRequest req, HttpServletResponse res)
	{
	  HttpSession session = req.getSession();
	  if(null != session){
		  session.invalidate();
	  }
		ModelAndView mav = new ModelAndView("qrLoginView");
		return mav;
	
	}
	
	@RequestMapping(value = "/review.infy")
	public ModelAndView checkQuery(HttpServletRequest req,
			HttpServletResponse res){
		
		mav = queryReviewService.checkQuery(req,res);
		
		return mav;
	}
	
	
	@RequestMapping(value = "/submitToApprover.infy")
	public ModelAndView submitQuery(HttpServletRequest req,
			HttpServletResponse res){
		
		mav = queryReviewService.submitQuery(req,res);
		return mav;	
	}
	
	@RequestMapping(value = "/submitrDashBoard.infy")
	public ModelAndView dashBoardForSubmitter(HttpServletRequest req,
			HttpServletResponse res){
		
		mav = queryReviewService.dashBoardForSubmitter(req,res);
		return mav;	
	}
	
	@RequestMapping(value = "/approverDashBoard.infy")
	public ModelAndView dashBoardForApprover(HttpServletRequest req,
			HttpServletResponse res){
		
		mav = queryReviewService.dashBoardForApprover(req,res);
		return mav;	
	}
	
	
	// getter setter

	public String getWhoIsLoggingIn() {
		return whoIsLoggingIn;
	}

	public void setWhoIsLoggingIn(String whoIsLoggingIn) {
		this.whoIsLoggingIn = whoIsLoggingIn;
	}

}
