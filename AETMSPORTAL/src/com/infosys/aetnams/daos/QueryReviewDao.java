package com.infosys.aetnams.daos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;



/**
 * @author sampad_chakraborty
 *
 */
public interface QueryReviewDao {

	ModelAndView queryReviewLoginForSubmitter(HttpServletRequest req,
			HttpServletResponse res);

	ModelAndView queryReviewLoginForApprover(HttpServletRequest req,
			HttpServletResponse res);

	ModelAndView dashBoardForSubmitter(HttpServletRequest req,
			HttpServletResponse res);

	ModelAndView submitQuery(HttpServletRequest req, HttpServletResponse res);

	ModelAndView dashBoardForApprover(HttpServletRequest req,
			HttpServletResponse res);

}
