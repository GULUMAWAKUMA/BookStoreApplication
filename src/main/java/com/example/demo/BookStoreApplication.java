package com.example.demo;


import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class BookStoreApplication {
	
	public static Logger logger=(Logger) LoggerFactory.getLogger(BookStoreApplication.class);
	
	
	public void intt(String msg) {
		logger.info("Application started...");
		
	}
	public static void main(String[] args) {
		logger.info("Application Executed...");
		SpringApplication.run(BookStoreApplication.class, args);
		
	}

}
