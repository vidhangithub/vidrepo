package com.infosys.aetnams.queries;

public interface ShiftOperationsQueries {
	
		public String GET_ADMIN_DETAILS = "select * from USER_LOGIN where INFOSYS_ID=?";
	
	public String GET_SHIFT_DETAILS="insert into SHIFT "+"(INFY_ID,EMP_NAME,STREAM,APPLICATIONS,DATE1,SHIFT1,DATE2,SHIFT2,DATE3,SHIFT3,DATE4,SHIFT4)"+"VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
	public String GET_SHIFT_DETAILS_V2="insert into SHIFT "+"(INFY_ID,EMP_NAME,STREAM,APPLICATIONS,DATE1,SHIFT1,DATE2,SHIFT2,DATE3,SHIFT3,DATE4,SHIFT4,DATE5,SHIFT5)"+"VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	public String DELETE_SHIFT_DETAILS="delete from SHIFT";
	public String GET_ALL_SHIFT = "SELECT * FROM SHIFT";
}
