package com.athensoft.user.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import com.athensoft.base.dao.BaseDaoJdbcImpl;
import com.athensoft.user.entity.User;

@Repository
//实现具体的类
@Qualifier("userDaoJdbcImpl")
//默认实例名称（默认是把class名首字母小写
public class UserDaoJdbcImpl extends BaseDaoJdbcImpl implements UserDao {
	
	private static final String TABLE = "member";
	

	@Override
	public List<User> findAll() {
		
		String sql = "select * from " + TABLE; 
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		List<User> x = new ArrayList<User>();
		try {
			x = jdbc.query(sql,paramSource,new UserRowMapper());
		}catch(EmptyResultDataAccessException ex) {
			x = null;
		}
		return x;
	}

	@Override
	public User findById(long memberId) {
		
		String sql = "select * from "+ TABLE +" where memeber_id = :memberId";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("memberId", memberId);
		User x = null;
		try {
			x = jdbc.queryForObject(sql,paramSource,new UserRowMapper());
	
		}catch(EmptyResultDataAccessException ex) {
			x = null;
		}
		return x;
	}

	@Override
	public List<User> findByName(String userName) {
		
		String sql = "select * from "+ TABLE +" where user_name = :userName";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		List<User> x = new ArrayList<User>();
		paramSource.addValue("userName", userName);
		try {
			x = jdbc.query(sql,paramSource,new UserRowMapper());
	
		}catch(EmptyResultDataAccessException ex) {
			x = null;
		}
		return (List<User>) x;
	}

	@Override
	public void update(User user) {
		
		StringBuffer sbf = new StringBuffer();
		
		sbf.append("UPDATE " + TABLE);
		sbf.append(" SET ");
		sbf.append("password=:password,  ");
		sbf.append("gender=:gender,  ");
		sbf.append("age=:age,  ");
		sbf.append(" WHERE member_id=:memberId ");

		String sql = sbf.toString();

		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		
		paramSource.addValue("password", user.getPassword());
		paramSource.addValue("gender", user.getGender());
		paramSource.addValue("age", user.getAge());
		paramSource.addValue("memberId", user.getMemberId());

		jdbc.update(sql, paramSource);
		
	}

	@Override
	public void create(User user) {
		
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

        paramSource.addValue("memberId", user.getMemberId());
        paramSource.addValue("userName", user.getUserName());
		paramSource.addValue("userPassword", user.getPassword());
		paramSource.addValue("gender",user.getGender());
		paramSource.addValue("age",user.getAge());
		paramSource.addValue("status",user.getStatus());
		
		jdbc.update(sql, paramSource);
	}
		

	@Override
	public void delete(User user) {
		
		String sql = "delete from " + TABLE + " where member_id =:memberId";

		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("memberId", user.getMemberId());
		jdbc.update(sql, paramSource);
		
	}
	
	private static class UserRowMapper implements RowMapper<User>{
		public User mapRow(ResultSet rs,int rowNumber) throws SQLException{
			User x = new User();
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
