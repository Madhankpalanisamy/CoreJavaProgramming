package org.accenture.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Additiontcs {

	@Test
	void test() {
		ArithmeticOperation obj = new ArithmeticOperation();
		int addition = obj.addition(100, 100);
		System.out.println(addition);
		assertEquals(200, addition);
		System.out.println();
		int subraction = ArithmeticOperation.subraction(500, 200);
		System.out.println(subraction);
		assertEquals(300, subraction);
		
	}
	
	@Test
	public void tc1() {
		ArithmeticOperation obj = new ArithmeticOperation();
		int addition = obj.addition(100, 100);
		System.out.println(addition);
		assertEquals(200, addition);
		System.out.println();

	}

}
