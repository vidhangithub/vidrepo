package com.infosys.aetnams.daos;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.infosys.aetnams.pojos.Application;
import com.infosys.aetnams.queries.PortalQueries;
import com.infosys.aetnams.rowmappers.ApplicationRowMapper;

public class ApplicationDisplayDAOImpl implements ApplicationDisplayDAO {
private JdbcTemplate jdbcTemplate;
	
	private ModelAndView mav = null;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	



	
	@Override
	public ModelAndView getApplicationDetails1(HttpServletRequest req,
			HttpServletResponse res) {
		try {
			List<Application> applicationList = jdbcTemplate.query(PortalQueries.APPLICATION_DETAILS1, new ApplicationRowMapper());
			if (applicationList != null && !applicationList.isEmpty()) {
				mav  = new ModelAndView("application", "APPLINFO", applicationList);
			
		} 
		}catch (Exception e) {
			System.out.println("Exception in DAO while fetching application details");
			e.printStackTrace();
			mav  = new ModelAndView("errorPage");
		}
				
		return mav;
	}
	
	@Override
	public ModelAndView getApplicationDetails2(HttpServletRequest req,
			HttpServletResponse res) {
		try {
			List<Application> applicationList = jdbcTemplate.query(PortalQueries.APPLICATION_DETAILS2, new ApplicationRowMapper());
			if (applicationList != null && !applicationList.isEmpty()) {
				mav  = new ModelAndView("application", "APPLINFO", applicationList);
			
		} 
		}catch (Exception e) {
			System.out.println("Exception in DAO while fetching application details");
			e.printStackTrace();
			mav  = new ModelAndView("errorPage");
		}
				
		return mav;
	}
	

	
	@Override
	public ModelAndView getApplicationDetails3(HttpServletRequest req,
			HttpServletResponse res) {
		try {
			List<Application> applicationList = jdbcTemplate.query(PortalQueries.APPLICATION_DETAILS3, new ApplicationRowMapper());
			if (applicationList != null && !applicationList.isEmpty()) {
				mav  = new ModelAndView("application", "APPLINFO", applicationList);
			
		} 
		}catch (Exception e) {
			System.out.println("Exception in DAO while fetching application details");
			e.printStackTrace();
			mav  = new ModelAndView("errorPage");
		}
				
		return mav;
	}
	

	
	@Override
	public ModelAndView getApplicationDetails4(HttpServletRequest req,
			HttpServletResponse res) {
		try {
			List<Application> applicationList = jdbcTemplate.query(PortalQueries.APPLICATION_DETAILS4, new ApplicationRowMapper());
			if (applicationList != null && !applicationList.isEmpty()) {
				mav  = new ModelAndView("application", "APPLINFO", applicationList);
			
		} 
		}catch (Exception e) {
			System.out.println("Exception in DAO while fetching application details");
			e.printStackTrace();
			mav  = new ModelAndView("errorPage");
		}
				
		return mav;
	}
	
	
	@Override
	public ModelAndView getApplicationDetails5(HttpServletRequest req,
			HttpServletResponse res) {
		try {
			List<Application> applicationList = jdbcTemplate.query(PortalQueries.APPLICATION_DETAILS5, new ApplicationRowMapper());
			if (applicationList != null && !applicationList.isEmpty()) {
				mav  = new ModelAndView("application", "APPLINFO", applicationList);
			
		} 
		}catch (Exception e) {
			System.out.println("Exception in DAO while fetching application details");
			e.printStackTrace();
			mav  = new ModelAndView("errorPage");
		}
				
		return mav;
	}

}
