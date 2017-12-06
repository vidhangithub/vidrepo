package com.infosys.aetnams.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.infosys.aetnams.pojos.Approver;



/**
 * @author sampad_chakraborty
 *
 */
public class ApproverRowMapper implements RowMapper<Approver> {

	@Override
	public Approver mapRow(ResultSet rs, int rowNum) throws SQLException {
		Approver approver = new Approver();
		approver.setApproverNID(rs.getString("APPROVER_NID"));
		approver.setFirstName(rs.getString("FIRST_NAME"));
		approver.setLastName(rs.getString("LAST_NAME"));
		approver.setLogin_Id(rs.getString("LOGIN_ID"));
		approver.setPassword(rs.getString("PASSWORD"));
		return approver;
	}

}
