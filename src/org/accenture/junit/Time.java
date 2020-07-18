package org.accenture.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Time {

	@Test
	void test() {
		
			ArithmeticOperation object = new ArithmeticOperation();
			int addition = object.addition(100, 100);
			System.out.println(addition);
			assertEquals(200, addition);
			System.out.println();
			int subraction = ArithmeticOperation.subraction(500, 200);
			System.out.println(subraction);
			assertEquals(3000, subraction);
			
		}
	}


