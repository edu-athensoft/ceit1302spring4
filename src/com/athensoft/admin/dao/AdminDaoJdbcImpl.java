package com.athensoft.admin.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.athensoft.admin.entity.Admin;

@Repository
//ʵ�־������
@Qualifier("adminDaoJdbcImpl")
//Ĭ��ʵ�����ƣ�Ĭ���ǰ�class������ĸСд
public class AdminDaoJdbcImpl implements AdminDao{

	@Override
	public List<Admin> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> findByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Admin admin) {
		// TODO Auto-generated method stub
		
	}
                   

}
