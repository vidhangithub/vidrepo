<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<table style="background-color: #e2ecf5; width: 100%; height: 33px; box-shadow: 5px 5px 3px #268E94;" border="0" cellspacing="0" cellpadding="0">
<tbody>
<tr>
<td> <center>Welcome To Query Review, <%=session.getAttribute("SUB_Fname")%></center></td>
</tr>
</tbody>
</table>
<div align="left"><a href="submitrDashBoard.infy" style="float: left;">My DashBoard</a></div><div align="right"><a href="submitterLogout.infy">Logout</a></div>
<div><font color="red">${EMSG}</font></div><br>
<div><font color="green">${QUERYCHECKD}</font></div><br>
<form action="review.infy" method="post">
<table>
<tr><td>
Type or Paste Your Query
</td>
<td>
<textarea rows="10" name="query_text"></textarea>
</td>
<td>
<input type="submit" value="Review The Query">
</td>
</tr>

</table>
</form>