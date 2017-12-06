

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
		

<div align="left"><a href="approverDashBoard.infy" style="float: left;">My History</a></div><div align="right"><a href="submitterLogout.infy">Logout</a></div>	

    
<fieldset>
<legend>Approver Dash Board</legend>
<div  style="width:900px; overflow-x: scroll;" ><div style="width:900px;" >
<table id="example" class="display" align="center" border="0" width="100%">
<thead>
<tr>
<td>Application-ID</td>
<td>Query_ID</td>
<td>Query</td>
<td>DB Details</td>
<td>Query Submitted Date</td>
<td>Approved/Reject Date</td>
<td>Approved By</td>
<td>Rejection Reason</td>
<td>Comment</td>
</tr>
</thead>


<tbody>
<c:forEach var="aDashborad" items="${aDashBoard}" varStatus="matCounter">
<tr>
<td> <c:out value="${aDashborad.application_id}"></c:out> </td>
<td> <c:out value="${aDashborad.query_id}"></c:out> </td>
<td> <c:out value="${aDashborad.query}"></c:out> </td>
<td> <c:out value="${aDashborad.db_details}"></c:out> </td>
<td> <c:out value="${aDashborad.query_submitted_date}"></c:out> </td>
<td> <c:out value="${aDashborad.approved_reject_date}"></c:out> </td>
<td> <c:out value="${aDashborad.approved_by}"></c:out> </td>
<td> <c:out value="${aDashborad.rejection_reason}"></c:out> </td>
<td> <c:out value="${aDashborad.coments}"></c:out> </td>
</tr>
</c:forEach>
</tbody>
<tfoot>
		<tr>
			<th><input type="text" name="search_engine" value="Search " class="search_init" /></th>
			<th><input type="text" name="search_engine" value="Search " class="search_init" /></th>
			<th><input type="text" name="search_browser" value="Search " class="search_init" /></th>
			<th><input type="text" name="search_platform" value="Search " class="search_init" /></th>
			<th><input type="text" name="search_engine" value="Search " class="search_init" /></th>
			<th><input type="text" name="search_browser" value="Search " class="search_init" /></th>
			<th><input type="text" name="search_platform" value="Search " class="search_init" /></th>
			<th><input type="text" name="search_engine" value="Search " class="search_init" /></th>
			<th><input type="text" name="search_engine" value="Search " class="search_init" /></th>
    	</tr>
</tfoot>
	</table>
	</div>

 </div>
</fieldset>

</body>
</html>