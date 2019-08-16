package com.athensoft.member.dao;

import java.util.List;
//ctrl+shift+o
import com.athensoft.member.entity.Member;

//����ʵ���� û��Դע��
public interface MemberDao {
	
	public Member findById();
	
	public List<Member> findAll();
	
	public void update(Member member);
	
	public void create(Member member);
	
	public void delete(Member member);
	

}