package com.athensoft.admin.dao;

import java.util.List;
//ctrl+shift+o

import com.athensoft.admin.entity.Admin;


//不能实例化 没有源注释
public interface AdminDao {
	

	
	public List<Admin> findAll();
	
	public Admin findById();
	
	public List<Admin> findByName();
	
	public void update(Admin admin);
	
	public void create(Admin admin);
	
	public void delete(Admin admin);
	
	
	

}
