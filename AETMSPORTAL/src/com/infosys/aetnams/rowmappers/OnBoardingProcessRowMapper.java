package com.infosys.aetnams.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.infosys.aetnams.pojos.OnBoardingProcess;

public class OnBoardingProcessRowMapper implements RowMapper <OnBoardingProcess> {

	@Override
	public OnBoardingProcess mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		OnBoardingProcess onBoardingProcess=new OnBoardingProcess();
		
		onBoardingProcess.setEmployeeId(rs.getLong("EMP_NO"));
		onBoardingProcess.setEmployeeName(rs.getString("NAME"));
		onBoardingProcess.setWelcomeMailReceived(rs.getString("WELCOME_MAIL_RECEIVED"));
		onBoardingProcess.setNdaITformBgCheck(rs.getString("NDA_IT_FORM_BG_CHECK"));
		onBoardingProcess.setNdaITformSigned(rs.getString("NDA_IT_FORM_SIGNED"));
		onBoardingProcess.setDoorAccess(rs.getString("DOOR_ACCESS"));
		onBoardingProcess.setApplyForNIDthroughACMS(rs.getString("APPLY_FOR_NID_THROUGH_ACMS"));
		onBoardingProcess.setAllocateBufferProjectCode(rs.getString("ALLOCATE_BUFFER_PROJECT_CODE"));
		onBoardingProcess.setMailToSpocToApplyForNID(rs.getString("MAIL_TO_SPOC_TO_APPLY_FOR_NID"));
		onBoardingProcess.setLanAccess(rs.getString("LAN_ACCESS"));
		onBoardingProcess.setComplianceAndOnboardingKit(rs.getString("COMPLIANCE_AND_ONBOARDING_KIT"));
		onBoardingProcess.setNDAformScannedAndUploaded(rs.getString("NDA_FORM_SCANNED_AND_UPLOADED"));
		onBoardingProcess.setTeamTrackerUpdated(rs.getString("TEAM_TRACKER_UPDATED"));
		onBoardingProcess.setAddedToMailList(rs.getString("ADDED_TO_MAIL_LIST"));
		onBoardingProcess.setCompletedMandatoryTrainings(rs.getString("COMPLETED_MANDETORY_TRAININGS"));
		onBoardingProcess.setForwardAllocationInALCON(rs.getString("FORWARD_ALLOCATION_IN_ALCON"));
		onBoardingProcess.setMapActivitiesToDART(rs.getString("MAP_ACTIVITIES_TO_DART"));
		onBoardingProcess.setRequestforVMAllocation(rs.getString("REQUEST_FOR_ALLOCATION_OF_VM"));
		onBoardingProcess.setRequestForSWInstall(rs.getString("REQUEST_FOR_SOFTWARE_INSTALL"));
		onBoardingProcess.setRequestForNSAUpload(rs.getString("REQUEST_UPLOAD_FOR_NSA"));
		onBoardingProcess.setCheckForGoalSettings(rs.getString("CHECK_FOR_GOAL_SETTINGS"));
		onBoardingProcess.setCheckForLateStay(rs.getString("CHECK_FOR_LATE_STAY"));
		onBoardingProcess.setDeskAllocations(rs.getString("DESK_ALLOCATIONS"));
		onBoardingProcess.setCreationDate(rs.getDate("CREATION_DATE"));
		onBoardingProcess.setLastUpdateDate(rs.getDate("LAST_UPDATE_DATE"));
		onBoardingProcess.setLastUpdatedBy(rs.getString("LAST_UPDATED_BY"));
		onBoardingProcess.setCompletionIndicator(rs.getString("COMPLETION_INDICATOR"));
		
		return onBoardingProcess;
	}

}
