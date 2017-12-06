package com.infosys.aetnams.queries;

public interface AdminOperationsQueries {

	public String GET_ADMIN_DETAILS = "select * from USER_LOGIN where INFOSYS_ID=?";
	
	public String GET_ONBOARD_DETAILS ="select * from ONBOARDING_MASTER where EMP_NO=?";
	public String GET_OFFBOARD_DETAILS ="select * from OFFBOARDING_MASTER where EMP_NO=?";
	public String GET_EMPLOYEE_DETAILS ="select * from EMPLOYEE_MASTER  where EMP_NO=? and NAME=?";
	public String INSERT_ONBOARD_DETAILS ="insert into ONBOARDING_MASTER "+"(EMP_NO,NAME,WELCOME_MAIL_RECEIVED,NDA_IT_FORM_BG_CHECK,NDA_IT_FORM_SIGNED,DOOR_ACCESS,APPLY_FOR_NID_THROUGH_ACMS,ALLOCATE_BUFFER_PROJECT_CODE,MAIL_TO_SPOC_TO_APPLY_FOR_NID,LAN_ACCESS,COMPLIANCE_AND_ONBOARDING_KIT,"+"NDA_FORM_SCANNED_AND_UPLOADED,TEAM_TRACKER_UPDATED,ADDED_TO_MAIL_LIST,COMPLETED_MANDETORY_TRAININGS,FORWARD_ALLOCATION_IN_ALCON,MAP_ACTIVITIES_TO_DART,REQUEST_FOR_ALLOCATION_OF_VM,REQUEST_FOR_SOFTWARE_INSTALL,REQUEST_UPLOAD_FOR_NSA,CHECK_FOR_GOAL_SETTINGS,"+"CHECK_FOR_LATE_STAY,DESK_ALLOCATIONS,CREATION_DATE,LAST_UPDATE_DATE,LAST_UPDATED_BY,COMPLETION_INDICATOR)"+"VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public String GET_BACKLOG_DETAILS="insert into BACKLOG_MASTER "+"(Assignment_Group,SM_Number,SM_Owner_Name,SM_Open_Date,SM_Status,Age,UnderTenDays,WithinTenToTwenty,SM_Last_Updated_Date,Last_Updated_Days_Ago,IM_Number,IM_Assignment_Group,IM_Status,IM_Assignee_Name,PnE_SDG,ADA_SDG,Exception,CG,Age_Bracket)"+"VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	public String DELETE_BACKLOG_DETAILS="delete from BACKLOG_MASTER";
	
	public String UPDATE_ONBOARD_DETAILS ="update ONBOARDING_MASTER "+" set NAME=?,WELCOME_MAIL_RECEIVED=?,NDA_IT_FORM_BG_CHECK=?,NDA_IT_FORM_SIGNED=?,DOOR_ACCESS=?,APPLY_FOR_NID_THROUGH_ACMS=?,ALLOCATE_BUFFER_PROJECT_CODE=?,MAIL_TO_SPOC_TO_APPLY_FOR_NID=?,LAN_ACCESS=?,COMPLIANCE_AND_ONBOARDING_KIT=?,"+"NDA_FORM_SCANNED_AND_UPLOADED=?,TEAM_TRACKER_UPDATED=?,ADDED_TO_MAIL_LIST=?,COMPLETED_MANDETORY_TRAININGS=?,FORWARD_ALLOCATION_IN_ALCON=?,MAP_ACTIVITIES_TO_DART=?,REQUEST_FOR_ALLOCATION_OF_VM=?,REQUEST_FOR_SOFTWARE_INSTALL=?,REQUEST_UPLOAD_FOR_NSA=?,CHECK_FOR_GOAL_SETTINGS=?,"+"CHECK_FOR_LATE_STAY=?,DESK_ALLOCATIONS=?,LAST_UPDATE_DATE=?,LAST_UPDATED_BY=?,COMPLETION_INDICATOR=?"+"where EMP_NO=?";
	
