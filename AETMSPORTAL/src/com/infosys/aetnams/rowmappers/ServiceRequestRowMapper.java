package com.infosys.aetnams.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.infosys.aetnams.pojos.Application;
import com.infosys.aetnams.pojos.ServiceRequest;
/*END : SR Service changes- 609333:Amit Pandey */
public class ServiceRequestRowMapper implements RowMapper<ServiceRequest>{
	@Override
	public ServiceRequest mapRow(ResultSet rs, int rowNmu) throws SQLException {
		ServiceRequest sr = new ServiceRequest();
		sr.setSrID(rs.getString("SR_Number"));
		sr.setSrType(rs.getString("SR_Type"));
		sr.setSrDescription(rs.getString("SR_Description"));
		sr.setAppDomain(rs.getString("APP_Domain"));
		sr.setImplementationDate(rs.getDate("Implementation_Date"));
		sr.setAppShortName(rs.getString("App_Short_Name"));
		sr.setSreCount(rs.getLong("SRE_Count"));
		sr.setOverallStatus(rs.getString("Overall_Status"));
		sr.setSdg(rs.getString("SDG"));
		return sr;
	}
	/*END : SR Service changes- 609333:Amit Pandey */
}
