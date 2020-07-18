package org.accenture.training.day1;

public class ContinueKeyword {

	public static void main(String[] args) {
		int i;
		for (i = 1; i <=10; i++) {
			if (i<8) {
				System.out.println("inside the if loop the i value is now : "+i);
				System.out.println("Condition is statisfied and loop get Continued....");
				continue;
				}
			System.out.println("Iteration of i: "+i);
	}
	System.out.println("Out of loop : "+i);

	}

}
