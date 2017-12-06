package com.infosys.aetnams.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.infosys.aetnams.pojos.Admin;



public class AdminRowMapper implements RowMapper<Admin>{
	@Override
	public Admin mapRow(ResultSet rs, int rowNmu) throws SQLException {
		Admin admin = new Admin();
		
		
		admin.setInfosysid(rs.getString("INFOSYS_ID"));
		admin.setPassword(rs.getString("PASSWORD"));
		
		return admin;
	}

}
