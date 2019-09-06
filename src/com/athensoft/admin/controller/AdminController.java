package com.athensoft.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.athensoft.admin.entity.Admin;
import com.athensoft.admin.service.AdminService;
import com.athensoft.member.entity.Member;


@RequestMapping("/admin")
public class AdminController {
	
	@RequestMapping("/login")	
	public String gotoLogin() {
		return "login";
	}
	
	@Autowired
	//自动化装配 实现自动注入
	private AdminService adminService;
	
	@RequestMapping("/adminwelcome")		
	public String gotoAdminWelcome(//跳转到页面
			) {
		adminService.testMemberService();
		adminService.getAllMembers();
		adminService.getMemberById();
		adminService.getMemberByName();
		Admin admin = null;
		adminService.update(admin);
		adminService.create(admin);
		
		return "admin/adminWelcome";
		
	}
	

	
	@RequestMapping("/logout")	
	public String doLogOut() {
		return "index";
	}

}
