package com.athensoft.global.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GlobalController {
	
	@RequestMapping("")
	public String gotoHome() {
		return "index";
	}
	
	@RequestMapping("/index")
	public String gotoHome2() {
		return "index";
	}
	
	@RequestMapping("/about")
	public String gotoAbout() {
		return "about";
	}
	
	@RequestMapping("/contact")
	public String gotoContact() {
		return "contact";
	}
}
