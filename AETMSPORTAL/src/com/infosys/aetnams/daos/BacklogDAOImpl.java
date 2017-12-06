package com.infosys.aetnams.daos;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.infosys.aetnams.pojos.Backlog;
import com.infosys.aetnams.queries.PortalQueries;
import com.infosys.aetnams.rowmappers.BacklogRowMapper;

public class BacklogDAOImpl implements BacklogDAO{
	
	private JdbcTemplate jdbcTemplate;
	
	private ModelAndView mav = null;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public ModelAndView getBacklogDetailsSDG1(HttpServletRequest req,
			HttpServletResponse res) {
		try {
			
	
			List<Backlog> backlogList = jdbcTemplate.query(PortalQueries.GET_BACKLOG_SDG1, new BacklogRowMapper());
			
			
			if (backlogList != null && !backlogList.isEmpty()) {
				System.out.println(backlogList);
				mav  = new ModelAndView("backlogview", "BACKINFO", backlogList);
			
		} 
			else{
				mav  = new ModelAndView("backlogview", "BACKINFO", backlogList);
			}
		}catch (Exception e) {
			System.out.println("Exception in DAOIMPL");
			e.printStackTrace();
			mav  = new ModelAndView("errorPage");
		}
		
		
		return mav;
	}
	
	
	@Override
	public ModelAndView getBacklogDetailsSDG2(HttpServletRequest req,
			HttpServletResponse res) {
		try {
			
	
			List<Backlog> backlogList = jdbcTemplate.query(PortalQueries.GET_BACKLOG_SDG2, new BacklogRowMapper());
			
			
			if (backlogList != null && !backlogList.isEmpty()) {
				System.out.println(backlogList);
				mav  = new ModelAndView("backlogview", "BACKINFO", backlogList);
			
		} 
			else{
				mav  = new ModelAndView("backlogview", "BACKINFO", backlogList);
			}
		}catch (Exception e) {
			System.out.println("Exception in DAOIMPL");
			e.printStackTrace();
			mav  = new ModelAndView("errorPage");
		}
		
		
		return mav;
	}
	
	
	@Override
	public ModelAndView getBacklogDetailsSDG3(HttpServletRequest req,
			HttpServletResponse res) {
		try {
			
	
			List<Backlog> backlogList = jdbcTemplate.query(PortalQueries.GET_BACKLOG_SDG3, new BacklogRowMapper());
			
			
			if (backlogList != null && !backlogList.isEmpty()) {
				System.out.println(backlogList);
				mav  = new ModelAndView("backlogview", "BACKINFO", backlogList);
			
		} 
			else{
				mav  = new ModelAndView("backlogview", "BACKINFO", backlogList);
			}
		}catch (Exception e) {
			System.out.println("Exception in DAOIMPL");
			e.printStackTrace();
			mav  = new ModelAndView("errorPage");
		}
		
		
		return mav;
	}
	
	

	
	@Override
	public ModelAndView getBacklogDetailsSDG4(HttpServletRequest req,
			HttpServletResponse res) {
		try {
			
	
			List<Backlog> backlogList = jdbcTemplate.query(PortalQueries.GET_BACKLOG_SDG4, new BacklogRowMapper());
			
			
			if (backlogList != null && !backlogList.isEmpty()) {
				System.out.println(backlogList);
				mav  = new ModelAndView("backlogview", "BACKINFO", backlogList);
			
		} 
			else{
				mav  = new ModelAndView("backlogview", "BACKINFO", backlogList);
			}
		}catch (Exception e) {
			System.out.println("Exception in DAOIMPL");
			e.printStackTrace();
			mav  = new ModelAndView("errorPage");
		}
		
		
		return mav;
	}
	
	

	
	@Override
	public ModelAndView getBacklogDetailsSDG5(HttpServletRequest req,
			HttpServletResponse res) {
		try {
			
	
			List<Backlog> backlogList = jdbcTemplate.query(PortalQueries.GET_BACKLOG_SDG5, new BacklogRowMapper());
			
			
			if (backlogList != null && !backlogList.isEmpty()) {
				System.out.println(backlogList);
				mav  = new ModelAndView("backlogview", "BACKINFO", backlogList);
			
		} 
			else{
				mav  = new ModelAndView("backlogview", "BACKINFO", backlogList);
			}
		}catch (Exception e) {
			System.out.println("Exception in DAOIMPL");
			e.printStackTrace();
			mav  = new ModelAndView("errorPage");
		}
		
		
		return mav;
	}
}
