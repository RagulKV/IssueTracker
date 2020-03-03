package com.mail.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mail.model.MailFormBean;
import com.mail.services.SafeMailSender;


@Controller
public class MailController {
	
	@Autowired
	SafeMailSender mailsender;
	
	
	
	
	@RequestMapping(value="/mailAdmin",method=RequestMethod.GET)
	public String issueMail(@ModelAttribute("mailForm")MailFormBean mf,BindingResult br) {
		return "mailPage";
	}
	@RequestMapping(value="/sendMail",method=RequestMethod.POST)
	public String sendMail(@ModelAttribute("mailForm")MailFormBean mf,BindingResult br) {
		if(br.hasErrors()) {
			return "mailPage";
		}
		
		mailsender.sendMail(mf);
		
		return "success";
	}
	
}
