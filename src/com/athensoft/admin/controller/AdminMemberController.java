package com.athensoft.admin.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.athensoft.member.entity.Member;
import com.athensoft.member.service.MemberService;

@Controller
@RequestMapping("/admin/member")
public class AdminMemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping("/list")
	public ModelAndView gotoAdminMemberPage() {
		ModelAndView mav = new ModelAndView();
		
		//get data
		List<Member> memberList = memberService.getAllMembers();
		
		//
		Map<String, Object> data = mav.getModel();
		data.put("memberList", memberList);
		
		String viewName = "admin/member-list";
		mav.setViewName(viewName);
		
		return mav;
	}
}
