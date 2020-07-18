package org.accenture.training.day2;

//Static block which is used to initialize the static data member and get executed before main method
//at time of class loading

public class StaticBlock {
	
	static int a;
	int x = 20;
	
	static {
		a=20;
		System.out.println("Static block is invoked");
		
		//x++;  //Non static variable cannot be declared or manipulate in static block
	}

	public static void main(String[] args) {
	System.out.println("Main method gets invoked");
	System.out.println("Printing the a value:"+a);

	}

}
