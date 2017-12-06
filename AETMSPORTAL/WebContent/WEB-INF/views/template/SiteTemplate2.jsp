<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Aetna-MS-Portal-SiteTemplate</title>
</head>
<link rel="Shortcut icon" href="resources/images/logo.gif">
<link rel="stylesheet" href="resources/css/screen.css" type="text/css" media="screen, projection"></link>
<link rel="stylesheet" href="resources/css/print.css" type="text/css" media="print"></link>



<style>

 body{ margin-top:px; margin-bottom:20px; background-color:#F7BE81;}
</style>

<body>

	<div class="container" style="border: #C1C1C1 solid 1px; border-radius:10px;">
	
		<!-- Navigation -->
		<div class="span-24">
		<tiles:insertAttribute name="navigation" />
		</div>
		<!-- Header -->
		<tiles:insertAttribute name="header" />
		
		<!-- banner Page -->
		<div class="span-24">
			<tiles:insertAttribute name="banner" />
		</div>
	
	
		
		<!-- Body Page -->
		<div class="span-24">
			<tiles:insertAttribute name="body" />
		</div>
		<!-- Footer Page -->
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>
