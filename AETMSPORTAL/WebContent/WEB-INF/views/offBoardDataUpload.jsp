<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>

<center>

<h2>${OFFBOARDCOMPLETEMSG}</h2>
<form   action="offBoardSave.infy" name="OffBoardingStepsForm"">
<table align="center" border="4" bordercolor="black">
		
		<tr><th align="center" headers="2" colspan="3">OffBoarding Process</th></tr>
		<tr>
		    <td>Joinee's Infosys ID</td>
			<td colspan="2"><input type="text"   value="${OFFBOARD.employeeId}" disabled="disabled">
			<input type="hidden"  name="employeeId" value="${OFFBOARD.employeeId}">
			</td> 
		
		</tr>	
		
		<c:if test="${OFFBOARD.getDoorAccessRevoke() != 'yes'}">	
		<tr >
			<td>Door Access Revoked</td>
			<td><input type="radio" value="yes" name="dooraccess">Yes</td>
			<td><input type="radio" value="no" name="dooraccess" checked="checked">No</td>
		</tr>
		</c:if>
		<c:if test="${OFFBOARD.getDoorAccessRevoke() == 'yes'}">	
		<tr >
			<td>Door Access Revoked</td>
			<td><input type="radio" value="yes" name="dooraccess" checked="checked" >Yes</td>
			<td><input type="radio" value="no" name="dooraccess" >No</td>
		</tr>
		</c:if>
		
		<c:if test="${OFFBOARD.getNidDeactivate() != 'yes'}">
		<tr>
			<td>NID Deactivated</td>
			<td><input type="radio" value="yes" name="niddeactivate">Yes</td>
			<td><input type="radio" value="no"name="niddeactivate" checked="checked">No</td>
		</tr>
		</c:if>
		<c:if test="${OFFBOARD.getNidDeactivate() == 'yes'}">
		<tr>
			<td>NID Deactivated</td>
			<td><input type="radio" value="yes" name="niddeactivate" checked="checked" >Yes</td>
			<td><input type="radio" value="no" name="niddeactivate"  >No</td>
		</tr>
		</c:if>
		
		<c:if test="${OFFBOARD.getRevokeLanAccess() != 'yes'}">
		<tr>
			<td>LAN Access Revoked</td>
			<td><input type="radio" value="yes" name="lanrevoke">Yes</td>
			<td><input type="radio" value="no" name="lanrevoke" checked="checked">No</td>
		</tr>
		</c:if>
		<c:if test="${OFFBOARD.getRevokeLanAccess() == 'yes'}">
		<tr>
			<td>LAN Access Revoked</td>
			<td><input type="radio" value="yes" name="lanrevoke" checked="checked" >Yes</td>
			<td><input type="radio" value="no" name="lanrevoke" >No</td>
		</tr>
		</c:if>
		
		<c:if test="${OFFBOARD.getRemoveFromMailingList() != 'yes'}">
		<tr>
			<td>Removed From Mailing List</td>
			<td><input type="radio" value="yes" name="removemailinglist">Yes</td>
			<td><input type="radio" value="no" name="removemailinglist" checked="checked">No</td>
		</tr>
		</c:if>
		<c:if test="${OFFBOARD.getRemoveFromMailingList() == 'yes'}">
		<tr>
			<td>Removed From Mailing List</td>
			<td><input type="radio" value="yes" name="removemailinglist"  checked="checked">Yes</td>
			<td><input type="radio" value="no" name="removemailinglist"  >No</td>
		</tr>
		</c:if>
	 	
</table>

 <input type="submit" value="Save" name="OffBoardSave" id="OffBoardSave"> <br/> <br/>
 
</form>
<form action="deleteEmp.infy">
<input type="hidden" value="${OFFBOARD.employeeId}" id="empId" name="empId">
<c:if test="${OFFBOARD.getCompletionIndicator() == 'yes'}">
  <input type="submit" value="Submit" name="OffBoardSubmit" id="OffBoardSubmit">
  </c:if>
</form>
</center>
</body>
</html>