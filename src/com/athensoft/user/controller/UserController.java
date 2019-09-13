package com.athensoft.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.athensoft.member.service.MemberService;
import com.athensoft.user.entity.User;
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
	//private MemberService memberService;
	
	@RequestMapping("/welcome")		
	public String gotoWelcome(//跳转到页面
			) {
//		memberService.testMemberService();
//		memberService.getAllMembers();
		return "member/welcome";
	}
	

	
	@RequestMapping("/logout")	
	public String doLogOut() {
		return "index";
	}
	
	@RequestMapping("/users")	
	public String testFindAllUser() {
		List<User> userList = userService.getAllUsers();
		for(User user: userList) {
			System.out.println(user.toString());
		}
		return "index";
	}

}
