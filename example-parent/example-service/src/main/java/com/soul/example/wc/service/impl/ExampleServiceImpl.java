package com.soul.example.wc.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soul.example.wc.domain.ExampleUserInfo;
import com.soul.example.wc.repository.ExampleUserInfoRepository;
import com.soul.example.wc.service.ExampleService;

@Service
public class ExampleServiceImpl implements ExampleService{

	@Autowired
	private ExampleUserInfoRepository exampleUserInfoRepository;
	
	@Override
	public String exec(String userId) {
		return "Hello, " + userId;
	}

	@Override
	public Object saveUser() {
		ExampleUserInfo info = new ExampleUserInfo();
		info.setUserId("WC00000001");
		info.setUserName("Soul");
		info.setSex("男");
		info.setAge(21);
		info.setAddress("未填写");
		exampleUserInfoRepository.save(info);
		Map<String, String> map = new HashMap<String, String>();
		map.put("code", "0000");
		map.put("notes", "保存成功");
		return map;
	}

}
