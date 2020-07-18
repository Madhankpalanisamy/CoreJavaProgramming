package org.accenture.training.day4;

public class ExcetionBlocks {

	public static void main(String[] args) {
		
		try {
			
			System.out.println("Control Comes to try block");
			int[] a = new int[4];
			System.out.println("Finding the array index position of 5th : "+ a[200]);
		} 
		
		catch (ArrayIndexOutOfBoundsException ar) {
			System.out.println("Child Exception class" + ar);
		}
		
		catch (Exception e) {
			System.out.println("Parent Exception class" + e);
		}
		
		finally {
			System.out.println("Finally blick will be executed if exception is captured or not");
			
		}
		
		System.out.println("Exception Handled");

	}

}
