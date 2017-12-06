<!-- Written by vidhan chandra -->
<%-- Written by vidhan chandra--%>

<%@ page session="true" import="com.infosys.aetnams.chat.ChatRoomList, com.infosys.aetnams.chat.ChatRoom" errorPage="error.jsp"%>
<%
	String nickname = (String)session.getAttribute("nickname");
	if (nickname != null && nickname.length() > 0)
	{
		ChatRoomList roomList = (ChatRoomList) application.getAttribute("chatroomlist");
		ChatRoom room = roomList.getRoomOfChatter(nickname);
		String roomname = room.getName();
%>
	
<HTML>
<HEAD>
<TITLE>Vidhan Chat - <%=nickname%> (<%=roomname%>) </TITLE>
<META name="Author" value="vidhan chandra)">
</HEAD>
<FRAMESET rows="80%,20%">
<FRAME SRC="/WEB-INF/views/chatSystem/displayMessages.jsp#current" name="MessageWin">
<FRAME SRC="/WEB-INF/views/chatSystem/sendMessage.jsp" name="TypeWin">
</FRAMESET>
<NOFRAMES>
<H2>This chat rquires a browser with frames support</h2>
</NOFRAMES>
</HTML>
<%
}
else
{
	response.sendRedirect("/WEB-INF/views/chatSystem/chat_login.jsp");
}
%>