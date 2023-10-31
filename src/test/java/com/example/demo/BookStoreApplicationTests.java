package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import ch.qos.logback.classic.Logger;

@SpringBootTest
class BookStoreApplicationTests {
	public static Logger logger=(Logger) LoggerFactory.getLogger(BookStoreApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case execution..");
		assertEquals(true,true);
	}

}
