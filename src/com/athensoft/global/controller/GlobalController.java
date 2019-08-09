package com.athensoft.global.controller;

import org.springframework.stereotype.Controller;
//Ctrl+Shift+O

@Controller
public class GlobalController {
	
	@RequestMapping("")
	public String gotoHome() {
		return "index";
	}
	

}
