/*
 * Copyright (c) - 2018 IBM. All rights reserved.
 * 
 */


package com.soul.example.wc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.soul.example.wc.core.VersionEntity;


/**
 * 
 * This class is used to represent available example_user_info() in the
 * database.</p>
 * 
 * 
 */
@Entity
@Table(name = "example_user_info")
public class ExampleUserInfo extends VersionEntity<ExampleUserInfo>{	
	private static final long serialVersionUID = 1L;
	

	/** 用户编码 */
	@Column(name = "user_id", unique = true, nullable = false, insertable = true, updatable = true, length = 10)
	private java.lang.String userId;
	
	/** 用户名称 */
	@Column(name = "user_name", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
	private java.lang.String userName;
	
	/** 性别 */
	@Column(name = "sex", unique = false, nullable = true, insertable = true, updatable = true, length = 1)
	private java.lang.String sex;
	
	/** 年龄 */
	@Column(name = "age", unique = false, nullable = true, insertable = true, updatable = true, length = 10)
	private java.lang.Integer age;
	
	/** 地址 */
	@Column(name = "address", unique = false, nullable = true, insertable = true, updatable = true, length = 255)
	private java.lang.String address;
	



	public ExampleUserInfo(){
	}

		
	public java.lang.String getUserId() {
		return userId;
	}

	public void setUserId(java.lang.String userId) {
		this.userId = userId;
	}


	public java.lang.String getUserName() {
		return this.userName;
	}
	
	public void setUserName(java.lang.String value) {
		this.userName = value;
	}
	
		
	public java.lang.String getSex() {
		return this.sex;
	}
	
	public void setSex(java.lang.String value) {
		this.sex = value;
	}
	
		
	public java.lang.Integer getAge() {
		return this.age;
	}
	
	public void setAge(java.lang.Integer value) {
		this.age = value;
	}
	
		
	public java.lang.String getAddress() {
		return this.address;
	}
	
	public void setAddress(java.lang.String value) {
		this.address = value;
	}
	

}

