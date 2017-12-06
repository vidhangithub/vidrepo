<!-- Written by vidhan chandra -->
<%-- Written by vidhan chandra--%>

<%@ page session="true" errorPage="error.jsp" import="java.util.Set,java.util.Iterator,java.util.Map,com.infosys.aetnams.chat.*"%>
<HTML>
<HEAD>
<TITLE>vidhan Chat - Room List</TITLE>
<LINK rel="stylesheet" type="text/css" href="resources/css/chat.css">
<meta name="Author" content="vidhan chandra">	
</HEAD>

<BODY bgcolor="#FFFFFF">
<%


String nickname = (String)session.getAttribute("nickname");
if (nickname == null || nickname == "")
{
	response.sendRedirect("/WEB-INF/views/chatSystem/login.jsp");
	//System.out.println("Redirecting");
}
else
{
	String roomname = request.getParameter("rn");	
	String descr = request.getParameter("sd");
	boolean see = false;
	if (descr != null && descr.equals("y"))
	{
		see = true;
	}
%>

<TABLE >	
	<TR>
		<TD width="100%">Select the room you want to enter or click view description to view description
			 about the room.
		</TD>
	</TR>
</TABLE>
<BR>
	<%
				
		
		try
		{
			ChatRoomList roomlist = (ChatRoomList)application.getAttribute("chatroomlist");
			ChatRoom[] chatrooms = roomlist.getRoomListArray();
			if(roomname == null)
			{
				roomname = roomlist.getRoomOfChatter(nickname).getName();
			}
			roomname = roomname.trim();

	%>
<DIV align="center">
<CENTER>
	<FORM name="chatrooms" action="/WEB-INF/views/chatSystem/start.jsp" method="post">
	<TABLE width="80%" border="1" cellspacing="1" cellpadding="1" align="center">
	<TR>
	<TD colspan="2" class="pagetitle">Room List</TD>
	</TR>
	<%
			for (int i = 0; i < chatrooms.length; i++)
			{
				if (chatrooms[i].getName().equalsIgnoreCase("StartUp"))
					continue;
	%>
		<TR>
		<TD width="50%">
		<INPUT type=radio name="rn" value="<%=chatrooms[i].getName()%>"
		<%if (chatrooms[i].getName().equals(roomname))
			out.write("checked");%>><%=chatrooms[i].getName()%></A>
		</TD>
	<%
				if (see == true && chatrooms[i].getName().equals(roomname))
				{
	%>	
			<TD width="50%"><%=chatrooms[i].getDescription()%></TD>
	<%
				}
				else
				{
	%>
			<TD width="50%"><A href="/WEB-INF/views/chatSystem/listrooms.jsp?rn=<%=chatrooms[i].getName()%>&sd=y">View Description</A></TD>
	<%
				}
	%>
		</TR>
	<%
			}
		}
		catch (Exception e)
		{
			System.out.println("Unable to get handle to Servlet Context: " + e.getMessage());
			e.printStackTrace();
		}
%>
<TR>
	<TD>&nbsp;<A href="/WEB-INF/views/chatSystem/addRoom.jsp" title="Add new Room">Add new Room</A></TD>
	<TD><INPUT type="Submit" value="Start"></TD>
</TR>
</TABLE>
</FORM>
</CENTER>
</DIV>
<%
	}
%>
<DIV align="center">
<CENTER>
<TABLE width="100%" border="0" align="center" cellpadding="3" cellspacing="0">
	<TR>
		<TD width="100%" align="center"><%
		String n = (String)session.getAttribute("nickname");
		if (n != null && n.length() > 0)
		{
			out.write("<a href=\"logout.jsp\">Logout</a>");
			out.write(" <a href=\"listrooms.jsp\">List of Rooms</a>");
		}
		%> </TD>
	</TR>
</TABLE>
</CENTER>
</DIV>
</BODY>
</HTML>