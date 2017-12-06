

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
<legend>Shift-Details</legend>
<div  style="width:700px; overflow: auto;" ><div style="width:700px; overflow: auto;" >
<table id="example" class="display" align="center" border="0" width="150%">
<thead>
<tr>
<td>Employee-ID</td>
<td>Employee-Name</td>
<td>STREAM</td>
<td>Applications</td>
<td>FIRST-WEEK</td>
<td>SHIFT</td>
<td>SECOND-WEEK</td>
<td>SHIFT</td>
<td>THIRD-WEEK</td>
<td>SHIFT</td>
<td>FOURTH-WEEK</td>
<td>SHIFT</td>
<td>FIFTH-WEEK</td>
<td>SHIFT</td>
</tr>
</thead>


<tbody>
<c:forEach var="shiftInfo" items="${SHIFTINFO}" varStatus="matCounter">
<tr> 
<td> <c:out value="${shiftInfo.infyId}"></c:out> </td>
<td> <c:out value="${shiftInfo.empName}"></c:out> </td>
<td> <c:out value="${shiftInfo.stream}"></c:out> </td>
<td> <c:out value="${shiftInfo.applications}"></c:out> </td>
<td> <c:out value="${shiftInfo.date1}"></c:out> </td>
<td> <c:out value="${shiftInfo.shift1}"></c:out> </td>
<td> <c:out value="${shiftInfo.date2}"></c:out> </td>
<td> <c:out value="${shiftInfo.shift2}"></c:out> </td>
<td> <c:out value="${shiftInfo.date3}"></c:out> </td>
<td> <c:out value="${shiftInfo.shift3}"></c:out> </td>
<td> <c:out value="${shiftInfo.date4}"></c:out> </td>
<td> <c:out value="${shiftInfo.shift4}"></c:out> </td>
<td> <c:out value="${shiftInfo.date5}"></c:out> </td>
<td> <c:out value="${shiftInfo.shift5}"></c:out> </td>
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
			<th><input type="text" name="search_browser" value="Search " class="search_init" /></th>
			<th><input type="text" name="search_platform" value="Search " class="search_init" /></th>

		</tr>
	</tfoot>
	</table>
	</div>

 </div>
</fieldset>

</table>
</body>
</html>