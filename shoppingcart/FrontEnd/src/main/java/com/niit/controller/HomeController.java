package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
	public class HomeController {
		@RequestMapping("/")
		public ModelAndView home()
		{
			ModelAndView mv=new ModelAndView("home");
			mv.addObject("username", "");
			return mv;
		}
		
		@RequestMapping("/login")
		public ModelAndView login()
		{
			ModelAndView mv=new ModelAndView("login");
			mv.addObject("isuserclickedlogin", true);
			return mv;
			
		}
		@RequestMapping("/registration")
		public ModelAndView registration()
		{
			ModelAndView mv=new ModelAndView("registration");
			mv.addObject("isuserclickedregistration", true);
			return mv;
		}
	}


