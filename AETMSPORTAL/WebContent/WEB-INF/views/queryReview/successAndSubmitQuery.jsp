<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<table style="background-color: #e2ecf5; width: 700px; height: 33px; box-shadow: 5px 5px 3px #268E94;" border="0" cellspacing="0" cellpadding="0">
<tbody>
<tr>
<td></td>
</tr>
</tbody>
</table>
<div align="left"><a href="#" style="float: left;">My DashBoard</a></div><div align="right"><a href="submitterLogout.infy">Logout</a></div>

<div><font color="green">${CHEKQUEYREQ}</font></div><br>
<div><font color="green">${SUCCESSMSG}</font></div><br>


<form action="submitToApprover.infy" method="post">
<table>
<tr>
<td>Choose Your Application </td>
<td>
<select name="applications" style="width: 405px">
<option value="A2234">Producer Directory</option>
<option value="A891">Sales Web</option>
<option value="A1779">Producer World Reporting</option>
<option value="A52">NISS</option>
</select>
</td>
</tr>

<tr>
<td>Please Enter DB Details :</td>
<td><textarea name="dbDetails" rows="3" cols="5" style="height: 15px"></textarea></td>
</tr>

<tr>
<td>Please enter your comment :</td>
<td><textarea name="sbmtCmnts" rows="3" cols="5" style="height: 25px"></textarea></td>
</tr>

<tr>
<td>Choose Your Approver </td>
<td>
<select name="approvers" style="width: 405px">
<option value="reetesh">REETESH</option>
<option value="swastik">SWASTIK</option>
<option value="sandeep">SANDEEP</option>
</select>
</td>
</tr>

<tr>
<td colspan="2">
<input type="submit" value="Submit It To Approver">
</td>
</tr>

</table>

</form>