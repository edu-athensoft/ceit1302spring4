package com.athensoft.admin.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import com.athensoft.admin.entity.Admin;
import com.athensoft.base.dao.BaseDaoJdbcImpl;


@Repository
//实现具体的类
@Qualifier("adminDaoJdbcImpl")
//默认实例名称（默认是把class名首字母小写
public class AdminDaoJdbcImpl extends BaseDaoJdbcImpl implements AdminDao {
	
	
	private static final String TABLE = "member";

	@Override
	public List<Admin> findAll() {
		String sql = "select * from " + TABLE; 
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		List<Admin> x = new ArrayList<Admin>();
		try {
			x = jdbc.query(sql,paramSource,new AdminRowMapper());
		}catch(EmptyResultDataAccessException ex) {
			x = null;
		}
		return x;
	}


	@Override
	public Admin findById(long memberId) {

		String sql = "select * from "+ TABLE +" where memeber_id = :memberId";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("memberId", memberId);
		Admin x = null;
		try {
			x = jdbc.queryForObject(sql,paramSource,new AdminRowMapper());
	
		}catch(EmptyResultDataAccessException ex) {
			x = null;
		}
		return x;


	}

	@Override
	public List<Admin> findByName(String userName) {
		String sql = "select * from "+ TABLE +" where user_name = :userName";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		List<Admin> x = new ArrayList<Admin>();
		paramSource.addValue("userName", userName);
		try {
			x = jdbc.query(sql,paramSource,new AdminRowMapper());
	
		}catch(EmptyResultDataAccessException ex) {
			x = null;
		}
		return  x;
	}


	@Override
	public void update(Admin admin) {
		
		StringBuffer sbf = new StringBuffer();
		
		sbf.append("UPDATE " + TABLE);
		sbf.append(" SET ");
		sbf.append("password=:password,  ");
		sbf.append("gender=:gender,  ");
		sbf.append("age=:age,  ");
		sbf.append(" WHERE member_id=:memberId ");

		String sql = sbf.toString();

		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		
		paramSource.addValue("password", admin.getPassword());
		paramSource.addValue("gender", admin.getGender());
		paramSource.addValue("age", admin.getAge());
		paramSource.addValue("memberId", admin.getMemberId());

		jdbc.update(sql, paramSource);
		
	}

	@Override
	public void create(Admin admin) {
		
		StringBuffer sbf = new StringBuffer();
		
		sbf.append("INSERT INTO ").append(TABLE).append("(");
		sbf.append("member_id,");
		sbf.append("user_name,");
		sbf.append("password,");
		sbf.append("gender,");
		sbf.append("age,");
		sbf.append("status");
		sbf.append(") ");
		sbf.append("VALUES(");
		sbf.append(":memberId,");
		sbf.append(":userName,");
		sbf.append(":password,");
		sbf.append(":gender,");
		sbf.append(":age,");;
		sbf.append(":status");
		sbf.append(")");

		String sql = sbf.toString();
		

        MapSqlParameterSource paramSource = new MapSqlParameterSource();

        paramSource.addValue("memberId", admin.getMemberId());
        paramSource.addValue("userName", admin.getUserName());
		paramSource.addValue("userPassword", admin.getPassword());
		paramSource.addValue("gender",admin.getGender());
		paramSource.addValue("age",admin.getAge());
		paramSource.addValue("status",admin.getStatus());
		
		jdbc.update(sql, paramSource);
		
	}

	@Override
	public void delete(Admin admin) {
		
		String sql = "delete from " + TABLE + " where member_id =:memberId";

		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("memberId", admin.getMemberId());
		jdbc.update(sql, paramSource);
		
	}
	
	
	public void activateAccount(Admin admin) {
		
		StringBuffer sbf = new StringBuffer();
		
		sbf.append("UPDATE " + TABLE);
		sbf.append(" SET ");
		sbf.append(" status=:status ");
		sbf.append(" WHERE ");
		sbf.append(" user_name=:userName");

		String sql = sbf.toString();

		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		
		paramSource.addValue("status", admin.getStatus());
		paramSource.addValue("userName", admin.getUserName());

		jdbc.update(sql, paramSource);

		
	}
	
	
	private static class AdminRowMapper implements RowMapper<Admin>{
		public Admin mapRow(ResultSet rs,int rowNumber) throws SQLException{
			Admin x = new Admin();
			x.setMemberId(rs.getLong("member_id"));
			x.setUserName(rs.getString("user_name"));
			x.setPassword(rs.getString("password"));
			x.setGender(rs.getInt("gender"));
			x.setAge(rs.getInt("age"));
			x.setStatus(rs.getInt("status"));
			
		    return x;
		}
	}
                   

}
