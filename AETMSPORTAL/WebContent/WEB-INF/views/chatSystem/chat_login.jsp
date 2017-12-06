<!-- Written by vidhan chandra -->
<%-- Written by vidhan chandra--%>

<%-- <%@ page errorPage="error.jsp" %> --%>
<HTML>
  <HEAD>
    <TITLE>
      Vidhan Chat - Login
    </TITLE>
	 <META http-equiv="pragma" content="no-cache">
	 <meta name="Author" content="vidhan chandra">	
	 <script language="JavaScript">
	 <!--
	 if(window.top != window.self)
	 {
		 window.top.location = window.location;
	 }
	 //-->
	 </script>
	 <LINK rel="stylesheet" href="resources/css/chat.css">
	 <META name="author" content="vidhan chandra)">
	</HEAD>
	<BODY bgcolor="#FFFFFF" onLoad="document.login.nickname.focus();">

    <TABLE width="40%" border="0" cellspacing="1" cellpadding="1" align="center">
      <%
      String d=(String)request.getAttribute("d");
      String n=(String)request.getAttribute("n");
      String ic=(String)request.getAttribute("ic");
          if (d!=null && d.equals("t"))
          {
      %>
      <TR>
        <TD>
          <TABLE width="100%" border="0" cellspacing="1" cellpadding="1" align="center">
            <TR>
              <TD colspan="2" align="center">
                <SPAN class="error">Nickname exists</SPAN><BR>
              </TD>
            </TR>
				<TR>
              <TD colspan="2">
                Nickname <B><%=n%></B> has already been taken please select some other nick.
              </TD>
            </TR>
          </TABLE>
        </TD>
      </TR>
      <%
        }
        else if (ic!=null && ic.equals("t"))
        {
      %>
      <TR>
        <TD colspan="2">
          <TABLE width="100%" border="0" cellspacing="1" cellpadding="1" align="center">
            <TR>
              <TD colspan="2" align="center">
                <SPAN class="error">Incomplete information</SPAN>
              </TD>
            </TR>
				<TR>
              <TD colspan="2">
                <b>Sex</b> and <b>Nickname</b> must be entered and nickname must be atleast <b>4</b> characters long and must not contain any <b>space</b>.
              </TD>
            </TR>
          </TABLE>
        </TD>
      </TR>
      <%
        }
      %>
      <TR>
        <TD colspan="2" class="panel">
          <FORM name="login" method="post" action="chatLogin.infy">
            <TABLE width="100%" border="0">
              <TR>
                <TD width="30%" class="white">
                  Nickname
                </TD>
                <TD width="70%">
                  <INPUT type="text" name="nickname" size="15">
                </TD>
              </TR>
              <TR>
                <TD width="30%" class="white">
                  Sex
                </TD>
                <TD width="70%">
                  <SELECT size="1" name="sex">
                    <OPTION value="m">
                      Male
                    </OPTION>
                    <OPTION value="f">
                      Female
                    </OPTION>
                  </SELECT>
                </TD>
              </TR>
              <TR>
                <TD>
                 &nbsp;  
                </TD>
                <TD>
                  <INPUT type="submit" name="Submit" value="Submit">
                </TD>
              </TR>
            </TABLE>
          </FORM>
        </TD>
      </TR>
    </TABLE>
  </BODY>
</HTML>