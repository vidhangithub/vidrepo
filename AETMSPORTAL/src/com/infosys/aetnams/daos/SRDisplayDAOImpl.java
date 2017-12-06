package com.infosys.aetnams.daos;

import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.infosys.aetnams.pojos.ServiceRequest;
import com.infosys.aetnams.queries.PortalQueries;
import com.infosys.aetnams.rowmappers.ServiceRequestRowMapper;

public class SRDisplayDAOImpl implements SRDisplayDAO {
	private JdbcTemplate jdbcTemplate;
	private ModelAndView mav = null;
	private HttpSession session = null;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public ModelAndView getSrDetails5(HttpServletRequest req,
			HttpServletResponse res) {
		session = req.getSession();
		try {
			List<ServiceRequest> srList = jdbcTemplate.query(PortalQueries.SR_DETAILS5, new ServiceRequestRowMapper());
			if (srList != null && !srList.isEmpty()) {
				session.setAttribute("SRINFO", srList);
				mav  = new ModelAndView("srDetail", "SRINFO", srList);
			
		} 
			else
			{
				mav  = new ModelAndView("srDetail", "SRINFO", srList);
			}
		}catch (Exception e) {
			System.out.println("Exception in DAO while fetching SR details");
			e.printStackTrace();
			mav  = new ModelAndView("errorPage");
		}
				
		return mav;
		
	}
	@Override
	public ModelAndView getSRETotal5(HttpServletRequest req,
			HttpServletResponse res) {
		try {
			String fromDate = req.getParameter("fromdate");
			String toDate = req.getParameter("todate");
			
			SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy");
			Date cnvrtdUtilFrmDate = sdf1.parse(fromDate);
			Date cnvrtdUtiltoDate = sdf1.parse(toDate);
			
			java.sql.Date cnvrtdSQLFrmDate = new java.sql.Date(cnvrtdUtilFrmDate.getTime());
			java.sql.Date cnvrtdSQLToDate = new java.sql.Date(cnvrtdUtiltoDate.getTime());

			int argTypes[] = {Types.DATE,Types.DATE};
			Object args[] = {cnvrtdSQLFrmDate,cnvrtdSQLToDate};
			int totalCount = jdbcTemplate.queryForInt(PortalQueries.SRE_TOTAL5, args, argTypes);
			if (totalCount != 0) {
				String totalCountString = Integer.toString(totalCount);
				String totalMSG = "Total SRE count from "+"\t"+fromDate+"\t"+ "to"+"\t" +toDate+"\t"+ "is = "+"\t" +totalCountString;
				mav  = new ModelAndView("srDetail", "TOTALSRE", totalMSG);
			
		} 
			else
			{   
				String totalCountString = Integer.toString(totalCount);
				String totalMSG = "Total SRE count from "+"\t"+fromDate+"\t"+ "to"+"\t" +toDate+"\t"+ "is = "+"\t" +totalCountString;
				mav  = new ModelAndView("srDetail", "TOTALSRE", totalMSG);
			}
		}catch (Exception e) {
			System.out.println("Exception in DAO while fetching Total SRE");
			e.printStackTrace();
			mav  = new ModelAndView("errorPage");
		}
				
		return mav;
		
	}


