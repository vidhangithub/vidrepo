package com.infosys.aetnams.daos;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.infosys.aetnams.pojos.Shift;
import com.infosys.aetnams.queries.PortalQueries;
import com.infosys.aetnams.queries.ShiftOperationsQueries;
import com.infosys.aetnams.rowmappers.ShiftRowMapper;

public class ShiftDisplayDAOImpl implements ShiftDisplayDAO {
	
	
	
private JdbcTemplate jdbcTemplate;
	
	private ModelAndView mav = null;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	
	//pritam-------------start-------------
	
	
		@Override
		public ModelAndView getShiftDetails(HttpServletRequest req,
				HttpServletResponse res) {
			try {
				List<Shift> shiftlist = jdbcTemplate.query(ShiftOperationsQueries.GET_ALL_SHIFT, new ShiftRowMapper());
				if (shiftlist != null && !shiftlist.isEmpty()) {
					mav  = new ModelAndView("shift", "SHIFTINFO", shiftlist);
				
			} 
			}catch (Exception e) {
				System.out.println("Exception in DAOIMPL");
				e.printStackTrace();
				mav  = new ModelAndView("errorPage");
			}
			
			
			return mav;
		}
		
		
		//pritam-------------start-------------
}
