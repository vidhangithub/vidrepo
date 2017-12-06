package com.infosys.aetnams.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.infosys.aetnams.daos.ShiftDisplayDAO;

public class ShiftDisplayServiceImpl implements ShiftDisplayService {

	private ModelAndView mav = null;
	
	private ShiftDisplayDAO shiftDisplayDAO;
	
	public void setShiftDisplayDAO(ShiftDisplayDAO shiftDisplayDAO) {
		this.shiftDisplayDAO = shiftDisplayDAO;
	}

	@Override
	public ModelAndView getShiftDetails(HttpServletRequest req,
			HttpServletResponse res) {
		mav = shiftDisplayDAO.getShiftDetails(req, res);
		return mav;
		
	}
}
