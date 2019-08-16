package com.athensoft.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.athensoft.member.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
		
//	public void setMemberService(MemberService memberService) {
//		this.memberService = memberService;
//	}

	@RequestMapping("/welcome")
	public String gotoWelcome() {
		memberService.testMemberService();
		memberService.getAllMembers();
		return "member/welcome";
	}
	
	
}
