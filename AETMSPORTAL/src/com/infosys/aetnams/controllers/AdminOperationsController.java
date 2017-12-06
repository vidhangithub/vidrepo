package com.infosys.aetnams.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.infosys.aetnams.services.AdminOperationsService;



@Controller
public class AdminOperationsController {

	private Log log = LogFactory.getLog(AdminOperationsController.class);
	ModelAndView mav= null;
	

	
	@Autowired
	private AdminOperationsService operationsService;
	
	
	@RequestMapping(value="/adminLogin.infy")
	public ModelAndView adminLoginCheck(HttpServletRequest req, HttpServletResponse res)
	{
		
		mav =operationsService.getAdminDetails(req, res); 
		return mav;
	
	}
	@RequestMapping(value="/onBoard.infy")
	public ModelAndView onBoardCheck(HttpServletRequest req, HttpServletResponse res)
	{
		
		mav =operationsService.getOnBoardDetails(req, res); 
		return mav;
	
	}
	
	//offBoard.infy
	@RequestMapping(value="/offBoard.infy")
	public ModelAndView offBoardCheck(HttpServletRequest req, HttpServletResponse res)
	{
		
		mav =operationsService.getOffBoardDetails(req, res); 
		return mav;
	
	}
	
	
	//onBoardSave.infy
	
	@RequestMapping(value="/onBoardSave.infy")
	public ModelAndView onBoardSave(HttpServletRequest req, HttpServletResponse res)
	{
		
		mav =operationsService.saveOnBoardDetails(req, res); 
		return mav;
	
	}
	
	//offBoardSave.infy
	
		@RequestMapping(value="/offBoardSave.infy")
		public ModelAndView offBoardSave(HttpServletRequest req, HttpServletResponse res)
		{
			
			mav =operationsService.saveOffBoardDetails(req, res); 
			return mav;
		
		}
	//insertEmp.infy
	
	@RequestMapping(value="/insertEmp.infy")
	public ModelAndView insertEmpDetails(HttpServletRequest req, HttpServletResponse res)
	{
		
		mav =operationsService.insertEmpDetails(req, res); 
		return mav;
	
	}
	
	
	@RequestMapping(value="/deleteEmp.infy")
	public ModelAndView deleteEmpDetails(HttpServletRequest req, HttpServletResponse res)
	{
		
		mav =operationsService.deleteEmpDetails(req, res); 
		return mav;
	
	}
	//empDataSave.infy
	
	@RequestMapping(value="/empDataSave.infy")
	public ModelAndView empDataSave(HttpServletRequest req, HttpServletResponse res)
	{
		
		mav =operationsService.empDataSave(req, res); 
		return mav;
	
	}
	
	@RequestMapping(value="/dataupload.infy")
	public ModelAndView adminDataUpload( @RequestParam("file") MultipartFile file,HttpServletRequest req, HttpServletResponse res)
	{
		
		mav =operationsService.getUploadDetails(file, req, res);
		return mav;
		
		
	}
	//pritam--------start--------------
	
	
		@RequestMapping(value="/shiftdataupload.infy")
		public ModelAndView shiftDataUpload( @RequestParam("file") MultipartFile file,HttpServletRequest req, HttpServletResponse res)
		{
			
			mav =operationsService.getShiftDetails(file, req, res);
			return mav;
			
			
		}
		//pritam--------end--------------

		/**
		* This "adminLogout" method simply invalidate http session 
		* for admin user  if exits, then its render login view .
		* 
		*
		* @author  sampad
		*  @date   2/13/2015
		*/
		@RequestMapping(value="/adminLogout.infy")
		public ModelAndView adminLogout(HttpServletRequest req, HttpServletResponse res)
		{
		  HttpSession session = req.getSession();
		  if(null != session){
			  session.invalidate();
		  }
			ModelAndView mav = new ModelAndView("adminLogout");
			return mav;
		
		}
		
	
}
