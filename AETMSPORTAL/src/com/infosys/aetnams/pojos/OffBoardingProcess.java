package com.infosys.aetnams.pojos;
import java.sql.Date;

public class OffBoardingProcess {
	
	private long employeeId;
	private String doorAccessRevoke;
	private String nidDeactivate;
	private String revokeLanAccess;
	private String removeFromMailingList;
	private Date creationDate;
	private Date lastUpdatedDate;
	private String lastUpdatedBy;
	private String completionIndicator;
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getDoorAccessRevoke() {
		return doorAccessRevoke;
	}
	public void setDoorAccessRevoke(String doorAccessRevoke) {
		this.doorAccessRevoke = doorAccessRevoke;
	}
	public String getNidDeactivate() {
		return nidDeactivate;
	}
	public void setNidDeactivate(String nidDeactivate) {
		this.nidDeactivate = nidDeactivate;
	}
	public String getRevokeLanAccess() {
		return revokeLanAccess;
	}
	public void setRevokeLanAccess(String revokeLanAccess) {
		this.revokeLanAccess = revokeLanAccess;
	}
	public String getRemoveFromMailingList() {
		return removeFromMailingList;
	}
	public void setRemoveFromMailingList(String removeFromMailingList) {
		this.removeFromMailingList = removeFromMailingList;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	public String getCompletionIndicator() {
		return completionIndicator;
	}
	public void setCompletionIndicator(String completionIndicator) {
		this.completionIndicator = completionIndicator;
	}
	
	

}
