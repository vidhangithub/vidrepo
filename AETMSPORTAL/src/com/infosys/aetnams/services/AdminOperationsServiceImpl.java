package com.infosys.aetnams.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.infosys.aetnams.daos.AdminOperationsDAO;


public class AdminOperationsServiceImpl implements AdminOperationsService{

private AdminOperationsDAO operationsDAO;
	
	private ModelAndView mav = null;
	
	public void setoperationsDAO(AdminOperationsDAO operationsDAO) {
		this.operationsDAO = operationsDAO;
	}

	@Override
	public ModelAndView getAdminDetails(HttpServletRequest req,
			HttpServletResponse res) {
		mav = operationsDAO.getAdminDetails(req, res);
		return mav;
		
	}
	
	@Override
	public ModelAndView getOnBoardDetails(HttpServletRequest req,
			HttpServletResponse res) {
		mav = operationsDAO.getOnBoardDetails(req, res);
		return mav;
		
	}
    //Changes offBoard starts
	@Override
	public ModelAndView getOffBoardDetails(HttpServletRequest req,
			HttpServletResponse res) {
		mav = operationsDAO.getOffBoardDetails(req, res);
		return mav;
		
	}
	
	//Changes offBoard ends
	
	@Override
	public ModelAndView saveOnBoardDetails(HttpServletRequest req,
			HttpServletResponse res) {
		mav = operationsDAO.saveOnBoardDetails(req, res);
		return mav;
		
	}
	
	@Override
	public ModelAndView saveOffBoardDetails(HttpServletRequest req,
			HttpServletResponse res) {
		mav = operationsDAO.saveOffBoardDetails(req, res);
		return mav;
		
	}
	
	@Override
	public ModelAndView insertEmpDetails(HttpServletRequest req,
			HttpServletResponse res) {
		mav = operationsDAO.insertEmpDetails(req, res);
		return mav;
		
	}
	
	@Override
	public ModelAndView deleteEmpDetails(HttpServletRequest req,
			HttpServletResponse res) {
		mav = operationsDAO.deleteEmpDetails(req, res);
		return mav;
		
	}
	
	
	@Override
	public ModelAndView empDataSave(HttpServletRequest req,
			HttpServletResponse res) {
		mav = operationsDAO.empDataSave(req, res);
		return mav;
		
	}
	
	@Override
	public ModelAndView getUploadDetails(@RequestParam("file") MultipartFile file,HttpServletRequest req,
			HttpServletResponse res) {
		mav = operationsDAO.getUploadDetails(file, req, res);
		return mav;
		
	}
	//pritam-------------start-----------------
	
		@Override
		public ModelAndView getShiftDetails(@RequestParam("file") MultipartFile file,HttpServletRequest req,
				HttpServletResponse res) {
			mav = operationsDAO.getShiftDetails(file, req, res);
			return mav;
			
		}
		
		//pritam-------------end-----------------
}
