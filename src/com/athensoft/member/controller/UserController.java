package com.athensoft.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.athensoft.member.service.MemberService;
import com.athensoft.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/login")	
	public String gotoLogin() {
		return "login";
	}
	
//@RequestMapping("/welcome")	
//	public String gotoWelcome(//跳转到页面
//			@RequestParam String name,
//			@RequestParam String password,
//			Model model) {
//		
//		String userName= name;
//		String userPassword = password;
//		
//		System.out.println("userName="+userName+"  \t"+"userpassword="+userPassword);
//		
//		model.addAttribute("userName",userName);
//		
//		model.addAttribute("userPassword",userPassword);
//		return "member/welcome";
//	}
	
	@Autowired
	//自动化装配 实现自动注入
	private UserService userService;
	
	@RequestMapping("/welcome")		
	public String gotoWelcome(//跳转到页面
			) {
		userService.testUserService();
		userService.getAllUsers();
		return "user/welcome";
	}
	

	
	@RequestMapping("/logout")	
	public String doLogOut() {
		return "index";
	}
	

}