	private String formatComprsnDate( String comprsnDate)
	{
		return "#"+comprsnDate+"#";
	}
	
	
	@Override
	public ModelAndView getSrDetails1(HttpServletRequest req,
			HttpServletResponse res) {
		session = req.getSession();
		try {
			List<ServiceRequest> srList = jdbcTemplate.query(PortalQueries.SR_DETAILS1, new ServiceRequestRowMapper());
			if (srList != null && !srList.isEmpty()) {
				session.setAttribute("SRINFO", srList);
				mav  = new ModelAndView("srDetail", "SRINFO", srList);
			
		} 
			else
			{
				mav  = new ModelAndView("srDetail", "SRINFO", srList);
			}
		}catch (Exception e) {
			System.out.println("Exception in DAO while fetching SR details");
			e.printStackTrace();
			mav  = new ModelAndView("errorPage");
		}
				
		return mav;
		
	}
	
	
	@Override
	public ModelAndView getSRETotal1(HttpServletRequest req,
			HttpServletResponse res) {
		try {
			String fromDate = req.getParameter("fromdate");
			String toDate = req.getParameter("todate");
			
			SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy");
			Date cnvrtdUtilFrmDate = sdf1.parse(fromDate);
			Date cnvrtdUtiltoDate = sdf1.parse(toDate);
			
			java.sql.Date cnvrtdSQLFrmDate = new java.sql.Date(cnvrtdUtilFrmDate.getTime());
			java.sql.Date cnvrtdSQLToDate = new java.sql.Date(cnvrtdUtiltoDate.getTime());

			int argTypes[] = {Types.DATE,Types.DATE};
			Object args[] = {cnvrtdSQLFrmDate,cnvrtdSQLToDate};
			int totalCount = jdbcTemplate.queryForInt(PortalQueries.SRE_TOTAL1, args, argTypes);
			if (totalCount != 0) {
				String totalCountString = Integer.toString(totalCount);
				String totalMSG = "Total SRE count from "+"\t"+fromDate+"\t"+ "to"+"\t" +toDate+"\t"+ "is = "+"\t" +totalCountString;
				mav  = new ModelAndView("srDetail", "TOTALSRE", totalMSG);
			
		} 
			else
			{   
				String totalCountString = Integer.toString(totalCount);
				String totalMSG = "Total SRE count from "+"\t"+fromDate+"\t"+ "to"+"\t" +toDate+"\t"+ "is = "+"\t" +totalCountString;
				mav  = new ModelAndView("srDetail", "TOTALSRE", totalMSG);
			}
		}catch (Exception e) {
			System.out.println("Exception in DAO while fetching Total SRE");
			e.printStackTrace();
			mav  = new ModelAndView("errorPage");
		}
				
		return mav;
		
	}

	
	@Override
	public ModelAndView getSrDetails2(HttpServletRequest req,
			HttpServletResponse res) {
		session = req.getSession();
		try {
			List<ServiceRequest> srList = jdbcTemplate.query(PortalQueries.SR_DETAILS2, new ServiceRequestRowMapper());
			if (srList != null && !srList.isEmpty()) {
				session.setAttribute("SRINFO", srList);
				mav  = new ModelAndView("srDetail", "SRINFO", srList);
			
		} 
			else
			{
				mav  = new ModelAndView("srDetail", "SRINFO", srList);
			}
		}catch (Exception e) {
			System.out.println("Exception in DAO while fetching SR details");
			e.printStackTrace();
			mav  = new ModelAndView("errorPage");
		}
				
		return mav;
		
	}
	
	
	@Override
	public ModelAndView getSRETotal2(HttpServletRequest req,
			HttpServletResponse res) {
		try {
			String fromDate = req.getParameter("fromdate");
			String toDate = req.getParameter("todate");
			
			SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy");
			Date cnvrtdUtilFrmDate = sdf1.parse(fromDate);
			Date cnvrtdUtiltoDate = sdf1.parse(toDate);
			
			java.sql.Date cnvrtdSQLFrmDate = new java.sql.Date(cnvrtdUtilFrmDate.getTime());
			java.sql.Date cnvrtdSQLToDate = new java.sql.Date(cnvrtdUtiltoDate.getTime());

			int argTypes[] = {Types.DATE,Types.DATE};
			Object args[] = {cnvrtdSQLFrmDate,cnvrtdSQLToDate};
			int totalCount = jdbcTemplate.queryForInt(PortalQueries.SRE_TOTAL2, args, argTypes);
			if (totalCount != 0) {
				String totalCountString = Integer.toString(totalCount);
				String totalMSG = "Total SRE count from "+"\t"+fromDate+"\t"+ "to"+"\t" +toDate+"\t"+ "is = "+"\t" +totalCountString;
				mav  = new ModelAndView("srDetail", "TOTALSRE", totalMSG);
			
		} 
			else
			{   
				String totalCountString = Integer.toString(totalCount);
				String totalMSG = "Total SRE count from "+"\t"+fromDate+"\t"+ "to"+"\t" +toDate+"\t"+ "is = "+"\t" +totalCountString;
				mav  = new ModelAndView("srDetail", "TOTALSRE", totalMSG);
			}
		}catch (Exception e) {
			System.out.println("Exception in DAO while fetching Total SRE");
			e.printStackTrace();
			mav  = new ModelAndView("errorPage");
		}
				
		return mav;
		
	}

