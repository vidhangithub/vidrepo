package com.infosys.aetnams.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.infosys.aetnams.pojos.OffBoardingProcess;


public class OffBoardingProcessRowMapper implements RowMapper <OffBoardingProcess> {
	
	public OffBoardingProcess mapRow(ResultSet rs,int rowNum) throws SQLException{
		
		OffBoardingProcess offBoardingProcess = new OffBoardingProcess();
		
		offBoardingProcess.setEmployeeId(rs.getLong("EMP_NO"));
		offBoardingProcess.setDoorAccessRevoke(rs.getString("DOOR_ACCESS_REVOKE"));
		offBoardingProcess.setNidDeactivate(rs.getString("NID_DEACTIVATE"));
		offBoardingProcess.setRevokeLanAccess(rs.getString("REVOKE_LAN_ACCESS"));
		offBoardingProcess.setRemoveFromMailingList(rs.getString("REMOVE_FROM_MAILING_LIST"));
		offBoardingProcess.setCreationDate(rs.getDate("CREATION_DATE"));
		offBoardingProcess.setLastUpdatedDate(rs.getDate("LAST_UPDATED_DATE"));
		offBoardingProcess.setLastUpdatedBy(rs.getString("LAST_UPDATED_BY"));
		offBoardingProcess.setCompletionIndicator(rs.getString("COMPLETION_INDICATOR"));
		
		return offBoardingProcess;
		
	}
	
}
