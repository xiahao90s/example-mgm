/*
 * Copyright (c) - 2018 IBM. All rights reserved.
 * 
 */

package com.soul.example.wc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.soul.example.wc.domain.ExmapleWcInfo;

public interface ExmapleWcInfoRepository extends JpaRepository<ExmapleWcInfo,java.lang.Long>, QueryDslPredicateExecutor<ExmapleWcInfo>{
	
}