package org.accenture.training.day1;

public class SwitchcaseStatement {

	public static void main(String[] args) {
		int number = 100;
		int c = number/10;
		System.out.println("Division Operaror Returns the co-effcient Value"+c);
		int d = number%10;
		System.out.println("Modular Operatot Returns the Reminder Value"+d);
		System.out.println("Value of c is"+c);
		switch(c) {
		case 10:
			System.out.println("Case 1 -->10");
			break;
		case 20:
			System.out.println("Case 1-->20");
			break;
		case 30:
			System.out.println("Case 3--->30");
			break;
		default:
			System.out.println("Default block execution");
		
			
		}
		
		}
		
}


