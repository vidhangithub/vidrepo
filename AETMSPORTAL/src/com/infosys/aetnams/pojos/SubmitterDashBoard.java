package com.infosys.aetnams.pojos;

/**
 * @author sampad_chakraborty
 *
 */
public class SubmitterDashBoard {
	
	private String NID;
	private String application_id;
	private String query;
	private String db_details;
	private String coments;
	private String query_submitted_date;
	private String approved_reject_date;
	private String rejection_reason;
	private String approved_by;
	
	
	
	//getter setter
	
	public String getNID() {
		return NID;
	}
	public void setNID(String nID) {
		NID = nID;
	}
	public String getApplication_id() {
		return application_id;
	}
	public void setApplication_id(String application_id) {
		this.application_id = application_id;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public String getDb_details() {
		return db_details;
	}
	public void setDb_details(String db_details) {
		this.db_details = db_details;
	}
	public String getComents() {
		return coments;
	}
	public void setComents(String coments) {
		this.coments = coments;
	}
	public String getQuery_submitted_date() {
		return query_submitted_date;
	}
	public void setQuery_submitted_date(String query_submitted_date) {
		this.query_submitted_date = query_submitted_date;
	}
	public String getApproved_reject_date() {
		return approved_reject_date;
	}
	public void setApproved_reject_date(String approved_reject_date) {
		this.approved_reject_date = approved_reject_date;
	}
	public String getRejection_reason() {
		return rejection_reason;
	}
	public void setRejection_reason(String rejection_reason) {
		this.rejection_reason = rejection_reason;
	}
	public String getApproved_by() {
		return approved_by;
	}
	public void setApproved_by(String approved_by) {
		this.approved_by = approved_by;
	}

}
