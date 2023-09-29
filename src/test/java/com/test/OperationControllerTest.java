package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


import com.prodProject.service.AllService; 

public class OperationControllerTest {
	AllService addctrl=new AllService();
	@Test
	void testAdd() {
		
		float actual=addctrl.add(10,10);
		float expected=20;
		assertEquals(expected,actual);
	}
	@Test
	void testSub() {
		float actual=addctrl.sub(20,10);
		float expected=10;
		assertEquals(expected,actual);
	}
	@Test
	void testMul() {
		float actual=addctrl.mul(5,5);
		float expected=25;
		assertEquals(expected,actual);
	}
	@Test
	void testDiv() {
		float actual=addctrl.div(100,10);
		float expected=10;
		assertEquals(expected,actual);
	}

}
