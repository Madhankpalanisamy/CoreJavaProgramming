package org.accenture.training.day1;

public class LogicalOperator {

	public static void main(String[] args) {
		int data1 = 100;
		int data2 = 200;
		
		System.out.println("false || false is  " + ((data1==data2) || (data1>data2)));
		System.out.println("True || false is  " + ((data1==data2) && (data1>data2)));
		System.out.println("False is "+ !(data1!=data2));
	}

}
