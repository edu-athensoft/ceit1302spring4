package com.athensoft.member.service;

import java.util.List;

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
	
	public List<Member> getAllMembers() {
		System.out.println("MemberService.getAllMembers()");
		
		return memberDao.findAll();
	}
	
	public Member getMemberById(long memberId) {
		System.out.println("Memberservice.getMemberById()");
		return memberDao.findById(memberId);
	}
	
	public List<Member> getMemberByName(String userName) {
		System.out.println("Memberservice.getMemberByName()");	
		return memberDao.findByName(userName);	
	}
	
    public void update(Member member) {
    	System.out.println("Memberservice.update()");
		memberDao.update(member);
    	
    }
	
    public void create(Member member) {
    	System.out.println("Memberservice.create()");
		memberDao.create(member);
    	
    }
    
    public void delete(Member member) {
    	System.out.println("Memberservice.delete()");
		memberDao.delete(member);
    	
    }

}
