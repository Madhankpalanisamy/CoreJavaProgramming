package org.accenture.training.day2;

public class StringMethods {

	public static void main(String[] args) {
		String str = "Madhan";
		String str1 = "Madhan";
		String str2 = "Madhan Kumar";
		
		String obj = new String("Madhan Kumar");
		String obj1 = new String("Madhan 	Kumar");
		
		//Same memory address for literal string
		System.out.println("Literal Sting Immutable");
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		System.out.println("*************************************************************");
		System.out.println(System.identityHashCode(str2));
		System.out.println("Non Literal Sting Immutable");
		System.out.println(System.identityHashCode(obj));
		System.out.println(System.identityHashCode(obj1));
		
		int length = str.length();
		System.out.println("String str length: "+length);
		
		
		String upperCase = str.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = str.toLowerCase();
		System.out.println(lowerCase);
		 
		System.out.println(obj.charAt(0));
		System.out.println(obj.charAt(1));
		System.out.println(obj.charAt(2));
		System.out.println(obj.charAt(3));
		System.out.println(obj.charAt(4));
		System.out.println(obj.charAt(5));
		
		
		char[] charArray = obj.toCharArray();
		System.out.println(charArray[0]);
		System.out.println(charArray[1]);
		System.out.println(charArray[2]);
		System.out.println(charArray[3]);
		System.out.println(charArray[4]);
		System.out.println(charArray[5]);
		System.out.println(charArray[6]);
		
		
	
	}

}
