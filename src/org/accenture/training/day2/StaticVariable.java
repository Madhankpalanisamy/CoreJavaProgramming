package org.accenture.training.day2;

public class StaticVariable {
	
	public static int a=0;
	
	public void increment() {
		a++;
		System.out.println("Increment of a value is : "+a);

	}

	public static void main(String[] args) {
		
		//classname.variable name -correct way
		System.out.println("Value of a is now: "+StaticVariable.a);
		
		StaticVariable obj = new StaticVariable();
		System.out.println("Accessing the static variable through object : "+obj.a);
		
		//Method
		obj.increment();
		
		System.out.println("Accessing the static variable through object : "+obj.a);

	}

}
