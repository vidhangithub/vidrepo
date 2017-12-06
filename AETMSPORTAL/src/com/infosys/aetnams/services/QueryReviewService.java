package com.infosys.aetnams.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;



/**
 * @author sampad_chakraborty
 *
 */
public interface QueryReviewService {

	ModelAndView queryReviewLoginForSubmitter(HttpServletRequest req,
			HttpServletResponse res);

	ModelAndView queryReviewLoginForApprover(HttpServletRequest req,
			HttpServletResponse res);

	ModelAndView checkQuery(HttpServletRequest req, HttpServletResponse res);

	ModelAndView dashBoardForSubmitter(HttpServletRequest req,
			HttpServletResponse res);

	ModelAndView submitQuery(HttpServletRequest req, HttpServletResponse res);

	ModelAndView dashBoardForApprover(HttpServletRequest req,
			HttpServletResponse res);

}
