package com.dev.core;

import org.junit.Test;

import com.mongodb.MongoClient;

public class AppTest {

	@Test
	public void testCreateConnection() throws Exception {
		App app = new App();
		MongoClient client = app.createMongoClient();
		System.out.println("hello");
	}
}
