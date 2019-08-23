package com.athensoft.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.athensoft.member.dao.MemberDao;
import com.athensoft.member.entity.Member;

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
	
	public void getMemberById() {
		System.out.println("Memberservice.getMemberById()");
		memberDao.findById();
	}
	
	public void getMemberByName() {
		System.out.println("Memberservice.getMemberByName()");
		memberDao.findByName();	
	}
	
    public void update(Member member) {
    	System.out.println("Memberservice.update()");
		memberDao.update(member);
    	
    }
	

}
