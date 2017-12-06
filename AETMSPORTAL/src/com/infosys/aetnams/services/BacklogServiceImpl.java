package com.infosys.aetnams.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.infosys.aetnams.daos.BacklogDAO;

public class BacklogServiceImpl implements BacklogService{
	private BacklogDAO backlogDAO;
	
	private ModelAndView mav = null;
	
	public void setbacklogDAO(BacklogDAO backlogDAO) {
		this.backlogDAO = backlogDAO;
	}
	
	@Override
	public ModelAndView getBacklogDetailsSDG1(HttpServletRequest req,
			HttpServletResponse res) {
		mav = backlogDAO.getBacklogDetailsSDG1(req, res);
		return mav;
		
	}
	
	@Override
	public ModelAndView getBacklogDetailsSDG2(HttpServletRequest req,
			HttpServletResponse res) {
		mav = backlogDAO.getBacklogDetailsSDG2(req, res);
		return mav;
		
	}

	@Override
	public ModelAndView getBacklogDetailsSDG3(HttpServletRequest req,
			HttpServletResponse res) {
		mav = backlogDAO.getBacklogDetailsSDG3(req, res);
		return mav;
		
	}
	
	@Override
	public ModelAndView getBacklogDetailsSDG4(HttpServletRequest req,
			HttpServletResponse res) {
		mav = backlogDAO.getBacklogDetailsSDG4(req, res);
		return mav;
		
	}
	
	@Override
	public ModelAndView getBacklogDetailsSDG5(HttpServletRequest req,
			HttpServletResponse res) {
		mav = backlogDAO.getBacklogDetailsSDG5(req, res);
		return mav;
		
	}

}
