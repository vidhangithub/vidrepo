package com.infosys.aetnams.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.infosys.aetnams.pojos.Submitter;



/**
 * @author sampad_chakraborty
 *
 */
public class SubmitterRowMapper implements RowMapper<Submitter>{

	@Override
	public Submitter mapRow(ResultSet rs, int rowNum) throws SQLException {
		Submitter submitter = new Submitter();
		
		submitter.setLogin_Id(rs.getString("LOGIN_ID"));
		submitter.setPassword(rs.getString("PASSWORD"));
		submitter.setFirstName(rs.getString("FIRST_NAME"));
		submitter.setLastName(rs.getString("LAST_NAME"));
		submitter.setNID(rs.getString("NID"));
		
		return submitter;
	}

}
