package org.accenture.training.day2;

public class MethodyByRef {
	
	private int radius=10;
	private double area;
	
	public void calcualteArea(MethodyByRef formalmref) {
		System.out.println("Method Definition");
		formalmref.area = 3.14 * formalmref.radius * formalmref.radius;
		System.out.println("Area,through formalmref object: "+formalmref.area);

	}

	public static void main(String[] args) {
		MethodyByRef mref = new MethodyByRef();
		mref.calcualteArea(mref); //Method calling with reference parameter
		System.out.println("Area,through mref object: "+mref.area);
		
		//int a =10; int b=a;
		//MethodyByRef mref = new MethodyByRef();
		//MethodyByRef formalmref = mref;

	}

}
