package com.infosys.aetnams.services;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

import com.infosys.aetnams.constants.QueryToolConstant;
import com.infosys.aetnams.daos.QueryReviewDao;



/**
 * @author sampad_chakraborty
 *
 */
public class QueryReviewServiceImpl implements QueryReviewService {
	

	private QueryReviewDao queryReviewDAO;
	

	
	private ModelAndView mav=null;
	
	
	//getter setter

	
	public void setQueryReviewDAO(QueryReviewDao queryReviewDAO) {
		this.queryReviewDAO = queryReviewDAO;
	}

	
	
	public ModelAndView queryReviewLoginForSubmitter(HttpServletRequest req,
			HttpServletResponse res) {
		
		mav = queryReviewDAO.queryReviewLoginForSubmitter(req, res);
		
		
		return mav;
	}


	public ModelAndView queryReviewLoginForApprover(HttpServletRequest req,
			HttpServletResponse res) {
		
		
		mav=queryReviewDAO.queryReviewLoginForApprover(req, res);
		
		return mav;
	}



	@Override
	public ModelAndView checkQuery(HttpServletRequest req,
			HttpServletResponse res) {
		mav = new ModelAndView();
		String emsg = null;
		
		String raw_query = req.getParameter("query_text");
		String query = raw_query.trim().toUpperCase();
		
		if(checkQueryStratString(query)){
			int i = decideWhichQuery(query);
			switch (i) {
			case QueryToolConstant.MAGICAL_ONE:
				if(checkFromInSelect(query)){
					mav= checkQuerySyntax(query,req,res);
				}else{
					req.setAttribute("QUERYCHECKD", query);
					emsg =QueryToolConstant.NO_FROM_IN_SELECT;
					mav = new ModelAndView("qrLoginSuccessForSubmitter","EMSG",emsg);
				}
				
				break;
				case QueryToolConstant.MAGICAL_TWO:
				if(checkIntoValuesAndvaluesInInsert(query)){
					
					mav= checkQuerySyntax(query,req,res);
				}else{
					
					req.setAttribute("QUERYCHECKD", query);
					emsg =QueryToolConstant.NO_INTO_VALUES_INSERT;
					mav = new ModelAndView("qrLoginSuccessForSubmitter","EMSG",emsg);
				}
				break;
				case QueryToolConstant.MAGICAL_THREE:
					if(checkSetInUpdate(query)){
						
						mav= checkQuerySyntax(query,req,res);
					}else{
						
						req.setAttribute("QUERYCHECKD", query);
						emsg =QueryToolConstant.NO_SET_IN_UPDATE;
						mav = new ModelAndView("qrLoginSuccessForSubmitter","EMSG",emsg);
					}
					break;
					case QueryToolConstant.MAGICAL_FOUR:
					if(checkFromInDelete(query)){
						
						mav= checkQuerySyntax(query,req,res);
					}else{
						
						req.setAttribute("QUERYCHECKD", query);
						emsg =QueryToolConstant.NO_FROM_IN_DELETE;
						mav = new ModelAndView("qrLoginSuccessForSubmitter","EMSG",emsg);
					}
					break;
			}
				
			
			
		}else{
			req.setAttribute("QUERYCHECKD", query);
			emsg =QueryToolConstant.MUST_STAT_WITH;
			mav = new ModelAndView("qrLoginSuccessForSubmitter","EMSG",emsg);
		}
		
		
		return mav;
	}

	
	public ModelAndView dashBoardForSubmitter(HttpServletRequest req,
			HttpServletResponse res) {
		
		mav = queryReviewDAO.dashBoardForSubmitter(req, res);
		
		return mav;
	}
	
