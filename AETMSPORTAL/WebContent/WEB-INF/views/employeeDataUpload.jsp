<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Employee Data Upload</title>
</head>
<body>
<center>
<form   action="empDataSave.infy" name="employeeDataUploadForm" >
<table align="center" border="4" bordercolor="black">
		
		<tr><th align="center" headers="2" colspan="3">Employee Data Upload</th></tr>
		<tr>
		    <td>Joinee's Infosys ID</td>
			<td colspan="2"><input type="text"  disabled="disabled" value="${EMPDATA.employeeId}">
			<input type="hidden"  name="employeeId" value="${EMPDATA.employeeId}">
			</td> 
		</tr>	
		<tr >
		    <td>Joinee's Name</td>	
			<td colspan="2"><input type="text"  name="employeeName" value="${EMPDATA.empName}"></td> 
		</tr>
		
		<tr >
		    <td>Aetna Email Id</td>	
			<td colspan="2"><input type="text"  name="aetnaEmailId" value="${EMPDATA.aetnaMailID}"></td> 
		</tr>
		<tr >
		    <td>Infosys Email Id</td>	
			<td colspan="2"><input type="text"  name="infyEmailId" value="${EMPDATA.infosysEmailId}"></td> 
		</tr>
		<tr >
		    <td>NID</td>	
			<td colspan="2"><input type="text"  name="nid" value="${EMPDATA.NID}"></td> 
		</tr>
		<tr >
		    <td>Reporting Manager</td>	
			<td colspan="2"><input type="text"  name="pm" value="${EMPDATA.reportingMGR}"></td> 
		</tr>
		<tr >
		    <td>Primary Domain</td>	
			<td colspan="2"><input type="text"  name="primaryDomain" value="${EMPDATA.primaryDomain}"></td> 
		</tr>
		<tr >
		    <td>Designation</td>	
			<td colspan="2"><input type="text"  name="designation" value="${EMPDATA.designation}"></td> 
		</tr>
		<tr >
		    <td>Primary Skill Set</td>	
			<td colspan="2"><input type="text"  name="primarySkillSet" value="${EMPDATA.primarySkill}"></td> 
		</tr>
	 	<tr >
		    <td>Cross Training</td>	
			<td colspan="2"><input type="text"  name="crossTraining" value="${EMPDATA.crossTrained}"></td> 
		</tr>
		<tr >
		    <td>Application</td>	
			<td colspan="2"><input type="text"  name="application" value="${EMPDATA.application}"></td> 
		</tr>
		
		<tr >
		    <td>Passport No.</td>	
			<td colspan="2"><input type="text"  name="passportNo" value="${EMPDATA.passportNumber}"></td> 
		</tr>
</table>

 <input type="submit" value="Submit" name="empDataSave" id="empDataSave"> <br/> <br/>
 
</form>

</center>
</body>
</html>