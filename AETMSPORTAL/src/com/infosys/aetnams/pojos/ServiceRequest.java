package com.infosys.aetnams.pojos;

import java.util.Date;


public class ServiceRequest {
	/*START : SR Service changes- 609333:Amit Pandey */
	private String srID;
	private String srType;
	private String srDescription;
	private String appDomain;
	private Date implementationDate;
	private String appShortName;
	private long sreCount;
	private String overallStatus;
	private String sdg;
	
	
	public String getSrID() {
		return srID;
	}
	public void setSrID(String srID) {
		this.srID = srID;
	}
	public String getSrType() {
		return srType;
	}
	public void setSrType(String srType) {
		this.srType = srType;
	}
	public String getSrDescription() {
		return srDescription;
	}
	public void setSrDescription(String srDescription) {
		this.srDescription = srDescription;
	}
	public String getAppDomain() {
		return appDomain;
	}
	public void setAppDomain(String appDomain) {
		this.appDomain = appDomain;
	}
	
	public Date getImplementationDate() {
		return implementationDate;
	}
	public void setImplementationDate(Date implementationDate) {
		this.implementationDate = implementationDate;
	}
	public String getAppShortName() {
		return appShortName;
	}
	public void setAppShortName(String appShortName) {
		this.appShortName = appShortName;
	}
	public long getSreCount() {
		return sreCount;
	}
	public void setSreCount(long sreCount) {
		this.sreCount = sreCount;
	}
	public String getOverallStatus() {
		return overallStatus;
	}
	public void setOverallStatus(String overallStatus) {
		this.overallStatus = overallStatus;
	}
	public String getSdg() {
		return sdg;
	}
	public void setSdg(String sdg) {
		this.sdg = sdg;
	}
	
	/*END : SR Service changes- 609333:Amit Pandey */
}
