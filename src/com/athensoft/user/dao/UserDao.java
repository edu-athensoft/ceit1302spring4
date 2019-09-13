package com.athensoft.user.dao;

import java.util.List;
//ctrl+shift+o

import com.athensoft.user.entity.User;


//����ʵ���� û��Դע��
public interface UserDao {
	

	
	public List<User> findAll();
	
	public User findById(long memberId);
	
	public List<User> findByName(String userName);
	
	public void update(User user);
	
	public void create(User user);
	
	public void delete(User user);
	
	
	

}
