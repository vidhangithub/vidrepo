package com.infosys.aetnams.daos;

import java.sql.Types;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.infosys.aetnams.constants.PortalConstant;
import com.infosys.aetnams.constants.QueryToolConstant;
import com.infosys.aetnams.pojos.Approver;
import com.infosys.aetnams.pojos.ApproverDashBoard;
import com.infosys.aetnams.pojos.QueryMaster;
import com.infosys.aetnams.pojos.Submitter;
import com.infosys.aetnams.pojos.SubmitterDashBoard;
import com.infosys.aetnams.queries.QueryReviewQueries;
import com.infosys.aetnams.rowmappers.ApproverDashBoardRowMapper;
import com.infosys.aetnams.rowmappers.ApproverRowMapper;
import com.infosys.aetnams.rowmappers.SubmitterDashBoardRowMapper;
import com.infosys.aetnams.rowmappers.SubmitterRowMapper;




 /**
 * @author sampad_chakraborty
 *
 */
public class QueryReviewDaoImpl implements QueryReviewDao {
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private ModelAndView mav = null;
	
	private QueryMaster queryMaster;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	HttpSession session =null;

	@Override
	public ModelAndView queryReviewLoginForSubmitter(HttpServletRequest req,
			HttpServletResponse res) {
		mav = new ModelAndView();
		try {
			session = req.getSession();
			
			//if(session.getAttribute("SUB_LOG_ID")==null ){
				String password = req.getParameter("qr_password");
					String login_id=req.getParameter("qr_logid");
					
					Submitter submitter =(Submitter)jdbcTemplate.queryForObject(QueryReviewQueries.GET_SUBMITTER_DETAILS ,new Object[] {login_id}, new SubmitterRowMapper());
					
					if (password.equals(submitter.getPassword())) {
						session.setAttribute("SUB_LOG_ID", login_id);
						session.setAttribute("SUB_Fname", submitter.getFirstName());
						session.setAttribute("SUB_Lname", submitter.getLastName());
						session.setAttribute("NID", submitter.getNID());
			
						mav = new ModelAndView("qrLoginSuccessForSubmitter", "SCSMSG", PortalConstant.LOGINSUCCESSMSG);
					}
					else
					{
						mav = new ModelAndView("qrLoginView", "ERRMSG",PortalConstant.LOGINFAILUREMSG);
					}
			//} 
		} catch (Exception e) {
			String failuerMSG ="YOU are not Authorized to proceed";
			System.out.println("Exception in DAOIMPL");
			
			e.printStackTrace();
			mav = new ModelAndView("qrLoginView", "ERRMSG", failuerMSG);
		}
		
		
		return mav;
	}

	@Override
	public ModelAndView queryReviewLoginForApprover(HttpServletRequest req,
			HttpServletResponse res) {
		mav = new ModelAndView();
		try {
			session = req.getSession();
			
			//if(session.getAttribute("approver_LOG_ID")==null ){
				String password = req.getParameter("qr_password");
					String login_id=req.getParameter("qr_logid");
					
					Approver approver =(Approver)jdbcTemplate.queryForObject(QueryReviewQueries.GET_APPROVER_DETAILS ,new Object[] {login_id}, new ApproverRowMapper());
					
					if (password.equals(approver.getPassword())) {
						session.setAttribute("approver_LOG_ID", login_id);
						session.setAttribute("approver_Fname", approver.getFirstName());
						session.setAttribute("approver_Lname", approver.getLastName());
						session.setAttribute("approver_NID", approver.getApproverNID());
			
						mav = new ModelAndView("qrLoginSuccessForApprover", "SCSMSG", PortalConstant.LOGINSUCCESSMSG);
					}
					else
					{
						mav = new ModelAndView("qrLoginView", "ERRMSG",PortalConstant.LOGINFAILUREMSG);
					}
			//} 
		} catch (Exception e) {
			String failuerMSG ="YOU are not Authorized to proceed";
			System.out.println("Exception in DAOIMPL");
			
			e.printStackTrace();
			mav = new ModelAndView("qrLoginView", "ERRMSG", failuerMSG);
		}
		
		
		return mav;
	}

	@Override
	public ModelAndView dashBoardForSubmitter(HttpServletRequest req,
			HttpServletResponse res) {
		try {
			session= req.getSession();
			if(null != session.getAttribute("NID")){
			String submitter_nid = (session.getAttribute("NID")).toString();
			
			java.util.List<SubmitterDashBoard> submitterDashBoards = jdbcTemplate.query(QueryReviewQueries.SUBMITTER_DASHBOARD_DETAILS,new Object[] {submitter_nid}, new SubmitterDashBoardRowMapper());
			if (submitterDashBoards != null && !submitterDashBoards.isEmpty()) {
				mav  = new ModelAndView("submitterDashBoard", "SDashBoard", submitterDashBoards);
			
		} 
			}
		}catch (Exception e) {
			System.out.println("Exception in DAO while fetching submitter DashBoard details");
			e.printStackTrace();
			mav  = new ModelAndView("errorPage");
		
	}

		return mav;
	}

