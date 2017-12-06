package com.infosys.aetnams.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.infosys.aetnams.pojos.ApproverDashBoard;

public class ApproverDashBoardRowMapper implements RowMapper<ApproverDashBoard> {

	@Override
	public ApproverDashBoard mapRow(ResultSet rs, int rowNum)
			throws SQLException {
		ApproverDashBoard dashBoard = new ApproverDashBoard();
		if(null != rs){
			
			dashBoard.setQuery_id(rs.getInt("QUERY_ID"));
			
			dashBoard.setNID(rs.getString("NID"));
		
			dashBoard.setApplication_id(rs.getString("APPLICATION_ID"));
			
		
			dashBoard.setQuery(rs.getString("QUERY"));
			
			
			dashBoard.setDb_details(rs.getString("DB_DETAILS"));
		
			
			dashBoard.setApproved_by(rs.getString("APPROVED_BY"));
		
			
			dashBoard.setQuery_submitted_date(rs.getDate("QRY_SUBMTD_DATE").toString());
			
			if(null != rs.getDate("QRY_APPRVD_REJECTED_DATE")){
			dashBoard.setApproved_reject_date(rs.getDate("QRY_APPRVD_REJECTED_DATE").toString());
			}
		
			dashBoard.setRejection_reason(rs.getString("REASON_FOR_REJECTION"));
			
			}
			
			return dashBoard;
	}

}
