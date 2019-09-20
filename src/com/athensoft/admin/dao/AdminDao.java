package com.athensoft.admin.dao;

import java.util.List;
//ctrl+shift+o

import com.athensoft.admin.entity.Admin;


//����ʵ���� û��Դע��
public interface AdminDao {
	

	
	public List<Admin> findAll();
	
	public Admin findById(long memberId);
	
	public List<Admin> findByName(String userName);
	
	public void update(Admin admin);
	
	public void create(Admin admin);
	
	public void delete(Admin admin);
	
	public void activateAccount(Admin admin) ;
	
	
	

}
