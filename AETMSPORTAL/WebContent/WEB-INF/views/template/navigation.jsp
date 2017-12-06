<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<style>
	.new{
	  color:#d63083;
	    font-size: 30px;
	    font-style:verdana;
	    font-weight: bold;
	    border-bottom-right-radius:0px;
	    border-bottom-left-radius:0px
	}
	 
	</style>

<table>
<tr>

	<td style="padding-left:5px;">
		<img src="resources/images/ms_logo.png" style="height: 40px"></img>
	</td>

	<td>
		<c:out value='${sessionScope.INFYID}'/>
		<c:if test="${sessionScope.INFYID != null}">
		 |<a href='adminLogout.infy'>Logout</a>
		</c:if>
	</td>
</tr>
</table>
 