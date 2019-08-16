package com.athensoft.member.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.athensoft.member.entity.Member;

@Repository
//ʵ�־������
@Qualifier("memberDaoJdbcImpl")
//Ĭ��ʵ�����ƣ�Ĭ���ǰ�class������ĸСд
public class MemberDaoJdbcImpl implements MemberDao {

	@Override
	public Member findById() {
		
		System.out.println("findById()");
		return null;
	}

	@Override
	public List<Member> findAll() {
		
		System.out.println("findAll()");
		return null;
	}

	@Override
	public void update(Member member) {
		System.out.println("update(Member member)");

	}

	@Override
	public void create(Member member) {
		System.out.println("create(Member member)");

	}

	@Override
	public void delete(Member member) {
		System.out.println("delete(Member member)");

	}

}
