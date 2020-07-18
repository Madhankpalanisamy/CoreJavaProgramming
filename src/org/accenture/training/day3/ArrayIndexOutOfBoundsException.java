package org.accenture.training.day3;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		
		int[] a = {10,20,30,40};
		System.out.println("1St : "+a[0]);
		System.out.println("2nd : "+a[1]);
		System.out.println("3rd : "+a[2]);
		System.out.println("4th : "+a[3]);
		System.out.println("*******ArrayIndexOutOfBoundsException*****");
		System.out.println("5th : "+a[4]);

	}

}
