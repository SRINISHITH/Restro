package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	// will send userid and pwd from jsp to controller
	// it should validate the credentials
	@RequestMapping("/validate")
	public ModelAndView validate(@RequestParam("uname") String username, @RequestParam("psw") String password) {
		ModelAndView mv = new ModelAndView("home");
		if (username.equals("niit") && password.equals("niit")) {
			mv.addObject("WelcomeMessage", "Welcome Mr/Ms:" +username);
		} else {
			mv.addObject("ErrorMessage", "invalid credentials...please try again.");
		}
		return mv;
	}
}
