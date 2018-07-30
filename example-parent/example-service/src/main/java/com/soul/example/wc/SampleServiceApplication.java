package com.soul.example.wc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.soul.example")
public class SampleServiceApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleServiceApplication.class, args);
	}
}
