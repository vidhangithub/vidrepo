package com.infosys.aetnams.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.infosys.aetnams.daos.SRDisplayDAO;

public class SRDisplayServiceImpl implements SRDisplayService {
private SRDisplayDAO srDAO;
	
	private ModelAndView mav = null;

	@Override
	public ModelAndView getSrDetails5(HttpServletRequest req,
			HttpServletResponse res) {
		mav = srDAO.getSrDetails5(req, res);
		return mav;
	}

	public SRDisplayDAO getSrDAO() {
		return srDAO;
	}
	public void setSrDAO(SRDisplayDAO srDAO) {
		this.srDAO = srDAO;
	}
	@Override
	public ModelAndView getSRETotal5(HttpServletRequest req,
			HttpServletResponse res) {
		mav = srDAO.getSRETotal5(req, res);
		return mav;
	}
	
	@Override
	public ModelAndView getSrDetails1(HttpServletRequest req,
			HttpServletResponse res) {
		mav = srDAO.getSrDetails1(req, res);
		return mav;
	}
	
	@Override
	public ModelAndView getSRETotal1(HttpServletRequest req,
			HttpServletResponse res) {
		mav = srDAO.getSRETotal1(req, res);
		return mav;
	}
	
	@Override
	public ModelAndView getSrDetails2(HttpServletRequest req,
			HttpServletResponse res) {
		mav = srDAO.getSrDetails2(req, res);
		return mav;
	}
	
	@Override
	public ModelAndView getSRETotal2(HttpServletRequest req,
			HttpServletResponse res) {
		mav = srDAO.getSRETotal2(req, res);
		return mav;
	}
	
	@Override
	public ModelAndView getSrDetails3(HttpServletRequest req,
			HttpServletResponse res) {
		mav = srDAO.getSrDetails3(req, res);
		return mav;
	}
	
	@Override
	public ModelAndView getSRETotal3(HttpServletRequest req,
			HttpServletResponse res) {
		mav = srDAO.getSRETotal3(req, res);
		return mav;
	}
	
	@Override
	public ModelAndView getSrDetails4(HttpServletRequest req,
			HttpServletResponse res) {
		mav = srDAO.getSrDetails4(req, res);
		return mav;
	}
	
	@Override
	public ModelAndView getSRETotal4(HttpServletRequest req,
			HttpServletResponse res) {
		mav = srDAO.getSRETotal4(req, res);
		return mav;
	}
}
