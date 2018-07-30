/*
 * Copyright (c) - 2018 IBM. All rights reserved.
 * 
 */

package com.soul.example.wc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.soul.example.wc.domain.ExampleUserInfo;

public interface ExampleUserInfoRepository extends JpaRepository<ExampleUserInfo,java.lang.Long>, QueryDslPredicateExecutor<ExampleUserInfo>{
	
}