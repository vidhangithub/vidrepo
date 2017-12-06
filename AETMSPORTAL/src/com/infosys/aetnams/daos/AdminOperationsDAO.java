package com.infosys.aetnams.daos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

public interface AdminOperationsDAO {

	public ModelAndView getAdminDetails(HttpServletRequest req,HttpServletResponse res) ;
	public ModelAndView getOnBoardDetails(HttpServletRequest req,HttpServletResponse res) ;
	public ModelAndView saveOnBoardDetails(HttpServletRequest req,HttpServletResponse res) ;
	public ModelAndView saveOffBoardDetails(HttpServletRequest req,HttpServletResponse res) ;
	public ModelAndView insertEmpDetails(HttpServletRequest req,HttpServletResponse res) ;
	public ModelAndView deleteEmpDetails(HttpServletRequest req,HttpServletResponse res) ;
	
	public ModelAndView getOffBoardDetails(HttpServletRequest req,HttpServletResponse res) ;
	
	public ModelAndView empDataSave(HttpServletRequest req,HttpServletResponse res) ;
	public ModelAndView getUploadDetails(@RequestParam("file") MultipartFile file,HttpServletRequest req,HttpServletResponse res) ;
	//pritam---start----
		public ModelAndView getShiftDetails(@RequestParam("file") MultipartFile file,HttpServletRequest req,HttpServletResponse res) ;
		
		//pritam---end---
}
