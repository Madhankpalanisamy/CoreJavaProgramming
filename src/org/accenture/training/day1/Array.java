package org.accenture.training.day1;

public class Array {

	public static void main(String[] args) {
		//diff
		int[] array1 = new int[5];
		int[] array2 = {10,20,30};
		float[] array3 = {10.25f,20.78f,30.4f,40.67f};
		double[] array4 = {10.25,20.78,30.4,40.67};
		char[] array5 = {'a','b','c'};
		
		array1[0]=100;
		array1[1]=200;
		array1[2]=300;
		array1[3]=400;
		array1[4]=500;
		//array1[5]=600;
		
		int length = array1.length;
		System.out.println("array1 of size : "+length);
		int length2 = array2.length;
		System.out.println("array2 of size : "+length2);
		int length3 = array3.length;
		System.out.println("array3 of size : "+length3);
		int length4 = array4.length;
		System.out.println("array4 of size : "+length4);
		int length5 = array5.length;
		System.out.println("array5 of size : "+length5);
		
		System.out.println("Default Value of array1 : "+array1[4]);
		System.out.println("Value of array[4] : "+array4[3]);
	}

}
