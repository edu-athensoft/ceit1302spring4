package com.athensoft.member.dao;

import java.util.List;
//ctrl+shift+o
import com.athensoft.member.entity.Member;

//不能实例化 没有源注释
public interface MemberDao {
	

	
	public List<Member> findAll();
	
	public Member findById(long memberId);
	
	public List<Member> findByName(String userName);
	
	public void update(Member member);
	
	public void create(Member member);
	
	public void delete(Member member);
	
	
	

}
