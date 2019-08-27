package com.athensoft.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.athensoft.member.dao.MemberDao;
import com.athensoft.member.entity.Member;
import com.athensoft.user.dao.UserDao;
import com.athensoft.user.entity.User;

@Service
public class UserService {
	
	@Autowired
	@Qualifier("userDaoJdbcImpl")
	private UserDao userDao;
	
	public void testUserService() {
		System.out.println("UserService.testUserService()");
		
	}
	
	public void getAllUsers() {
		System.out.println("UserService.getAllUsers()");
		userDao.findAll();
	}
	
	public void getUserById() {
		System.out.println("Userservice.getUserById()");
		userDao.findById();
	}
	
	public void getUserByName() {
		System.out.println("Userservice.getUserByName()");
		userDao.findByName();	
	}
	
    public void update(User user) {
    	System.out.println("Userservice.update()");
		userDao.update(user);
    	
    }
	

}