	public String UPDATE_ONBOARD_ALL_YES_CHECK="Select * from ONBOARDING_MASTER "+" where WELCOME_MAIL_RECEIVED='yes' and NDA_IT_FORM_BG_CHECK='yes' and NDA_IT_FORM_SIGNED='yes' and DOOR_ACCESS='yes' and APPLY_FOR_NID_THROUGH_ACMS='yes' and ALLOCATE_BUFFER_PROJECT_CODE='yes' and MAIL_TO_SPOC_TO_APPLY_FOR_NID='yes' and LAN_ACCESS='yes' and COMPLIANCE_AND_ONBOARDING_KIT='yes' and "+"NDA_FORM_SCANNED_AND_UPLOADED='yes' and TEAM_TRACKER_UPDATED='yes' and ADDED_TO_MAIL_LIST='yes' and COMPLETED_MANDETORY_TRAININGS='yes' and FORWARD_ALLOCATION_IN_ALCON='yes' and MAP_ACTIVITIES_TO_DART='yes' and REQUEST_FOR_ALLOCATION_OF_VM='yes' and REQUEST_FOR_SOFTWARE_INSTALL='yes' and REQUEST_UPLOAD_FOR_NSA='yes' and CHECK_FOR_GOAL_SETTINGS='yes' and "+"CHECK_FOR_LATE_STAY='yes' and DESK_ALLOCATIONS='yes' and "+"EMP_NO=?";
	
	public String UPDATE_COMPLETION_IND_TO_YES="update ONBOARDING_MASTER set COMPLETION_INDICATOR=? where EMP_NO=?";
	
	public String INSERT_EMPLOYEE_DETAILS="insert into EMPLOYEE_MASTER "+"(EMP_NO,NAME,INFOSYS_EMAIL_ID)"+"VALUES (?,?,?)";
	
	public String UPDATE_EMPLOYEE_DETAILS="update EMPLOYEE_MASTER "+" set AETNA_EMAIL_ID=?,INFOSYS_EMAIL_ID=?,NID=?,PM=?,PRIMARY_DOMAIN=?,DESIGNATION=?,PRIMARY_SKILL_SET=?,CROSS_TRAINING=?,APPLICATION=?,PASSPORT_NUMBER=?"+"where EMP_NO=?";
	
	public String INSERT_OFFBOARD_DETAILS ="insert into OFFBOARDING_MASTER "+"(EMP_NO,DOOR_ACCESS_REVOKE,NID_DEACTIVATE,REVOKE_LAN_ACCESS,REMOVE_FROM_MAILING_LIST,CREATION_DATE,LAST_UPDATED_DATE,LAST_UPDATED_BY,COMPLETION_INDICATOR)"+"VALUES (?,?,?,?,?,?,?,?,?)";
	
	public String UPDATE_OFFBOARD_DETAILS ="update OFFBOARDING_MASTER "+" set DOOR_ACCESS_REVOKE=?,NID_DEACTIVATE=?,REVOKE_LAN_ACCESS=?,REMOVE_FROM_MAILING_LIST=?,LAST_UPDATED_DATE=?,LAST_UPDATED_BY=?,COMPLETION_INDICATOR=?"+"where EMP_NO=?";
	
	public String UPDATE_OFFBOARD_ALL_YES_CHECK="Select * from OFFBOARDING_MASTER "+" where DOOR_ACCESS_REVOKE='yes' and NID_DEACTIVATE='yes' and REVOKE_LAN_ACCESS='yes' and REMOVE_FROM_MAILING_LIST='yes'and "+"EMP_NO=?";
	
	public String UPDATE_OFFBOARD_COMPLETION_IND_TO_YES="update OFFBOARDING_MASTER set COMPLETION_INDICATOR=? where EMP_NO=?";
	
	public String DELETE_EMPLOYEE_DETAILS_OFFBOARD ="delete from OFFBOARDING_MASTER  where EMP_NO=?";
	
	public String DELETE_EMPLOYEE_DETAILS_ONBOARD ="delete from ONBOARDING_MASTER  where EMP_NO=?";
	
	public String DELETE_EMPLOYEE_DETAILS_MASTER ="delete from EMPLOYEE_MASTER  where EMP_NO=?";
	
}