package com.athensoft.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.athensoft.member.dao.MemberDao;
import com.athensoft.member.entity.Member;
import com.athensoft.member.service.MemberService;

public class AdminService extends MemberService {
	
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
    
    public void create(Member member) {
    	System.out.println("Memberservice.create()");
    	memberDao.create(member);
    }
}