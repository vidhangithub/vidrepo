 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <!DOCTYPE html>

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
var infyid=document.loginForm.infyid.value;  
var pswrd=document.loginForm.pswrd.value;  
  
if (infyid==null || infyid==""){  
  alert("Name can't be blank");  
 return false;} 
else if (pswrd==null || pswrd==""){  
	  alert("Password can not be blank");  
	 return false;} 
else if(pswrd.length<4){  
  alert("Password must be at least 4 characters long.");  
 return false;  
  }  
}  
</script>  


</head>

<body>

<%-- ${ERRMSG}
<form action="adminLogin.infy" method="post" name="loginForm" onsubmit="return validateform();">
   <div class="login-wrap" style="top: 40px;float:right; padding-right: 20px" >
  <fieldset>
  <legend> Login </legend>
  <div class="form">
    <input type="text" name="infyid" placeholder="Username"  /> <br>
    <input type="password"  name="pswrd" placeholder="Password" /><br>
    <input type="submit" value="SignIN" name="loginSubmit" id="loginSubmit"> 
  </div>
  </fieldset>
</div> 



</form> --%>

<table class="background">

	<tr>
		<td width="430px" height="55"><font color="066dab">Welcome
				To MS PORTAL ADMINISTRATOR. Here is the login for Admin user of the application<br> Admin can upload data through excell regarding Queue Status and Employee Shift details <br> Admin also can upload ONBOARDING details for new Joinee through this portal
				
		</font></td>


		<td  class="login-sub">
			<div id="loginDiv">
			<font color="red" size="1"
								style="margin-left: 14px; margin-top: 3px; width: 15px; height: 16px">
			${ERRMSG}</font>
		<form action="adminLogin.infy" method="post" name="loginForm" onsubmit="return validateform();">
					<table>
<tr>
							<td colspan="2">
								<font color="066dab"  size="3"
								style="margin-left: 14px; margin-top: 3px; width: 15px; height: 16px">Login</font>
							</td>
						</tr>

						<tr>
							<td colspan="2"><input type="text" name="infyid" placeholder="Username" 
								style="font-size: 14px; margin-left: 14px; margin-top: 5px; width: 226px; height: 20px" />
							</td>
						</tr>
						<tr>
							<td colspan="2"><input type="password" name="pswrd" placeholder="Password" 
								style="font-size: 14px; margin-left: 14px; margin-top: 5px; width: 226px; height: 20px" />
							</td>
						</tr>
						
						<tr>
							<td>
							 <input type="submit" value="SignIN" name="loginSubmit" id="loginSubmit" class="btn" style="font-size: 15px; margin-left: 14px; margin-top: 5px;"/> 
							</td>
						</tr>

						
					</table>
				</form>
			</div>
		</td>
	</tr>
</table>
</body>

</html> 

