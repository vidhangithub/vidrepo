package com.infosys.aetnams.daos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface BacklogDAO {
	public ModelAndView getBacklogDetailsSDG1(HttpServletRequest req,HttpServletResponse res) ;
	public ModelAndView getBacklogDetailsSDG2(HttpServletRequest req,HttpServletResponse res) ;
	public ModelAndView getBacklogDetailsSDG3(HttpServletRequest req,HttpServletResponse res) ;
	public ModelAndView getBacklogDetailsSDG4(HttpServletRequest req,HttpServletResponse res) ;
	public ModelAndView getBacklogDetailsSDG5(HttpServletRequest req,HttpServletResponse res) ;
}
