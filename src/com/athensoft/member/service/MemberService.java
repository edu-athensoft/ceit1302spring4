package com.athensoft.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.athensoft.member.dao.MemberDao;

@Service
public class MemberService {
	
	@Autowired
	@Qualifier("memberDaoJdbcImpl")
	private MemberDao memberDao;
	
	public void testMemberService() {
		System.out.println("MemberService.testMemberService()");
	}
	
	public void getAllMembers() {
		System.out.println("MemberService.getAllMembers()");
		memberDao.findAll();	
	}
}
