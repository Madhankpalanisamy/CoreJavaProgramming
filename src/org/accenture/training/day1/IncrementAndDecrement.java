package org.accenture.training.day1;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		int a=10;
		int b = 11;
		
		System.out.println("Value of a is : "+a);
		System.out.println("After post increment of value of a is : " + a++);
		System.out.println("Value of a is "+a);
		System.out.println("***********************************************");
		System.out.println();
		System.out.println("Value of a is "+b);
		System.out.println("After pre increment of value of b is : " + ++b);
		System.out.println("Value of a is "+b);
		System.out.println("***********************************************");
		System.out.println();
		System.out.println("Value of a is "+a);
		System.out.println("After post decrement of value of a is : " + a--);
		System.out.println("Value of a is "+a);
		System.out.println("***********************************************");
		System.out.println();
		System.out.println("Value of a is "+b);
		System.out.println("After pre decrement of value of a is : " + --b);
		System.out.println("Value of a is "+b);
		System.out.println("***********************************************");
		System.out.println();
	}

}
