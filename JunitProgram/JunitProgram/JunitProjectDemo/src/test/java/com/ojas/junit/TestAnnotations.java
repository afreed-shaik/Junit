package com.ojas.junit;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

public class TestAnnotations {
	
	@Before
	public static void beforeClass() {
		System.out.println("DB connection");
	}

	@Test
	public void contextLoads() {
		
		System.out.println("test1");
	}
	
	@Test
	public void add() {

		System.out.println("test2");
	}
	
	@Test
	public void checkPerfect() {
		
		System.out.println("test3");
	}
	
	@After
	public void after() {
		System.out.println("after");
	}

}
