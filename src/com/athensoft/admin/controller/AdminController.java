package com.athensoft.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.athensoft.admin.service.AdminService;
import com.athensoft.member.entity.Member;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@RequestMapping("/login")	
	public String gotoLogin() {
		return "login";
	}
	
	@Autowired
	//�Զ���װ�� ʵ���Զ�ע��
	private AdminService adminService;
	
	@RequestMapping("/adminwelcome")		
	public String gotoAdminWelcome(//��ת��ҳ��
			) {
		adminService.testMemberService();
		adminService.getAllMembers();
		adminService.getMemberById();
		adminService.getMemberByName();
		Member member = null;
		adminService.update(member);
		adminService.create(member);
		
		return "admin/adminWelcome";
		
	}
	

	
	@RequestMapping("/logout")	
	public String doLogOut() {
		return "index";
	}

}
