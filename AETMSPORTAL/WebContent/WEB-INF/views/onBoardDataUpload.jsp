<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<script>  
function validateform(){  
var employeeName=document.OnBoardingStepsForm.employeeName.value;  
  
  
if (employeeName==null || employeeName==""){  
  alert("Employee Name can not be blank.");  
 return false;} 
 
else if(employeeName.length<6){  
  alert("Employee Name must be at least 6 characters long.");  
 return false;  
  } 

else if(employeeName.length>50){  
	  alert("Employee Name can not be more than 50 characters long.");  
	 return false;  
	  }  
}  
</script>

</head>
<body>

<center>

<h2>${ONBOARDCOMPLETEMSG}</h2>
<form   action="onBoardSave.infy" name="OnBoardingStepsForm" onsubmit="return validateform();">
<table align="center" border="4" bordercolor="black">
		
		<tr><th align="center" headers="2" colspan="3">OnBoarding Process</th></tr>
		<tr>
		    <td>Joinee's Infosys ID</td>
			<td colspan="2"><input type="text"   value="${ONBOARD.employeeId}" disabled="disabled">
			<input type="hidden"  name="employeeId" value="${ONBOARD.employeeId}">
			</td> 
		
		</tr>	
		<tr >
		    <td>Joinee's Name</td>	
			<td colspan="2"><input type="text"  name="employeeName" value="${ONBOARD.employeeName}"><font size="3" color="red">*</font></td> 
			
		</tr>
		
		<c:if test="${ONBOARD.getWelcomeMailReceived() != 'yes'}">	
		<tr >
			<td>Welcome mail Sent</td>
			<td><input type="radio" value="yes" name="welcomeLetter">Yes</td>
			<td><input type="radio" value="no" name="welcomeLetter" checked="checked">No</td>
		</tr>
		</c:if>
		<c:if test="${ONBOARD.getWelcomeMailReceived() == 'yes'}">	
		<tr >
			<td>Welcome mail Sent</td>
			<td><input type="radio" value="yes" name="welcomeLetter" checked="checked" >Yes</td>
			<td><input type="radio" value="no" name="welcomeLetter" >No</td>
		</tr>
		</c:if>
		
		<c:if test="${ONBOARD.getNdaITformBgCheck() != 'yes'}">
		<tr>
			<td>NDA/IT Form Background Check</td>
			<td><input type="radio" value="yes" name="ndaITBGcheck">Yes</td>
			<td><input type="radio" value="no"name="ndaITBGcheck" checked="checked">No</td>
		</tr>
		</c:if>
		<c:if test="${ONBOARD.getNdaITformBgCheck() == 'yes'}">
		<tr>
			<td>NDA/IT Form Background Check</td>
			<td><input type="radio" value="yes" name="ndaITBGcheck" checked="checked" >Yes</td>
			<td><input type="radio" value="no" name="ndaITBGcheck"  >No</td>
		</tr>
		</c:if>
		
		<c:if test="${ONBOARD.getNdaITformSigned() != 'yes'}">
		<tr>
			<td>NDA/IT Form Signed</td>
			<td><input type="radio" value="yes" name="ndaITsigned">Yes</td>
			<td><input type="radio" value="no" name="ndaITsigned" checked="checked">No</td>
		</tr>
		</c:if>
		<c:if test="${ONBOARD.getNdaITformSigned() == 'yes'}">
		<tr>
			<td>NDA/IT Form Signed</td>
			<td><input type="radio" value="yes" name="ndaITsigned" checked="checked" >Yes</td>
			<td><input type="radio" value="no" name="ndaITsigned" >No</td>
		</tr>
		</c:if>
		
		<c:if test="${ONBOARD.getDoorAccess() != 'yes'}">
		<tr>
			<td>Door Access given</td>
			<td><input type="radio" value="yes" name="doorAcess">Yes</td>
			<td><input type="radio" value="no" name="doorAcess" checked="checked">No</td>
		</tr>
		</c:if>
		<c:if test="${ONBOARD.getDoorAccess() == 'yes'}">
		<tr>
			<td>Door Access given</td>
			<td><input type="radio" value="yes" name="doorAcess"  checked="checked">Yes</td>
			<td><input type="radio" value="no" name="doorAcess"  >No</td>
		</tr>
		</c:if>
		
		<c:if test="${ONBOARD.getApplyForNIDthroughACMS() != 'yes'}">
		<tr>
			<td>Apply For NID through ACMS</td>
			<td><input type="radio" value="yes" name="applyForNIDacms">Yes</td>
			<td><input type="radio" value="no" name="applyForNIDacms" checked="checked">No</td>
		</tr>
		</c:if>
		<c:if test="${ONBOARD.getApplyForNIDthroughACMS() == 'yes'}">
		<tr>
			<td>Apply For NID through ACMS</td>
			<td><input type="radio" value="yes" name="applyForNIDacms" checked="checked" >Yes</td>
			<td><input type="radio" value="no" name="applyForNIDacms" >No</td>
		</tr>
		</c:if>
		
		<c:if test="${ONBOARD.getAllocateBufferProjectCode() != 'yes'}">
		<tr>
			<td>Allocate Buffer and Project Code</td>
			<td><input type="radio" value="yes" name="allocateBFFRProjCode">Yes</td>
			<td><input type="radio" value="no" name="allocateBFFRProjCode" checked="checked">No</td>
		</tr>
		</c:if>
		<c:if test="${ONBOARD.getAllocateBufferProjectCode() == 'yes'}">
		<tr>
			<td>Allocate Buffer and Project Code</td>
			<td><input type="radio" value="yes" name="allocateBFFRProjCode" checked="checked" >Yes</td>
			<td><input type="radio" value="no" name="allocateBFFRProjCode" >No</td>
		</tr>
		</c:if>
		
		<c:if test="${ONBOARD.getMailToSpocToApplyForNID() != 'yes'}">
		<tr>
			<td>Mail to SPOC to apply for NID</td>
			<td><input type="radio" value="yes" name="mailToSPOCforNID">Yes</td>
			<td><input type="radio" value="no" name="mailToSPOCforNID" checked="checked">No</td>
		</tr>
		</c:if>
		<c:if test="${ONBOARD.getMailToSpocToApplyForNID() == 'yes'}">
		<tr>
			<td>Mail to SPOC to apply for NID</td>
			<td><input type="radio" value="yes" name="mailToSPOCforNID" checked="checked" >Yes</td>
			<td><input type="radio" value="no" name="mailToSPOCforNID" >No</td>
		</tr>
		</c:if>
		
		<c:if test="${ONBOARD.getLanAccess() != 'yes'}">
		<tr>
			<td>LAN Access given</td>
			<td><input type="radio" value="yes" name="lanAccess">Yes</td>
			<td><input type="radio" value="no" name="lanAccess" checked="checked">No</td>
		</tr>
		</c:if>
		<c:if test="${ONBOARD.getLanAccess() == 'yes'}">
		<tr>
			<td>LAN Access given</td>
			<td><input type="radio" value="yes" name="lanAccess" checked="checked" >Yes</td>
			<td><input type="radio" value="no" name="lanAccess" >No</td>
		</tr>
		</c:if>
		
		<c:if test="${ONBOARD.getComplianceAndOnboardingKit() != 'yes'}">
		<tr>
			<td>Communicate on compliance & Onboarding kit</td>
			<td><input type="radio" value="yes" name="comp&OnboardKit">Yes</td>
			<td><input type="radio" value="no" name="comp&OnboardKit" checked="checked">No</td>
		</tr>
		</c:if>
		<c:if test="${ONBOARD.getComplianceAndOnboardingKit() == 'yes'}">
		<tr>
			<td>Communicate on compliance & Onboarding kit</td>
			<td><input type="radio" value="yes" name="comp&OnboardKit" checked="checked" >Yes</td>
			<td><input type="radio" value="no" name="comp&OnboardKit" >No</td>
		</tr>
		</c:if>
		
		<c:if test="${ONBOARD.getNDAformScannedAndUploaded() != 'yes'}">
		<tr>
			<td>NDA Form Scanned & Uploaded</td>
			<td><input type="radio" value="yes" name="ndaFormScan&Upload">Yes</td>
			<td><input type="radio" value="no" name="ndaFormScan&Upload" checked="checked">No</td>
		</tr>
		</c:if>
		<c:if test="${ONBOARD.getNDAformScannedAndUploaded() == 'yes'}">
		<tr>
			<td>NDA Form Scanned & Uploaded</td>
			<td><input type="radio" value="yes" name="ndaFormScan&Upload" checked="checked" >Yes</td>
			<td><input type="radio" value="no" name="ndaFormScan&Upload" >No</td>
		</tr>
		</c:if>
		
		<c:if test="${ONBOARD.getTeamTrackerUpdated() != 'yes'}">
		<tr>
			<td>Team Tracker Updated</td>
			<td><input type="radio" value="yes" name="teamTrackerUpdate">Yes</td>
			<td><input type="radio" value="no" name="teamTrackerUpdate" checked="checked">No</td>
		</tr>
		</c:if>
		<c:if test="${ONBOARD.getTeamTrackerUpdated() == 'yes'}">
		<tr>
			<td>Team Tracker Updated</td>
			<td><input type="radio" value="yes" name="teamTrackerUpdate" checked="checked" >Yes</td>
			<td><input type="radio" value="no" name="teamTrackerUpdate" >No</td>
		</tr>
		</c:if>
		
		<c:if test="${ONBOARD.getAddedToMailList() != 'yes'}">
		<tr>
			<td>Added to mail List</td>
			<td><input type="radio" value="yes" name="addedToMailList">Yes</td>
			<td><input type="radio" value="no" name="addedToMailList" checked="checked">No</td>
		</tr>
		</c:if>
		<c:if test="${ONBOARD.getAddedToMailList() == 'yes'}">
		<tr>
			<td>Added to mail List</td>
			<td><input type="radio" value="yes" name="addedToMailList" checked="checked" >Yes</td>
			<td><input type="radio" value="no" name="addedToMailList"  >No</td>
		</tr>
		</c:if>
		
		<c:if test="${ONBOARD.getCompletedMandatoryTrainings() != 'yes'}">
		<tr>
			<td>Completed Mandatory Trainings</td>
			<td><input type="radio" value="yes" name="compMandTrainng">Yes</td>
			<td><input type="radio" value="no" name="compMandTrainng" checked="checked">No</td>
		</tr>
		</c:if>
		<c:if test="${ONBOARD.getCompletedMandatoryTrainings() == 'yes'}">
		<tr>
			<td>Completed Mandatory Trainings</td>
			<td><input type="radio" value="yes" checked="checked" name="compMandTrainng" >Yes</td>
			<td><input type="radio" value="no" name="compMandTrainng" >No</td>
		</tr>
		</c:if>
		
		<c:if test="${ONBOARD.getForwardAllocationInALCON() != 'yes'}">
		<tr>
			<td>Forward Allocations in ALCON</td>
			<td><input type="radio" value="yes" name="fwdAllocatnALCON">Yes</td>
			<td><input type="radio" value="no" name="fwdAllocatnALCON" checked="checked">No</td>
		</tr>
		</c:if>
		<c:if test="${ONBOARD.getForwardAllocationInALCON() == 'yes'}">
		<tr>
			<td>Forward Allocations in ALCON</td>
			<td><input type="radio" value="yes" name="fwdAllocatnALCON" checked="checked" >Yes</td>
			<td><input type="radio" value="no" name="fwdAllocatnALCON" >No</td>
		</tr>
		</c:if>
		
		<c:if test="${ONBOARD.getMapActivitiesToDART() != 'yes'}">
		<tr>
			<td>Map Activities To DART</td>
			<td><input type="radio" value="yes" name="mapActvtyToDART">Yes</td>
			<td><input type="radio" value="no" name="mapActvtyToDART" checked="checked">No</td>
		</tr>
		</c:if>
		<c:if test="${ONBOARD.getMapActivitiesToDART() == 'yes'}">
		<tr>
			<td>Map Activities To DART</td>
			<td><input type="radio" value="yes" name="mapActvtyToDART" checked="checked" >Yes</td>
			<td><input type="radio" value="no" name="mapActvtyToDART" >No</td>
		</tr>
		</c:if>

		<c:if test="${ONBOARD.getRequestforVMAllocation() != 'yes'}">
		<tr>
			<td>Request for VM Allocation</td>
			<td><input type="radio" value="yes" name="reqVMAllocatn">Yes</td>
			<td><input type="radio" value="no" name="reqVMAllocatn" checked="checked">No</td>
		</tr>
		</c:if>
		<c:if test="${ONBOARD.getRequestforVMAllocation() == 'yes'}">
		<tr>
			<td>Request for VM Allocation</td>
			<td><input type="radio" value="yes" name="reqVMAllocatn" checked="checked" >Yes</td>
			<td><input type="radio" value="no" name="reqVMAllocatn" >No</td>
		</tr>
		</c:if>

		<c:if test="${ONBOARD.getRequestForSWInstall() != 'yes'}">
		<tr>
			<td>Request for Software Install</td>
			<td><input type="radio" value="yes" name="reqForSWInstall">Yes</td>
			<td><input type="radio" value="no" name="reqForSWInstall" checked="checked">No</td>
		</tr>
		</c:if>
		<c:if test="${ONBOARD.getRequestForSWInstall() == 'yes'}">
		<tr>
			<td>Request for Software Install</td>
			<td><input type="radio" value="yes" name="reqForSWInstall" checked="checked" >Yes</td>
			<td><input type="radio" value="no" name="reqForSWInstall" >No</td>
		</tr>
		</c:if>
		
		<c:if test="${ONBOARD.getRequestForNSAUpload() != 'yes'}">
		<tr>
			<td>Request for NSA Upload</td>
			<td><input type="radio" value="yes" name="reqForNSAUpload">Yes</td>
			<td><input type="radio" value="no" name="reqForNSAUpload" checked="checked">No</td>
		</tr>
		</c:if>
		<c:if test="${ONBOARD.getRequestForNSAUpload() == 'yes'}">
		<tr>
			<td>Request for NSA Upload</td>
			<td><input type="radio" value="yes" name="reqForNSAUpload" checked="checked" >Yes</td>
			<td><input type="radio" value="no" name="reqForNSAUpload" >No</td>
		</tr>
		</c:if>

		<c:if test="${ONBOARD.getCheckForGoalSettings() != 'yes'}">
		<tr>
			<td>Check for Goal Settings</td>
			<td><input type="radio" value="yes" name="checkForGoalSet">Yes</td>
			<td><input type="radio" value="no" name="checkForGoalSet" checked="checked">No</td>
		</tr>
		</c:if>
		<c:if test="${ONBOARD.getCheckForGoalSettings() == 'yes'}">
		<tr>
			<td>Check for Goal Settings</td>
			<td><input type="radio" value="yes" name="checkForGoalSet" checked="checked" >Yes</td>
			<td><input type="radio" value="no" name="checkForGoalSet" >No</td>
		</tr>
		</c:if>

        <c:if test="${ONBOARD.getCheckForLateStay() != 'yes'}">
		<tr>
			<td>Check for Late Stay</td>
			<td><input type="radio" value="yes" name="chckForLateStay">Yes</td>
			<td><input type="radio" value="no" name="chckForLateStay" checked="checked">No</td>
		</tr>
		</c:if>
		<c:if test="${ONBOARD.getCheckForLateStay() == 'yes'}">
		<tr>
			<td>Check for Late Stay</td>
			<td><input type="radio" value="yes" name="chckForLateStay" checked="checked" >Yes</td>
			<td><input type="radio" value="no" name="chckForLateStay" >No</td>
		</tr>
		</c:if>

        <c:if test="${ONBOARD.getDeskAllocations() != 'yes'}">
		<tr>
			<td>Desk Allocation</td>
			<td><input type="radio" value="yes" name="deskAllocatn">Yes</td>
			<td><input type="radio" value="no" name="deskAllocatn" checked="checked">No</td>
		</tr>
		</c:if>
		<c:if test="${ONBOARD.getDeskAllocations() == 'yes'}">
		<tr>
			<td>Desk Allocation</td>
			<td><input type="radio" value="yes" name="deskAllocatn" checked="checked" >Yes</td>
			<td><input type="radio" value="no" name="deskAllocatn" >No</td>
		</tr>
		</c:if>
	 	
</table>

 <input type="submit" value="Save" name="OnBoardSave" id="OnBoardSave"> <br/> <br/>
 
</form>
<form action="insertEmp.infy">
<input type="hidden" value="${ONBOARD.employeeId}" id="empId" name="empId">
<input type="hidden" value="${ONBOARD.employeeName}" id="empName" name="empName">
<c:if test="${ONBOARD.getCompletionIndicator() == 'yes'}">
  <input type="submit" value="Submit" name="OnBoardSubmit" id="OnBoardSubmit"> 
  </c:if>
</form>
</center>
</body>
</html>