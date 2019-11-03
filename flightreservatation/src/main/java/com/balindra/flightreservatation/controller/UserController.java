package com.balindra.flightreservatation.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.balindra.flightreservatation.entity.User;
import com.balindra.flightreservatation.security.service.SecurityService;
import com.balindra.flightreservatation.service.UserService;

@Controller
public class UserController {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService uservice;
	
	
	
//	@Autowired 
//	private BCryptPasswordEncoder encoder;
	
	@Autowired 
	private SecurityService securityservice;
	
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public String userRegistration(@ModelAttribute("user") User user) {
		
		LOGGER.info("Inside userRegistration method({})"+user);
		return "login/registeruser";
		
	}
	
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public String registeruser(@ModelAttribute("user") User user, Model model) {
		LOGGER.info("Inside the registeruser method()"+user);
		//user.setPassword(encoder.encode(user.getPassword()));
		model.addAttribute("user", uservice.saveUser(user));
		return "saveduser";
		
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String getlogin() {
		LOGGER.info("Inside the getlogin() method()");
		return"login/login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@RequestParam("email")String email, @RequestParam("password")String password,Model model) {
		LOGGER.info("Inside the login method() with username: {} ) "+email);
		
//		if(securityservice.login(email, password)){
//			return "findflight";
//		}else {
//			model.addAttribute("msg", "Invalid username or password. Please try again.");
//		}
		
		User user=uservice.findByEmail(email);
		if(email.equals(user.getEmail())&&password.equals(user.getPassword())){
			return "findflight";
		}else {
			model.addAttribute("msg", "Invalid username or password. Please try again.");
		}
		
		
		return "login/login";
	}
	
	
}
