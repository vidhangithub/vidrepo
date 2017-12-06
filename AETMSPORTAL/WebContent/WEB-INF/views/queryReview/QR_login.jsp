
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
<script type="text/javascript">
	function Qr_validation() {
		var userName = document.getElementById('qr_UserName').value;
		var password = document.getElementById('qr_Pswd').value;
		if (userName == null || userName == '') {

			if (password == '' || password == null) {

				alert('Please Enter UserName and password');
			} else {
				alert('Please Enter UserName');
			}
		} else if (password == '' || password == null) {

			alert('Please Enter Password');
		}
	}
</script>

<table class="background">

	<tr>
		<td width="430px" height="55"><font color="066dab">Welcome
				To Query Review Application.Here is the login for submitter and
				approver to get their respective landing pages. <br> Submitter
				can check his/her query syntax, submit their query to approver with
				application Id/DB details with proper comment <br> Approver can
				see his/her dash board,can approved/reject queries submitted to
				him/her
		</font></td>



		<td  class="login-sub">
			<div id="loginDiv">

				<form action="qrLoginIn.infy" method="post">
					<table>


						<tr>
							<td colspan="2"><input type="text" id="qr_UserName"
								name="qr_logid"
								style="font-size: 14px; margin-left: 14px; margin-top: 5px; width: 226px; height: 20px" />
							</td>
						</tr>
						<tr>
							<td colspan="2"><input type="password" id="qr_Pswd"
								name="qr_password"
								style="font-size: 14px; margin-left: 14px; margin-top: 5px; width: 226px; height: 20px" /></td>
						</tr>
						<tr>
							<td colspan="2"><select name="whoIsSubmitting"
								style="font-size: 14px; margin-left: 14px; margin-top: 5px; width: 230px; height: 26px">
									<option value="submitter">Submitter</option>
									<option value="approver">Approver</option>
							</select></td>
						</tr>
						<tr>
							<td><input type="submit" value="Login" id="loginSubmit"
								class="btn"
								style="font-size: 15px; margin-left: 14px; margin-top: 5px;"
								onclick="Qr_validation();" /></td>
						</tr>

						<tr>
							<td colspan="2"><input type="checkbox" name="check"
								value="ckhboxVal"
								style="margin-left: 14px; margin-top: 3px; width: 15px; height: 16px" /><font
								color="blue" size="3">Remember me</font></td>

						</tr>
						<tr>
							<td colspan="2"><font color="blue" size="3"
								style="margin-left: 14px; margin-top: 3px; width: 15px; height: 16px"><a
									href="#">New User</a> | <a href="#">Forgot Password</a></font></td>
						</tr>
					</table>
				</form>
			</div>
		</td>
	</tr>
</table>
