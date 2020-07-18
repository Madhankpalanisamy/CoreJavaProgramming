package org.accenture.training.day1;

public class DoWhileLoop {

	public static void main(String[] args) {
		int i = 1;
		
		do {
			System.out.println("The iteration of i : "+i);
			i++;
			System.out.println("Post increment of i value");
			System.out.println("The iteration of i checking : "+i);
		} while (i<=10);
		System.out.println("Out of while loop and value of i is : " +i);

	}

}
