package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class UserController {
	@Autowired
	private UserDAO userDAO;
	@Autowired
	private User user;
		@PostMapping("validate")
		public ModelAndView validate(@RequestParam("uname") String username, @RequestParam("psw") String password) {
			ModelAndView mv = new ModelAndView("home");
			user=userDAO.validate(username, password);
			if (user==null) {
				mv.addObject("ErrorMessage", "invalid credentials...please try again.");
			} else {
				mv.addObject("WelcmeMessage","Welcome"+user.getName());
			}
			return mv;
		}



}
