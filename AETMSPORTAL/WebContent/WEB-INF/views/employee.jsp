

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link rel="stylesheet" type="text/css" href="resources/dataTable/demo_table.css" /> 
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
<legend>Employees </legend>
<div  style="width:900px; overflow-x: scroll;" ><div style="width:900px;" >
<table id="example" class="display" align="center" border="0" width="100%">
<thead>
<tr>
<td>Employee-ID</td>
<td>Employee-Name</td>
<td>Infosys-Mail-ID</td>
<td>Aetna-Mail-ID</td>
<td>NID</td>
<td>Reporting-Manager</td>
<td>Passport-No</td>
<td>Primary-Domain</td>
<td>Designation</td>
<td>Skill-Set</td>
<td>Cross-Trained-In</td>
<td>Application</td>
</tr>
</thead>


<tbody>
<c:forEach var="empInfo" items="${EMPINFO}" varStatus="matCounter">
<tr> 
<td> <c:out value="${empInfo.employeeId}"></c:out> </td>
<td> <c:out value="${empInfo.empName}"></c:out> </td>
<td> <c:out value="${empInfo.infosysEmailId}"></c:out> </td>
<td> <c:out value="${empInfo.aetnaMailID}"></c:out> </td>
<td> <c:out value="${empInfo.NID}"></c:out> </td>
<td> <c:out value="${empInfo.reportingMGR}"></c:out> </td>
<td> <c:out value="${empInfo.passportNumber}"></c:out> </td>
<td> <c:out value="${empInfo.primaryDomain}"></c:out> </td>
<td> <c:out value="${empInfo.designation}"></c:out> </td>
<td> <c:out value="${empInfo.primarySkill}"></c:out> </td>
<td> <c:out value="${empInfo.crossTrained}"></c:out> </td>
<td> <c:out value="${empInfo.application}"></c:out> </td>
</tr>
</c:forEach>
      </tbody>
	      	<tfoot>
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