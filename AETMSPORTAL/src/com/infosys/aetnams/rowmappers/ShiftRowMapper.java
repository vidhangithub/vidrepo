package com.infosys.aetnams.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;



import com.infosys.aetnams.pojos.Shift;

public class ShiftRowMapper implements RowMapper<Shift>{

	
	@Override
	public Shift mapRow(ResultSet rs, int rowNmu) throws SQLException {
		
		
		Shift shift=new Shift();
		shift.setInfyId(rs.getInt("INFY_ID"));
		shift.setEmpName(rs.getString("EMP_NAME"));
		shift.setStream(rs.getString("STREAM"));
		shift.setApplications(rs.getString("APPLICATIONS"));
		
		shift.setDate1(rs.getDate("DATE1"));
		shift.setShift1(rs.getString("SHIFT1"));
		shift.setDate2(rs.getDate("DATE2"));
		shift.setShift2(rs.getString("SHIFT2"));
		shift.setDate3(rs.getDate("DATE3"));
		shift.setShift3(rs.getString("SHIFT3"));
		shift.setDate4(rs.getDate("DATE4"));
		shift.setShift4(rs.getString("SHIFT4"));
		shift.setDate5(rs.getDate("DATE5"));
		shift.setShift5(rs.getString("SHIFT5"));
		
		return shift;
	}

}
