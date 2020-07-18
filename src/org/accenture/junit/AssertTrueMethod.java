package org.accenture.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;


class AssertTrueMethod {
	
	
	@Test
	public	void test() {
		ArithmeticOperation obj = new ArithmeticOperation();
		int addition = obj.addition(100, 100);
		System.out.println(addition);
		assertTrue(addition==200);
		
	}
	
	@Ignore
	@Test
	public	void assertFail() {
		ArithmeticOperation obj = new ArithmeticOperation();
		int addition = obj.addition(100, 100);
		System.out.println(addition);
		assertFalse(addition==200);
		
	}

}