	@Override
	public ModelAndView submitQuery(HttpServletRequest req,
			HttpServletResponse res) {
		
		mav = queryReviewDAO.submitQuery(req, res);
		
		return mav;
	}
	
	
	private ModelAndView checkQuerySyntax(String query, HttpServletRequest req,
			HttpServletResponse res) {
		ModelAndView mav = null;
		int loopCount = QueryToolConstant.MAGICAL_ZERO;
		String emsg = null;
		String checkQuery = null;
		String successMsg = null;
		String tableName = null;
		HttpSession session = req.getSession();
		
		StringTokenizer tokenizer = new StringTokenizer(query, ";");
		
		while(tokenizer.hasMoreElements()){
			loopCount++;
			System.out.println(tokenizer.nextElement());
			if(loopCount >QueryToolConstant.MAGICAL_ONE){
				System.out.println(tokenizer.nextElement());
				req.setAttribute("QUERYCHECKD", query);
				emsg =QueryToolConstant.SEMICOLONMSG;
				mav = new ModelAndView("qrLoginSuccessForSubmitter","EMSG",emsg);
			}
		}
		
		if(loopCount == QueryToolConstant.MAGICAL_ONE && checkWhereInQuery(query)){
			int i = decideWhichQuery(query);
			switch (i) {
			case QueryToolConstant.MAGICAL_ONE:
				tableName = findTableNamePresentInSelectAndDelete(query);
				if(isTableNameTypeOfString(tableName)){
					checkQuery = query;
					successMsg = QueryToolConstant.SUCCESSMSG;
					session.setAttribute("CHEKQUERY", checkQuery);
					req.setAttribute("CHEKQUEYREQ", checkQuery);
					req.setAttribute("SUCCESSMSG", successMsg);
					mav = new ModelAndView("successAndSubmitMsg");
				}else{
					req.setAttribute("QUERYCHECKD", query);
					emsg =QueryToolConstant.NO_TABLE_NAME_IN_SELECT;
					mav = new ModelAndView("qrLoginSuccessForSubmitter","EMSG",emsg);
				}
				break;
				case QueryToolConstant.MAGICAL_TWO:
				tableName = findTableNamePresentInInsert(query);
				if(isTableNameTypeOfString(tableName)){
					checkQuery = query;
					successMsg = QueryToolConstant.SUCCESSMSG;
					session.setAttribute("CHEKQUERY", checkQuery);
					req.setAttribute("CHEKQUEYREQ", checkQuery);
					req.setAttribute("SUCCESSMSG", successMsg);
					mav = new ModelAndView("successAndSubmitMsg");
				}else{
					req.setAttribute("QUERYCHECKD", query);
					emsg =QueryToolConstant.NO_TABLE_NAME_IN_INSERT;
					mav = new ModelAndView("qrLoginSuccessForSubmitter","EMSG",emsg);
				}
				break;
				case QueryToolConstant.MAGICAL_THREE:
					tableName = findTableNamePresentInUpdate(query);
					if(isTableNameTypeOfString(tableName)){
						checkQuery = query;
						successMsg = QueryToolConstant.SUCCESSMSG;
						session.setAttribute("CHEKQUERY", checkQuery);
						req.setAttribute("CHEKQUEYREQ", checkQuery);
						req.setAttribute("SUCCESSMSG", successMsg);
						mav = new ModelAndView("successAndSubmitMsg");
					}else{
						req.setAttribute("QUERYCHECKD", query);
						emsg =QueryToolConstant.NO_TABLE_NAME_IN_UPDATE;
						mav = new ModelAndView("qrLoginSuccessForSubmitter","EMSG",emsg);
					}
					break;
					
			}
		}
		else if(mav == null){
			req.setAttribute("QUERYCHECKD", query);
			emsg =QueryToolConstant.NOWHEREMSG;
			mav = new ModelAndView("qrLoginSuccessForSubmitter","EMSG",emsg);
		}else{
			emsg =QueryToolConstant.NOWHEREMSG;
			mav = new ModelAndView("qrLoginSuccessForSubmitter","EMSG",emsg);
		}
		return mav;
	}







