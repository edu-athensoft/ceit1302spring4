package com.athensoft.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@RequestMapping("/login")	
	public String gotoLogin() {
		return "login";
	}
	

	
	@RequestMapping("/adminwelcome")		
	public String gotoAdminWelcome(//��ת��ҳ��
			) {
		
		return "admin/adminWelcome";
		
	}
	

	
	@RequestMapping("/logout")	
	public String doLogOut() {
		return "index";
	}

	

}
