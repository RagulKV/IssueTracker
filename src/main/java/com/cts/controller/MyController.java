package com.cts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/RegisterUser",method=RequestMethod.GET)
	public String Register() {
		return "Register_User";
	}
	
}
