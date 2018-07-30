package com.soul.example.wc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.soul.example.wc.service.ExampleService;

@Controller
@RequestMapping(value = "/test")
public class ExampleController {

	private static final Logger logger = LoggerFactory.getLogger(ExampleController.class);
	
	@Autowired
	private ExampleService exampleService;
	
	@GetMapping(value = "/exec")
	@ResponseBody
	public Object exec(){
		logger.info("hello, Word");
		return exampleService.exec("Word");
	}
	
	@PostMapping(value = "/saveUser")
	@ResponseBody
	public Object saveUser(){
		return exampleService.saveUser();
	}
}