	@Override
	public ModelAndView submitQuery(HttpServletRequest req,
			HttpServletResponse res) {
		try {
		 queryMaster = populateQueryMasterFormRequest(req);
		 
		 int argTypes[] = {Types.INTEGER,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.DATE,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR};
		 
		 Object args[] = {queryMaster.getQuery_id(),queryMaster.getNID(),queryMaster.getQuery(),queryMaster.getStatus(),queryMaster.getApproved_by(),utilToSqlDate(queryMaster.getQuery_submitted_date()),queryMaster.getComents(),queryMaster.getApplication_id(),queryMaster.getDb_details()};
		 
		 int rowInserted = jdbcTemplate.update(QueryReviewQueries.SUBMIT_QUERY_DETAILS,args,argTypes );
		 if(rowInserted != 0){
			req.setAttribute("QURYSBMSNSUCESS", QueryToolConstant.QUERYSUBMSN_SUCCESS_MSG) ;
			
			mav = new ModelAndView("submitSuccessMsg");
		 }
		} catch (Exception e) {
			System.out.println("Exception in DAO while submitting query details");
			e.printStackTrace();
			mav  = new ModelAndView("errorPage");
		}
		
		return mav;
	}

	private java.sql.Date utilToSqlDate(Date query_submitted_date) {
		java.sql.Date sqlDate = new java.sql.Date( query_submitted_date.getTime());
		
		return sqlDate;
	}

	private QueryMaster populateQueryMasterFormRequest(HttpServletRequest req) {
				
		if(null != req){
			queryMaster = new QueryMaster();
			queryMaster.setQuery_id(populateQueryId());
			queryMaster.setNID(getNidFromSession(req));
			queryMaster.setApplication_id(req.getParameter("applications"));
			queryMaster.setDb_details(req.getParameter("dbDetails"));
			queryMaster.setComents(req.getParameter("sbmtCmnts"));
			queryMaster.setApproved_by(req.getParameter("approvers"));
			queryMaster.setQuery_submitted_date(new Date());
			queryMaster.setQuery(getQueryFromSession(req));
			queryMaster.setStatus(QueryToolConstant.SUBMITTED_STATUS);
			
		}
		return queryMaster;
	}

	
	
	private String getQueryFromSession(HttpServletRequest req) {
		String query = null;
		session= req.getSession();
		if(null != session.getAttribute("CHEKQUERY")){
			query = (session.getAttribute("CHEKQUERY")).toString();
			return query;
		}
		else
			return "";
	
	}

	private String getNidFromSession(HttpServletRequest req) {
		String submitter_nid = null;
		session= req.getSession();
		if(null != session.getAttribute("NID")){
			submitter_nid = (session.getAttribute("NID")).toString();
			return submitter_nid;
		}
		else
			return "";
			
		
	}

	@SuppressWarnings("deprecation")
	private Integer populateQueryId() {
		
		Integer query_id = 0;
		Integer maxQueryIdFromDB = jdbcTemplate.queryForInt(QueryReviewQueries.GET_MAX_ID);
		if(null ==maxQueryIdFromDB || maxQueryIdFromDB==0){
			
			query_id = QueryToolConstant.MAGICAL_ONE;
		}else {
			query_id = maxQueryIdFromDB + QueryToolConstant.MAGICAL_ONE;
		}
		
		return query_id;
	}

	@Override
	public ModelAndView dashBoardForApprover(HttpServletRequest req,
			HttpServletResponse res) {
		try {
			session= req.getSession();
			if(null != session.getAttribute("approver_LOG_ID")){
			String approver_Id = (session.getAttribute("approver_LOG_ID")).toString();
			
			java.util.List<ApproverDashBoard> approverDashBoards = jdbcTemplate.query(QueryReviewQueries.APPROVER_DASHBOARD_DETAILS,new Object[] {approver_Id}, new ApproverDashBoardRowMapper());
			if (approverDashBoards != null && !approverDashBoards.isEmpty()) {
				
				mav  = new ModelAndView("approverDashBoard", "aDashBoard", approverDashBoards);
 			} 
			}
		}catch (Exception e) {
			System.out.println("Exception in DAO while fetching Approver DashBoard details");
			e.printStackTrace();
			mav  = new ModelAndView("errorPage");
		
	}

		return mav;
	}

	

}