package com.athensoft.user.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;


import com.athensoft.user.entity.User;

@Repository
//ʵ�־������
@Qualifier("userDaoJdbcImpl")
//Ĭ��ʵ�����ƣ�Ĭ���ǰ�class������ĸСд
public class UserDaoJdbcImpl implements UserDao {

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	
}
