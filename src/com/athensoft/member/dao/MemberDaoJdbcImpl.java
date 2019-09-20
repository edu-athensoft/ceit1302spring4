package com.athensoft.member.dao;

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
import com.athensoft.member.entity.Member;


@Repository
//实现具体的类
@Qualifier("memberDaoJdbcImpl")
//默认实例名称（默认是把class名首字母小写
public class MemberDaoJdbcImpl extends BaseDaoJdbcImpl implements MemberDao {

  private static final String TABLE = "member";
	

	@Override
	public List<Member> findAll() {
		String sql = "select * from " + TABLE; 
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		List<Member> x = new ArrayList<Member>();
		try {
			x = jdbc.query(sql,paramSource,new MemberRowMapper());
		}catch(EmptyResultDataAccessException ex) {
			x = null;
		}
		return x;
	}

	@Override
	public Member findById(long memberId) {
		String sql = "select * from "+ TABLE +" where memeber_id = :memberId";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("memberId", memberId);
		Member x = null;
		try {
			x = jdbc.queryForObject(sql,paramSource,new MemberRowMapper());
	
		}catch(EmptyResultDataAccessException ex) {
			x = null;
		}
		return x;
	}

	@Override
	public List<Member> findByName(String userName) {
		String sql = "select * from "+ TABLE +" where user_name = :userName";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		List<Member> x = new ArrayList<Member>();
		paramSource.addValue("userName", userName);
		try {
			x = jdbc.query(sql,paramSource,new MemberRowMapper());
	
		}catch(EmptyResultDataAccessException ex) {
			x = null;
		}
		return (List<Member>) x;
	}

	@Override
	public void update(Member member) {
		
		StringBuffer sbf = new StringBuffer();
		
		sbf.append("UPDATE " + TABLE);
		sbf.append(" SET ");
		sbf.append("password=:password,  ");
		sbf.append("gender=:gender,  ");
		sbf.append("age=:age,  ");
		sbf.append(" WHERE member_id=:memberId ");

		String sql = sbf.toString();

		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		
		paramSource.addValue("password", member.getPassword());
		paramSource.addValue("gender", member.getGender());
		paramSource.addValue("age", member.getAge());
		paramSource.addValue("memberId", member.getMemberId());

		jdbc.update(sql, paramSource);
		
	}

	@Override
	public void create(Member member) {
		
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

        paramSource.addValue("memberId", member.getMemberId());
        paramSource.addValue("userName", member.getUserName());
		paramSource.addValue("userPassword", member.getPassword());
		paramSource.addValue("gender",member.getGender());
		paramSource.addValue("age",member.getAge());
		paramSource.addValue("status",member.getStatus());
		
		jdbc.update(sql, paramSource);
	}
		

	@Override
	public void delete(Member member) {
		
		String sql = "delete from " + TABLE + " where member_id =:memberId";

		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("memberId", member.getMemberId());
		jdbc.update(sql, paramSource);
		
	}
	
	private static class MemberRowMapper implements RowMapper<Member>{
		public Member mapRow(ResultSet rs,int rowNumber) throws SQLException{
			Member x = new Member();
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
