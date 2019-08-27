package com.athensoft.admin.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.athensoft.admin.entity.Admin;

@Repository
//实现具体的类
@Qualifier("adminDaoJdbcImpl")
//默认实例名称（默认是把class名首字母小写
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
