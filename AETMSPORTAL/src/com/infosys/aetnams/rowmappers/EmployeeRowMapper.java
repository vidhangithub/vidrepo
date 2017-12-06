package com.infosys.aetnams.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.infosys.aetnams.pojos.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{

	

	@Override
	public Employee mapRow(ResultSet rs, int rowNmu) throws SQLException {
		Employee employee = new Employee();
		employee.setEmployeeId(rs.getLong("Emp_No"));
		employee.setEmpName(rs.getString("Name"));
		employee.setAetnaMailID(rs.getString("Aetna_Email_ID"));
		employee.setInfosysEmailId(rs.getString("Infosys_EMail_ID"));
		employee.setNID(rs.getString("NID"));
		employee.setReportingMGR(rs.getString("PM"));
		employee.setPassportNumber(rs.getString("Passport_Number"));
		employee.setPrimaryDomain(rs.getString("Primary_Domain"));
		employee.setDesignation(rs.getString("Designation"));
		employee.setPrimarySkill(rs.getString("Primary_Skill_Set"));
		employee.setCrossTrained(rs.getString("Cross_Training"));
		employee.setApplication(rs.getString("Application"));
		return employee;
	}

}
