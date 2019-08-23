package com.athensoft.member.entity;

import com.athensoft.entity.User;

public class Member extends User{
		

		private String userName;
		private String password;
		private Long memberId;
		private Integer gender;//���ǵ�������i18N��String���ã�������ӳ��ȽϺ�
		private Integer age;
		private Integer status;

		
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public Long getMemberId() {
			return memberId;
		}
		public void setMemberId(Long memberId) {
			this.memberId = memberId;
		}
		public Integer getGender() {
			return gender;
		}
		public void setGender(Integer gender) {
			this.gender = gender;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public Integer getStatus() {
			return status;
		}
		public void setStatus(Integer status) {
			this.status = status;
		}

		
		

	}

	
	


