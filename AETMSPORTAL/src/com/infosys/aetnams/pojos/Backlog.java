package com.infosys.aetnams.pojos;

import java.sql.Date;

public class Backlog {
	private String assignment_group;
	private String sm_number;
	private String sm_owner_name;
	private Date sm_open_date;
	private String sm_status;
	private Double sm_age;
	private Double under_ten_days;
	private Double within_ten_to_twenty;
	private Date sm_last_updt_dt;
	private Double sm_last_updt_days_ago;
	private String im_number;
	private String im_assignment_group;
	private String im_status;
	private String im_assignee_name;
	private String pne_sdg;
	private String ada_sdg;
	private String exception;
	private String cg;
	private String age_bracket;
	
	// getters and setters.
	public String getAssignment_group() {
		return assignment_group;
	}
	public void setAssignment_group(String assignment_group) {
		this.assignment_group = assignment_group;
	}
	public String getSm_number() {
		return sm_number;
	}
	public void setSm_number(String sm_number) {
		this.sm_number = sm_number;
	}
	public String getSm_owner_name() {
		return sm_owner_name;
	}
	public void setSm_owner_name(String sm_owner_name) {
		this.sm_owner_name = sm_owner_name;
	}
	
	public String getSm_status() {
		return sm_status;
	}
	public void setSm_status(String sm_status) {
		this.sm_status = sm_status;
	}
	
	
	public Double getSm_age() {
		return sm_age;
	}
	public void setSm_age(Double sm_age) {
		this.sm_age = sm_age;
	}
	
	
	public Date getSm_open_date() {
		return sm_open_date;
	}
	public void setSm_open_date(Date sm_open_date) {
		this.sm_open_date = sm_open_date;
	}
	public Date getSm_last_updt_dt() {
		return sm_last_updt_dt;
	}
	public void setSm_last_updt_dt(Date sm_last_updt_dt) {
		this.sm_last_updt_dt = sm_last_updt_dt;
	}
	
	public Double getUnder_ten_days() {
		return under_ten_days;
	}
	public void setUnder_ten_days(Double under_ten_days) {
		this.under_ten_days = under_ten_days;
	}
	public Double getWithin_ten_to_twenty() {
		return within_ten_to_twenty;
	}
	public void setWithin_ten_to_twenty(Double within_ten_to_twenty) {
		this.within_ten_to_twenty = within_ten_to_twenty;
	}
	public Double getSm_last_updt_days_ago() {
		return sm_last_updt_days_ago;
	}
	public void setSm_last_updt_days_ago(Double sm_last_updt_days_ago) {
		this.sm_last_updt_days_ago = sm_last_updt_days_ago;
	}
	public String getIm_number() {
		return im_number;
	}
	public void setIm_number(String im_number) {
		this.im_number = im_number;
	}
	public String getIm_assignment_group() {
		return im_assignment_group;
	}
	public void setIm_assignment_group(String im_assignment_group) {
		this.im_assignment_group = im_assignment_group;
	}
	public String getIm_status() {
		return im_status;
	}
	public void setIm_status(String im_status) {
		this.im_status = im_status;
	}
	public String getIm_assignee_name() {
		return im_assignee_name;
	}
	public void setIm_assignee_name(String im_assignee_name) {
		this.im_assignee_name = im_assignee_name;
	}
	public String getPne_sdg() {
		return pne_sdg;
	}
	public void setPne_sdg(String pne_sdg) {
		this.pne_sdg = pne_sdg;
	}
	public String getAda_sdg() {
		return ada_sdg;
	}
	public void setAda_sdg(String ada_sdg) {
		this.ada_sdg = ada_sdg;
	}
	public String getException() {
		return exception;
	}
	public void setException(String exception) {
		this.exception = exception;
	}
	public String getCg() {
		return cg;
	}
	public void setCg(String cg) {
		this.cg = cg;
	}
	public String getAge_bracket() {
		return age_bracket;
	}
	public void setAge_bracket(String age_bracket) {
		this.age_bracket = age_bracket;
	}
	
	
	
}
