<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MS-Portal-BackLogResult</title>
<link rel="stylesheet" type="text/css" href="resources/dataTable/demo_table.css" />
</head>
<body>
<script type="text/javascript" src="resources/dataTable/dataTables.js"></script>

<script type="text/javascript" charset="utf-8">
			var asInitVals = new Array();
			
			$(document).ready(function() {
				var oTable = $('#example').dataTable( {
					"oLanguage": {
						"sSearch": "Search all columns:"
					}
				} );
				
				$("tfoot input").keyup( function () {
					/* Filter on the column (the index) of this element */
					oTable.fnFilter( this.value, $("tfoot input").index(this) );
				} );
		
				$("tfoot input").each( function (i) {
					asInitVals[i] = this.value;
				} );
				
				$("tfoot input").focus( function () {
					if ( this.className == "search_init" )
					{
						this.className = "";
						this.value = "";
					}
				} );
				
				$("tfoot input").blur( function (i) {
					if ( this.value == "" )
					{
						this.className = "search_init";
						this.value = asInitVals[$("tfoot input").index(this)];
					}
				} );
			
			} );
		</script>
<fieldset>
<legend>BackLog-Status</legend>
<div  style="width:700px; overflow-x: scroll" ><div style="width:700px;" >   
<table id="example" class="display" align="center" border="0" width="100%">
<thead>
<tr>
<td>Assignment-Group</td>
<td>SM Number</td>
<td>Owner Name</td>
<td>Open Date</td>
<td>Status</td>
<td>SM Age</td>
<td>Under 10 Days</td>
<td>Within 10 to 20 Days</td>
<td>SM last Update</td>
<td>No of days ago updated</td>
<td>IM number</td>
<td>IM assignment group</td>
</tr>
</thead>
<tbody>
<c:forEach var="backInfo" items="${BACKINFO}">
<tr>
<td> <c:out value="${backInfo.assignment_group}"></c:out> </td>
<td> <c:out value="${backInfo.sm_number}"></c:out> </td>
<td> <c:out value="${backInfo.sm_owner_name}"></c:out> </td>
<td> <c:out value="${backInfo.sm_open_date}"></c:out> </td>
<td> <c:out value="${backInfo.sm_status}"></c:out> </td>
<td> <c:out value="${backInfo.sm_age}"></c:out> </td>
<td> <c:out value="${backInfo.under_ten_days}"></c:out> </td>
<td> <c:out value="${backInfo.within_ten_to_twenty}"></c:out> </td>
<td> <c:out value="${backInfo.sm_last_updt_dt}"></c:out> </td>
<td> <c:out value="${backInfo.sm_last_updt_days_ago}"></c:out> </td>
<td> <c:out value="${backInfo.im_number}"></c:out> </td>
<td> <c:out value="${backInfo.im_assignment_group}"></c:out> </td>
<%-- <td> <c:out value="${backInfo.im_status}"></c:out> </td>
<td> <c:out value="${backInfo.im_assignee_name}"></c:out> </td>
<td> <c:out value="${backInfo.pne_sdg}"></c:out> </td>
<td> <c:out value="${backInfo.ada_sdg}"></c:out> </td>
<td> <c:out value="${backInfo.exception}"></c:out> </td>
<td> <c:out value="${backInfo.cg}"></c:out> </td>
<td> <c:out value="${backInfo.age_bracket}"></c:out> </td> --%>
</tr>

</c:forEach>
</tbody><tfoot>
		<tr>
			<th><input type="text" name="search_engine" value="Search " class="search_init" /></th>
			<th><input type="text" name="search_browser" value="Search " class="search_init" /></th>
			<th><input type="text" name="search_platform" value="Search " class="search_init" /></th>
			<th><input type="text" name="search_engine" value="Search " class="search_init" /></th>
			<th><input type="text" name="search_browser" value="Search " class="search_init" /></th>
			<th><input type="text" name="search_platform" value="Search " class="search_init" /></th>
			<th><input type="text" name="search_engine" value="Search " class="search_init" /></th>
			<th><input type="text" name="search_browser" value="Search " class="search_init" /></th>
			<th><input type="text" name="search_platform" value="Search " class="search_init" /></th>
			<th><input type="text" name="search_engine" value="Search " class="search_init" /></th>
			<th><input type="text" name="search_browser" value="Search " class="search_init" /></th>
			<th><input type="text" name="search_platform" value="Search " class="search_init" /></th>

		</tr>
	</tfoot>
	</table>
	</div>

 </div>
</fieldset>
</body>
</html>