package com.athensoft.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


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
	
	public List<User> getAllUsers() {
		//System.out.println("UserService.getAllUsers()");
		return userDao.findAll();
	}
	
	public User getUserById(long memberId) {
		//System.out.println("Userservice.getUserById()");
		return (User)userDao.findById(memberId);
	}
	
	public User getUserByName(String userName) {
		//System.out.println("Userservice.getUserByName()");
		return (User) userDao.findByName(userName);	
	}
	
    public void update(User user) {
    	//System.out.println("Userservice.update()");
		userDao.update(user);
    	
    }
    
    
    public void create(User user) {
    	//System.out.println("Userservice.create()");
		userDao.create(user);
    	
    }

    public void delete(User user) {
    	//System.out.println("Userservice.delete()");
		userDao.delete(user);
    	
    }
}
