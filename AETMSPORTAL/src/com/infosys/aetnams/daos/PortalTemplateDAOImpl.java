package com.infosys.aetnams.daos;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.infosys.aetnams.pojos.Employee;
import com.infosys.aetnams.queries.PortalQueries;
import com.infosys.aetnams.rowmappers.EmployeeRowMapper;

public class PortalTemplateDAOImpl implements PortalTemplateDAO {

	private JdbcTemplate jdbcTemplate;
	
	private ModelAndView mav = null;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	

	@Override
	public ModelAndView getEmployeeDetails(HttpServletRequest req,
			HttpServletResponse res) {
		try {
			List<Employee> employeeList = jdbcTemplate.query(PortalQueries.GET_ALL_EMPLOYEES, new EmployeeRowMapper());
			if (employeeList != null && !employeeList.isEmpty()) {
				mav  = new ModelAndView("result", "EMPINFO", employeeList);
			
		} 
		}catch (Exception e) {
			System.out.println("Exception in DAOIMPL");
			e.printStackTrace();
			mav  = new ModelAndView("errorPage");
		}
		
		
		return mav;
	}

}
