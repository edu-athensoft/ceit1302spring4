package com.athensoft.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.athensoft.member.service.MemberService;
import com.athensoft.user.service.UserService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
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
	private MemberService memberService;
	
	@RequestMapping("/welcome")		
	public String gotoWelcome(//跳转到页面
			) {
		memberService.testMemberService();

		return "user/welcome";
	}
	

	
	@RequestMapping("/logout")	
	public String doLogOut() {
		return "index";
	}
	

}