	@Override
	public ModelAndView getSrDetails3(HttpServletRequest req,
			HttpServletResponse res) {
		session = req.getSession();
		try {
			List<ServiceRequest> srList = jdbcTemplate.query(PortalQueries.SR_DETAILS3, new ServiceRequestRowMapper());
			if (srList != null && !srList.isEmpty()) {
				session.setAttribute("SRINFO", srList);
				mav  = new ModelAndView("srDetail", "SRINFO", srList);
			
		} 
			else
			{
				mav  = new ModelAndView("srDetail", "SRINFO", srList);
			}
		}catch (Exception e) {
			System.out.println("Exception in DAO while fetching SR details");
			e.printStackTrace();
			mav  = new ModelAndView("errorPage");
		}
				
		return mav;
		
	}
	
	
	@Override
	public ModelAndView getSRETotal3(HttpServletRequest req,
			HttpServletResponse res) {
		try {
			String fromDate = req.getParameter("fromdate");
			String toDate = req.getParameter("todate");
			
			SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy");
			Date cnvrtdUtilFrmDate = sdf1.parse(fromDate);
			Date cnvrtdUtiltoDate = sdf1.parse(toDate);
			
			java.sql.Date cnvrtdSQLFrmDate = new java.sql.Date(cnvrtdUtilFrmDate.getTime());
			java.sql.Date cnvrtdSQLToDate = new java.sql.Date(cnvrtdUtiltoDate.getTime());

			int argTypes[] = {Types.DATE,Types.DATE};
			Object args[] = {cnvrtdSQLFrmDate,cnvrtdSQLToDate};
			int totalCount = jdbcTemplate.queryForInt(PortalQueries.SRE_TOTAL3, args, argTypes);
			if (totalCount != 0) {
				String totalCountString = Integer.toString(totalCount);
				String totalMSG = "Total SRE count from "+"\t"+fromDate+"\t"+ "to"+"\t" +toDate+"\t"+ "is = "+"\t" +totalCountString;
				mav  = new ModelAndView("srDetail", "TOTALSRE", totalMSG);
			
		} 
			else
			{   
				String totalCountString = Integer.toString(totalCount);
				String totalMSG = "Total SRE count from "+"\t"+fromDate+"\t"+ "to"+"\t" +toDate+"\t"+ "is = "+"\t" +totalCountString;
				mav  = new ModelAndView("srDetail", "TOTALSRE", totalMSG);
			}
		}catch (Exception e) {
			System.out.println("Exception in DAO while fetching Total SRE");
			e.printStackTrace();
			mav  = new ModelAndView("errorPage");
		}
				
		return mav;
		
	}

	@Override
	public ModelAndView getSrDetails4(HttpServletRequest req,
			HttpServletResponse res) {
		session = req.getSession();
		try {
			List<ServiceRequest> srList = jdbcTemplate.query(PortalQueries.SR_DETAILS4, new ServiceRequestRowMapper());
			if (srList != null && !srList.isEmpty()) {
				session.setAttribute("SRINFO", srList);
				mav  = new ModelAndView("srDetail", "SRINFO", srList);
			
		} 
			else
			{
				mav  = new ModelAndView("srDetail", "SRINFO", srList);
			}
		}catch (Exception e) {
			System.out.println("Exception in DAO while fetching SR details");
			e.printStackTrace();
			mav  = new ModelAndView("errorPage");
		}
				
		return mav;
		
	}
	
	
	@Override
	public ModelAndView getSRETotal4(HttpServletRequest req,
			HttpServletResponse res) {
		try {
			String fromDate = req.getParameter("fromdate");
			String toDate = req.getParameter("todate");
			
			SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy");
			Date cnvrtdUtilFrmDate = sdf1.parse(fromDate);
			Date cnvrtdUtiltoDate = sdf1.parse(toDate);
			
			java.sql.Date cnvrtdSQLFrmDate = new java.sql.Date(cnvrtdUtilFrmDate.getTime());
			java.sql.Date cnvrtdSQLToDate = new java.sql.Date(cnvrtdUtiltoDate.getTime());

			int argTypes[] = {Types.DATE,Types.DATE};
			Object args[] = {cnvrtdSQLFrmDate,cnvrtdSQLToDate};
			int totalCount = jdbcTemplate.queryForInt(PortalQueries.SRE_TOTAL4, args, argTypes);
			if (totalCount != 0) {
				String totalCountString = Integer.toString(totalCount);
				String totalMSG = "Total SRE count from "+"\t"+fromDate+"\t"+ "to"+"\t" +toDate+"\t"+ "is = "+"\t" +totalCountString;
				mav  = new ModelAndView("srDetail", "TOTALSRE", totalMSG);
			
		} 
			else
			{   
				String totalCountString = Integer.toString(totalCount);
				String totalMSG = "Total SRE count from "+"\t"+fromDate+"\t"+ "to"+"\t" +toDate+"\t"+ "is = "+"\t" +totalCountString;
				mav  = new ModelAndView("srDetail", "TOTALSRE", totalMSG);
			}
		}catch (Exception e) {
			System.out.println("Exception in DAO while fetching Total SRE");
			e.printStackTrace();
			mav  = new ModelAndView("errorPage");
		}
				
		return mav;
		
	}

	
}
