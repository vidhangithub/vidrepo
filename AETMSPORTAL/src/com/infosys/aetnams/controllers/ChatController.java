package com.infosys.aetnams.controllers;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.servlet.ModelAndView;

import com.infosys.aetnams.chat.ChatRoom;
import com.infosys.aetnams.chat.ChatRoomList;
import com.infosys.aetnams.chat.Chatter;

/**
 * @author vidhan_chandra
 *
 */

@Controller
public class ChatController implements ServletContextAware{
	
	private Log log = LogFactory.getLog(ChatController.class);
	private ModelAndView mav= null;
	private HttpSession session = null;
	private ServletContext scontext = null;
	
	
	@RequestMapping(value = "/chatLoginPage.infy")
	public ModelAndView queryReviewLoginView(HttpServletRequest req,
			HttpServletResponse res) {

		mav = new ModelAndView("chat_login");
		return mav;

	}
	
	@RequestMapping(value="/chatLogin.infy")
	public ModelAndView chatLogin(HttpServletRequest request, HttpServletResponse response)
	{
		log.info("chatLogin of  ChatController Starts");
		if (checkChatAlreadyLogin(session)) {
			mav = new ModelAndView("listrooms");
		} 
		
		else {
			String nickname = request.getParameter("nickname");
			nickname = nickname.trim().toLowerCase();
			String sex = request.getParameter("sex");
			if (sex.length() > 0)
			{
				sex = sex.trim().toLowerCase();
			}
			if ((nickname != null && nickname.length() > 3 && nickname.indexOf(" ") == -1) && (sex != null && (sex.equals("m") || sex.equals("f") ) ))
			{
				try
				{
					ChatRoomList roomlist = (ChatRoomList) scontext.getAttribute("chatroomlist");
					boolean chatterexists = roomlist.chatterExists(nickname);
					if (chatterexists)
					{
						String tchat = "t";
						request.setAttribute("d", tchat);
						request.setAttribute("n", nickname);
						mav = new ModelAndView("chat_login");
					}
					else
					{
						HttpSession session = request.getSession(true);
						int timeout = 1800; // 30 minutes
						String t = scontext.getInitParameter("sessionTimeout"); // gets Minutes
						if (t != null)
						{
							try
							{
								timeout = Integer.parseInt(t);
								timeout = timeout * 60;
							}
							catch (NumberFormatException nfe)
							{							
							}
						}
						session.setMaxInactiveInterval(timeout);
						session.setAttribute("nickname", nickname);
						// Because Chatter objects are stored in room.
						// So before user selects any room he is added to a temporary room "StartUp"
						ChatRoom chatRoom = roomlist.getRoom("StartUp"); 
						nickname = nickname.toLowerCase();
						Chatter chatter = null;
						if ("m".equals(sex))
						{
							sex = "Male";
						}
						else
						{
							sex = "Female";
						}
						chatter = new Chatter(nickname, sex, new java.util.Date().getTime());
						chatRoom.addChatter(chatter);
						mav = new ModelAndView("listrooms");

					}
				}
				catch(Exception exception)
				{
					System.out.println("Exception thrown in LoginServlet: " + exception.getMessage());
					exception.printStackTrace();
					mav = new ModelAndView("error");
				}
			}
			else
			{
				String icChat = "t";
				request.setAttribute("ic", icChat);
				mav = new ModelAndView("chat_login");
			}
			

		}
		
		
		
		return mav;
	
	}
	
	private boolean checkChatAlreadyLogin(HttpSession session)
	{
		try {
			String nickname = (String)session.getAttribute("nickname");
			if (nickname != null && nickname != "")
			{
				return true;
			}
			else return false;
			
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public void setServletContext(ServletContext servletContext) {
			this.scontext = servletContext;
		
	}

	

}
