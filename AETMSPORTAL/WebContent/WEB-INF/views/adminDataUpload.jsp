<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>

<style type="text/css">
.background {
	
	z-index: -1;
	background: #DDE5ED;
	padding: 15px;
	margin-top: 5px;
	vertical-align: top;
	
	
}

.seperator {
	width: 0px;
	background: linear-gradient(to bottom, #c5deea 0%, #8abbd7 31%, #066dab 100%);
}

.login-main {
	width: 370px;
	height: 340px;
	/*  z-index: -1; */
	margin-top: 15px;
	margin-bottom: 15px;
	margin-right: 30px;
	margin-left: 30px;
	background: linear-gradient(to bottom, #4f85bb 0%, #4f85bb 100%);
}

.login-sub {
	width: 300px;
	height: 280px;
	/*  z-index: -1; */
	margin-top: 10px;
	margin-bottom: 10px;
	margin-right: 30px;
	margin-left: 30px;
	background: #a7cfdf;
	background: linear-gradient(to bottom, #a7cfdf 0%, #23538a 100%);
}

.btn {
	background: #3f80ab;
	background-image: -webkit-linear-gradient(top, #3f80ab, #3f80ab);
	background-image: -moz-linear-gradient(top, #3f80ab, #3f80ab);
	background-image: -ms-linear-gradient(top, #3f80ab, #3f80ab);
	background-image: -o-linear-gradient(top, #3f80ab, #3f80ab);
	background-image: linear-gradient(to bottom, #3f80ab, #3f80ab);
	-webkit-border-radius: 20;
	-moz-border-radius: 20;
	border-radius: 20px;
	font-family: Arial;
	color: #ffffff;
	font-size: 15px;
	padding: 5px 20px 5px 20px;
	text-decoration: none;
}

.btn:hover {
	background: #3cb0fd;
	background-image: -webkit-linear-gradient(top, #3cb0fd, #3498db);
	background-image: -moz-linear-gradient(top, #3cb0fd, #3498db);
	background-image: -ms-linear-gradient(top, #3cb0fd, #3498db);
	background-image: -o-linear-gradient(top, #3cb0fd, #3498db);
	background-image: linear-gradient(to bottom, #3cb0fd, #3498db);
	text-decoration: none;
}

.link:hover {
	background: #28597a;
	color: #ccc;
}
</style>
<script>  
function validateform(){  
var infyid=document.onBoardForm.infosysid.value;  
var numbers = /^[0-9]+$/;   
  
if (infyid==null || infyid==""){  
  alert("Please enter infosys Id to proceed.");  
 return false;} 
 
else if(infyid.length<3){  
  alert("Infy ID must be at least 3 characters long.");  
 return false;  
  } 

else if(infyid.length>8){  
	  alert("Infy ID must be at less than or equal to 8 characters long.");  
	 return false;  
	  }

else if (document.onBoardForm.infosysid.value.match(numbers))
	{
	
	return true;
	}
else {
	alert("Infosys Id should be numaric only");
	return false;
}
}  

</script> 

</head>

 <table style="background-color: #e2ecf5; width: 740px; height: 33px; box-shadow: 5px 5px 3px #268E94;margin-top: 20px;margin-bottom: 20px" border="0" cellspacing="0" cellpadding="0">
<tbody>
<tr>
<td><span style="color: #002200;"><strong><span style="font-size: large; font-family: verdana,geneva;">${SCSMSG}<c:out value='${sessionScope.INFYID}'/></span></strong></span></td>
</tr>
</tbody>
</table>


<%-- 
<h1>${ERRMSG}</h1>
<h2>${EMPDATASUCCCMSG}</h2>
<h3>Upload data for Queue-Status</h3>

<form action="dataupload.infy" method="post"
                        enctype="multipart/form-data">
<input type="file" name="file" size="50" />
<br />
<input type="submit" value="Upload File" />
</form>

<h3>Upload data for upcoming Shift Details</h3>

<form action="shiftdataupload.infy" method="post"
                        enctype="multipart/form-data">
<input type="file" name="file" size="50" />
<br />
<input type="submit" value="ShiftUpload" />
</form>
<h2>${DATASAVESCSMSG}</h2>
<form action="onBoard.infy" method="post" name="onBoardForm" onsubmit="return validateform();">
  <div class="login-wrap" style="top: 40px;float:right; padding-right: 20px" >
  <fieldset>
  <legend> Start Onboarding</legend>
  <div class="form">
    <input type="text" name="infosysid"  placeholder="infosysId" /> <br>
   
    <input type="submit" value="Let's Go" name="loginSubmit" id="loginSubmit"> 
  </div>
  </fieldset>
</div>

</form>  --%>

<table class="background">

	<tr>
		<td width="430px" height="55"><font color="066dab">
		<font color="blue" size="1"
								style="margin-left: 14px; margin-top: 3px; width: 15px; height: 16px">${SCSMSG1}</font>
		<font color="blue" size="1"
								style="margin-left: 14px; margin-top: 3px; width: 15px; height: 16px">${ERRMSG}</font>
<font color="blue" size="1"
								style="margin-left: 14px; margin-top: 3px; width: 15px; height: 16px">${EMPDATASUCCCMSG}</font><br />
<font color="066dab" size="3"
								style="margin-left: 14px; margin-top: 3px; width: 15px; height: 16px">
Upload data for Queue-Status</font>

<form action="dataupload.infy" method="post"
                        enctype="multipart/form-data">
<input type="file" name="file" size="50" />
<br />
<input type="submit" value="Upload File" class="btn"
style="font-size: 15px; margin-left: 14px; margin-top: 5px;"/>
</form>
<font color="066dab" size="3"
								style="margin-left: 14px; margin-top: 3px; width: 15px; height: 16px">
Upload data for upcoming Shift Details</font>

<form action="shiftdataupload.infy" method="post"
                        enctype="multipart/form-data">
<input type="file" name="file" size="50" />
<br />
<input type="submit" value="ShiftUpload"  class="btn"
style="font-size: 15px; margin-left: 14px; margin-top: 5px;"/>
</form>
		
		
		</font></td>



		<td  class="login-sub">
			<div id="loginDiv">
			<font color="blue" size="1"
								style="margin-left: 14px; margin-top: 3px; width: 15px; height: 16px">
			${DATASAVESCSMSG} ${OFFBOARDSMSG}</font>
			
			
			
			
			
			<form action="offBoard.infy" method="post"  >
					<table>
<tr>


							<td colspan="2">
								<font color="066dab"  size="3"
								style="margin-left: 14px; margin-top: 3px; width: 15px; height: 16px">OFF BOARDING PROCESS</font>
							</td>
						</tr>

						<tr>
							<td colspan="2"><input type="text" name="infosysid"  placeholder="infosysId"
								style="font-size: 14px; margin-left: 14px; margin-top: 5px; width: 226px; height: 20px" />
							</td>
						</tr>
						
						
						<tr>
							<td>
							 <input type="submit" value="Let's Go" name="loginSubmit" id="loginSubmit" class="btn" style="font-size: 15px; margin-left: 14px; margin-top: 5px;"/> 
							</td>
						</tr>

						
					</table>
				</form>
		<form action="onBoard.infy" method="post" name="onBoardForm" onsubmit="return validateform();">
					<table>
<tr>


							<td colspan="2">
								<font color="066dab"  size="3"
								style="margin-left: 14px; margin-top: 3px; width: 15px; height: 16px">ON BOARDING PROCESS</font>
							</td>
						</tr>

						<tr>
							<td colspan="2"><input type="text" name="infosysid"  placeholder="infosysId"
								style="font-size: 14px; margin-left: 14px; margin-top: 5px; width: 226px; height: 20px" />
							</td>
						</tr>
						
						
						<tr>
							<td>
							 <input type="submit" value="Let's Go" name="loginSubmit" id="loginSubmit" class="btn" style="font-size: 15px; margin-left: 14px; margin-top: 5px;"/> 
							</td>
						</tr>

						
					</table>
				</form>
			</div>
		</td>
	</tr>
</table>