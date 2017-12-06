package com.infosys.aetnams.queries;



public interface QueryReviewQueries {
	
	public String GET_SUBMITTER_DETAILS = "select * from SUBMITTER_MASTER where LOGIN_ID=?";
	public String GET_APPROVER_DETAILS = "select * from APPROVER_MASTER where LOGIN_ID=?";
	public String SUBMITTER_DASHBOARD_DETAILS = "select * from QUERY_MASTER where NID=?";
	public String SUBMIT_QUERY_DETAILS = "INSERT into QUERY_MASTER (QUERY_ID,NID,QUERY,STATUS,APPROVED_BY,QRY_SUBMTD_DATE,COMMENTS_BY_SUBMITTER,APPLICATION_ID,DB_DETAILS)"+ "values(?,?,?,?,?,?,?,?,?)";
	public String GET_MAX_ID = "select max(QUERY_ID) from QUERY_MASTER";
	public String APPROVER_DASHBOARD_DETAILS = "select * from QUERY_MASTER where APPROVED_BY=? and STATUS='submitted'";
	
	
}
