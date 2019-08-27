package com.athensoft.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.athensoft.admin.dao.AdminDao;
import com.athensoft.admin.entity.Admin;

public class AdminService {
	
	@Autowired
	@Qualifier("adminDaoJdbcImpl")
	private AdminDao adminDao;
	
	public void testMemberService() {
		System.out.println("AdminService.testAdminService()");
		
	}
	
	public void getAllMembers() {
		System.out.println("AdminService.getAllMembers()");
		adminDao.findAll();
	}
	
	public void getMemberById() {
		System.out.println("AdminService.getMemberById()");
		adminDao.findById();
	}
	
	public void getMemberByName() {
		System.out.println("AdminService.getMemberByName()");
		adminDao.findByName();	
	}
	
    public void update(Admin admin) {
    	System.out.println("AdminService.update()");
    	adminDao.update(admin);  	
    }
    
    public void create(Admin admin) {
    	System.out.println("AdminService.create()");
    	adminDao.create(admin);
    }
}