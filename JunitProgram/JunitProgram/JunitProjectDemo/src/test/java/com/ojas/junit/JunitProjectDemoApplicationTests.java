package com.ojas.junit;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JunitProjectDemoApplicationTests {
	
	AssertClass obj = new AssertClass();
	
	
	
	

	@Test
	public void checkEqauls() {
		String str = "srinivas";
		assertEquals("srinivas", str);
		System.out.println("test1");
	}
	
	@Test
	public void add() {
		assertEquals(2, obj.add(1, 1));
		System.out.println("test2");
	}
	
	@Test
	public void checkPerfect() {
		boolean b = obj.checkPerfectNum(145);
		assertTrue(b);
		System.out.println("test3");
	}
	
	@Test
	public void checkEqaulss() {
	    int num1 = 5;
	    int num2 = 6;
	    assertTrue(num1 < num2);
	    assertFalse(num1 > num2);
	}
	
	@Test
	public void checkArray() {
		int[] expected = {1,2,3,4,5};
		int[] actual = {5,4,3,2,1};
		assertArrayEquals(expected, obj.sorting(actual));
	}

}
