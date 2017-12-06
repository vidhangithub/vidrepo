
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link rel="stylesheet" href="resources/datepicker/jquery-ui.css">
<link rel="stylesheet" type="text/css" href="resources/dataTable/demo_table.css" /> 
<script type="text/javascript" src="resources/dataTable/dataTables.js"></script>
<script type="text/javascript" src="resources/slides/slides.min.jquery.js"></script>
<script type="text/javascript" src="resources/datepicker/jquery-ui.js"></script>
  <script>

  $(function() {

    $( "#datepicker" ).datepicker();
    $( "#datepicker_one" ).datepicker();
  });
  

  </script>





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
<legend>ServiceRequest</legend>
<div  style="width:700px; overflow-x: scroll;" ><div style="width:700px;" >
<table id="example" class="display" align="center" border="0" width="100%">
<thead>
<tr>
<td>SR-Number</td>
<td>SR-Type</td>
<td>SR-Description</td>
<td>Application-Domain</td>
<td>Implementation-Date</td>
<td>App-Short-Name</td>
<td>SRE-Count</td>
<td>Overall_Status</td>
</tr>
</thead>


<tbody>
<c:forEach var="srInfo" items="${SRINFO}" varStatus="matCounter">
<tr>
<td> <c:out value="${srInfo.srID}"></c:out> </td>
<td> <c:out value="${srInfo.srType}"></c:out> </td>
<td> <c:out value="${srInfo.srDescription}"></c:out> </td>
<td> <c:out value="${srInfo.appDomain}"></c:out> </td>
<td> <c:out value="${srInfo.implementationDate}"></c:out> </td>
<td> <c:out value="${srInfo.appShortName}"></c:out> </td>
<td> <c:out value="${srInfo.sreCount}"></c:out> </td>
<td> <c:out value="${srInfo.overallStatus}"></c:out> </td>
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

		</tr>
	</tfoot>
	</table>
	</div>

 </div>
</fieldset>

<!-- <div>
Calculate SRE count from <input type="date" name="fromDate" id="fromDate">  to <input type="date" name="toDate" id="toDate"> <input type="submit" id="calculateSRE" value="Calculate">
</div> -->

<div>
<c:forEach var="srInfo" items="${SRINFO}" varStatus="matCounter" begin="0" end="0">
<c:if test="${srInfo.sdg eq '1'}">
<form action="calcSRE1.infy" method="post">
<table>
<tr>
<td>
<label for="from"><font color="green">Calculate SRE count From</font></label>

<input type="text" id="datepicker" name="fromdate">

<label for="to"><font color="green">to </font></label>

<input type="text" id="datepicker_one" name="todate"> <input type="submit" id="calculateSRE" value="Calculate">
</td>
</tr>
<tr>
<td><font color="red" style="border-bottom-color: cyan"> ${TOTALSRE} </font>  </td>
</tr>
</table>
</form>
</c:if>
</c:forEach>

</div>

<div>
<c:forEach var="srInfo" items="${SRINFO}" varStatus="matCounter" begin="0" end="0">
<c:if test="${srInfo.sdg eq '2'}">
<form action="calcSRE2.infy" method="post">
<table>
<tr>
<td>
<label for="from"><font color="green">Calculate SRE count From</font></label>

<input type="text" id="datepicker" name="fromdate">

<label for="to"><font color="green">to </font></label>

<input type="text" id="datepicker_one" name="todate"> <input type="submit" id="calculateSRE" value="Calculate">
</td>
</tr>
<tr>
<td><font color="red" style="border-bottom-color: cyan"> ${TOTALSRE} </font>  </td>
</tr>
</table>
</form>
</c:if>
</c:forEach>

</div>

<div>
<c:forEach var="srInfo" items="${SRINFO}" varStatus="matCounter" begin="0" end="0">
<c:if test="${srInfo.sdg eq '3'}">
<form action="calcSRE3.infy" method="post">
<table>
<tr>
<td>
<label for="from"><font color="green">Calculate SRE count From</font></label>

<input type="text" id="datepicker" name="fromdate">

<label for="to"><font color="green">to </font></label>

<input type="text" id="datepicker_one" name="todate"> <input type="submit" id="calculateSRE" value="Calculate">
</td>
</tr>
<tr>
<td><font color="red" style="border-bottom-color: cyan"> ${TOTALSRE} </font>  </td>
</tr>
</table>
</form>
</c:if>
</c:forEach>

</div>

<div>
<c:forEach var="srInfo" items="${SRINFO}" varStatus="matCounter" begin="0" end="0">
<c:if test="${srInfo.sdg eq '4'}">
<form action="calcSRE4.infy" method="post">
<table>
<tr>
<td>
<label for="from"><font color="green">Calculate SRE count From</font></label>

<input type="text" id="datepicker" name="fromdate">

<label for="to"><font color="green">to </font></label>

<input type="text" id="datepicker_one" name="todate"> <input type="submit" id="calculateSRE" value="Calculate">
</td>
</tr>
<tr>
<td><font color="red" style="border-bottom-color: cyan"> ${TOTALSRE} </font>  </td>
</tr>
</table>
</form>
</c:if>
</c:forEach>

</div>

<div>
<c:forEach var="srInfo" items="${SRINFO}" varStatus="matCounter" begin="0" end="0">
<c:if test="${srInfo.sdg eq '5'}">
<form action="calcSRE5.infy" method="post">
<table>
<tr>
<td>
<label for="from"><font color="green">Calculate SRE count From</font></label>

<input type="text" id="datepicker" name="fromdate">

<label for="to"><font color="green">to </font></label>

<input type="text" id="datepicker_one" name="todate"> <input type="submit" id="calculateSRE" value="Calculate">
</td>
</tr>
<tr>
<td><font color="red" style="border-bottom-color: cyan"> ${TOTALSRE} </font>  </td>
</tr>
</table>
</form>
</c:if>
</c:forEach>

</div>

</body>
</html>