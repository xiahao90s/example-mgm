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
 * This class is used to represent available exmaple_wc_info() in the
 * database.</p>
 * 
 * 
 */
@Entity
@Table(name = "exmaple_wc_info")
public class ExmapleWcInfo extends VersionEntity<ExmapleWcInfo>{	
	private static final long serialVersionUID = 1L;
	

	/** OPENID */
	@Column(name = "wc_openid", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
	private java.lang.String wcOpenid;
	
	/** 昵称 */
	@Column(name = "nickname", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
	private java.lang.String nickname;
	
	/** 公众号 */
	@Column(name = "wc_appid", unique = false, nullable = true, insertable = true, updatable = true, length = 30)
	private java.lang.String wcAppid;
	
	/** 头像URL */
	@Column(name = "head_pic_url", unique = false, nullable = true, insertable = true, updatable = true, length = 200)
	private java.lang.String headPicUrl;
	



	public ExmapleWcInfo(){
	}

	
		
	public java.lang.String getWcOpenid() {
		return this.wcOpenid;
	}
	
	public void setWcOpenid(java.lang.String value) {
		this.wcOpenid = value;
	}
	
		
	public java.lang.String getNickname() {
		return this.nickname;
	}
	
	public void setNickname(java.lang.String value) {
		this.nickname = value;
	}
	
		
	public java.lang.String getWcAppid() {
		return this.wcAppid;
	}
	
	public void setWcAppid(java.lang.String value) {
		this.wcAppid = value;
	}
	
		
	public java.lang.String getHeadPicUrl() {
		return this.headPicUrl;
	}
	
	public void setHeadPicUrl(java.lang.String value) {
		this.headPicUrl = value;
	}
	

}