	private String findTableNamePresentInUpdate(String query) {
		String pattern1="UPDATE";
		String pattern2="SET";
		String textInBetween = null;
		String regexString = Pattern.quote(pattern1) + "(.*?)" +Pattern.quote(pattern2);
		
		Pattern pattern = Pattern.compile(regexString);
		Matcher matcher = pattern.matcher(query);
		
		while(matcher.find()){
			textInBetween = matcher.group(1);
		}
		return textInBetween;
	}



	private String findTableNamePresentInInsert(String query) {
		String pattern1="INTO";
		String pattern2="(";
		String textInBetween = null;
		String regexString = Pattern.quote(pattern1) + "(.*?)" +Pattern.quote(pattern2);
		
		Pattern pattern = Pattern.compile(regexString);
		Matcher matcher = pattern.matcher(query);
		
		while(matcher.find()){
			textInBetween = matcher.group(1);
		}
		return textInBetween;
	}



	private boolean isTableNameTypeOfString(String tableName) {
		if(null != tableName && tableName instanceof String){
			return true;
		}else
			
		return false;
	}



	private String findTableNamePresentInSelectAndDelete(String query) {
		String pattern1="FROM";
		String pattern2="WHERE";
		String textInBetween = null;
		String regexString = Pattern.quote(pattern1) + "(.*?)" +Pattern.quote(pattern2);
		
		Pattern pattern = Pattern.compile(regexString);
		Matcher matcher = pattern.matcher(query);
		
		while(matcher.find()){
			textInBetween = matcher.group(1);
		}
		return textInBetween;
	}



	private boolean checkWhereInQuery(String query) {
		if( query.contains(QueryToolConstant.MAGICAL_WHERE)){
			
			return true;
			}
		return false;
	}



	private boolean checkFromInDelete(String query) {
		if(query.startsWith(QueryToolConstant.DELETE_STAT)&& query.contains(QueryToolConstant.DELETE_FROM)){
			
		return true;
		}
		return false;
	}



	private boolean checkSetInUpdate(String query) {
		if(query.startsWith(QueryToolConstant.UPDATE_STAT)&& query.contains(QueryToolConstant.UPDATE_SET)
				&& query.endsWith(QueryToolConstant.UPDATE_END)){
			
			return true;
		}
		return false;
	}



	private boolean checkIntoValuesAndvaluesInInsert(String query) {
		if(query.startsWith(QueryToolConstant.INSERT_STAT)&& query.contains(QueryToolConstant.INSERT_INTO)
				&& query.contains(QueryToolConstant.INSERT_VALUES)){
			
			return true;
		}
		return false;
	}



	private boolean checkFromInSelect(String query) {
		if(query.startsWith(QueryToolConstant.SELECT_STAT)&& query.contains(QueryToolConstant.MAGICAL_FROM)
				&& query.endsWith(QueryToolConstant.SELECT_END)){
			
			return true;
		}
		return false;
	}



	private int decideWhichQuery(String query) {
		if(query.startsWith(QueryToolConstant.SELECT_STAT)){
			return QueryToolConstant.MAGICAL_ONE;
			
		}else if (query.startsWith(QueryToolConstant.INSERT_STAT)) {
			return QueryToolConstant.MAGICAL_TWO;
		
		}else if (query.startsWith(QueryToolConstant.UPDATE_STAT)) {
			return QueryToolConstant.MAGICAL_THREE;
		
		}else if (query.startsWith(QueryToolConstant.DELETE_STAT)) {
			return QueryToolConstant.MAGICAL_FOUR;
		}
		return 0;
	}



	private boolean checkQueryStratString(String query) {
		if(query.startsWith(QueryToolConstant.INSERT_STAT)||query.startsWith(QueryToolConstant.UPDATE_STAT)
				||query.startsWith(QueryToolConstant.SELECT_STAT)||query.startsWith(QueryToolConstant.DELETE_STAT))
		{
			return true;
		}else
			return false;
		}



	@Override
	public ModelAndView dashBoardForApprover(HttpServletRequest req,
			HttpServletResponse res) {
		
		mav = queryReviewDAO.dashBoardForApprover(req,res);
		
		return mav;
	}







	

}
