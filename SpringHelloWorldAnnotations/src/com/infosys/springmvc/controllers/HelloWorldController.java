package com.infosys.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	
	@RequestMapping(value="/index.infy")
	public ModelAndView justTest()
	{
	return new ModelAndView("home", "MSG", new String("Hello World::"));
	}
}
