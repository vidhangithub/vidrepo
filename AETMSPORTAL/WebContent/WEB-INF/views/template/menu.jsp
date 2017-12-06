<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<ul style="list-style:none;line-height:28px;">

	<%-- <li><spring:url value="/index.infy" var="homeUrl" htmlEscape="true" />
		<a href="${homeUrl}">Home</a>
	</li> --%>
	
	<%-- <li><spring:url value="/calcPrdctivty.infy" var="prdctvtyURL" htmlEscape="true" />
		<a href="${prdctvtyURL}">Productivity</a>
	</li> --%>
	
	<%-- <li><spring:url value="/srDetail.infy" var="srDetailURL" htmlEscape="true" />
		<a href="${srDetailURL}">SR-List</a>
	</li> --%>

	<li><spring:url value="/qrLogin.infy" var="queryReviewUrl" htmlEscape="true" />
		<a href="${queryReviewUrl}">Query-Review</a>
	</li>
	
	<li><spring:url value="/shiftTracker.infy" var="shifttrackerURL" htmlEscape="true" />
		<a href="${shifttrackerURL}">Shift-Tracker</a>
	</li>
	
	<li><spring:url value="/chatLoginPage.infy" var="chatloginpageURL" htmlEscape="true" />
		<a href="${chatloginpageURL}">Discussion-Forum</a>
	</li>

</ul>
