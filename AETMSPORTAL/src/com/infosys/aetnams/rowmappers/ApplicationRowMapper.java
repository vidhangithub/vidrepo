package com.infosys.aetnams.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.infosys.aetnams.pojos.Application;

/*START : Application Service changes- 609333:Amit Pandey */
public class ApplicationRowMapper implements RowMapper<Application>{

	@Override
	public Application mapRow(ResultSet rs, int rowNmu) throws SQLException {
		Application application = new Application();
		application.setApplicationID(rs.getString("App_Id"));
		application.setApplicationName(rs.getString("App_Short_Name"));
		application.setGroupName(rs.getString("Group_Name"));
		application.setPrimaryOffshore(rs.getString("Primary_Offshore_SME"));
		application.setBackupOffshore(rs.getString("Backup_Offshore_SME"));
		application.setOnsiteL3(rs.getString("Onsite_L3"));
		application.setOffshoreSpoc(rs.getString("Offshore_SPOC"));
		return application;
	}
	/*END : Application Service changes- 609333:Amit Pandey */
}
