package com.infosys.aetnams.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.infosys.aetnams.pojos.Backlog;

public class BacklogRowMapper implements RowMapper<Backlog>{

	
	@Override
	public Backlog mapRow(ResultSet rs, int rowNmu) throws SQLException {
		Backlog backlog = new Backlog();
		backlog.setAssignment_group(rs.getString("Assignment_Group"));
		backlog.setSm_number(rs.getString("SM_Number"));
		backlog.setSm_owner_name(rs.getString("SM_Owner_Name"));
		backlog.setSm_open_date(rs.getDate("SM_Open_Date"));
		backlog.setSm_status(rs.getString("SM_Status"));
		backlog.setSm_age(rs.getDouble("Age"));
		backlog.setUnder_ten_days(rs.getDouble("UnderTenDays"));
		backlog.setWithin_ten_to_twenty(rs.getDouble("WithinTenToTwenty"));
		backlog.setSm_last_updt_dt(rs.getDate("SM_Last_Updated_Date"));
		backlog.setSm_last_updt_days_ago(rs.getDouble("Last_Updated_Days_Ago"));
		backlog.setIm_number(rs.getString("IM_Number"));
		backlog.setIm_assignment_group(rs.getString("IM_Assignment_Group"));
		return backlog;
	}
}
