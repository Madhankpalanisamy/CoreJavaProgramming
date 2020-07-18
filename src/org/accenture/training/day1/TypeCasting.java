package org.accenture.training.day1;

public class TypeCasting {

	public static void main(String[] args) {
		
		int i = 100;
		float f = 10.5f;
		long l = 10000000;
		System.out.println("implicit typeCasting");
		long lon = i; //No need of doing explicit typeCasting here
		float flo =l; //No need of doing explicit typeCasting here
		long l1 =(long) f;
		System.out.println(lon);
		System.out.println(flo);
		System.out.println(l1);
		
		System.out.println("Explicut TypeCasting");
		double d = 100.455;
		int inte = (int) d;
		float r = (float) d;
		
		
		

	}

}
