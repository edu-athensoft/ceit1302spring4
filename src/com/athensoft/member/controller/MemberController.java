package com.athensoft.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@RequestMapping("/login")	
	public String gotoLogin() {
		return "login";
	}
	
	@RequestMapping("/welcome")	
	public String gotoWelcome() {
		return "welcome";
	}
	
	@RequestMapping("/logout")	
	public String doLogOut() {
		return "index";
	}
	

}
