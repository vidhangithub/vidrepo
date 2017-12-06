

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
<legend>Applications</legend>
<div  style="width:900px; overflow-x: scroll;" ><div style="width:900px;" >
<table id="example" class="display" align="center" border="0" width="100%">
<thead>
<tr>
<td>Application-ID</td>
<td>Application-Name</td>
<td>Group-Name</td>
<td>Primary-Offshore-SME</td>
<td>Backup-Offshore-SME</td>
<td>Onsite-L3</td>
<td>Offshore-SPOC</td>
</tr>
</thead>


<tbody>
<c:forEach var="applInfo" items="${APPLINFO}" varStatus="matCounter">
<tr>
<td> <c:out value="${applInfo.applicationID}"></c:out> </td>
<td> <c:out value="${applInfo.applicationName}"></c:out> </td>
<td> <c:out value="${applInfo.groupName}"></c:out> </td>
<td> <c:out value="${applInfo.primaryOffshore}"></c:out> </td>
<td> <c:out value="${applInfo.backupOffshore}"></c:out> </td>
<td> <c:out value="${applInfo.onsiteL3}"></c:out> </td>
<td> <c:out value="${applInfo.offshoreSpoc}"></c:out> </td>
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

		</tr>
	</tfoot>
	</table>
	</div>

 </div>
</fieldset>

</body>
</html>